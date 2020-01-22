package pl.CharacterGenerator;

class Race{

static class Elf {
 int WW = 20;
 int US = 30;
 int K = 20;
 int ODP = 20;
 int ZR = 30;
 int INT = 20;
 int SW = 20;
 int OGD = 20;
 int SZ = 5;
 
 public static int ZYW() {
  int zywResault = DiceGenerator.getRandomNumerTo10();
  int zyw = 0;
  if (zywResault <= 3) {
   zyw = 9;
  } else if (zywResault <= 6) {
   zyw = 10;
  } else if (zywResault <= 9) {
   zyw = 11;
  } else if (zywResault == 10){
   zyw = 12;
  }
  return zyw;
 }

 public static int PP(){
  int szczResault = DiceGenerator.getRandomNumerTo10();
  int szcz = 0;
  if (szczResault <=4){
   szcz = 1;
  }else szcz = 2;
  return szcz;
 }
}
 static class Human {
  int WW = 20;
  int US = 20;
  int K = 20;
  int ODP = 20;
  int ZR = 20;
  int INT = 20;
  int SW = 20;
  int OGD = 20;
  int SZ = 4;

  public static int ZYW() {
   int zywResault = DiceGenerator.getRandomNumerTo10();
   int zyw = 0;
   if (zywResault <= 3) {
    zyw = 10;
   } else if (zywResault <= 6) {
    zyw = 11;
   } else if (zywResault <= 9) {
    zyw = 12;
   } else if (zywResault == 10){
    zyw = 13;
   }
   return zyw;
  }

  public static int PP(){
   int szczResault = DiceGenerator.getRandomNumerTo10();
   int szcz = 0;
   if (szczResault <=4){
    szcz = 2;
   }else szcz = 3;
   return szcz;
  }

 }
 /*static class Dwarf {
  int WW = 20;
  int US = 20;
  int K = 20;
  int ODP = 20;
  int ZR = 20;
  int INT = 20;
  int SW = 20;
  int OGD = 20;
  int SZ = 5;
  int ZW;
 }*/
}
