package Book2.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class DownstreamCollectors {
    public static class City {
        private String name;
        private String state;
        private int population;

        public City(String name, String state, int population) {
            this.name = name;
            this.state = state;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }

        public int getPopulation() {
            return population;
        }
    }

    public static Stream<City> readsCities(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                .map(l -> l.split(", "))
                .map(a -> new City(a[0], a[1],
                        Integer.parseInt(a[2])));
    }

    public static void main(String[] args) throws IOException {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        locales = Stream.of(Locale.getAvailableLocales());

        Map<String, Set<Locale>> countryToLocaleSet = locales.collect(groupingBy(
                Locale::getCountry, toSet()));
        System.out.println("countryToLocaleSet: " + countryToLocaleSet);

        locales = Stream.of(Locale.getAvailableLocales());
        Map<String, Long> countryToLocaleCounts = locales.collect(groupingBy(
                Locale::getCountry, counting()));
        System.out.println("countryToLocaleCounts: " + countryToLocaleCounts);

        Stream<City> cities = readsCities("e:cities.txt");
        Map<String,Integer> stateToCityPopulation = cities.collect(groupingBy(
                City::getState,summingInt(City::getPopulation)));
        System.out.println("stateToCityPopulation: " + stateToCityPopulation);

        cities = readsCities("e:cities.txt");
        Map<String, Optional<String>> stateToLongestCityName = cities.collect(groupingBy(
                City::getState, mapping(City::getName,
                maxBy(Comparator.comparing(String::length)))));
        System.out.println("stateToLongestCityName: " + stateToLongestCityName);

        cities = readsCities("e:cities.txt");
        Map<String, IntSummaryStatistics> stateToCityPopulationSummary = cities.collect(
                groupingBy(City::getState, summarizingInt(City::getPopulation)));
        System.out.println();
        System.out.println(stateToCityPopulationSummary.get("NY"));
    }
}
