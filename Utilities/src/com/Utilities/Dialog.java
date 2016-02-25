/**
 * Dialog.java
 * Created on Feb 25, 2016, 21:26:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Show dialog with message to User
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Dialog {

    protected Component parentComponent;

    public Dialog(Component parentComponent) {
        this.parentComponent = parentComponent;
    }

    public int ShowDialog(String notification, String title, int option) {
        int status = JOptionPane.showConfirmDialog(parentComponent,
                notification,
                title,
                option);
        return status;
    }

    public void Dismiss(String notification, String title, int option) {
        JOptionPane.showMessageDialog(parentComponent, notification,
                title, option);
    }
}
