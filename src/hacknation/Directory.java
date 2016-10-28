/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacknation;

/**
 *
 * @author Trevor Leach
 */
public class Directory extends Object {
    protected String name;
    private final String type;
    
    //comment
    public Directory(String n, String t) {
        super();
        this.name = n;
        this.type = t;
    }
    
    public String getName() {
        return this.name;
    }
}
