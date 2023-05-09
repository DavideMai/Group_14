public class Assegnare_punteggi {

	
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CardGame {
    public static void main(String[] args) {
        // Definizione di colori e coordinate
        String[] colors = {"blue", "green", "yellow", "white", "pink", "sky"};
        int[][] coords = new int[30][2];
        int index = 0;
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 6; x++) {
                coords[index][0] = x;
                coords[index][1] = y;
                index++;
            }
        }

        // Definire le variabili
        int score = 0;
        ArrayList<String> cards = new ArrayList<String>();

        // Ricevi input dal lettore
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Choose card " + (i+1) + ":");
            String card = scanner.nextLine();
            cards.add(card);
        }

        // Controlla che i colori corrispondano
        Set<String> uniqueCards = new HashSet<String>(cards);
        int numUniqueCards = uniqueCards.size();
        if (numUniqueCards == 1) {
            score += 10;
            System.out.println("Congratulations, you got 10 points!");
        } else if (numUniqueCards == 2) {
            score += 3;
            System.out.println("Good job, you got 3 points!");
        } else {
            System.out.println("Sorry, you didn't score any points.");
        }

        // Cerca 4 carte dello stesso colore
        if (numUniqueCards == 1 && cards.size() == 4) {
            score += 3;
            System.out.println("You also got 3 bonus points for having 4 cards of the same color.");
        }

        // Controlla se ci sono 5 carte o 6 carte dello stesso colore
        Set<String> cardSet = new HashSet<String>(cards);
        Set<String> connectedSet1 = new HashSet<String>(Arrays.asList(colors).subList(0, 5));
        Set<String> connectedSet2 = new HashSet<String>(Arrays.asList(colors).subList(1, 6));
        if (cardSet.equals(connectedSet1) || cardSet.equals(connectedSet2)) {
            score += 5;
            System.out.println("You also got 5 bonus points for having 5 connected cards of the same color.");
        } else if (cardSet.equals(new HashSet<String>(Arrays.asList(colors)))) {
            score += 8;
            System.out.println("You also got 8 bonus points for having 6 connected cards of the same color.");
        }

    }
}
	
