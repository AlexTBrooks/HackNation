/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author main
 */
public class Computer {
    
    public Folder fileTree;
    public String IP;
    public String DNSname;
    public String password;
    public String user;
    private Directory currentDir;
    private HashMap<String, Integer> openPorts;
    
    
    public Computer(String user,String password,String IP,String DNSname){
        this.user = user;
        this.password = password;
        this.IP = IP;
        this.DNSname = DNSname;
        
        this.fileTree = new Folder(null, "root");
        this.fileTree.addChild(new Folder(this.fileTree, "home"));
        this.fileTree.addChild(new Folder(this.fileTree, "bin"));
        this.fileTree.addChild(new Folder(this.fileTree, "recycling"));
        this.fileTree.addChild(new Folder(this.fileTree, "temp"));
        
        Folder home = (Folder)fileTree.getChildren().get(0);
        home.addChild(new Folder(this.fileTree, "Desktop"));
        home.addChild(new Folder(this.fileTree, "Documents"));
        home.addChild(new Folder(this.fileTree, "Downloads"));
        home.addChild(new Folder(this.fileTree, "Pictures"));
        home.addChild(new Folder(this.fileTree, "Videos"));
        
        this.openPorts = new HashMap<String, Integer>();
        this.openPorts.put("SSH", 22);
        this.openPorts.put("HTTP", 80);
        this.openPorts.put("HTTPS", 443);
        this.openPorts.put("DNS", 53);
        this.openPorts.put("SMTP", 25);
        this.openPorts.put("SMTPS", 465);
        this.openPorts.put("IMAP", 143);
        this.openPorts.put("IMAPS", 993);
        this.openPorts.put("LDAP", 389);
        this.openPorts.put("MYSQL", 3306);
        this.openPorts.put("NFS", 2049);
    }
    
    public HashMap<String,Integer> getOpenPorts(){
        return this.openPorts;
    }
    
    
}
