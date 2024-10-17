package Bancolombia;

public class Corriente extends Cuenta
{
	private long sobregiro;

	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo= saldo + valor;
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>saldo)
		{
			this.sobregiro=sobregiro-(valor-saldo);
			this.saldo=saldo-valor;
		}
		else
		{
			this.saldo=saldo-valor;
		}
	}

	@Override
	public String toString() {
		return "Corriente [sobregiro=" + sobregiro + "]";
	}
	
}

