package arithmetique;

public class singleton {
  
	private static singleton instance =null;
	private int x;
	private int y;
	private String maths;
	private singleton() {
		super();
	}
	private  singleton(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	
	
	public singleton(int x, int y, String maths) {
		super();
		this.x = x;
		this.y = y;
		this.maths = maths;
	}
	public static singleton  getinstance() {
		   if(instance==null) {
			   instance = new singleton();
		   }
		
		return instance;
	}  
	
	public static singleton  getinstances(int x, int y) {
		   if(instance==null) {
			   instance = new singleton(x,y);
		   }
		
		return instance;
	}  
	
	public static singleton  getinstances(int x, int y,String maths) {
		   if(instance==null) {
			   instance = new singleton(x,y,maths);
		   }
		
		return instance;
	}  
	
	
	
	public int somme(int x, int y)
	
	{
	return x+y;	}
	
public int multiplication (int x, int y)
	
	{
	return x*y;	}
public int soustraction(int x, int y)

{
return x-y;	}
	
	public float division(int x, int y)
	
	{
	return x/y;
	}	
	
	public void affiche()
	{System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " +
			this.y);
	
	}
	
	public Object clone() throws
	CloneNotSupportedException {

	throw new CloneNotSupportedException();

	}

}
