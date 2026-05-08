package tp_4_ejercicio_6;
import java.util.Scanner;
public class TP_4_Ejercicio_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] num1 = new int [10];
        int p = 0;
        int c = 0;
        int x = 0;
        int i = 0;
        System.out.println("Ingrese 10 numeros");
        for(int e = 0; e < 10; e++){
            System.out.println("Numero "+(e+1));
            num1[e] = num.nextInt();
        }
        while(i < 10){
            if (num1[i]<0){
                x++;
            }else if(num1[i]>0){
                p++;
            }else{
                c++;
            }
            i++;
        }
        System.out.println("Numeros positivos ingresados son: "+p);
        System.out.println("Numeros negativos ingresados son: "+x);
        System.out.println("Ceros ingresados: "+c);

    }
    
}
