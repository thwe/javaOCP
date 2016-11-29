package bookexample_inheritance;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerPiece shape = new PlayerPiece();
		shape.displayShape();
		shape.movePiece();
		
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
		
		
		Object o = player;
		GameShape shape1 = player;
		Animatable mover = player;
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
		}

}
