package tp_4_ejercicio_5;
public class TP_4_Ejercicio_5 {
    public static void main(String[] args) {
        int [] vector = new int [20];
        int i = 0;
        do{
            vector[i] = ( i+1 )*2;
            i++;
        } while (i < 20);
        System.out.println("Los primeros 20 numeros pares");
        for(int a = 0;a < 20;a++){
            System.out.println(vector[a]);
        }
    }
    
}
