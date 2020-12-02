package problematique;
import java.util.Scanner;
public class ex {

	public static void main(String[] args) {

        System.out.println("Combien avez-vous recu d'argent (MAD) ?");

        Scanner scan = new Scanner(System.in);



        int input;

        while(!scan.hasNextInt()) {
            System.out.println("Veuillez saisir un nombre valide");
            scan.next();
        }

        input = scan.nextInt();

        int rest = input/4;

        int books = input - rest;

        int coffee = rest/3/10;
        int recharge = rest/3/10;
        int trame = rest/3/8;

        int flowers = ((rest/3)%coffee*10) + ((rest/3)%recharge*10) + ((rest/3)%trame*8);

        System.out.println("Livres et fournitures : " + books);
        System.out.println("Vous pouvez ensuite acheter :");
        System.out.println(coffee + " cafés");
        System.out.println(recharge + " cartes de recharge prépayées");
        System.out.println(trame + " billets de TRAME");
        System.out.println("Et il vous restera "+flowers+" MAD pour les roses blanches");

    }        

		

	}





