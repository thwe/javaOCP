package hausaufgabeWitchEnum;

public class LittleWitchEnum {
	
	enum Clock {SECHS, SIEBEN, ACHT, NEUN, ZEHN, ELF, ZWOELF
	}
	
	public static void main(String[] args) {
		witchTime2();
		//witchTime();
	}

	public static void witchTime() {
	//	Clock[] clock = Clock.values();
		
		for(Clock clock1 : Clock.values()){
			//System.out.println(clock1);
		
		switch (clock1) {
		case SECHS:
			System.out.println("Morgens früh um 6 kommt die kleine Hex");
			break;
		case SIEBEN:
			System.out.println("Morgens früh um 7 schabt sie gelbe Rüben.");
			break;
		case ACHT:
			System.out.println("Morgens früh um 8 wird Kaffee gemacht.");
			break;
		case NEUN:
			System.out.println("Morgens früh um 9 geht sie in die Scheun'.");
			break;
		case ZEHN:
			System.out.println("Morgens früh um 10 hackt sie Holz und Spän'.");
			break;
		case ELF:
			System.out.println("Feuert an um 11, kocht dann bis um 12:");
			break;
		case ZWOELF:
			System.out.println("Fröschebein und Krebs und Fisch. Hurtig Kinder kommt zu Tisch!");
			break;
		default:
			System.out.println("oups!");
			break;
		}
		}
	}
		public static void witchTime2() {
				Clock[] clock = Clock.values();
				for (int i = 0; i < clock.length; i++) {
					
					switch (clock[i]) {
					case SECHS:
						System.out.println("Morgens früh um 6 kommt die kleine Hex");
						break;
					case SIEBEN:
						System.out.println("Morgens früh um 7 schabt sie gelbe Rüben.");
						break;
					case ACHT:
						System.out.println("Morgens früh um 8 wird Kaffee gemacht.");
						break;
					case NEUN:
						System.out.println("Morgens früh um 9 geht sie in die Scheun'.");
						break;
					case ZEHN:
						System.out.println("Morgens früh um 10 hackt sie Holz und Spän'.");
						break;
					case ELF:
						System.out.println("Feuert an um 11, kocht dann bis um 12:");
						break;
					case ZWOELF:
						System.out.println("Fröschebein und Krebs und Fisch. Hurtig Kinder kommt zu Tisch!");
						break;
					default:
						System.out.println("oups!");
						break;
					}
				}
				for(Clock clock1 : clock){
					//System.out.println(clock1);
				
				
				}
	}
}
