package tp_4_ejercicio_4;
import java.util.Scanner;
public class TP_4_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i = 0;
        int a = 0;
        double resultado = 0;
        System.out.println("Ingrese la cantidad de alumnos en la clase");
        do{
            a = n.nextInt();
            if (a < 1){
                System.out.println("Ingrese una cantidad validad de alumnos");
            }else{
                System.out.println("La cantidad de alumnos ingresados es de "+ a);
            }
        }while (a < 1);
        double []  vector = new double [a];
        while(i < a){
            do{
                System.out.println("Ingrese la nota del alumno "+(i+1));
                vector [i] = n.nextInt();
                if((vector[i]<0)||(vector[i]>10)){
                    System.out.println("Nota no valida");
                }
            }while((vector[i]<0)||(vector[i]>10));
            i++;
        }
        for(int c = 0; c < a; c++){
            resultado = resultado + vector[c];
        }
        resultado = resultado / a;
        System.out.println("La nota promedio fue "+resultado);
        System.out.println("Alumnos con la nota mayor al promedio.");
        for(int c = 0;c < a;c++){
            if (vector[c] > resultado){
                System.out.println("Alumno numero "+(c+1)+" con una nota de "+vector[c]);
            }
        }

    }
    
}
