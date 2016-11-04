/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

import java.util.StringTokenizer;

/**
 *
 * @author main
 */
public class File extends Directory {
    private String path;
    private int fileSize;
    private String fileName;
    private String data;
    private Folder parent;
    
    public File(int fileSize, String name, String data)
    {
        super(name, "file");
        this.fileSize = fileSize;
        this.fileName = name;
        this.data = data;
    }
    
    public String getFileName()
    {
        return this.fileName;
    }
    
    public final String setFilePath() {
        String path = this.parent.getFolderPath();
        return path + this.fileName;
    }
    
    public String getFileExtension()
    {
        String ext;
        String name;
        StringTokenizer token = new StringTokenizer(this.fileName, ".");
        System.out.println(token);
        return null;
    }
    
    public int getFileSizeInBytes()
    {
        return this.fileSize;
    }
    
    public String getFileData()
    {
        return this.data;
    }
    
    public boolean is(String path){
        if (path == null) return false;
        if (!(path instanceof String)) return false;
        return path.equals(this.path);
    }
    
}