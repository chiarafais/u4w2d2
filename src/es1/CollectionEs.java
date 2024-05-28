package es1;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionEs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            HashSet<String> parole = new HashSet<>();
            HashSet<String> duplicate = new HashSet<>();


            System.out.println("Quante parole vuoi inserire?");
            int N = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < N; i++) {
                System.out.println("Inserisci la parola N." + (i+1));
                String p = scanner.nextLine();
                if (!parole.add(p)) {
                    duplicate.add(p);
                }
                parole.add(p);
            }

            System.out.println("Hai ripetuto più volte la parola : " + duplicate);

            System.out.println("Numero di parole distinte : " + parole.size());

            System.out.println("Queste sono le parole che hai inserito esclusi doppioni : " + parole);

            scanner.close();
    }
}
