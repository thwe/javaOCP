package adapterClasses;

public class ApplikationAdapter {

	public static void main(String[] args) {
		UseAdapterClass.MyAdapter myAdapter = 
				new UseAdapterClass().new MyAdapter();
		myAdapter.method1();

	}

}
