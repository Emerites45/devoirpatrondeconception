package builder;

public class directeur {

	public void construire () {
		
		pizza pizza=null;
		
		moteurpizzareine mpr= new moteurpizzareine();
		moteurpizzapiquante mpp= new moteurpizzapiquante();
		
		mpr.creerNouvellePizza();
		mpr.monterPate();
		mpr.monterSauce();
		mpr.monterGarniture();
		pizza=mpr.getPizza();
		pizza.print();
		
		mpp.creerNouvellePizza();
		mpp.monterPate();
		mpp.monterSauce();
		mpp.monterGarniture();
		pizza=mpp.getPizza();
		pizza.print();
		
		
		
	}
	
}
