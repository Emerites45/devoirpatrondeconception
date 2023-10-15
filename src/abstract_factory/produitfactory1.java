package abstract_factory;

public class produitfactory1  implements ipproduitfactory {

	@Override
	public produitA getproduitA() {
		
		return new produitA1();
	}

	@Override
	public produitB getproduitB() {
			
		return new produitB1();
	}

}
