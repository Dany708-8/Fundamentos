package Bancolombia;

public abstract class Cuenta
{
	protected int numeroCuenta;
	protected String titular;
	protected long saldo;
	public Cuenta(int numeroCuenta, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
	}
	public abstract void deposito(long valor);
	public abstract void retiro(long valor);
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
}