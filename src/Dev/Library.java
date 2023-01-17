package Dev;

import java.util.*;

public class Library {
	private Library_item li;

	public Library_item getLi() {
		return li;
	}

	public void setLi(Library_item li) {
		this.li = li;
	}

	public ArrayList<Library_item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Library_item> item) {
		this.item = item;
	}

	private ArrayList<Library_item> item = new ArrayList<Library_item>();

	public void add(Library_item i) {
		item.add(i);
	}

	public void search(Library_item i) {
		if (item.contains(i)) {
			System.out.println("Item Found!!!!");
			System.out.println("Title:" + i.getTitle());
			System.out.println("Price:" + i.getPrice());
			i.display();
		} else {
			System.out.println("Not Found!!!!");
		}
	}
}