package ejemplo2;

public class D extends B {
	private int atributoD;
	
	public D(int atributoA, int atributoB, int atributoD) {
		super(atributoA, atributoB);
		this.atributoD = atributoD;
	}

	public int metodoD() {
		System.out.println("método D");
		System.out.println();
		return atributoD;
	}
}
