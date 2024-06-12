package tddmicroexercises.leaderboard;

import java.util.List;

public class RegularRace implements Race {
    private final List<Driver> results;
    private final Integer[] points; // Added points array

    public RegularRace(List<Driver> results, Integer[] points) {
        this.results = results;
        this.points = points;
    }

    @Override
    public List<Driver> getResults() {
        return results;
    }

    @Override
    public int getPoints(Driver driver) {
        return points[results.indexOf(driver)];
    }

    @Override
    public Integer[] getPointsArray() {
        return points;
    }

}
