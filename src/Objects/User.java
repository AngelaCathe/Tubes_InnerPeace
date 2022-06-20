/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Aspire 5
 */
public class User extends Person { 
    protected String Titlediary;
    protected String Isidiary;
    protected String datediary;

    public User(String name, String password) {
        super(name, password);
    }

    public void setDiary(String Titlediary, String Isidiary, String datediary) {
    this.Titlediary = Titlediary;
    this.Isidiary = Isidiary;
    this.datediary = datediary;
    }

}
