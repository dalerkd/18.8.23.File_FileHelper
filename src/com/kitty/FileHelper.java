package com.kitty;

public class FileHelper {
    /*
    * 将sourceFile内容写入到destFile
    * */
    public static void copy(File sourceFile,File destFile){
        destFile.writeString(sourceFile.readToString());
    }

}
