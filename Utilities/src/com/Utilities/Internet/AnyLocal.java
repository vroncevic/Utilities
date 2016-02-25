/**
 * AnyLocal.java
 * Created on Feb 25, 2016, 9:12:48 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Checking for wildcards
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class AnyLocal {

    private boolean isAnyLocal;

    public AnyLocal() {
        this.isAnyLocal = false;
    }

    public boolean isIsAnyLocal() {
        return isAnyLocal;
    }

    public void setIsAnyLocal(boolean isAnyLocal) {
        this.isAnyLocal = isAnyLocal;
    }
}
