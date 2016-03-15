/**
 * CheckPath.java
 * Created on Mar 15, 2016
 * IT Department
 * Copyright(c) Frobas doo
 */
package com.Utilities;

import java.io.File;

/**
 * Checking file or directory
 *
 * @author Vladimir Roncevic <vladimir.roncevic@frobas.com>
 */
public class CheckPath {

    public static boolean Exist(String Path) {
        boolean status = false;
        if (new File(Path).exists()) {
            status = true;
        }
        return status;
    }
}
