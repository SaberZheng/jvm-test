package com.ecut.javac;

import java.io.Serializable;
import java.util.Map;

public class Student implements Serializable {

    private String id ;

    private  Map<String , Integer> score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }
}
