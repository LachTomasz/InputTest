package InputTest;
import java.util.*;
/**
 * Ten program demonstruje pobieranie danych z konsoli.
 * This program demonstrates getting data from the console.
 * @author Tomek
 *
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Pobieranie pierwszej porcji danych.
        //Getting the first batch of data.
        System.out.print("Jak się nazywasz? ");
        String name = in.nextLine();

        //Pobieranie drugiej porcji danych.
        //Retrieving the second batch of data.
        System.out.print("Ile masz lat? ");
        int age = in.nextInt();

        //Wydruk danych na konsoli.
        //Data printout on the console.
        System.out.println("Witaj użytkowniku " + name + ". W przyszłym roku będziesz mieć " + (age +1) + " lat.");
    }
}