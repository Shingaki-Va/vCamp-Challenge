import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();                                                  //leo n

        int[] arr = new int[n];                                                //creo array tamaño n alumnos
        for (int i = 0; i < arr.length; i++) {
            System.out.print("ingrese la nota del alumno " + (i + 1) + ": ");  //recorro y lleno array con notas
            arr[i] = sc.nextInt();
            while (arr[i] < 0 || arr[i] > 100) {
                System.out.println("Nota inválida, reingrese una nota entre 0 y 100"); //valido que las notas esten entre 0 y 100
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("notas ingresadas: " + Arrays.toString(arr));       //muestro notas sin redondear
        redondearNota(arr);                                                    //llamo funcion y devuelve array redondeado
    }

    public static void redondearNota(int[] array) {
        int[] arrRedondeo = new int[array.length];             //creo array para guardar notas redondeadas
        for (int i = 0; i < array.length; i++) {
            int b = array[i] % 10;                             //extraigo ultimo digito de la nota

            if ((b - 5) > -3 && (b - 5) <= -1                  // comparo si ultimo digito está a menos de 3pts del 5
                    && array[i] > 38) {                        //Verifico que si es mayor a 38
                arrRedondeo[i] = array[i] + (b - 5) * -1;      // si es true redondeo a 5 y lo guardo en array

            } else {
                arrRedondeo[i] = array[i];                     //si es false, y mayor a 38 guardo sin redondear, menor a 38 no redondea
            }

        }
        System.out.println("notas finales:    " + Arrays.toString(arrRedondeo)); //imprimo notas redondeadas
    }


}


