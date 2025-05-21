package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, -1.0, 10.0, 11.0, 6.5, 8.0);

        int excellentCount = analyzer.countExcellentStudents(scores);
        double averageScore = analyzer.calculateValidAverage(scores);

        System.out.println("Số học sinh Giỏi: " + excellentCount);
        System.out.println("Điểm trung bình hợp lệ: " + averageScore);
    }
}