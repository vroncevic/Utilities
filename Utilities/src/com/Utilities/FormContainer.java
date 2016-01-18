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

    /**
     * Default initial constructor
     */
    public FormContainer() {
        this.Title = null;
        this.CompanyName = null;
        this.AppName = null;
        this.AppInfo = null;
        this.AppLogo = null;
        this.AppIcon = null;
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
    public FormContainer(String Title, String CompanyName, String AppName, 
            String AppInfo, ImageIcon AppLogo, ImageIcon AppIcon) {
        this.Title = Title;
        this.CompanyName = CompanyName;
        this.AppName = AppName;
        this.AppInfo = AppInfo;
        this.AppLogo = AppLogo;
        this.AppIcon = AppIcon;
    }

    /**
     * Get Application Title
     *
     * @return string
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Set Application Title
     *
     * @param Title string
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Application name
     *
     * @return string
     */
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * Set Company Name
     *
     * @param CompanyName string
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get Application Name
     *
     * @return string
     */
    public String getAppName() {
        return AppName;
    }

    /**
     * Set Application Name
     *
     * @param AppName string
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Application Info text
     *
     * @return string
     */
    public String getAppInfo() {
        return AppInfo;
    }

    /**
     * Set Application Info text
     *
     * @param AppInfo string
     */
    public void setAppInfo(String AppInfo) {
        this.AppInfo = AppInfo;
    }

    /**
     * Get Application Logo
     *
     * @return image icon
     */
    public ImageIcon getAppLogo() {
        return AppLogo;
    }

    /**
     * Set Application Logo
     *
     * @param AppLogo image icon
     */
    public void setAppLogo(ImageIcon AppLogo) {
        this.AppLogo = AppLogo;
    }

    /**
     * Get Application Icon
     *
     * @return image icon
     */
    public ImageIcon getAppIcon() {
        return AppIcon;
    }

    /**
     * Set Application Icon
     *
     * @param AppIcon image icon
     */
    public void setAppIcon(ImageIcon AppIcon) {
        this.AppIcon = AppIcon;
    }
}
