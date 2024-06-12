package tddmicroexercises.leaderboard;


import java.util.List;

public interface Race {
    List<Driver> getResults();
    int getPoints(Driver driver);
}
