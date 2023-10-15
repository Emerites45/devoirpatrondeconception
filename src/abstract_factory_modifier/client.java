package abstract_factory_modifier;

public class client {

	public static void main(String[] args) {
       
		produitfactory1 produitfactory1= new produitfactory1();
		produitfactory2 produitfactory2= new produitfactory2();
		produitfactory3 produitfactory3= new produitfactory3();
		
		produitA pa=null;
		produitB pb=null;
		
		System.out.println("Utilisation de la première fabrique: ");
		pa= produitfactory1.getproduitA();
		pb=produitfactory1.getproduitB();
		
		pa.methodeA();
		pb.methodeB();
		

		System.out.println("Utilisation de la deuxième fabrique: ");
		pa= produitfactory2.getproduitA();
		pb=produitfactory2.getproduitB();
		
		pa.methodeA();
		pb.methodeB();
		
		System.out.println("Utilisation de la troisième  fabrique: ");
		pa= produitfactory3.getproduitA();
		pb=produitfactory3.getproduitB();
		
		pa.methodeA();
		pb.methodeB();
		

	}

}
