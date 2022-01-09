package Banco;

public class Cuenta {

	
	
	private double saldo;
	private double NumeroCuenta;
	private double NIP;
	private double balance;

	
	public Cuenta () {}
	public Cuenta (double NumeroCuenta,double NIP,double balance) {
		this.NumeroCuenta=NumeroCuenta;
		this.NIP=NIP;
		this.balance=balance;
		
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getNumeroCuenta() {
		return NumeroCuenta;
	}
	public void setNumeroCuenta(double numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}
	public double getNIP() {
		return NIP;
	}
	public void setNIP(double nIP) {
		NIP = nIP;
	}
	
    public void Depositar(double cantidad) {
        balance += cantidad;
    }
    
   

    public boolean Extraer(double cantidad) {
    	if(cantidad <= balance) {
            balance -= cantidad;
            
            return true;
       
    }else {
    	return false;
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}