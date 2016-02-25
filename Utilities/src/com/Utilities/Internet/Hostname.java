/**
 * Hostname.java
 * Created on Feb 25, 2016, 9:05:40 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Hostname container
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Hostname {

    private String hostName;
    private String canonicalHostName;

    public Hostname() {
        this.hostName = null;
        this.canonicalHostName = null;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getCanonicalHostName() {
        return canonicalHostName;
    }

    public void setCanonicalHostName(String canonicalHostName) {
        this.canonicalHostName = canonicalHostName;
    }
}
