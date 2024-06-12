package tddmicroexercises.leaderboard;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Leaderboard {

    private final List<Race> races;

    public Leaderboard(List<Race> races) {
        this.races = races;
    }

    public Map<String, Integer> calculateDriverResults() {
        return races.stream()
                .flatMap(Race::getResults)
                .collect(Collectors.groupingBy(Driver::getName,
                        Collectors.summingInt(race -> race.getPoints(race))));
    }

    public List<String> calculateDriverRankings() {
        return calculateDriverResults().entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue).reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
