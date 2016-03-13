/**
 * About.java
 * Created on Feb 25, 2016, 21:33:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities.About;

import com.Utilities.AboutContainer;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * About frame
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class About extends javax.swing.JFrame {

    private static final long serialVersionUID = -4772400194263230645L;

    public About(AboutContainer content) {
        initComponents();
        this.LogoLabel.setIcon(content.getAppLogo());
        this.CompanyName.setText(content.getCompanyName());
        this.AppName.setText(content.getAppName());
        this.AppInfo.setText(content.getAppInfo());
        super.setTitle(content.getTitle());
        super.setIconImage(content.getAppIcon().getImage());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        super.setLocation(dim.width / 2 - super.getSize().width / 2, dim.height / 2 - super.getSize().height / 2);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        CompanyName = new javax.swing.JLabel();
        CloseAbout = new javax.swing.JButton();
        AppName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(270, 345));
        setMinimumSize(new java.awt.Dimension(270, 345));
        setPreferredSize(new java.awt.Dimension(270, 345));
        setResizable(false);

        logoPanel.setMaximumSize(new java.awt.Dimension(175, 55));
        logoPanel.setMinimumSize(new java.awt.Dimension(175, 55));
        logoPanel.setPreferredSize(new java.awt.Dimension(175, 55));

        LogoLabel.setAlignmentY(0.0F);

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        CompanyName.setText("Company name");

        CloseAbout.setText("Close");
        CloseAbout.setMaximumSize(new java.awt.Dimension(65, 25));
        CloseAbout.setMinimumSize(new java.awt.Dimension(65, 25));
        CloseAbout.setPreferredSize(new java.awt.Dimension(65, 25));
        CloseAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseAboutActionPerformed(evt);
            }
        });

        AppName.setText("Application name and version");

        AppInfo.setEditable(false);
        AppInfo.setBackground(new java.awt.Color(238, 238, 238));
        AppInfo.setColumns(20);
        AppInfo.setRows(5);
        jScrollPane1.setViewportView(AppInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AppName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(CloseAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompanyName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CloseAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 280, 375);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseAboutActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CloseAboutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AppInfo;
    private javax.swing.JLabel AppName;
    private javax.swing.JButton CloseAbout;
    private javax.swing.JLabel CompanyName;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoPanel;
    // End of variables declaration//GEN-END:variables
}
