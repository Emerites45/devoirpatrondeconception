package abstract_factory;

public class produitfactory2 implements ipproduitfactory {

	@Override
	public produitA getproduitA() {
		
		return  new produitA2();
	}

	@Override
	public produitB getproduitB() {
		
		return new produitB2();
	}

}
