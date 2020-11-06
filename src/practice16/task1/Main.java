package practice16.task1;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        CardManager cardManager;

        System.out.println ( "Enter cards amount per deck:" );
        cardManager = new CardManager ( scanner.nextInt ( ) );

        cardManager.setCards ( scanner , cardManager.getFirstPlayerDeck ( ) );
        cardManager.setCards ( scanner , cardManager.getSecondPlayerDeck ( ) );

        cardManager.peekCard ( cardManager.getFirstPlayerDeck ( ) , cardManager.getSecondPlayerDeck ( ) );
    }
}