package client;

import java.util.*;
import dev.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Bank b = new Bank();
		Name n1 = new Name("f1", "l1");
		Name n2 = new Name("f2", "l2");
		Fixed_Deposit f1 = new Fixed_Deposit(5000, 2, 10);
		Fixed_Deposit f2 = new Fixed_Deposit(5000, 3, 10);
		b.ADD(n1);
		b.acnname(n1);
		f1.Deposit();
		b.ADD(n2);
		b.acnname(n2);
		f2.Deposit();
		Loan_Account l1 = new Loan_Account(8000, 2, 2);
		l1.Deposit();
		l1.emiCal();
		l1.repaid();
	}
}