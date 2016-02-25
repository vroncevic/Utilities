/**
 * Reachable.java
 * Created on Feb 25, 2016, 9:17:06 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Check is reachable
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Reachable {

    private boolean isReachable;

    public Reachable() {
        this.isReachable = false;
    }

    public boolean isIsReachable() {
        return isReachable;
    }

    public void setIsReachable(boolean isReachable) {
        this.isReachable = isReachable;
    }
}
