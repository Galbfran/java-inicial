
import java.util.Scanner;
public class casoSwitch {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        int entradaTeclado = Integer.parseInt(entradaEscaner.nextLine ()); //Invocamos un método sobre un objeto Scanner
        String nombreDia = null;

        switch (entradaTeclado){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "numero invalido";
        }
        System.out.println("El dia es: " + nombreDia);
    }
}
