package com.Utilities.Internet;

/**
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com
 */
public class IPAddressInfo {

    private String ipAddress;
    private String ipVersion;
    private String hostName;
    private String canonicalHostName;
    private boolean isLoopback;
    private boolean isSiteLocal; // private IP address
    private boolean isAnyLocal;  // wildcard address
    private boolean isLinkLocal;
    private boolean isMulticast;
    private boolean isReachable;

    /**
     * 
     */
    public IPAddressInfo() {
    
    }

    /**
     * 
     * @param ipAddress
     * @param ipVersion
     * @param hostName
     * @param canonicalHostName
     * @param isLoopback
     * @param isSiteLocal
     * @param isAnyLocal
     * @param isLinkLocal
     * @param isMulticast
     * @param isReachable 
     */
    public IPAddressInfo(String ipAddress, String ipVersion, String hostName, 
            String canonicalHostName, boolean isLoopback, boolean isSiteLocal, 
            boolean isAnyLocal, boolean isLinkLocal, 
            boolean isMulticast, boolean isReachable) {
        this.ipAddress = ipAddress;
        this.ipVersion = ipVersion;
        this.hostName = hostName;
        this.canonicalHostName = canonicalHostName;
        this.isLoopback = isLoopback;
        this.isSiteLocal = isSiteLocal;
        this.isAnyLocal = isAnyLocal;
        this.isLinkLocal = isLinkLocal;
        this.isMulticast = isMulticast;
        this.isReachable = isReachable;
    }

    /**
     * 
     * @return 
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 
     * @param ipAddress 
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 
     * @return 
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * 
     * @param ipVersion 
     */
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * 
     * @return 
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * 
     * @param hostName 
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * 
     * @return 
     */
    public String getCanonicalHostName() {
        return canonicalHostName;
    }

    /**
     * 
     * @param canonicalHostName 
     */
    public void setCanonicalHostName(String canonicalHostName) {
        this.canonicalHostName = canonicalHostName;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsLoopback() {
        return isLoopback;
    }

    /**
     * 
     * @param isLoopback 
     */
    public void setIsLoopback(boolean isLoopback) {
        this.isLoopback = isLoopback;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsSiteLocal() {
        return isSiteLocal;
    }

    /**
     * 
     * @param isSiteLocal 
     */
    public void setIsSiteLocal(boolean isSiteLocal) {
        this.isSiteLocal = isSiteLocal;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsAnyLocal() {
        return isAnyLocal;
    }

    /**
     * 
     * @param isAnyLocal 
     */
    public void setIsAnyLocal(boolean isAnyLocal) {
        this.isAnyLocal = isAnyLocal;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsLinkLocal() {
        return isLinkLocal;
    }

    /**
     * 
     * @param isLinkLocal 
     */
    public void setIsLinkLocal(boolean isLinkLocal) {
        this.isLinkLocal = isLinkLocal;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsMulticast() {
        return isMulticast;
    }

    /**
     * 
     * @param isMulticast 
     */
    public void setIsMulticast(boolean isMulticast) {
        this.isMulticast = isMulticast;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsReachable() {
        return isReachable;
    }

    /**
     * 
     * @param isReachable 
     */
    public void setIsReachable(boolean isReachable) {
        this.isReachable = isReachable;
    }
}
