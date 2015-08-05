package rrf.exceções;

public abstract class Testa_Exceção {
	
	public static void main(String[] args) {
		
		System.out.println("Inicio do Programa");
		m1();
		System.out.println("Fim do Programa");
	}

	private static void m1() {
		System.out.println("Inicio M1()");
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Problema!");
		}
			
		System.out.println("Fim M1()");
		
	}

	private static void m2() {
		System.out.println("Inicio M2()");
		
		int nums [] = new int[5];
		for(int i=0; i<6; i++){
				nums [i] = i*2;
				System.out.println(nums[i]);
		}
			
		
		System.out.println("Fim M2()");
		
	}

}
