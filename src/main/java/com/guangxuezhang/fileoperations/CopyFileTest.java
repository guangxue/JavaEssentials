package com.guangxuezhang.fileoperations;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {

    private final String resPath = System.getProperty("user.dir") + "/src/main/resources";

    public static void main(String[] args) {

    }

    @Test
    public void fileCopyFirstExample() {
        String fromFilePath = this.resPath + "BRICH_ITEM_CODE.txt";
        String toFilePath = this.resPath + "BIRCH_ITEM_CODE_COPY.txt";

            try(FileInputStream fileInputStream = new FileInputStream(fromFilePath);
                FileOutputStream fileOutputStream = new FileOutputStream(toFilePath)
            ){
                byte[] bytesToRead = new byte[128];
                int totalBytesRead = 0;
                while((totalBytesRead = fileInputStream.read(bytesToRead)) != -1) {
                    fileOutputStream.write(bytesToRead, 0, totalBytesRead);
                }
            } catch (IOException e) {
                System.out.println("Copy File Error: " + e.getMessage());
            }
    }
}
