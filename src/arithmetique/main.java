package arithmetique;

public class main {

	public static void main(String[] args) {
		
		int somme = singleton.getinstance().somme(3, 5);
		System.out.println( "la somme vaut :"+somme);
		
		int soustraction = singleton.getinstance().soustraction(3, 5);
		System.out.println("la soustraction est : "+soustraction);
		
		float division = singleton.getinstance().division(4, 2);
		System.out.println("la division vaut : "+division);
		
		
		int multiplication = singleton.getinstance().multiplication(3, 5);
		System.out.println("la multiplication vaut : "+multiplication);
		
		
			
		singleton S1= singleton.getinstances(1, 2);
		S1.affiche();
		
		singleton S0= singleton.getinstances(1, 2,"bonjour");
		S1.affiche();
		
		singleton S2=singleton.getinstances(somme, somme);
		S2.affiche();
		
		
	}

}
