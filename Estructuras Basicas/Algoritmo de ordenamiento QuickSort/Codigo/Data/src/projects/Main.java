package projects;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount of players on the game");
        int[] something = new int[keyboard.nextInt()];
        System.out.println("Now input the score of each player");
        for (int i = 0; i < something.length; i++) {
            System.out.println("Adding a value to player " + (i + 1));
            something[i] = keyboard.nextInt();
        }
        quicksort(something, 0, (something.length - 1));
        System.out.println("Here are the results");
        System.out.println(Arrays.toString(something));
    }
    public static void quicksort(int[] v, int left, int right) {
        int pivot = v[0];
        int i = left;
        int j = right;
        int temp;
        while(i < j){
            while(v[i] <= pivot && i < j) i++;
            while(v[j] > pivot) j--;
            if (i < j) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        v[left] = v[j];
        v[j] = pivot;
        if(left < j - 1)
            quicksort(v,left,j - 1);
        if(j + 1 < right)
            quicksort(v,j + 1,right);
        // taken from http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
    }
}
