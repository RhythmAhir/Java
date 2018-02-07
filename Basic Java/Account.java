package summer16;

public class Account {
    private String name, number, phoneNo;
    private double balance;
    
    public Account(String name, String number, String phoneNo) {
        this.name = name;
    }
    
    public Account(String name, String number, double balance) {
        this.balance = balance;
    }
    
    public void setPhoneNo(String phoneNo) {
        
    }
    
    public String getPhoneNo() {
        return null;
    }
    
    public double deposit(double value) {
        balance = balance + value;
        return balance;
    }
    
    public boolean withdraw(double value) {
        if (balance<value) return false;
        balance = balance - value;
        return true;
    }
    
    public double getBalance() {
        return balance;   
    }
    
    public String toString() {
        return name + ", " + phoneNo;
    }
}
