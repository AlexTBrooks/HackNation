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
    }
    
    public HashMap<String,Integer> getOpenPorts(){
        return openPorts;
    }
    
    
}
