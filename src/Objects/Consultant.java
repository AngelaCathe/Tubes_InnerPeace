/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Aspire 5
 */
public class Consultant extends Person {
    public String statusAppoint;
    public String diagnosis;
    public String footnote;
    
    public Consultant() {
        super("konsul", "konsul");
    }
    
    public void setRecord(String status, String diagnos,String footnt) {
        this.statusAppoint = status;
        this.diagnosis = diagnos;
        this.footnote = footnt;
    }
    
    
}
