package org.lessons.java;

public class main {

    public static void main(String[] args) {

        Numeri numeri = new Numeri();

        numeri.addElemento(30);
        numeri.addElemento(5);

        System.out.println(numeri.getElementoSuccessivo());
        System.out.println(numeri.hasAncoraElementi());
        System.out.println(numeri.getElementoSuccessivo());
        System.out.println(numeri.hasAncoraElementi());

    }
}
