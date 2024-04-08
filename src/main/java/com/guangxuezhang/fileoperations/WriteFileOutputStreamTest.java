package com.guangxuezhang.fileoperations;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileOutputStreamTest {

    private final Resources resources = new Resources();
    private final String exampleFilename =  "fileToWrite.txt";

    public static void main(String[] args) {}

    @Test
    public void writeToFileInBytes() {

        try (FileOutputStream fileOutputStream = new FileOutputStream(resources.getFilePath(this.exampleFilename))) {

            String str2File = "PC3 25CM T101";

            fileOutputStream.write(str2File.getBytes());
        } catch (IOException e) {
            System.out.println("{Error writing file}:" + e.getMessage());
        }
    }

    @Test
    public void appendBytesInFile() {

        try (FileOutputStream foutstream = new FileOutputStream(resources.getFilePath(this.exampleFilename), true)) {
            String STRappendToFile = " LOOSE";
            foutstream.write(STRappendToFile.getBytes());

        }catch (IOException e) {
            System.out.println("Error append file:"+ e.getMessage());
        }
    }
}
