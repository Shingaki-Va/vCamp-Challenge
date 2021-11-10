import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("ingrese año: ");           //ingreso año
            int anio = sc.nextInt();

            while (anio <1700 || anio > 2700){           //valido que el año sea entre 1700 y 2700
                System.out.println("debe ingresar un año entre 1700 y 2700");
                anio = sc.nextInt();
            }

            System.out.print("ingrse día: ");            //ingreso dia
            int dia = sc.nextInt();

            georgiano(anio, dia);                        // llamo funcion paso por param anio y dia

        }

    public static void georgiano(int anio, int dia) {
        boolean anioJuliano = false;                            //Flag para saber si es juliano
        boolean anioGeorgiano = false;                          //Flag para saber si es georgiano

        if (anio >= 1700 && anio <= 1917) {
            anioJuliano = true;                                 //si es Juliano, flag true
        } else if (anio >= 1919) {
            anioGeorgiano = true;                               //si es georgiano, flag true
        } else if (anio == 1918) {                              //Si es Justo año de cambio
            dia = dia + 13;                                     //primer dia pasa a ser 14
        }

        if (anioGeorgiano = true && anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0) {
            dia = dia + 1;                                      //si es giorgiano y bisiestro, agrego un día mas
        }

        if (anioJuliano = true && anio % 4 == 0) {
            dia = dia - 1;                                       //si es juliano y bisiestro, resto un día
        }
        GregorianCalendar gc = new GregorianCalendar();                    //instancio objeto tipo GreorgianCalendar
        gc.set(GregorianCalendar.DAY_OF_YEAR, dia);                        //seteo dia del año, con el dia pasado por parametro y modificado en caso de año bisiestro
        gc.set(GregorianCalendar.YEAR, anio);                              //seteo anio, con el anio pasado por parametro
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");  //Le doy formato fecha
        System.out.println(sdf.format(gc.getTime()));                      //imprimo con formato la fecha

    }






}
