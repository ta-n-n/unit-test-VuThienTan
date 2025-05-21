
import org.example.StudentAnalyzer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    void testCountExcellentStudents_WithEmptyList() {
        List<Double> scores = Collections.emptyList();
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(0, result);
    }

    @Test
    void testCountExcellentStudents_WithNullList() {
        int result = analyzer.countExcellentStudents(null);
        assertEquals(0, result);
    }

    @Test
    void testCountExcellentStudents_WithValidScores() {
        List<Double> scores = Arrays.asList(8.0, 9.5, 7.0, 10.0, 6.5);
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(3, result);
    }

    @Test
    void testCountExcellentStudents_WithInvalidScores() {
        List<Double> scores = Arrays.asList(8.0, -1.0, 11.0, 9.0);
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(2, result);
    }

    @Test
    void testCountExcellentStudents_WithNullValues() {
        List<Double> scores = Arrays.asList(8.5, null, 9.0);
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(2, result);
    }

    @Test
    void testCalculateValidAverage_WithEmptyList() {
        List<Double> scores = Collections.emptyList();
        double result = analyzer.calculateValidAverage(scores);
        assertEquals(0.0, result);
    }

    @Test
    void testCalculateValidAverage_WithNullList() {
        double result = analyzer.calculateValidAverage(null);
        assertEquals(0.0, result);
    }

    @Test
    void testCalculateValidAverage_WithValidScores() {
        List<Double> scores = Arrays.asList(7.0, 8.0, 9.0);
        double result = analyzer.calculateValidAverage(scores);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    void testCalculateValidAverage_WithInvalidScores() {
        List<Double> scores = Arrays.asList(7.0, -5.0, 12.0, 9.0);
        double result = analyzer.calculateValidAverage(scores);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    void testCalculateValidAverage_WithOnlyInvalidScores() {
        List<Double> scores = Arrays.asList(-1.0, 11.0, 100.0);
        double result = analyzer.calculateValidAverage(scores);
        assertEquals(0.0, result);
    }

    @Test
    void testCalculateValidAverage_WithNullValues() {
        List<Double> scores = Arrays.asList(null, 8.0, null, 10.0);
        double result = analyzer.calculateValidAverage(scores);
        assertEquals(9.0, result, 0.001);
    }
}
