package com.guangxuezhang.fileoperations;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileTest {

    private final String resPath = System.getProperty("user.dir") + "/src/main/resources/";
    private final String exampleFilePath = this.resPath + "fileToWrite.txt";

    public static void main(String[] args) {}

    @Test
    public void writeToFileInBytes() {

        try (FileOutputStream fileOutputStream = new FileOutputStream(this.exampleFilePath)) {

            String str2File = "PC3 25CM T101";

            fileOutputStream.write(str2File.getBytes());
        } catch (IOException e) {
            System.out.println("{Error writing file}:" + e.getMessage());
        }
    }

    @Test
    public void appendBytesInFile() {

        try (FileOutputStream foutstream = new FileOutputStream(this.exampleFilePath, true)) {
            String STRappendToFile = " LOOSE";
            foutstream.write(STRappendToFile.getBytes());

        }catch (IOException e) {
            System.out.println("Error append file:"+ e.getMessage());
        }
    }
}
