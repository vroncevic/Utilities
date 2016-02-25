/**
 * Multicast.java
 * Created on Feb 25, 2016, 9:15:55 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Checking Multicast
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Multicast {

    private boolean isMulticast;

    public Multicast() {
        this.isMulticast = false;
    }

    public boolean isIsMulticast() {
        return isMulticast;
    }

    public void setIsMulticast(boolean isMulticast) {
        this.isMulticast = isMulticast;
    }
}
