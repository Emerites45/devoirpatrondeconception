package buider_modifier;

abstract class moteurpizza {
	
	protected pizza pizza;
	public pizza getPizza() { return pizza; }
	public void creerNouvellePizza() { pizza = new pizza(); }
	public abstract void monterPate();
	public abstract void monterSauce();
	public abstract void monterGarniture();

}
