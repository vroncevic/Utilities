/**
 * Version.java
 * Created on Feb 25, 2016, 21:17:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities;

/**
 * Version ID of Application
 *
 * Version id number of APP added new feature BugFix id number of fix solved
 * VerTag b = beta | r = release
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Version {

    private String Version;
    private String BugFix;
    private String VerTag;

    public Version() {
        this.Version = "1";
        this.BugFix = "0";
        this.VerTag = "b";
    }

    public Version(String Version, String BugFix, String VerTag) {
        this.Version = Version;
        this.BugFix = BugFix;
        this.VerTag = VerTag;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getBugFix() {
        return BugFix;
    }

    public void setBugFix(String BugFix) {
        this.BugFix = BugFix;
    }

    public String getVerTag() {
        return VerTag;
    }

    public void setVerTag(String VerTag) {
        this.VerTag = VerTag;
    }

    public String fullAppVersion() {
        return Version + "." + BugFix + "." + VerTag;
    }
}
