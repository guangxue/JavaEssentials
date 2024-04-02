package com.guangxuezhang.fileoperations;

import java.io.FileInputStream;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileTest {
    private final String resPath = System.getProperty("user.dir") + "/src/main/resources/";

    private final String exampleFilePath = this.resPath + "BIRCH_ITEM_CODE.txt";

    public static void main(String[] args) {

    }

    @Test
    public void readFileByOneByte() {
        try (FileInputStream inputStream = new FileInputStream(this.exampleFilePath)) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Err read one byte: " + e.getMessage());
        }
    }

    @Test
    public void readFileByBytes() {

        try (FileInputStream inputStream = new FileInputStream(this.exampleFilePath)) {
            byte[] bytes = new byte[8];
            int readBytes = 0;

            while((readBytes = inputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readBytes));
            }
        } catch (IOException e) {
            System.out.println("[Error read bytes]" + e.getMessage());
        }
    }
}
