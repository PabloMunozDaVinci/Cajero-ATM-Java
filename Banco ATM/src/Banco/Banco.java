package Banco;

import java.util.ArrayList;

public class Banco {

	ArrayList<Cliente> clientes;

	private int numberOfClientes;

	public Banco() {
		this.clientes = new ArrayList<Cliente>();

	}

	public void addClientes(Cliente cliente) {
		this.clientes.add(cliente);

	}

	public int getNumOfClientes() {
		return numberOfClientes;
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public int buscarClientes(int NIP, int NumeroCuenta) {

		int numerocliente = 0;

		boolean encontre = false;

		int i = 0;

		while (i < this.clientes.size() || encontre == true) {

			if (this.clientes.get(i).getCuenta().getNIP() == NIP
					&& this.clientes.get(i).getCuenta().getNumeroCuenta() == NumeroCuenta) {

				numerocliente = i;

				encontre = true;

			}

		}

		return numerocliente;

	}

}