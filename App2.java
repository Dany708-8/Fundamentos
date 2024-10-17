package Bancolombia;

public class App2 {

	public static void main(String[] args) {
		Ahorro ahorro = new Ahorro(1222,"Daniel Vergara",100L);
		ahorro.deposito(10000L);
		ahorro.retiro(500L);
		Corriente corriente = new Corriente(4356,"Daniel Oviedo",500000);
		corriente.deposito(5000);
		corriente.retiro(520424);
		// TODO Auto-generated method stub
		
		

	}

}
