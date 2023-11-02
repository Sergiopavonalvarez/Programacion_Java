package POO_Carrera;

public class Test {

	public static void main(String[] args) {
		
		
//		Carrera b=new Carrera(1000, 3, 2023);
		
		Resultado o=new Resultado(100, 1);
		Atleta a=new Atleta("Eduardo", 1988 ,o);
		
//		System.out.println(a.getresultad());
//		System.out.println(a.getcarrera());
//		System.out.println(a.toString());
//		System.out.println();
		
		Calle h=new Calle(1);
		h.setAtleta(a);
		h.setTiempo(100.0);
		Carrera u=new Carrera(5000, 90, 1989,h);
		System.out.println(u.toString());
		System.out.println();
		
		
		
		Calle q=new Calle(2);
		q.setAtleta(a);
		q.setTiempo(100.0);
		Carrera m=new Carrera(5000, 90, 1989,q);
		System.out.println(m.toString());
		
		

	}

}
