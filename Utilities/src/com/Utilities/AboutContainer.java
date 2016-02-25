/**
 * AboutContainer.java
 * Created on Feb 25, 2016, 21:30:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities;

import javax.swing.ImageIcon;

/**
 * About container for About Application frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class AboutContainer extends FormContainer {

    public AboutContainer(Object AppClass) {
        super();
        super.setAppLogo(new ImageIcon(AppClass.getClass().getResource("/resource/logo.png")));
        super.setAppIcon(new ImageIcon(AppClass.getClass().getResource("/resource/icon.png")));
    }

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
