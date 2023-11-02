package TAREA_POO_05_CUENTACORRIENTE;

public class CuentaCorrienteTest {
public static void main(String[] args) {
CuentaCorriente cc=new CuentaCorriente();
cc.imposicion(200);
cc.reintegro(300);
System.out.println(cc.saldo());
}
}
