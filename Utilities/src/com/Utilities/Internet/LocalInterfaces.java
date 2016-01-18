package com.Utilities.Internet;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com
 */
public class LocalInterfaces {

    /**
     * listInterfaces return array list of interfaces
     *
     * @return array list of interfaces
     */
    public static ArrayList<InterfaceInfo> listInterfaces() {
        Enumeration<NetworkInterface> interfaces = null;
        ArrayList<InterfaceInfo> listofinterfaces = new ArrayList<>();

        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {

        }

        while (interfaces.hasMoreElements()) {
            NetworkInterface ni = interfaces.nextElement();
            InterfaceInfo info = new InterfaceInfo();
            info.setName(ni.getName());
            info.setDisplayName(ni.getDisplayName());
            try {
                info.setIsUp(ni.isUp());
            } catch (SocketException ex) {

            }
            try {
                info.setIsLoopback(ni.isLoopback());
            } catch (SocketException ex) {

            }
            info.setIsVirtual(ni.isVirtual());
            try {
                info.setIsP2P(ni.isPointToPoint());
            } catch (SocketException ex) {

            }
            info.setParentInterface(ni.getParent());
            info.setSubInterfaces(ni.getSubInterfaces());
            info.setInterfaceAddress(ni.getInterfaceAddresses());
            info.setInetAddress(ni.getInetAddresses());
            try {
                info.setHWAddress(ni.getHardwareAddress());
            } catch (SocketException ex) {

            }
            try {
                info.setMTU(ni.getMTU());
            } catch (SocketException ex) {

            }
            listofinterfaces.add(info);
        }
        return listofinterfaces;
    }
}
