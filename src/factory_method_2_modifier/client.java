package factory_method_2_modifier;

public class client {

	

	public static void main(String[] args) {
		
		produitfactory produitfactory1= new produitfactory1();
		produitfactory produitfactory2= new produitfactory2();
		produitfactory produitfactory3= new produitfactory3();
		
		produitA produitA= null;
		
		System.out.println("utilisation de la premiere fabrique :");
		produitA= produitfactory1.getproduitA();
		produitA.methodeA();
		
		System.out.println("utilisation de la deuxième fabrique :");
		produitA= produitfactory2.getproduitA();
		produitA.methodeA();
		
		System.out.println("utilisation de la troisième fabrique :");
		produitA= produitfactory3.getproduitA();
		produitA.methodeA();
		
		

	}

}
