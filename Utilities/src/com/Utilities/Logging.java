/**
 * Logging.java
 * Created on Feb 25, 2016, 21:27:52 PM
 * Copyright(c) Frobas d.o.o.
 */
package com.Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Logging message from Application
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class Logging {

    public static int logging(String LogFlag, String Message, String PathLog, String ToolName) {
        if ((PathLog != null)) {
            File LogFolder = new File(PathLog);
            if ((LogFolder.exists()) && (ToolName != null)) {
                UserProfile uprofile = new UserProfile();
                try {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    if ((LogFlag == null) || (Message == null)) {
                        return -1;
                    }
                    String Log = "[" + dateFormat.format(date) + "] " + LogFlag + " "
                            + Message + " User: " + uprofile.getUserName() + " ["
                            + InetAddress.getLocalHost().getHostName() + "]";
                    try {
                        File LogFile = new File(PathLog + "/" + ToolName + ".log");
                        if (!LogFile.exists()) {
                            LogFile.createNewFile();
                        }
                        FileWriter fw = new FileWriter(LogFile.getAbsoluteFile(), true);
                        try (BufferedWriter bw = new BufferedWriter(fw)) {
                            bw.append(Log + "\n");
                        }
                        return 0;
                    } catch (IOException ex) {

                    }
                } catch (UnknownHostException ex) {

                }
            }
        }
        return -1;
    }
}
