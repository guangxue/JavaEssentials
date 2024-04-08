package com.guangxuezhang.fileoperations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class FileCreateTest {

    private final Logger logger = LoggerFactory.getLogger(FileCreateTest.class);

    // Example file name that will be created
    private final String exampleFilename = "sampleFilePC.txt";

    public static void main(String[] args) {}

    @Test
    public void createNewFile() {
        Resources resources = new Resources();
        String sampleFilePath = resources.getFilePath(this.exampleFilename);

        try {
            File sampleFile = new File(sampleFilePath);
            if(sampleFile.createNewFile()) {
                logger.info("File created: " + sampleFile.getName());
            } else {
                logger.warn("File already exists.");
                if(sampleFile.delete()) {
                    logger.info("File is deleted!");
                }else {
                    logger.warn("Delete file Unsuccessful!");
                }
            }
        } catch (IOException e) {
            logger.error("File Create Error: "+ e.getMessage());
        }
    }

    @Test
    public void createNewFileWithFileAndString() {
        Resources resources = new Resources();
        try {
            File sampleFilePC = new File(resources.getFilePath(), resources.getFilePath(this.exampleFilename));
            if(sampleFilePC.createNewFile()) {
                System.out.println("File Created: " + sampleFilePC.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            logger.error("File creation Failed as:"+e.getMessage());
        }
    }

    @Test
    public void createNewFileInString() {}
}
