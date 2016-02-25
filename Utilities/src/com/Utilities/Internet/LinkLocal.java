/**
 * LinkLocal.java
 * Created on Feb 25, 2016, 9:14:55 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities.Internet;

/**
 * Checking Link Local
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class LinkLocal {

    private boolean isLinkLocal;

    public LinkLocal() {
        this.isLinkLocal = false;
    }

    public boolean isIsLinkLocal() {
        return isLinkLocal;
    }

    public void setIsLinkLocal(boolean isLinkLocal) {
        this.isLinkLocal = isLinkLocal;
    }
}
