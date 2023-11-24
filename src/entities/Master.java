package entities;

public class Master {

	public static void main(String[] args) {
		
		MainClass Main = new MainClass();
		
		System.out.println("Selecting String Type and Bubble Sort");
		Main.selectObjectType(new StringObject());
		Main.selectSortType(new BubbleSort());
		
		System.out.println("Filling String with random chars");
		Main.fillList();
		
		Main.sortList();
	}

}
