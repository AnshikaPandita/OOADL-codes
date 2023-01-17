package dev;

import java.util.*; 
public class Bank {
	private ArrayList <Account> account=new ArrayList <Account> ();
	public ArrayList<Account> getAccount() {
		return account;
		}
	public void setAccount(ArrayList<Account> account) { 
		this.account = account;
		}
public void add(){
	account.addAll(account); 
	
}}