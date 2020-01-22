package pl.CharacterGenerator;

import java.util.Random;

public class DiceGenerator{

    public static int getRandomNumerTo20() {
        Random rand = new Random();
        int dg = rand.nextInt(21);
        if (dg < 2){
            do {
                dg = rand.nextInt(21);
            } while (dg < 2);
        }
        return dg;
    }

    public static int getRandomNumerTo10() {
        Random rand = new Random();
        int dg = rand.nextInt(11);

        return dg;
    }
}