
public class Ingredients {
	private String name;
	private String type;
	private boolean staple;
	private boolean shelfStable;
	
	//Constructors
	//In each constructor you need to save the data to a file in the appropriate folder
	Ingredients() {
		//make a generic entry
		
	}
	
	Ingredients(String name, String type, boolean staple, boolean shelfStable) {
		this.name = name;
		this.type = type;
		this.staple = staple;
		this.shelfStable = shelfStable;
	}
	
	//Accessors
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public boolean getStaple() {
		return this.staple;
	}
	
	public boolean getShelfStable() {
		return this.shelfStable;
	}
	
	//Mutators
	public void setName(String newName) {
		this.name = newName;
		}
		
	public void setType(String newType) {
		this.type = newType;
		}
		

		
	public void setStaple(boolean newStaple) {
		this.staple = newStaple;
		}
		
	public void getShelfStable(boolean newShelfStable) {
		this.shelfStable = newShelfStable;
		}

}
