package buider_modifier;

public class moteurpizzapiquante  extends moteurpizza{
	
	
	
	public void monterPate()
	{ pizza.setPate("feuilletée"); }
	public void monterSauce()
	{ pizza.setSauce("piquante"); }
	public void monterGarniture() { pizza.setGarniture("pepperoni+salami");
	}
	
	public pizza getPizza() {
		
		
		return pizza;
	}

}
