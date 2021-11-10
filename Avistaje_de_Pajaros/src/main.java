import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);


        System.out.print("n = ");
        int n = scInt.nextInt();                               //Leo n
        System.out.print("arr = ");
        String arrString = scString.nextLine();                //Leo String de id ||| si la cantidad de char es mayor a n, solo
                                                               //toma en cuenta hasta el char numero n

        String[] separatedChars = arrString.split(" ");  //split String por espacios

        int[] arrInt = new int[n];                            //Array Int
        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(separatedChars[i]);   //Guardo y parseo a int los chars en arrInt
        }


        System.out.println("id: " + pajarosMigratorios(n, arrInt)); //imprimo funcion

    }


    public static Integer pajarosMigratorios(int n, int arr[]) {
        int aux[] = new int[n];                                 //Creo Array aux para comparar
        int indice = 0;                                         //Inicializo indice en 0 para comprar

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {                        //Comparo pos n con pos n+1
                    aux[indice] = arr[j];                      //Si es true guardo en array aux
                    indice++;                                  //si es true incremento el indice
                }
            }
        }
                                                                //tengo array aux con los id repetidos
        int idMin = 99999;                                     //busco minimo entre los id repetidos
        for (int i = 0; i < indice; i++) {
            if (aux[i] < idMin) {
                idMin = aux[i];                                //Guardo id menor en idMin
            }
        }

        if (idMin == 99999) {                                  // si idMin es igual a 99999 significa que no hay id repetidos
            return null;                                       //retorna null, ya que no hay repetidos
        } else
            return idMin;                                      //sino, retorna id repetido menor
    }
}
