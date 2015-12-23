package com.Utilities;

/**
 * Version APP ID
 * 
 * Version id number of APP added new feature
 * BugFix id number of fix solved 
 * VerTag b = beta | r = release
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Version {

    protected String Version;
    protected String BugFix;
    protected String VerTag;

    /**
     * Initial Constructor with first beta version
     */
    public Version() {
        this.Version = "1";
        this.BugFix = "0";
        this.VerTag = "b";
    }

    /**
     * Constructor with version parameters
     *
     * @param Version
     * @param BugFix
     * @param VerTag
     */
    public Version(String Version, String BugFix, String VerTag) {
        this.Version = Version;
        this.BugFix = BugFix;
        this.VerTag = VerTag;
    }

    /**
     * Get APP version
     *
     * @return version number
     */
    public String getVersion() {
        return Version;
    }

    /**
     * Set APP version
     *
     * @param Version id number
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get sub version of APP
     *
     * @return sub version
     */
    public String getBugFix() {
        return BugFix;
    }

    /**
     * Set bug fix number
     *
     * @param BugFix id number of fix
     */
    public void setBugFix(String BugFix) {
        this.BugFix = BugFix;
    }

    /**
     * Get bug fix number
     *
     * @return is number of fix
     */
    public String getVerTag() {
        return VerTag;
    }

    /**
     * Set version tag of APP
     *
     * @param VerTag beta/release
     */
    public void setVerTag(String VerTag) {
        this.VerTag = VerTag;
    }

    /**
     * Get full version of APP
     *
     * @return
     */
    public String fullAppVersion() {
        return Version + "." + BugFix + "." + VerTag;
    }
}
