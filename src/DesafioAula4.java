import java.util.Scanner;

public class DesafioAula4 {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        String mensajeCliente = """
                ********************************
                Nombre del cliente: %s
                Tipo de Cuenta: %s
                Su saldo disponible es: %.2f $
                ********************************
                """.formatted(nombre, tipoDeCuenta, saldo);
        String menuOpciones = """
                ****Escribe el numero de la opcion deseada****
                1 - Consultar Saldo
                2 - Restirar
                3 - Depositar
                9 - Salir
                """;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println(mensajeCliente);
        while (opcion != 9){
            System.out.println(menuOpciones);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("""
                            El saldo actualizado es %.2f $.
                            %n""", saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo Insuficiente");
                    }else{
                        saldo -=valorARetirar;
                        System.out.printf("Su saldo actual es: %.2f $%n", saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.printf("Su saldo actual es: %.2f $%n", saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida. Elija una opcion valida");
            }
        }
    }
}
