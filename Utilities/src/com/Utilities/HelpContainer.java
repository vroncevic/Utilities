package com.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;

/**
 * Help container for Help Topics frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class HelpContainer extends FormContainer {

    /**
     * Initial constructor
     *
     * @param AppClass parent class
     */
    public HelpContainer(Object AppClass) {
        super();
        setAppLogo(new ImageIcon(AppClass.getClass().getResource("/resource/logo.png")));
        setAppIcon(new ImageIcon(AppClass.getClass().getResource("/resource/icon.png")));
        InputStream helper = AppClass.getClass().getResourceAsStream("/resource/help");
        StringBuilder s = new StringBuilder();
        InputStreamReader isr;
        BufferedReader br;
        try {
            isr = new InputStreamReader(helper);
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                s.append(line);
            }
            br.close();
            isr.close();
            helper.close();
        } catch (IOException ex) {

        }
        setAppInfo(s.toString());
    }

    /**
     * Constructor with parameters
     *
     * @param Title string
     * @param CompanyName string
     * @param AppName string
     * @param AppInfo string
     * @param AppLogo image icon
     * @param AppIcon image icon
     */
    public HelpContainer(String Title, String CompanyName, String AppName,
            String AppInfo, ImageIcon AppLogo, ImageIcon AppIcon) {
        super(Title, CompanyName, AppName, AppInfo, AppLogo, AppIcon);
    }
}
