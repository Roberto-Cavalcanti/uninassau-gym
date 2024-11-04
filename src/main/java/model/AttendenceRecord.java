package model;

import java.util.HashMap;
import java.util.Map;

public class AttendenceRecord {
    private Lesson lesson;
    private HashMap<String, String> frequency = new HashMap<>();

    public AttendenceRecord(Lesson lesson){
        this.lesson = lesson;
    }

    public HashMap<String,String> getFrequency(){
        return frequency;
    }

    public void checkFrequency(String name){
        if(frequency.containsKey(name)){
            frequency.replace(name, "PRESENTE");
        }
    }
}

