package org.example.models;
import java.util.ArrayList;
import java.util.HashMap;
public class Top {
    HashMap<String, Integer> exercises = new HashMap<String, Integer>();
    HashMap<String, Integer> practices = new HashMap<String, Integer>();
    protected final int pointsOfActivity;
    protected final int pointsOfSeminary;

    public Top(HashMap<String, Integer> exercises, HashMap<String, Integer> practices, int activity, int seminary){
        this.exercises = exercises;
        this.pointsOfActivity = activity;
        this.practices = practices;
        this.pointsOfSeminary = seminary;
    }
    public int getPointsOfActivity(){
        return pointsOfActivity;
    }
    public int getPointsOfSeminary(){
        return pointsOfSeminary;
    }
    public int getPointsOfExercises(){
        var result = 0;
        for(var entry: exercises.entrySet()){
            result+=entry.getValue();
        }
        return result;
    }
    public int getPointsOfPractices(){
        var result = 0;
        for(var entry: practices.entrySet()){
            result+=entry.getValue();
        }
        return result;
    }

    public String[] pointsOfAll(){
        String str = getPointsOfActivity() + " " + getPointsOfExercises()+ " " + getPointsOfPractices() + " " +  getPointsOfSeminary();
        return str.split(" ");
    }
}
