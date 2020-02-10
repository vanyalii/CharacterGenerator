package pl.CharacterGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Names {
    public static String getMaleName() {

        ArrayList<String> maleName = new ArrayList<>();
        try {
            // Uworzenie obiektu FileReader
            FileReader fr = new FileReader("maleName.txt");

            // Utworzenie obiektu bufferReader
            BufferedReader bf = new BufferedReader(fr);

            String linia;

            while((linia = bf.readLine()) != null) {
                maleName.add(linia);
            }
            fr.close();

        } catch (IOException e) {
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
