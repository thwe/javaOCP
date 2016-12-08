package anonymousInnerClasses.classes02;

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}



class Food{
	Popcorn p = new Popcorn(){
		@Override
		public void pop() {
			System.out.println("anonymous popcorn");
		}
		
		public void sizzle(){
			System.out.println("anonymous sizzling popcorn");
		}

	};
	
	
	public void popIt(){
		p.pop();
		//p.sizzle();
		//Popcorn hat keine Methode sizzle()
		
		new Popcorn(){
			@Override
			public void pop() {
				System.out.println("anonymous popcorn");
			}
			
			public void sizzle(){
				System.out.println("anonymous sizzling popcorn");
			}
		}.sizzle();
	}
	
	public static void main(String[] args) {
		Food food = new Food();
		food.popIt();
	}
}
