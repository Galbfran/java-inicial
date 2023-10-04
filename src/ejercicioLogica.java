public class ejercicioLogica {
    public static void main(String[] args) {
        // crear dos variables y intercambiar su valor
        int numeroUno , numeroDos, auxiliar;
        numeroUno = 20;
        numeroDos = 30;
        System.out.println("Numero uno vale:" + numeroUno + ". Numero dos vale:"+ numeroDos);
        auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;
        System.out.println("Numero uno vale:" + numeroUno + ". Numero dos vale:"+ numeroDos);

    }
}
