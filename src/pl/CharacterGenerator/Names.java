package pl.CharacterGenerator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Names {
    public static String getMaleName() {

        ArrayList<String> maleName = new ArrayList<>();
        maleName.add("Aaron");
        maleName.add("Adam");
        maleName.add("Adrian");
        maleName.add("Alan");
        maleName.add("Albert");
        maleName.add("Alek");
        maleName.add("Aleks");
        maleName.add("Aleksander");
        maleName.add("Aleksy");
        maleName.add("Alex");
        maleName.add("Alexander");
        maleName.add("Alfred");
        maleName.add("Allan");
        maleName.add("Alojzy");
        maleName.add("Amadeusz");
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
