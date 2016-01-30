import java.util.*; 

public class TrainersList {

	public static void main(String[] args) {
		//Create a hash map 
		HashMap<String, String> bracket = new HashMap<String, String>(); 
		
		//put elements to the map 
		bracket.put("Ash","Pikachu"); 
		bracket.put("Gary","Eevee"); 
		bracket.put("Paul","Honchkrow"); 
		bracket.put("Richie","Pikachu"); 
		
		// Display content using Iterator
		Set set = bracket.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> mentry = (Map.Entry)iterator.next();
			System.out.print("Trainer is: "+ mentry.getKey() + " & Pokemon is: ");
			System.out.println(mentry.getValue());
		}
	    
		System.out.println();
		
		//Get and update a value (Make sure to have conversion at end)
		String var= bracket.get("Gary").toString();
		System.out.println("Gary is replacing: "+var + " with Arcanine");
		bracket.put("Gary", new String("Arcanine"));
	    
		System.out.println(); 
		
		//display updated bracket
		set = bracket.entrySet();
		iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> mentry = (Map.Entry)iterator.next();
			System.out.print("Trainer is: "+ mentry.getKey() + " & Pokemon is: ");
			System.out.println(mentry.getValue());
		}
		
		//Remove values based on key
		//hmap.remove(3);
		
		System.out.println("Let the Battle Begin");
	}

}
