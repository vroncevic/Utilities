package com.Utilities.SplashScreen;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JWindow;

/**
 * Basic Splash Screen without progress bar
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class BasicSplashScreen extends JWindow {

    /**
     * Buffered splash image from resource
     */
    private BufferedImage bufferedImg;

    /**
     * Image icon for splash screen
     */
    private ImageIcon img;
    
    /**
     * Basic Splash Screen
     *
     * @param duration of splash screen
     * @param AppClass parent class
     */
    public BasicSplashScreen(int duration, Object AppClass) {
        try {
            bufferedImg
                    = ImageIO.read(AppClass.getClass().getResource("/resource/splashscreen.png"));
        } catch (IOException ex) {
        }
        img = new ImageIcon(bufferedImg);
        setSize(img.getIconWidth(), img.getIconHeight());
        setBackground(getBackground());
        setVisible(true);
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
        }
        setVisible(false);
        dispose();
    }

    /**
     * Paint Image from resource
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        int curW = img.getIconWidth();
        int curH = img.getIconHeight();
        if (g != null && curW > 0 && curH > 0) {
            BufferedImage bufImage = new BufferedImage(curW, curH, BufferedImage.TYPE_INT_ARGB);
            Graphics2D gr = bufImage.createGraphics();
            if (gr != null) {
                try {
                    gr.setColor(getBackground());
                    gr.fillRect(0, 0, curW, curH);
                    gr.drawImage(img.getImage(), 0, 0, curW, curH, this);
                    gr.dispose();
                    g.drawImage(bufImage, 0, 0, curW, curH, null);
                } finally {
                    gr.dispose();
                }
            }
        }
    }
}
