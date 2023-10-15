package factory_method_2_modifier;

public class produitfactory1  extends produitfactory{

	public produitfactory1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected produitA createproduitA() {
		
		return new produitA1();
	}

}
