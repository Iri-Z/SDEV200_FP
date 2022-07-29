import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class test {
	public static void main(String[] args) {
		test t = new test();
		
		Recipes rp = (Recipes) t.ReadObjectFromFile();
		System.out.print(rp);
		System.out.print(rp.getIngredientList());
	}
	
    public Object ReadObjectFromFile() {
    	 
        try {
 
            FileInputStream fileIn = new FileInputStream("Recipes\\Dinner\\lemon_chicken_pasta");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Recipes obj = (Recipes) objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
