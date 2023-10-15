package abstract_factory;

public class client {

	public static void main(String[] args) {
       
		produitfactory1 produitfactory1= new produitfactory1();
		produitfactory2 produitfactory2= new produitfactory2();
		
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
		

	}

}
