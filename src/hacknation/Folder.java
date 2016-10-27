/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

import java.util.List;

/**
 *
 * @author main
 */
public class Folder extends Directory {
    private String folderName;
    private Folder parent;
    private List<Directory> children;

    public Folder(Folder p, String name) {
        super(name, "folder");
        this.parent = p;
        this.folderName = name;
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

    public String getFolderPath() {
        if(this.parent == null) 
            return "/" + folderName;
        String path = this.parent.getFolderPath();
        return path + "/" + folderName;
    }

    public List<Directory> getChildren() {
        return children;
    }

    public void removeChild(Directory d) {
        this.children.remove(d);
    }

    public void addChild(Directory d) {
        this.children.add(d);
    }
}
