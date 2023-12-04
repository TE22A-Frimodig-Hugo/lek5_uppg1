import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        //Skapa ett fält med talen  8,4,6,3,9:
        int[] fält1 = {8, 4, 6, 3, 9};

        // Skriv ut talen i fälten med en for-loop:
        for (int i = 0; i < fält1.length; i++)
        {
            System.out.print(fält1[i] + " ");
        }

        System.out.println("Längden av fältet "+ fält1.length);
    
        // uppg 1 klar

    }
}
