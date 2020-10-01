package techio.java.stream;

import java.util.List;
import java.util.stream.Collectors;

public class WinnersOfToursGreaterOrLessThan3500km {

    public void winnersOfToursGreaterOrLessThan3500km() {
        // Filter and Map -
        List<String> winnerOfToursLessThan3500km = Winner.tdfWinners
                .stream()
                .filter(d -> d.getLengthKm() < 3500) // Separate out Tours less than 3500km
                .map(Winner::getName) // Get names of winners
                .collect(Collectors.toList()); // Return a list

        // Winners of Tours Less than 3500km - [Alberto Contador, Cadel Evans, Bradley Wiggins, Chris Froome, Chris Froome]
        System.out.println("Winners of Tours Less than 3500km - " + winnerOfToursLessThan3500km);

        List<String> winnersOfToursGreaterThan3500km = Winner.tdfWinners
                .stream()
                .filter(d -> d.getLengthKm() >= 3500)
                .map(Winner::getName)
                .collect(Collectors.toList());
        // Winners of Tours Greater than 3500km - [Oscar Pereiro, Alberto Contador, Carlos Sastre, Andy Schleck, Vincenzo Nibali, Chris Froome]
        System.out.println("Winners of Tours Greater than 3500km - " + winnersOfToursGreaterThan3500km);
    }

    public static void main(String[] args) {
        WinnersOfToursGreaterOrLessThan3500km winnersOfToursGreaterOrLessThan3500km = new WinnersOfToursGreaterOrLessThan3500km();
        winnersOfToursGreaterOrLessThan3500km.winnersOfToursGreaterOrLessThan3500km();
    }
}
