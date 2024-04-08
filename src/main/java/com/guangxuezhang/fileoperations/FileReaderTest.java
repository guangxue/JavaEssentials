package com.guangxuezhang.fileoperations;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
    FileInputStream is Byte Based, it can be used to read bytes.
    FileReader is Character Based, it can be used to read characters.
    FileInputStream is used for reading binary files.
    FileReader is used for reading text files in platform default encoding.
 */

public class FileReaderTest {

    private final Resources resources = new Resources();

    public static void main(String[] args) {}

    @Test
    public void ReadFileTest() {
        String exampleFilename = "BIRCH_ITEM_CODE.txt";
        try(FileReader fileReader = new FileReader(this.resources.getFilePath(exampleFilename));) {
            int totalBytesRead;
            char[] chars = new char[8];
            while((totalBytesRead = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, totalBytesRead));
            }
       } catch (IOException e) {
            System.out.println("Error reading file(FileReader)" + e.getMessage());
        }
    }

}
