/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

import java.util.HashMap;

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
        fileTree.addChild(new Folder(this.fileTree, "home"));
        fileTree.addChild(new Folder(this.fileTree, "bin"));
        fileTree.addChild(new Folder(this.fileTree, "recycling"));
        fileTree.addChild(new Folder(this.fileTree, "temp"));
        //add second layer in home folder
        
        this.openPorts = new HashMap<String, Integer>();
        openPorts.put("SSH", 22);
        openPorts.put("HTTP", 80);
        openPorts.put("HTTPS", 443);
        openPorts.put("DNS", 53);
        openPorts.put("SMTP", 25);
        openPorts.put("SMTPS", 465);
        openPorts.put("IMAP", 143);
        openPorts.put("IMAPS", 993);
        openPorts.put("LDAP", 389);
        openPorts.put("MYSQL", 3306);
        openPorts.put("NFS", 2049);
    }
    
    public HashMap<String,Integer> getOpenPorts(){
        return this.openPorts;
    }
    
    
}
