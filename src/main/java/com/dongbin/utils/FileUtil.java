package com.dongbin.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class FileUtil extends FileUtils {

    public static void test() {
        File file = new File(getUserDirectory(), "");
        System.out.println("");
    }
}
