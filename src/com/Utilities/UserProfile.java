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

    /**
     * Initial Constructor
     */
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

    /**
     * Constructor with parameters
     *
     * @param UserName of client user
     * @param UserHome path
     * @param UserDir current path
     * @param OperatingSystemName name id of OS
     * @param OperatingSystemArch 32 or 64 bit platform
     * @param OperatingSystemVersion id version of OS
     * @param JavaHome path of JRE
     * @param JavaVendor vendor id of JRE
     * @param JavaVersion version id of JRE
     * @param JavaClassPath path of libraries
     */
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

    /**
     * get USER
     *
     * @return
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * set USER
     *
     * @param UserName
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * get USERHOME
     *
     * @return
     */
    public String getUserHome() {
        return UserHome;
    }

    /**
     * set USERHOME
     *
     * @param UserHome
     */
    public void setUserHome(String UserHome) {
        this.UserHome = UserHome;
    }

    /**
     * get WORKDIR
     *
     * @return
     */
    public String getUserDir() {
        return UserDir;
    }

    /**
     * set WORKDIR
     *
     * @param UserDir
     */
    public void setUserDir(String UserDir) {
        this.UserDir = UserDir;
    }

    /**
     * get OS name
     *
     * @return
     */
    public String getOperatingSystemName() {
        return OperatingSystemName;
    }

    /**
     * set OS name
     *
     * @param OperatingSystemName
     */
    public void setOperatingSystemName(String OperatingSystemName) {
        this.OperatingSystemName = OperatingSystemName;
    }

    /**
     * get OS arch
     *
     * @return
     */
    public String getOperatingSystemArch() {
        return OperatingSystemArch;
    }

    /**
     * set OS arch
     *
     * @param OperatingSystemArch
     */
    public void setOperatingSystemArch(String OperatingSystemArch) {
        this.OperatingSystemArch = OperatingSystemArch;
    }

    /**
     * get OS version
     *
     * @return
     */
    public String getOperatingSystemVersion() {
        return OperatingSystemVersion;
    }

    /**
     * set OS version
     *
     * @param OperatingSystemVersion
     */
    public void setOperatingSystemVersion(String OperatingSystemVersion) {
        this.OperatingSystemVersion = OperatingSystemVersion;
    }

    /**
     * get JAVA_HOME path
     *
     * @return
     */
    public String getJavaHome() {
        return JavaHome;
    }

    /**
     * set JAVA_HOME path
     *
     * @param JavaHome
     */
    public void setJavaHome(String JavaHome) {
        this.JavaHome = JavaHome;
    }

    /**
     * get vendor id of JRE
     *
     * @return
     */
    public String getJavaVendor() {
        return JavaVendor;
    }

    /**
     * set vendor id of JRE
     *
     * @param JavaVendor
     */
    public void setJavaVendor(String JavaVendor) {
        this.JavaVendor = JavaVendor;
    }

    /**
     * get version of JRE
     *
     * @return
     */
    public String getJavaVersion() {
        return JavaVersion;
    }

    /**
     * set version of JRE
     *
     * @param JavaVersion
     */
    public void setJavaVersion(String JavaVersion) {
        this.JavaVersion = JavaVersion;
    }

    /**
     * get CLASSPATH
     *
     * @return
     */
    public String getJavaClassPath() {
        return JavaClassPath;
    }

    /**
     * Set CLASSPATH
     *
     * @param JavaClassPath
     */
    public void setJavaClassPath(String JavaClassPath) {
        this.JavaClassPath = JavaClassPath;
    }
}
