package tddmicroexercises.leaderboard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class LeaderboardTest {

    @Test
    public void itShouldSumThePoints() {
        // setup

        // act
        Map<String, Integer> results = TestData.sampleLeaderboard1.calculateDriverResults();

        // verify
        assertTrue(results.containsKey("Lewis Hamilton"), "results " + results);
        assertEquals(18 + 18 + 25, (int) results.get("Lewis Hamilton"));
    }

    @Test
    public void isShouldFindTheWinner() {
        // setup

        // act
        List<String> result = TestData.sampleLeaderboard1.calculateDriverRankings();

        // verify
        assertEquals("Lewis Hamilton", result.get(0));
    }

    @Test
    public void itShouldKeepAllDriversWhenSamePoints() {
        // setup
        // bug, drops drivers with same points

        // act
        List<String> rankings = TestData.sampleLeaderboard2.calculateDriverRankings();

        // verify
        assertEquals(Arrays.asList(TestData.driver1.getName(), TestData.driver2.getName(), TestData.driver3.getName()), rankings);
        // note: the order of driver1 and driver2 is JDK/platform dependent
    }
}
