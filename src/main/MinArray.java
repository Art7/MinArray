package main;

/**
 * Created by Artur on 08.04.2015.
 */
public class MinArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min, i;
        for( i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        min = array[0];
        for( i = 1; i < array.length; i++){
            if(array[i] < min ) min = array[i];
        }
        System.out.println(min);
    }
}
