/**
 * Application.java
 * Created on Feb 25, 2016, 21:36:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * IP Address Information
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com
 */
public class IPAddressInfo {

    private String ipAddress;
    private String ipVersion;

    public IPAddressInfo() {
        this.ipAddress = null;
        this.ipVersion = null;
    }

    public IPAddressInfo(String ipAddress, String ipVersion) {
        this.ipAddress = ipAddress;
        this.ipVersion = ipVersion;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }
}
