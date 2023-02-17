//Exercise 3 : Pick A Random Element From Array
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a method that returns a random element from an ArrayList.
 * Date : 09/02/2023
 */
package exercise3;


import java.util.ArrayList;
import java.util.Random;

/**
 * Cette classe permet de choisir un élément au hasard à partir d'une liste d'éléments.
 */

public class ArrayRandom {

    /**
     * Cette méthode prend en entrée une liste d'éléments de type `String` et retourne un élément choisi au hasard.
     *
     * @param values la liste d'éléments à partir de laquelle un élément sera choisi
     * @return un élément choisi au hasard de la liste `values`
     */
    public static String random(ArrayList<String> values) {
        int randomIndex = new Random().nextInt(0, values.size());
        return values.get(randomIndex);
    }

    public static void main(String[] args) {
    	//Exercice 3
        ArrayList<String> dataListe = new ArrayList<String>();
        dataListe.add("Potato");
        dataListe.add("Apple");
        dataListe.add("Orange");
        dataListe.add("Banana");
        dataListe.add("Pineple");
        System.out.println(ArrayRandom.random(dataListe));
	}
}
