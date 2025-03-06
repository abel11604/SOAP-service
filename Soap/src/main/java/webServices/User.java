/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webServices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author abelc
 */
public class User implements Serializable{
private static final long serialVersionUID = 1L;
    public String name, username;

    public static List<User> users = new ArrayList<>(Arrays.asList(
        new User("Rosa", "Marfil"),
        new User("Pepito", "Grillo"),
        new User("Manuela", "Río")
    ));

    public User() {
        super();
    }

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public void setUser(User user){
    users.add(user);
    }
    
    public List<User> getUsers(){
    return users;
    }
    
}
