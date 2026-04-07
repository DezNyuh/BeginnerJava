package exercicios.entities;

public class UnderBank {

	public String name;
	public int account;
	public double cash;

	public UnderBank() {
	}

	public UnderBank(String name, int account, double cash) {
		this.name = name;
		this.account = account;
		this.cash = cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getCash() {
		return cash;
	}

	public void deposit(double cash) {
		this.cash += cash;
	}

	public void withdraw(double cash) {
		this.cash -= cash + 5;
	}
	public String toString() {
		return "Account " + account + ", Holder: " + name + ", Balance: $" + String.format("%.2f", getCash());
	}
}
