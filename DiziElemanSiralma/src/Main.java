import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu (n) : ");
        int boyut = inp.nextInt();

        int[] arr = new int[boyut];
        int count = 0;

        System.out.println("Dizinin elemanlarını giriniz : ");

        for(int i = 0; i < boyut; i++){
            System.out.print((i+1) + ". Eleman : ");
            int eleman = inp.nextInt();
            arr[count++] = eleman;
        }
        System.out.println("Yeni dizimiz \t: " + Arrays.toString(arr));

        int arr2;

        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    arr2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr2;
                }
            }
        }
        System.out.println("Sıralı dizimiz \t: " + Arrays.toString(arr));

    }
}