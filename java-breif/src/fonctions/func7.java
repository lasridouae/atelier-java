package fonctions;

public class func7 {

	   public static string myMethod( String gender , int age) {
		    System.out.println( gender + age  );
		    
		    if(gender == "Femme" || gender == "Homme"  && age>18) {
		    	return ("Vous �tes une "+gender+" et vous �tes majeur");
		    	return ("Vous �tes un "+gender+ "et vous �tes majeur");
		    } 
		    if (gender == "Femme" || gender == "Homme" && age < 18) {
		    	return ("Vous �tes une "+gender+ " et vous �tes mineur");
		    	return ("Vous �tes un "+gender+ "et vous �tes mineur");
		    } 
		   
		    
		    
		    
		  }

		 
}
	

