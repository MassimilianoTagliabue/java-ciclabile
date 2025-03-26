package org.lessons.java;

public class Numeri {

    private static int[] interi;
    private int counter = 0;


    public Numeri(){
        interi = new int[0];
    }

    public Numeri(int[] numeri){
        this.interi=numeri.clone();
    }

    public int getElementoSuccessivo(){
        return interi[counter++]; 
    }

    public boolean hasAncoraElementi(){
        if(counter >= interi.length){
            return false;
        }else{
            return true;
        }
    }


    public void addElemento(int numero){
        int[] arrayAggiornato = new int[interi.length + 1];

        for(int i=0; i<interi.length; i++){
            arrayAggiornato[i] = interi[i];
        }

        arrayAggiornato[arrayAggiornato.length -1] = numero;

        this.interi = arrayAggiornato;
    }
}
