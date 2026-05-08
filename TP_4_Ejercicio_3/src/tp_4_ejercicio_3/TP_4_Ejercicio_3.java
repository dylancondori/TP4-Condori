package tp_4_ejercicio_3;
import java.util.Scanner;
public class TP_4_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] num1 = new int [10];
        int i = 0;
        double resultado1 = 0;
        double resultado2 = 0;
        System.out.println("Ingrese 10 numeros");
        while (i < 10){
            num1[i] = num.nextInt();
            i++;
        }
        for (int x = 0; x < 10; x++){
            if (x % 2 == 0){
                resultado2 = resultado2 + num1[x];

            }else{
                resultado1 = resultado1 + num1[x];
            }
        }
        resultado2 = resultado2 / 5;
        resultado1 = resultado1 / 5;
            System.out.println("El promedio de numeros de las posiciones positivas es de "+resultado1);
            System.out.println("El promedio de numeros de las posiciones negativas es de "+resultado2);
    }
    
}
