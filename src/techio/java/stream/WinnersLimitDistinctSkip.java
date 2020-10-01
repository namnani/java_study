package techio.java.stream;

import java.util.List;
import java.util.stream.Collectors;

public class WinnersLimitDistinctSkip {
    public void winnerLimitDistinctSkip() {
        // limit -
        List<Winner> winnerObjectsOfToursLessThan3500kmLimit2 = techio.java.stream.Winner.tdfWinners
                .stream()
                .filter(d -> d.getLengthKm() < 3500)
                .limit(2)
                .collect(Collectors.toList());
        // winnerObjectsOfToursLessThan3500kmLimit2 [Alberto Contador, Cadel Evans]
        System.out.println("winnerObjectsOfToursLessThan3500kmLimit2 " + winnerObjectsOfToursLessThan3500kmLimit2);

        List<String> firstTwoWinnersOfToursLessThan3500km = Winner.tdfWinners
                .stream()
                .filter(d -> d.getLengthKm() < 3500)
                .map(Winner::getName)
                .limit(2)
                .collect(Collectors.toList());
        // firstTwoWinnersOfToursLessThan3500km - [Alberto Contador, Cadel Evans]
        System.out.println("firstTwoWinnersOfToursLessThan3500km - " + firstTwoWinnersOfToursLessThan3500km);

        // filter by distinct
        List<String> distinctTDFWinners = Winner.tdfWinners
                .stream()
                .map(Winner::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinctTDFWinners - " + distinctTDFWinners);

        long numberOfDistinctWinners = Winner.tdfWinners
                .stream()
                .map(Winner::getName)
                .distinct()
                .count();
        // numberOfDistinctWinners - 8
        System.out.println("numberOfDistinctWinners - " + numberOfDistinctWinners);

        // skip records
        List<Winner> skipEveryOtherTDFWinner = Winner.tdfWinners
                .stream()
                .skip(2)
                .collect(Collectors.toList());
        // skipEveryOtherTDFWinner - [Carlos Sastre, Alberto Contador, Andy Schleck, Cadel Evans, Bardley Wiggins, Chris Froome, Vincenzo Nibali, Chris Froome, Chris Froome]
        System.out.println("skipEveryOtherTDFWinner - " + skipEveryOtherTDFWinner);
    }


    public static void main(String[] args) {
        WinnersLimitDistinctSkip winnersLimitDistinctSkip = new WinnersLimitDistinctSkip();
        winnersLimitDistinctSkip.winnerLimitDistinctSkip();
    }
}
