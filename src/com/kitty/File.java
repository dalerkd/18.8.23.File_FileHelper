package com.kitty;

import java.io.*;

public class File {

    private String m_dir;

    public File(String dir) {
        m_dir = dir;
    }

    public String readToString() {
        java.io.File file = new java.io.File(m_dir);
        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(fileContent);
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(fileContent);

    }

    //写入一个String2file.
    public void writeString(String content) {
        java.io.File file = new java.io.File(m_dir);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file);
            out.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
