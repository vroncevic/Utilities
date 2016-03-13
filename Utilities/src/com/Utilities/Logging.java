/**
 * Logging.java
 * Created on Feb 25, 2016, 21:27:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        if ((LogFlag != null) && (Message != null) && (PathLog != null) && (ToolName != null)) {
            UserProfile uprofile = new UserProfile();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String Log = "[" + dateFormat.format(date) + "] " + LogFlag + " "
                    + Message + " User: " + uprofile.getUserName() + " ["
                    + System.getenv("HOSTNAME") + "]";
            try {
                File LogFile = new File(PathLog + "/" + ToolName + ".log");
                if (!LogFile.exists()) {
                    LogFile.createNewFile();
                }
                FileWriter fw = new FileWriter(LogFile.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(Log + "\n");
                bw.flush();
                fw.close();
                return 0;
            } catch (IOException ex) {

            }
        }
        return -1;
    }
}
