import java.util.*;

public class TestScoreAnalyzer {
    public static void main(String[] args) {
        // Sample student test scores
        List<Integer> testScores = Arrays.asList(85, 92, 78, 88, 90, 72, 68, 95, 82, 75);

        // Calculate average score
        double averageScore = calculateAverage(testScores);

        // Calculate median score
        double medianScore = calculateMedian(testScores);

        // Count scores
        int aboveAverageCount = countAboveAverage(testScores, averageScore);
        int atAverageCount = countAtAverage(testScores, averageScore);
        int belowAverageCount = countBelowAverage(testScores, averageScore);

        // Print results
        System.out.println("Test Score Analysis:");
        System.out.println("Average Score: " + averageScore);
        System.out.println("Median Score: " + medianScore);
        System.out.println("Number of Students Above Average: " + aboveAverageCount + ", Median Score: " + calculateMedian(getAboveAverageScores(testScores, averageScore)));
        System.out.println("Number of Students At Average: " + atAverageCount + ", Median Score: " + calculateMedian(getAtAverageScores(testScores, averageScore)));
        System.out.println("Number of Students Below Average: " + belowAverageCount + ", Median Score: " + calculateMedian(getBelowAverageScores(testScores, averageScore)));
    }

    // Method to calculate the average score
    public static double calculateAverage(List<Integer> scores) {
        return scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Method to calculate the median score
    public static double calculateMedian(List<Integer> scores) {
        Collections.sort(scores);
        int size = scores.size();
        if (size % 2 == 0) {
            return (scores.get(size / 2 - 1) + scores.get(size / 2)) / 2.0;
        } else {
            return scores.get(size / 2);
        }
    }

    // Method to get scores above average
    public static List<Integer> getAboveAverageScores(List<Integer> scores, double average) {
        return scores.stream().filter(score -> score > average).collect(Collectors.toList());
    }

    // Method to get scores at average
    public static List<Integer> getAtAverageScores(List<Integer> scores, double average) {
        return scores.stream().filter(score -> score == average).collect(Collectors.toList());
    }

    // Method to get scores below average
    public static List<Integer> getBelowAverageScores(List<Integer> scores, double average) {
        return scores.stream().filter(score -> score < average).collect(Collectors.toList());
    }

    // Method to count scores above average
    public static int countAboveAverage(List<Integer> scores, double average) {
        return (int) scores.stream().filter(score -> score > average).count();
    }

    // Method to count scores at average
    public static int countAtAverage(List<Integer> scores, double average) {
        return (int) scores.stream().filter(score -> score == average).count();
    }

    // Method to count scores below average
    public static int countBelowAverage(List<Integer> scores, double average) {
        return (int) scores.stream().filter(score -> score < average).count();
    }
}
