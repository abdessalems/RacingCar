package tddmicroexercises.leaderboard;


import java.util.List;

public interface Race {
    List<Driver> getResults();
    int getPoints(Driver driver);
    Integer[] getPointsArray(); // New method to get the points array

}
