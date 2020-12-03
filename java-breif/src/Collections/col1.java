package Collections;
import java.util.*;
public class col1 {
	
	public static void main(String args[]){

        List<String> list=new ArrayList<String>();
        List<String> listl=new LinkedList<String>();
        Set<String> myhashset = new HashSet<>();
        HashMap<String,String> myhashmap1 = new HashMap<>() , myhashmap2 = new HashMap<>();  //Ecrire une hashmap
        list.add("janvier");
        list.add("f�vrier");
        list.add("mars");
        list.add("avril");
        list.add("mai");
        list.add("juin");
        list.add("juillet");
        list.add("aout");
        list.add("septembre");
        list.add("octobre");
        list.add("novembre");
        list.add("d�cembre");
        list.set(7,new String("ao�t"));          //Modifier le mois aout
        listl.add("Im the first elm");                  //Ins�rer un �l�ment dans la liste � la premi�re position
        list.remove(2);                           //Supprimer le troisi�me �l�ment de cette liste.
        list.sort( Comparator.comparing( String::toString ));  //Trier cette liste
        listl.addAll(list);         //Copier cette liste dans une autre
        listl.addAll(list);         //clone la liste dans une autre???????????????????????????????

        myhashset.add("janvier");
        myhashset.add("f�vrier");
        myhashset.add("mars");
        myhashset.add("avril");
        myhashset.add("mai");
        myhashset.add("juin");
        myhashset.add("juillet");
        myhashset.add("aout");
        myhashset.add("septembre");
        myhashset.add("octobre");
        myhashset.add("novembre");
        myhashset.add("d�cembre");

        myhashmap1.put("car","Mercedesbenz");
        myhashmap1.put("motor","Docati");
        myhashmap1.put("chihaja","chi haja mn chihaja");


       for(String mois:list){    //afficher list des mois
            System.out.println(mois);
             System.out.println("HashSet: " + list);   //or
    }
        System.out.println(list.get(2));  //afficher la troisi�me ligne
        System.out.println(list.get(4));  //afficher le 5eme ligne

        System.out.println(list.indexOf("octobre"));  //Rechercher un �l�ment dans cette liste

        System.out.println(listl.isEmpty());          //	Tester cette liste est vide ou non

        for(String mois:myhashset){    //afficher hashset des mois
            System.out.println(mois);
             System.out.println("HashSet: " + myhashset);    //or
        }



        String last = null;
        for(String mois:myhashset){    //afficher last des mois
            last = mois;
        }
        System.out.println(last);

        System.out.println(myhashset.size());       //le nombre d'�l�ments dans un ensemble de HashSet

        myhashset.clear();                          //Vider cette HashSet
        System.out.println(myhashset.isEmpty());    //Tester que cette HashSet est vide ou non


        System.out.println("Hashmap : "+myhashmap1);
        System.out.println("Hashmap : "+myhashmap1.size());
        myhashmap2.putAll(myhashmap1);
        System.out.println("Hashmap : "+myhashmap2);

        myhashmap1.remove("car");
        System.out.println("Hashmap : "+myhashmap1);
    }
}


