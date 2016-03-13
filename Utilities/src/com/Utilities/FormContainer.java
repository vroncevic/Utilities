/**
 * FormContainer.java
 * Created on Feb 25, 2016, 21:27:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities;

import javax.swing.ImageIcon;

/**
 * Form container with content of frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
abstract public class FormContainer {

    private String Title;
    private String CompanyName;
    private String AppName;
    private String AppInfo;
    private ImageIcon AppLogo;
    private ImageIcon AppIcon;

    public FormContainer() {
        this.Title = null;
        this.CompanyName = null;
        this.AppName = null;
        this.AppInfo = null;
        this.AppLogo = null;
        this.AppIcon = null;
    }

    public FormContainer(String Title, String CompanyName, String AppName, 
            String AppInfo, ImageIcon AppLogo, ImageIcon AppIcon) {
        this.Title = Title;
        this.CompanyName = CompanyName;
        this.AppName = AppName;
        this.AppInfo = AppInfo;
        this.AppLogo = AppLogo;
        this.AppIcon = AppIcon;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public String getAppInfo() {
        return AppInfo;
    }

    public void setAppInfo(String AppInfo) {
        this.AppInfo = AppInfo;
    }

    public ImageIcon getAppLogo() {
        return AppLogo;
    }

    public void setAppLogo(ImageIcon AppLogo) {
        this.AppLogo = AppLogo;
    }

    public ImageIcon getAppIcon() {
        return AppIcon;
    }

    public void setAppIcon(ImageIcon AppIcon) {
        this.AppIcon = AppIcon;
    }
}
