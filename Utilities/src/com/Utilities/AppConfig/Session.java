/**
 * Session.java
 * Created on Feb 25, 2016, 21:34:52 PM
 * Copyright(c) Frobas doo
 */
package com.Utilities.AppConfig;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Creating, Reading and Saving configuration of Application
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
abstract public class Session {

    private String config;

    public Session(String CfgDir, String CfgFile) {
        String configDir = System.clearProperty("user.home") + "/" + CfgDir;
        String configure = configDir + "/" + CfgFile;
        File cdir, cfile;
        boolean check = checkConfig(configure);
        if (check == true) {
            this.config = configure;
        } else {
            cdir = new File(configDir);
            if (!(cdir.exists())) {
                cdir.mkdir();
            }
            try {
                cfile = new File(configure);
                cfile.createNewFile();
            } catch (IOException ex) {

            }
        }
    }

    public void write(Object obj) {
        try {
            if ((obj != null) && (this.config != null)) {
                XStream xs = new XStream();
                FileOutputStream fis = new FileOutputStream(this.config);
                xs.toXML(obj, fis);
            }
        } catch (IOException ex) {

        }
    }

    public Object read(Object defaultcfg) {
        Object obj = null;
        InputStream fis = null;
        FileReader fileReader;
        try {
            if (this.config != null) {
                fileReader = new FileReader(this.config);
                XStream xs = new XStream(new DomDriver());
                if (obj == null) {
                    BufferedReader br = new BufferedReader(fileReader);
                    if ((!(fileReader.ready())) && (br.readLine() == null)) {
                        write(defaultcfg);
                    }
                    obj = xs.fromXML(fileReader);
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {

            }
        }
        return (obj);
    }

    private boolean checkConfig(String config) {
        return new File(config).exists();
    }
}
