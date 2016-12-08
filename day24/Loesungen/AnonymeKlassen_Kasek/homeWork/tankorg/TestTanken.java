package homeWork.tankorg;

public class TestTanken {

	public static void main(String[] args) {
		TankSaeule tanksaeule = new TankSaeule();
		Tank tank = new Tank(50, 10);
		
		tanksaeule.tankstutzenEntnehmen(tank);
		tanksaeule.startTanken();
	}
}