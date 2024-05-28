package es2;

import java.util.*;

public class CollectionEs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi visualizzare?");
        int N = scanner.nextInt();
        ArrayList<Integer> listaNumeri = listaNumeri(N);
        System.out.println(listaNumeri);

        System.out.println(secondaListaNumeri(listaNumeri));

        System.out.println("scrivi true per vedere i numeri pari, false per vedere i numeri dispari");
        boolean prova = scanner.nextBoolean();
        pariDispari(listaNumeri,prova);
    }

    //prima parte
    public static ArrayList<Integer> listaNumeri(int N){

        ArrayList<Integer> listaNumeri = new ArrayList<>(); //copiato dal codice di sta mattina

        Random random =  new Random();

        for (int i = 0; i < N; i++) {
            listaNumeri.add(random.nextInt(1,101));
        }
        Collections.sort(listaNumeri);

        return listaNumeri;
    }

    //seconda parte
    public static List<Integer> secondaListaNumeri(List<Integer> listaNumeri){
        ArrayList<Integer> nuovoArray = new ArrayList<>(listaNumeri);
        Collections.reverse(listaNumeri);
        nuovoArray.addAll(listaNumeri);
        return nuovoArray;
    }

    //terza parte
    public static void pariDispari(ArrayList<Integer> listaNumeri , boolean prova){
        for (int i = prova ? 0 : 1 ; i < listaNumeri.size(); i+=2) {
            System.out.println(listaNumeri.get(i));
        }
    }

}
