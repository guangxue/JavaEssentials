package com.guangxuezhang.fileoperations;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class FileCreateTest {

    private final Logger logger = LoggerFactory.getLogger(FileCreateTest.class);
    private final String resourcePath = System.getProperty("user.dir")+"/src/main/resources/";

    public static void main(String[] args) {}

    @Test
    public void createNewFile() {
        String sampleFilePath = resourcePath + "sampleFile.txt";

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
        // new File(File file, String child)
        File parentFileLocation = new File(System.getProperty("user.dir")+"/src/main/resources");
        String filename = "sampleFilePC.txt";

        try {
            File sampleFilePC = new File(parentFileLocation, filename);
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
