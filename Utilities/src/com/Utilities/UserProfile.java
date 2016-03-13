/**
 * UserProfile.java
 * Created on Feb 25, 2016, 21:29:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities;

/**
 * Container with user and system informations
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class UserProfile {

    private String UserName;
    private String UserHome;
    private String UserDir;
    private String OperatingSystemName;
    private String OperatingSystemArch;
    private String OperatingSystemVersion;
    private String JavaHome;
    private String JavaVendor;
    private String JavaVersion;
    private String JavaClassPath;

    public UserProfile() {
        UserName = System.getProperty("user.name");
        UserHome = System.getProperty("user.home");
        UserDir = System.getProperty("user.dir");
        OperatingSystemName = System.getProperty("os.name");
        OperatingSystemArch = System.getProperty("os.arch");
        OperatingSystemVersion = System.getProperty("os.version");
        JavaHome = System.getProperty("java.home");
        JavaVendor = System.getProperty("java.vendor");
        JavaVersion = System.getProperty("java.version");
        JavaClassPath = System.getProperty("java.class.path");
    }

    public UserProfile(String UserName, String UserHome, String UserDir,
            String OperatingSystemName, String OperatingSystemArch,
            String OperatingSystemVersion, String JavaHome, String JavaVendor,
            String JavaVersion, String JavaClassPath) {
        this.UserName = UserName;
        this.UserHome = UserHome;
        this.UserDir = UserDir;
        this.OperatingSystemName = OperatingSystemName;
        this.OperatingSystemArch = OperatingSystemArch;
        this.OperatingSystemVersion = OperatingSystemVersion;
        this.JavaHome = JavaHome;
        this.JavaVendor = JavaVendor;
        this.JavaVersion = JavaVersion;
        this.JavaClassPath = JavaClassPath;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserHome() {
        return UserHome;
    }

    public void setUserHome(String UserHome) {
        this.UserHome = UserHome;
    }

    public String getUserDir() {
        return UserDir;
    }

    public void setUserDir(String UserDir) {
        this.UserDir = UserDir;
    }

    public String getOperatingSystemName() {
        return OperatingSystemName;
    }

    public void setOperatingSystemName(String OperatingSystemName) {
        this.OperatingSystemName = OperatingSystemName;
    }

    public String getOperatingSystemArch() {
        return OperatingSystemArch;
    }

    public void setOperatingSystemArch(String OperatingSystemArch) {
        this.OperatingSystemArch = OperatingSystemArch;
    }

    public String getOperatingSystemVersion() {
        return OperatingSystemVersion;
    }

    public void setOperatingSystemVersion(String OperatingSystemVersion) {
        this.OperatingSystemVersion = OperatingSystemVersion;
    }

    public String getJavaHome() {
        return JavaHome;
    }

    public void setJavaHome(String JavaHome) {
        this.JavaHome = JavaHome;
    }

    public String getJavaVendor() {
        return JavaVendor;
    }

    public void setJavaVendor(String JavaVendor) {
        this.JavaVendor = JavaVendor;
    }

    public String getJavaVersion() {
        return JavaVersion;
    }

    public void setJavaVersion(String JavaVersion) {
        this.JavaVersion = JavaVersion;
    }

    public String getJavaClassPath() {
        return JavaClassPath;
    }

    public void setJavaClassPath(String JavaClassPath) {
        this.JavaClassPath = JavaClassPath;
    }
}
