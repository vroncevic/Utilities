package com.Utilities.Internet;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com
 */
public class InterfaceInfo {
    
    private String Name;
    private String DisplayName;
    private boolean IsUp;
    private boolean IsLoopback;
    private boolean IsVirtual;
    private boolean IsP2P;
    private NetworkInterface ParentInterface;
    private Enumeration<NetworkInterface> SubInterfaces;
    private java.util.List<InterfaceAddress> InterfaceAddress;
    private Enumeration<InetAddress> InetAddress;
    private byte[] HWAddress;
    private int MTU;

    /**
     * 
     */
    public InterfaceInfo() {
    
    }

    /**
     * 
     * @param Name
     * @param DisplayName
     * @param IsUp
     * @param IsLoopback
     * @param IsVirtual
     * @param IsP2P
     * @param ParentInterface
     * @param SubInterfaces
     * @param InterfaceAddress
     * @param InetAddress
     * @param HWAddress
     * @param MTU 
     */
    public InterfaceInfo(String Name, String DisplayName, boolean IsUp, 
            boolean IsLoopback, boolean IsVirtual, boolean IsP2P, 
            NetworkInterface ParentInterface, 
            Enumeration<NetworkInterface> SubInterfaces, 
            List<InterfaceAddress> InterfaceAddress, 
            Enumeration<InetAddress> InetAddress, 
            byte[] HWAddress, int MTU) {
        this.Name = Name;
        this.DisplayName = DisplayName;
        this.IsUp = IsUp;
        this.IsLoopback = IsLoopback;
        this.IsVirtual = IsVirtual;
        this.IsP2P = IsP2P;
        this.ParentInterface = ParentInterface;
        this.SubInterfaces = SubInterfaces;
        this.InterfaceAddress = InterfaceAddress;
        this.InetAddress = InetAddress;
        this.HWAddress = HWAddress;
        this.MTU = MTU;
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return 
     */
    public String getDisplayName() {
        return DisplayName;
    }

    /**
     * 
     * @param DisplayName 
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsUp() {
        return IsUp;
    }

    /**
     * 
     * @param IsUp 
     */
    public void setIsUp(boolean IsUp) {
        this.IsUp = IsUp;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsLoopback() {
        return IsLoopback;
    }

    /**
     * 
     * @param IsLoopback 
     */
    public void setIsLoopback(boolean IsLoopback) {
        this.IsLoopback = IsLoopback;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsVirtual() {
        return IsVirtual;
    }

    /**
     * 
     * @param IsVirtual 
     */
    public void setIsVirtual(boolean IsVirtual) {
        this.IsVirtual = IsVirtual;
    }

    /**
     * 
     * @return 
     */
    public boolean isIsP2P() {
        return IsP2P;
    }

    /**
     * 
     * @param IsP2P 
     */
    public void setIsP2P(boolean IsP2P) {
        this.IsP2P = IsP2P;
    }

    /**
     * 
     * @return 
     */
    public NetworkInterface getParentInterface() {
        return ParentInterface;
    }

    /**
     * 
     * @param ParentInterface 
     */
    public void setParentInterface(NetworkInterface ParentInterface) {
        this.ParentInterface = ParentInterface;
    }

    /**
     * 
     * @return 
     */
    public Enumeration<NetworkInterface> getSubInterfaces() {
        return SubInterfaces;
    }

    /**
     * 
     * @param SubInterfaces 
     */
    public void setSubInterfaces(Enumeration<NetworkInterface> SubInterfaces) {
        this.SubInterfaces = SubInterfaces;
    }

    /**
     * 
     * @return 
     */
    public List<InterfaceAddress> getInterfaceAddress() {
        return InterfaceAddress;
    }

    /**
     * 
     * @param InterfaceAddress 
     */
    public void setInterfaceAddress(List<InterfaceAddress> InterfaceAddress) {
        this.InterfaceAddress = InterfaceAddress;
    }

    /**
     * 
     * @return 
     */
    public Enumeration<InetAddress> getInetAddress() {
        return InetAddress;
    }

    /**
     * 
     * @param InetAddress 
     */
    public void setInetAddress(Enumeration<InetAddress> InetAddress) {
        this.InetAddress = InetAddress;
    }

    /**
     * 
     * @return 
     */
    public byte[] getHWAddress() {
        return HWAddress;
    }

    /**
     * 
     * @param HWAddress 
     */
    public void setHWAddress(byte[] HWAddress) {
        this.HWAddress = HWAddress;
    }

    /**
     * 
     * @return 
     */
    public int getMTU() {
        return MTU;
    }

    /**
     * 
     * @param MTU 
     */
    public void setMTU(int MTU) {
        this.MTU = MTU;
    }
}
