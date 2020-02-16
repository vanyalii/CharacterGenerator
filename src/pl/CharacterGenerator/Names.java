package pl.CharacterGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Names {
    public static String getMaleName() {

        ArrayList<String> maleName = new ArrayList<>();
        try {
            File file = new File("maleName.txt");
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");
            while (sc.hasNext()){
                maleName.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(maleName.size());

        return maleName.get(randomIndex);
    }
    public static String getFemaleName() {

        ArrayList<String> femaleName = new ArrayList<>();
        femaleName.add("Aaron");
        femaleName.add("Anna");
        femaleName.add("Agnieszka");
        femaleName.add("Alan");
        femaleName.add("Albert");
        femaleName.add("Alek");
        femaleName.add("Aleks");
        femaleName.add("Aleksander");
        femaleName.add("Aleksy");
        femaleName.add("Alex");
        femaleName.add("Alexander");
        femaleName.add("Alfred");
        femaleName.add("Allan");
        femaleName.add("Alojzy");
        femaleName.add("Amadeusz");
        int randomIndex = ThreadLocalRandom.current().nextInt(femaleName.size());

        return femaleName.get(randomIndex);
    }
}
