package client;

import java.util.*;
import dev.*;

public class Main {
	public static void main(String[] args) {
		Account_holder ah1 = new Account_holder("Rahul");
		Account_holder ah2 = new Account_holder("Varun");
		Account_holder ah3 = new Account_holder("Rohan");
		Account_holder ah4 = new Account_holder("Ram");
		Saving_acc s1 = new Saving_acc(1111001100, 10000.5, ah1);
		double bal = s1.deposit(4000);
		System.out.println("Balance in s1 after deposit:" + bal);
		bal = s1.deposit(3700);
		System.out.println("Balance in s1 after deposit:" + bal);
		bal = s1.withdraw(2000);
		System.out.println("Balance in s1 after withdraw:" + bal);
		System.out.println("\n");
		Saving_acc s2 = new Saving_acc(1101000100, 5000.0, ah2);
		bal = s2.deposit(6000);
		System.out.println("Balance in s3 after deposit:" + bal);
		bal = s2.withdraw(2000);
		System.out.println("Balance in s2 after withdraw:" + bal);
		bal = s2.withdraw(2000);
		System.out.println("Balance in s3 after withdraw:" + bal);
		System.out.println("\n");
		Saving_acc s3 = new Saving_acc(1101100110, 2000.0, ah3);
		bal = s3.deposit(6000);
		System.out.println("Balance in s3 after deposit:" + bal);
		s3.transfer(s1, 4000);
		System.out.println("\n");
		Current_acc c1 = new Current_acc(1101100000, 25000.00, ah4);
		bal = c1.deposit(10000);
		System.out.println("Balance in c1 after deposit:" + bal);
		c1.withdraw(30000);
		System.out.println("Balance in c1 after withdraw:" + bal);
		c1.withdraw(10000);
		System.out.println("Balance in c1 after withdraw:" + bal);
	}
}