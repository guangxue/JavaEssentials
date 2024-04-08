package com.guangxuezhang.fileoperations;

import java.io.File;

public class Resources {

    private final String resourcePath;

    public Resources() {
        String[] pathnames = {"src", "main", "resources"};
        this.resourcePath = String.join(File.separator, pathnames);
    }
    public String getFilePath(String filename) {
        return String.join(File.separator, this.resourcePath, filename) ;
    }

    public String getFilePath() { return this.resourcePath; }
}
