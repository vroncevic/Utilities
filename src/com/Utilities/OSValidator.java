package com.Utilities;

/**
 * Validator for Operating System
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class OSValidator {

    private static String OS = System.getProperty("os.name").toLowerCase();

    /**
     * Check is OS windows
     *
     * @return for success true else false
     */
    public static boolean isWindows() {
        boolean status = false;
        if (OS.indexOf("win") >= 0) {
            status = true;
        }
        return status;
    }

    /**
     * Check is OS Mac
     *
     * @return for success true else false
     */
    public static boolean isMac() {
        boolean status = false;
        if (OS.indexOf("mac") >= 0) {
            status = true;
        }
        return status;
    }

    /**
     * Check is OS Unix
     *
     * @return for success true else false
     */
    public static boolean isUnix() {
        boolean status = false;
        if ((OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0)) {
            status = true;
        }
        return status;
    }

    /**
     * Check is OS Solaris
     *
     * @return for success true else false
     */
    public static boolean isSolaris() {
        boolean status = false;
        if ((OS.indexOf("sunos") >= 0)) {
            status = true;
        }
        return status;
    }
}
