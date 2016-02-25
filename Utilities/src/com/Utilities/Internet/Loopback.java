/**
 * Loopback.java
 * Created on Feb 25, 2016, 9:08:32 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Loopback interface
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Loopback {

    private boolean isLoopback;

    public Loopback() {
        this.isLoopback = false;
    }

    public boolean isIsLoopback() {
        return isLoopback;
    }

    public void setIsLoopback(boolean isLoopback) {
        this.isLoopback = isLoopback;
    }
}
