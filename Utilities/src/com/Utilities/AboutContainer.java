package com.Utilities;

import javax.swing.ImageIcon;

/**
 * About container for About Application frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class AboutContainer extends FormContainer {

    /**
     * Initial constructor
     *
     * @param AppClass parent class
     */
    public AboutContainer(Object AppClass) {
        super();
        setAppLogo(new ImageIcon(AppClass.getClass().getResource("/resource/logo.png")));
        setAppIcon(new ImageIcon(AppClass.getClass().getResource("/resource/icon.png")));
    }

    /**
     * Constructor with parameters
     *
     * @param Title string for frame title
     * @param CompanyName string 
     * @param AppName string
     * @param AppInfo string
     * @param AppLogo image icon
     * @param AppIcon image icon
     */
    public AboutContainer(String Title, String CompanyName, String AppName, String AppInfo, ImageIcon AppLogo, ImageIcon AppIcon) {
        super(Title, CompanyName, AppName, AppInfo, AppLogo, AppIcon);
    }

    @Override
    public void setAppInfo(String AppInfo) {
        UserProfile uprofile = new UserProfile();
        super.setAppInfo(" Powered by " + AppInfo + "\n"
                + " System: " + uprofile.getOperatingSystemName() + "\n"
                + " Version: " + uprofile.getOperatingSystemVersion() + "\n"
                + " Arch: " + uprofile.getOperatingSystemArch() + "\n"
                + " User directory: " + uprofile.getUserHome() + "\n"
                + " Java HOME:\n"
                + " " + uprofile.getJavaHome() + "\n"
                + " Java vendor: " + uprofile.getJavaVendor() + "\n"
                + " Java version: " + uprofile.getJavaVersion() + "\n");
    }
}
