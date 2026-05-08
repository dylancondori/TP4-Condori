package tp_4_ejercicio_8;
import java.util.Scanner;
public class TP_4_Ejercicio_8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String[] num1 = new String[20];
        double[] s = new double[20];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del empleado " +(i + 1));
            num1[i] = num.nextLine();
            do{
                System.out.println("Ingrese el sueldo del empleado " +(i + 1));
                s[i] = num.nextDouble();
                if(s[i]<1){
                    System.out.println("Ingresar salario mayor a cero");
                }
            }while(s[i]<1);
            num.nextLine();
        }
        double resultado1 = s[0];
        String resultado2 = num1[0];
        for (int i = 1; i < 3; i++) {
            if (s[i] > resultado1) {
                resultado1 = s[i];
                resultado2 = num1[i];
            }
        }
        System.out.println("El empleado que más gana es "+resultado2+" con un sueldo de: "+resultado1);
    }
    
}
