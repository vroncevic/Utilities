/**
 * Application.java
 * Created on Feb 25, 2016, 2:17:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities.SplashScreen;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Splash screen for Application
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class SplashScreen extends JFrame {

    private static final long serialVersionUID = 1796199089874569271L;
    private JProgressBar splashBar;
    private BufferedImage bufferedImg;
    private ImageIcon img;
    private JLabel splashImage;

    public SplashScreen(int sleep, Object AppClass) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | 
                IllegalAccessException | UnsupportedLookAndFeelException e) {

        }
        super.setUndecorated(true);
        try {
            bufferedImg = 
                    ImageIO.read(AppClass.getClass().getResource("/resource/splashscreen.jpg"));
        } catch (IOException ex) {
            
        }
        this.img = new ImageIcon(bufferedImg);
        this.splashImage = new JLabel(img);
        this.splashImage.setSize(img.getIconWidth(), img.getIconHeight());
        this.splashBar = new JProgressBar(0, 100);
        this.splashBar.setSize(new Dimension(img.getIconWidth(), 10));
        JSplitPane spliter = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT, 
                new JScrollPane(splashBar), 
                new JScrollPane(splashImage));
        spliter.setEnabled(false);
        super.add(spliter);
        super.setSize(img.getIconWidth() + 8, img.getIconHeight() + 38);
        java.net.URL imageIconApp = SplashScreen.class.getResource("/resource/icon.png");
        ImageIcon icon = new ImageIcon(imageIconApp);
        super.setIconImage(icon.getImage());
        super.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        super.setLocation(dim.width / 4, dim.height / 4);
        super.setVisible(true);
        new Thread(new SplashTimer()).start();
        try {
            Thread.sleep(sleep);
        } catch (Exception e) {

        }
        super.dispose();
    }

    public class SplashTimer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i <= 100; i++) {
                splashBar.setValue(i);
                splashBar.repaint();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException err) {
                    
                }
            }
        }
    }
}
