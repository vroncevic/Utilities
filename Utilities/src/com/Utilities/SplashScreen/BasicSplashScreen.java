/**
 * Application.java
 * Created on Feb 25, 2016, 2:17:52 PM
 * Copyright(c) Frobas d.o.o.
 */
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

    private static final long serialVersionUID = -6721489511713742356L;
    private BufferedImage bufferedImg;
    private ImageIcon img;

    public BasicSplashScreen(int duration, Object AppClass) {
        try {
            this.bufferedImg
                    = ImageIO.read(AppClass.getClass().getResource("/resource/splashscreen.png"));
        } catch (IOException ex) {
        }
        this.img = new ImageIcon(bufferedImg);
        super.setSize(img.getIconWidth(), img.getIconHeight());
        super.setBackground(super.getBackground());
        super.setVisible(true);
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
        }
        super.setVisible(false);
        super.dispose();
    }

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
