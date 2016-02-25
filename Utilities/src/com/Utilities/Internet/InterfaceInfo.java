/**
 * InterfaceInfo.java
 * Created on Feb 25, 2016, 9:12:48 PM
 * Copyright(c) Frobas d.o.o.
 */
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

    public InterfaceInfo() {
    
    }

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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public boolean isIsUp() {
        return IsUp;
    }

    public void setIsUp(boolean IsUp) {
        this.IsUp = IsUp;
    }

    public boolean isIsLoopback() {
        return IsLoopback;
    }

    public void setIsLoopback(boolean IsLoopback) {
        this.IsLoopback = IsLoopback;
    }

    public boolean isIsVirtual() {
        return IsVirtual;
    }

    public void setIsVirtual(boolean IsVirtual) {
        this.IsVirtual = IsVirtual;
    }

    public boolean isIsP2P() {
        return IsP2P;
    }

    public void setIsP2P(boolean IsP2P) {
        this.IsP2P = IsP2P;
    }

    public NetworkInterface getParentInterface() {
        return ParentInterface;
    }

    public void setParentInterface(NetworkInterface ParentInterface) {
        this.ParentInterface = ParentInterface;
    }

    public Enumeration<NetworkInterface> getSubInterfaces() {
        return SubInterfaces;
    }

    public void setSubInterfaces(Enumeration<NetworkInterface> SubInterfaces) {
        this.SubInterfaces = SubInterfaces;
    }

    public List<InterfaceAddress> getInterfaceAddress() {
        return InterfaceAddress;
    }

    public void setInterfaceAddress(List<InterfaceAddress> InterfaceAddress) {
        this.InterfaceAddress = InterfaceAddress;
    }

    public Enumeration<InetAddress> getInetAddress() {
        return InetAddress;
    }

    public void setInetAddress(Enumeration<InetAddress> InetAddress) {
        this.InetAddress = InetAddress;
    }

    public byte[] getHWAddress() {
        return HWAddress;
    }

    public void setHWAddress(byte[] HWAddress) {
        this.HWAddress = HWAddress;
    }

    public int getMTU() {
        return MTU;
    }

    public void setMTU(int MTU) {
        this.MTU = MTU;
    }
}
