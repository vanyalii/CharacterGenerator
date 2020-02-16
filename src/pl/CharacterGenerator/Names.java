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
        try {
            File file = new File("femaleName.txt");
            Scanner sc = new Scanner(file);
            sc.useDelimiter(",");
            while (sc.hasNext()){
                femaleName.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(femaleName.size());

        return femaleName.get(randomIndex);

    }
}
