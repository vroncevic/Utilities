/**
 * SiteLocal.java
 * Created on Feb 25, 2016, 9:11:11 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Checking is private IP Address
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class SiteLocal {

    private boolean isSiteLocal;

    public SiteLocal() {
        this.isSiteLocal = false;
    }

    public boolean isIsSiteLocal() {
        return isSiteLocal;
    }

    public void setIsSiteLocal(boolean isSiteLocal) {
        this.isSiteLocal = isSiteLocal;
    }
}
