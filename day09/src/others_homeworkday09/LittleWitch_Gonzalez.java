public class LittleWitch {
  
  public static void main(String[] args) {
    int clock = 0;
    while(clock <= 23){
      hexeAktivitaeten(clock);
      
      clock++;
    }
  }
  
  public static void hexeAktivitaeten(int clock){
    switch(clock){
      case 22:
      case 23:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Die kleine Hexe schlaeft (es ist " + clock + " Uhr).");
      break;
      case 6:
        System.out.println("Morgens frueh um 6");
        System.out.println("kommt die kleine Hex.");
        break;
      case 7:
        System.out.println("Morgens frueh um 7");
        System.out.println("schabt sie gelbe Rueben.");
        break;
      case 8:
        System.out.println("Morgens frueh um 8");
        System.out.println("wird Kaffee gemacht.");
        break;
      case 9:
        System.out.println("Morgens frueh um 9");
        System.out.println("geht sie in die Scheun'.");
        break;
      case 10:
        System.out.println("Morgens frueh um 10");
        System.out.println("hackt sie Holz und Spaen'.");
        break;
      case 11:
        System.out.println("Feuert an um 11,");        
        break;
      case 12:
        System.out.println("kocht dann bis um 12:");
        System.out.println("Froeschebein und Krebs und Fisch.");
        System.out.println("Hurtig Kinder kommt zu Tisch!");
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
        System.out.println("Die kleine Hexe spielt (es ist " + clock + " Uhr).");
      break;
      default:
        System.out.println("Keine Ahnung.");
      break;      
    }    
    
  }
  
}