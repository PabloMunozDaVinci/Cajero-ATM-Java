package Banco;

public class test {

	public static void main(String[] args) {
		
		
		Banco b1 = new Banco ();
		
		Cliente c1 = new Cliente("pablo","josesito");
		Cliente c2 = new Cliente("pablo2","josesito2");
		Cliente c3 = new Cliente("pablo3","josesito3");
		
		
		 c1.crearCuenta(1,1234,5000);
		
		 c2.crearCuenta(2,1222,2222);
		 c3.crearCuenta(3,1432,1111);
		
	
		 b1.addClientes(c1);
		 
		 
		 
	}
}
