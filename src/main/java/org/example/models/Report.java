package org.example.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {
    ArrayList<Student> students = new ArrayList<>();

    public Report(ArrayList<Student> students) {
        this.students = students;
    }

    public HashMap<Student, String> getAllPoint() {
        HashMap<Student, String> report = new HashMap<>();
        StringBuilder allPoints = new StringBuilder();
        for (var student : students) {
            var permSeminary = 0;
            var permActivity = 0;
            var permExercise = 0;
            var permPractice = 0;
            for (int i = 0; i < student.tops.size(); i++) {
                for (int j = 0; j < student.tops.get(i).pointsOfAll().length; j++) {
                    if (j == 0) {
                        permActivity += Integer.parseInt(student.tops.get(i).pointsOfAll()[j]);
                    } else if (j == 1) {
                        permExercise += Integer.parseInt(student.tops.get(i).pointsOfAll()[j]);
                    } else if (j == 2) {
                        permPractice += Integer.parseInt(student.tops.get(i).pointsOfAll()[j]);
                    } else if (j == 3) {
                        permSeminary += Integer.parseInt(student.tops.get(i).pointsOfAll()[j]);
                    }
                }

            }
            allPoints.append(permActivity + " " + permExercise + " " + permPractice + " " + permSeminary);
            report.put(student, allPoints.toString());
        }
        return report;
    }

}
