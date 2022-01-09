package Banco;

import java.util.Scanner;

public class ATM extends Banco {
	static Scanner ingreso = new Scanner(System.in);
	private int NumeroCuenta;
	private int NIIP;

	public int getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public int getNIIP() {
		return NIIP;
	}

	public void setNIIP(int nIIP) {
		NIIP = nIIP;
	}

	public void MostrarSaludo() {

		ingreso = new Scanner(System.in);

		System.out.println("Bienvenido a su cajero automatizado , por favor introdusca su numero de cuenta");

		NumeroCuenta = ingreso.nextInt();

		System.out.println("Por favor introdusca su NIP");
		NIIP = ingreso.nextInt();

		boolean existe = false;

		
		int nroCliente = BuscarCliente(NIIP,NumeroCuenta);
		
		if(nroCliente !=0) {
			System.out.println("Elija La opcion que desee ");
			System.out.println("1 - Depositar ");
			int valorAdepositar = 12;
			super.clientes.get(nroCliente).getCuenta().Depositar(valorAdepositar);
		}else {
			System.out.println("El cliente no Existe ");
		}
		

	}

	public int BuscarCliente(int NIP, int NumeroCuenta) {

		int numeroCliente = super.buscarClientes(NIP, NumeroCuenta);

		return numeroCliente;
	}

	public void CheckMaxCaracteres() {

	}

}
