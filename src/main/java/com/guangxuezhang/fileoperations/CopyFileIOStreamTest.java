package com.guangxuezhang.fileoperations;

import org.junit.Test;

import java.io.*;

public class CopyFileIOStreamTest {

    public static void main(String[] args) {}

    @Test
    public void fileCopyFirstExample() {
        Resources resources = new Resources();
        String fromFilePath = resources.getFilePath("BIRCH_ITEM_CODE.txt");
        String toFilePath = resources.getFilePath("BIRCH_ITEM_CODE_COPY.txt");

            try(FileInputStream fileInputStream = new FileInputStream(fromFilePath);
                FileOutputStream fileOutputStream = new FileOutputStream(toFilePath)
            ){
                byte[] bytesToRead = new byte[8];
                int totalBytesRead;
                while((totalBytesRead = fileInputStream.read(bytesToRead)) != -1) {
                    fileOutputStream.write(bytesToRead, 0, totalBytesRead);
                }
            } catch (IOException e) {
                System.out.println("Copy File Error: " + e.getMessage());
            }
    }
}
