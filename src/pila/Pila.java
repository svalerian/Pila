package pila;
/*
    Ejercicio numero 9 || Tema 3
 */

public class Pila {
    private static final int MAX_ELEMENTOS = 10;
    private int[] elementos;
    private int ultimo;

    public Pila(){
        elementos = new int[MAX_ELEMENTOS];
        ultimo = -1;
    }

    public void imprimePila(){
        if (ultimo != -1){
            for (int i = 0; i <= ultimo; i++){
                System.out.print(elementos[i] + "\t");
            }
        }
    }
}
