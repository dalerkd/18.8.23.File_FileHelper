package com.kitty;

import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        File file = new File("ReadMe.txt");
        System.out.println("##First File:\r\n"+file.readToStringMySelf());

        File destFile = new File("OK.txt");
        FileHelper.copy(file,destFile);
        System.out.println("##Second File:\r\n"+destFile.readToStringMySelf());

    }
}
