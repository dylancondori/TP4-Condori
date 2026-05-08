package tp_4_ejerecicio_2;
import java.util.Scanner;
public class TP_4_Ejerecicio_2 {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int [] num1 = new int [10];
        int i = 0;
        int u = 0;
        int f = 0;
        double resultado1 = 0;
        double resultado2 = 0;
        while (i < 10){
            System.out.println("Ingrese el numero "+(i + 1));
            num1[i] = nu.nextInt();
            i++;
        }
        for (int c = 0; c < 10; c++){
            if (num1[c] < 0){
                resultado2 = resultado2 + num1[c];
                f++;
            }else if (num1[c] > 0){
                resultado1 = resultado1 + num1[c];
                u++;
            }
        }
        resultado2 = resultado2 / f;
        resultado1 = resultado1 / u;
        if (u != 0){
            System.out.println("El promedio de numeros positivos ingresados es de "+ resultado1);
        }else{
            System.out.println("No se ingreso ningun numero positivos.");
        }
        if (f != 0){
            System.out.println("El promedio de numeros negativos ingresados es de "+resultado2);
        }else{
            System.out.println("No se ingreso ningun numero negativo.");
        }
    }
    
}
