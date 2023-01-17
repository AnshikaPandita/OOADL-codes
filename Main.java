package client;

import java.util.ArrayList;

import dev.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("STATE :MAHARASHTRA");
		ArrayList<String> name = new ArrayList<>();
		name.add("taxpayer1");
		name.add("taxpayer2");
		Taxpayer payer = new Taxpayer(560000, 12);
		Taxpayer payer1 = new Taxpayer(120000, 18);
		ArrayList<Taxpayer> tp = new ArrayList<>();
		tp.add(payer);
		tp.add(payer1);

		System.out.println("taxpayer\t\tannualincome\t\ttax");
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < tp.size(); i++) {
			System.out.println(name.get(i) + "\t\t" + tp.get(i).getIncome() + "\t\t\t" + tp.get(i).getTax());

		}
		State st = new State(tp);
		System.out.println("total state tax :" + st.state());
		System.out.println("\nSTATE : GOA");
		ArrayList<String> name1 = new ArrayList<>();
		name1.add("taxpayer1");
		name1.add("taxpayer2");
		Taxpayer payer2 = new Taxpayer(750000, 15);
		Taxpayer payer3 = new Taxpayer(900000, 12);
		ArrayList<Taxpayer> tp1 = new ArrayList<>();
		tp1.add(payer2);
		tp1.add(payer3);

		System.out.println("taxpayer\t\tannualincome\t\ttax");
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < tp.size(); i++) {
			System.out.println(name1.get(i) + "\t\t" + tp1.get(i).getIncome() + "\t\t\t" + tp1.get(i).getTax());

		}
		State st1 = new State(tp1);
		System.out.println("total state tax :" + st1.state());
	}

}