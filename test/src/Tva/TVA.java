package Tva;
import java.util.Scanner;

public class TVA {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Saisit le prix");
	        double HT = sc.nextDouble();
	        System.out.println("Vous souhait un remise?");
	        char response = sc.next().charAt(0);
	        if (response != 'y' && response != 'n') {
	            System.out.println("\nInvalid response. Try again.");
	        }
	        if (response == 'y') {
	        double TTC = HT+(HT*0.2);
	        System.out.println("Donner la remise ");
	        double prc = sc.nextDouble();
	        double RM = TTC-(TTC*prc/100);
	        System.out.println("TTC est : " +TTC+" MDH");
	        System.out.println("La remise est : "+RM+" MDH");
	        }  else if (response == 'n') {
	            System.out.println("Le prix sans est : "+HT+" MDH");
	        }
	    }

	}

