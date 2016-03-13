/**
 * Help.java
 * Created on Feb 25, 2016, 21:35:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities.Help;

import com.Utilities.HelpContainer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 * Help Topics frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Help extends javax.swing.JFrame {

    private static final long serialVersionUID = -648436326292098599L;

    public Help(HelpContainer content) {
        initComponents();
        super.setTitle(content.getTitle());
        this.LogoLabel.setIcon(content.getAppLogo());
        super.setIconImage(content.getAppIcon().getImage());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        super.setLocation(dim.width / 2 - super.getSize().width / 2, dim.height / 2 - super.getSize().height / 2);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        HTMLScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        HTMLPage.setContentType("text/html");
        HTMLPage.setText(content.getAppInfo());
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HTMLScrollPane = new javax.swing.JScrollPane();
        HTMLPage = new javax.swing.JEditorPane();
        CloseHelp = new javax.swing.JButton();
        LogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 358));
        setMinimumSize(new java.awt.Dimension(400, 358));
        setResizable(false);

        HTMLPage.setEditable(false);
        HTMLPage.setBackground(new java.awt.Color(238, 238, 238));
        HTMLScrollPane.setViewportView(HTMLPage);

        CloseHelp.setText("Close");
        CloseHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HTMLScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 215, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CloseHelp, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HTMLScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CloseHelp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseHelpActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CloseHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseHelp;
    private javax.swing.JEditorPane HTMLPage;
    private javax.swing.JScrollPane HTMLScrollPane;
    private javax.swing.JLabel LogoLabel;
    // End of variables declaration//GEN-END:variables
}
