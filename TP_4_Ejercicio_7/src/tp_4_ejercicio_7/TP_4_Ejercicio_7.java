package tp_4_ejercicio_7;
public class TP_4_Ejercicio_7 {
    public static void main(String[] args) {
        int [] vector = new int [10];
        int i = 0;
        while (i < 10){
            vector[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
            i++;
        }
        System.out.println("Los numeros aleatorios entre 0 al 100 son:");
        for (int a = 0; a < 10;a++){
            System.out.println(vector[a]);
        }

    }
    
}
