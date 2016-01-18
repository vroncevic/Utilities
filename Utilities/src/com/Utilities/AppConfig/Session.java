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
 * Creating, Reading and Saving configuration of APP
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
abstract public class Session {

    private String config;

    /**
     * Creating Session file
     *
     * @param CfgDir path for APP configuration
     * @param CfgFile path to CFG file
     */
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

    /**
     * Write class to configuration file
     *
     * @param obj class for writing
     */
    public void write(Object obj) {
        try {
            if ((obj != null) && (config != null)) {
                XStream xs = new XStream();
                FileOutputStream fis = new FileOutputStream(config);
                xs.toXML(obj, fis);
            }
        } catch (IOException ex) {

        }
    }

    /**
     * Read from configuration file and create class
     *
     * @param defaultcfg
     * @return Object class with configuration
     */
    public Object read(Object defaultcfg) {
        Object obj = null;
        InputStream fis = null;
        FileReader fileReader;
        try {
            if (config != null) {
                fileReader = new FileReader(config);
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

    /**
     * Check existing configuration file
     *
     * @param config absolute path
     * @return true for exist else false
     */
    private boolean checkConfig(String config) {
        return new File(config).exists();
    }
}
