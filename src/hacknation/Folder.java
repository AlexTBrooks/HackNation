/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author main
 */
public class Folder extends Directory {
    private String path;
    private String folderName;
    private Folder parent;
    private List<Directory> children = new ArrayList<Directory>();

    public Folder(Folder p, String name) {
        super(name, "folder");
        this.parent = p;
        this.folderName = name;
        this.path = setFolderPath();
    }

    public void moveTo(Folder p) {
        this.parent.removeChild(this);
        this.parent = p;
        this.parent.addChild(this);
    }

    public void rename(String n) {
        this.folderName = n;
        super.name = n;
    }

    public String getFolderName() {
        return folderName;
    }

    public List<Directory> getChildren() {
        return this.children;
    }
    
    public String getFolderPath() {
        return this.path;
    }
    
    public final String setFolderPath() {
        if(this.parent == null)
            return "/";
        String path = this.parent.setFolderPath();
        return path + this.folderName + "/";
    }

    public void removeChild(Directory d) {
        this.children.remove(d);
    }

    public void addChild(Directory d) {
        this.children.add(d);
    }
    
    public boolean is(String path){
        if (path == null) return false;
        if (!(path instanceof String)) return false;
        return path.equals(this.path);
    }
}
