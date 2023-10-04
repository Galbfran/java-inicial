import java.util.Scanner;

public class vectoresMatrices {
    public static void main(String[] args) {
        //declaracion
        int vector [] = new int [4];
        Scanner teclado = new Scanner(System.in);
        //asignacion(manual)
        //vector[0] = 2;
        //vector[1] = 10;
        //vector[2] = 15;
        //vector[3] = 20;
        for(int i = 0; i < vector.length ; i++){
            System.out.println("Ingrese valor al indice " + i );
            vector[i] = teclado.nextInt();
        }

        for(int i = 0; i < vector.length ; i++){
            System.out.println("Valor del vector en posicion:" + i +" Valor: " + vector[i]);
        }

        //matrices (manual)
        int matriz [][] = new int [2][2];
        //matriz[0][0] = 5;
        //matriz[0][1] = 10;
        //matriz[1][0] = 20;
        //matriz[1][1] = 30;
        for(int i = 0 ; i < 2 ; i++ ){
            for (int c = 0 ; c<2 ; c++){
                System.out.println("El ingrese valor de la posicion i "+ i+" c = " + c);
                matriz[i][c] = teclado.nextInt();
            }
        }


        for(int i = 0 ; i < 2 ; i++ ){
            for (int c = 0 ; c<2 ; c++){
                System.out.println("El valor de la posicion i = " + i + " El valor de c = " + c);
                System.out.println("El valor es " + matriz[i][c]);
            }
        }


    }
}
