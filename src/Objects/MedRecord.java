/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import revisi_mentalhealth_care.Login;

/**
 *
 * @author Aspire 5
 */
public class MedRecord {
    public String topic;
    public String place;
    public String date;
    public String time;
    
    public MedRecord(String topic,String place, String date, String time) {
        this.topic = topic;
        this.place = place;
        this.date = date;
        this.time = time;
    }
    @Override
    public String toString() { 
        return String.format("Record info:\nTopic = %1$s \nPlace = %2$s \nDate = %3$s \nTime = %4$s)", topic, place, date, time);  // mengembalikan string dalam bentuk format yang telah disusun
    }
}
