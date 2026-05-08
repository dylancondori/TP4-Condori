package tp_4_ejercicio_9;
import java.util.Scanner;
public class TP_4_Ejercicio_9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] alumnos = new int[10];
        int pagaron = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("El alumno "+(i + 1)+" , cuanto pago su cuota?");
            alumnos[i] = num.nextInt();
            if (alumnos[i] >= 1) {
                pagaron++;
            }
        }
        int deudores = 10 - pagaron;
        double porcentaje = (pagaron * 100.0) / 10;
        System.out.println("Cantidad de alumnos que pagaron: "+pagaron);
        System.out.println("Cantidad de alumnos que adeudan: "+deudores);
        System.out.println("Porcentaje de alumnos que pagaron: "+porcentaje+"%");

    }
    
}
