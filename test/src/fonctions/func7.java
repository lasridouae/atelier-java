package fonctions;

public class func7 {

	   public static string myMethod( String gender , int age) {
		    System.out.println( gender + age  );
		    
		    if(gender == "Femme" || gender == "Homme"  && age>18) {
		    	return ("Vous êtes une "+gender+" et vous êtes majeur");
		    	return ("Vous êtes un "+gender+ "et vous êtes majeur");
		    } 
		    if (gender == "Femme" || gender == "Homme" && age < 18) {
		    	return ("Vous êtes une "+gender+ " et vous êtes mineur");
		    	return ("Vous êtes un "+gender+ "et vous êtes mineur");
		    } 
		   
		    
		    
		    
		  }

		 
}
	

