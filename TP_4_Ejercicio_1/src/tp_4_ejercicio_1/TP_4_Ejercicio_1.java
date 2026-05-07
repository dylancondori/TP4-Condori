package tp_4_ejercicio_1;
import java.util.Scanner;
public class TP_4_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        int [] num2 = new int [7];
        int i = 0;
        System.out.println("Ingrese 7 numeros");
        while (i < 7){
            System.out.println("Ingrese el numero "+(i+1));
            num2[i] = num1.nextInt();
            i++;
        }
        for (int p = 0; p < 7; p++){
            System.out.println("El numero "+(p+1)+" es "+num2[p]);
        }
  }
}
