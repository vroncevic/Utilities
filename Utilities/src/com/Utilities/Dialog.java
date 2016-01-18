package com.Utilities;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * Show dialog with message to User
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Dialog {

    /**
     * Parent component
     */
    protected Component parentComponent;

    /**
     * Constructor with parent component
     *
     * @param parentComponent
     */
    public Dialog(Component parentComponent) {
        this.parentComponent = parentComponent;
    }

    /**
     * ShowDialog display notification with message
     *
     * @param notification message to user
     * @param title of dialog
     * @param option yes | no, and more
     * @return status
     */
    public int ShowDialog(String notification, String title, int option) {
        int status = JOptionPane.showConfirmDialog(parentComponent,
                notification,
                title,
                option);
        return status;
    }

    /**
     * Dismiss dialog
     *
     * @param notification message to user
     * @param title of dialog
     * @param option dismiss
     */
    public void Dismiss(String notification, String title, int option) {
        JOptionPane.showMessageDialog(parentComponent, notification,
                title, option);
    }
}
