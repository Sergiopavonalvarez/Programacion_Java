package TAREA_POO_05_CUENTACORRIENTE;

public class CuentaCorriente {

	private String saldo;

	public int saldo() {

		return Integer.parseInt(saldo);

	}

	public void imposicion(int x) {

		int imposicion_saldo = Integer.parseInt(this.saldo) + x;
		this.saldo = Integer.toString(imposicion_saldo);
	}

	public void reintegro(int x) {

		int reintegro_saldo = Integer.parseInt(this.saldo) - x;
		this.saldo = Integer.toString(reintegro_saldo);
	}

	public CuentaCorriente() {
		saldo = "0";
	}

}
