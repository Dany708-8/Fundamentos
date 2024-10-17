package Bancolombia;

public class Ahorro extends Cuenta
{
	private long interes;

	public Ahorro(int numeroCuenta, String titular, long interes) {
		super(numeroCuenta, titular);
		this.interes = interes;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo= saldo + valor;
		this.interes= (long) (valor *0.3);

		System.out.println("Deposito:" + "saldo:" + saldo + " interes: " + interes + " valor deposito: " + valor);
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor<=saldo)
		{
			this.saldo=saldo-valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	
}
