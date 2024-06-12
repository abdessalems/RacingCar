package tddmicroexercises.leaderboard;

import java.util.Arrays;

public class TestData {

    public static Driver driver1;
    public static Driver driver2;
    public static Driver driver3;
    public static SelfDrivingCar driver4;

    public static Race race1;
    public static Race race2;
    public static Race race3;
    public static Race race4;
    public static Race race5;
    public static Race race6;

    public static Leaderboard sampleLeaderboard1;
    public static Leaderboard sampleLeaderboard2;

    static {
        driver1 = new Driver("Nico Rosberg", "DE");
        driver2 = new Driver("Lewis Hamilton", "UK");
        driver3 = new Driver("Sebastian Vettel", "DE");
        driver4 = new SelfDrivingCar("1.2", "Acme");

        race1 = new RegularRace(Arrays.asList(driver1, driver2, driver3), new Integer[]{25, 18, 15});
        race2 = new RegularRace(Arrays.asList(driver3, driver2, driver1), new Integer[]{25, 18, 15});
        race3 = new RegularRace(Arrays.asList(driver2, driver1, driver3), new Integer[]{25, 18, 15});
        race4 = new RegularRace(Arrays.asList(driver1, driver2, driver4), new Integer[]{25, 18, 15});
        race5 = new RegularRace(Arrays.asList(driver4, driver2, driver1), new Integer[]{25, 18, 15});
        race6 = new RegularRace(Arrays.asList(driver2, driver1, driver4), new Integer[]{25, 18, 15});

        sampleLeaderboard1 = new Leaderboard(Arrays.asList(race1, race2, race3));
        sampleLeaderboard2 = new Leaderboard(Arrays.asList(race4, race5, race6));
    }
}
