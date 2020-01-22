package pl.CharacterGenerator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Race.Elf elf = new Race.Elf();
        Race.Human human = new Race.Human();

        int diceGeneratorResaultTo20WW = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20US = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20K = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20ODP = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20ZR = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20INT = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20SW = DiceGenerator.getRandomNumerTo20();
        int diceGeneratorResaultTo20OGD = DiceGenerator.getRandomNumerTo20();


        ArrayList<Integer> attributsResault = new ArrayList<>();

        System.out.println("Wybierz płeć: ");
        System.out.println("1. Mężczyzna");
        System.out.println("2. Kobieta");
        int choiceSex = sc.nextInt();

        String newline = System.lineSeparator();

        switch (choiceSex){
            case 1:{

                System.out.println("Randomowe generowanie męskiego imienia...");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String maleName = Names.getMaleName();
                System.out.println("Twoje imię to: " + maleName + newline);
                break;
            }
            case 2:{

                System.out.println("Randomowe generowanie męskiego imienia...");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String maleName = Names.getFemaleName();
                System.out.println("Twoje imię to: " + maleName + newline);
                break;
            }
        }

        System.out.println("Wybierz rase:");
        System.out.println("1: Elf");
        System.out.println("2: Człowiek");
        System.out.println("3: Krasnolud");
        int choiceRace = sc.nextInt();

        switch(choiceRace){
            case 1:
            {
                attributsResault.add(diceGeneratorResaultTo20WW + elf.WW);
                attributsResault.add(diceGeneratorResaultTo20US + elf.US);
                attributsResault.add(diceGeneratorResaultTo20K + elf.K);
                attributsResault.add(diceGeneratorResaultTo20ODP + elf.ODP);
                attributsResault.add(diceGeneratorResaultTo20ZR + elf.ZR);
                attributsResault.add(diceGeneratorResaultTo20INT + elf.INT);
                attributsResault.add(diceGeneratorResaultTo20SW + elf.SW);
                attributsResault.add(diceGeneratorResaultTo20OGD + elf.OGD);
                attributsResault.add(elf.SZ);
                int S = attributsResault.get(2);
                int strongResault = S/10;
                int WT = attributsResault.get(3);
                int resistanceResault = WT/10;
                attributsResault.add(strongResault);
                attributsResault.add(resistanceResault);
                attributsResault.add(elf.ZYW());
                attributsResault.add(elf.PP());

                System.out.println("Oto wylosowane atrybuty Elfa: " + newline + "Twoja walka wręcz: " + attributsResault.get(0) + newline + "Twoje umiejętności strzeleckie: " + attributsResault.get(1) + newline + "Twoja krzepa: " + attributsResault.get(2) + newline + "Twoja odporność: " + attributsResault.get(3) + newline + "Twoja zręczność: " + attributsResault.get(4) + newline + "Twoja inteligencja: " + attributsResault.get(5) + newline + "Twoja siła woli: " + attributsResault.get(6) + newline + "Twoja ogłada: " + attributsResault.get(7) + newline + "Twoja szybkość: " + attributsResault.get(8) + newline + "Twoja siła: " + attributsResault.get(9) + newline + "Twoja odporność: " + attributsResault.get(10) + newline + "Twoja żywotność: " + attributsResault.get(11) + newline + "Twoje punkty przeznaczenia: " + attributsResault.get(12));
                break;
            }
                case 2: {
                    System.out.println(diceGeneratorResaultTo20INT);
                    attributsResault.add(diceGeneratorResaultTo20WW + human.WW);
                    attributsResault.add(diceGeneratorResaultTo20US + human.US);
                    attributsResault.add(diceGeneratorResaultTo20K + human.K);
                    attributsResault.add(diceGeneratorResaultTo20ODP + human.ODP);
                    attributsResault.add(diceGeneratorResaultTo20ZR + human.ZR);
                    attributsResault.add(diceGeneratorResaultTo20INT + human.INT);
                    attributsResault.add(diceGeneratorResaultTo20SW + human.SW);
                    attributsResault.add(diceGeneratorResaultTo20OGD + human.OGD);
                    attributsResault.add(human.SZ);
                    int S = attributsResault.get(2);
                    int strongResault = S / 10;
                    int WT = attributsResault.get(3);
                    int resistanceResault = WT / 10;
                    attributsResault.add(strongResault);
                    attributsResault.add(resistanceResault);
                    attributsResault.add(human.ZYW());
                    attributsResault.add(human.PP());

                    System.out.println("Oto wylosowane atrybuty Człowieka: " + newline + "Twoja walka wręcz: " + attributsResault.get(0) + newline + "Twoje umiejętności strzeleckie: " + attributsResault.get(1) + newline + "Twoja krzepa: " + attributsResault.get(2) + newline + "Twoja odporność: " + attributsResault.get(3) + newline + "Twoja zręczność: " + attributsResault.get(4) + newline + "Twoja inteligencja: " + attributsResault.get(5) + newline + "Twoja siła woli: " + attributsResault.get(6) + newline + "Twoja ogłada: " + attributsResault.get(7) + newline + "Twoja szybkość: " + attributsResault.get(8) + newline + "Twoja siła: " + attributsResault.get(9) + newline + "Twoja odporność: " + attributsResault.get(10) + newline + "Twoja żywotność: " + attributsResault.get(11) + newline + "Twoje punkty przeznaczenia: " + attributsResault.get(12));
                break;

            }
        }


    }

}



