public class operadoresAritmeticos {
    public static void main(String[] args) {
        int num1 , num2;
        num1 = 10;
        num2 = 5;
        System.out.println("valres aritmeticos");
        //suma
        int suma = num2 + num1;
        System.out.println("El valor de la suma es: " + suma );
        //resta
        int resta = num2 - num1;
        System.out.println("El valor de la resta es: " + resta );
        //multiplicar
        int multiplicar = num2 * num1;
        System.out.println("El valor de la multiplcacion es: " + multiplicar );
        //dividir
        int dividir = num2 / num1;
        System.out.println("El valor de la divicion es: " + dividir );

        if(num1 == num1){
            System.out.println("los numeros son iguales");
        }
        if(num1 > num2){
            System.out.println("numero uno mayor a numero dos");
        }
        if(num1 != num2){
            System.out.println("numero uno distinto a numero dos");
        }
        if(num1 == num1 && num1 != 2){
            System.out.println("el numero uno es igual y el num uno es distinto a  dos");
        }


    }
}
