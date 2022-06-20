/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Aspire 5
 */
public class Person { 
    private String name;
    private String password;
    
    public Person(String name, String password) { 
        this.name = name; 
        this.password = password; 
    }

    public String getName() { 
        return this.name; 
    }

    public String getPassword() { 
        return this.password; 
    }

    public void setPassword(String password) { 
        this.password = password;
    }

}