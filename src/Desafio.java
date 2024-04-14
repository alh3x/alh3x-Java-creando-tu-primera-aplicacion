import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        System.out.println(numeroSecreto);
        int intento = 0;
        int limiteIntentos = 5;
        int numeroUsuario;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al juego de la adivinanza, adivina el numero del 1 al 100, tienes 5 intentos");
        while (intento < limiteIntentos) {
            intento++;
            System.out.println("Intneto "+ intento + " ingrese un numero:");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario==numeroSecreto){
                System.out.println("Felicidades acertaste el numero era " + numeroUsuario + ". acertaste en el intento " + intento);
                break;
            }
            if (numeroUsuario<numeroSecreto){
                System.out.println("Incorrecto, el numero es mayor");
            } else {
                System.out.println("Incorrecto, el numero es menor");
            }

        }
        if (intento == limiteIntentos) {
            System.out.println("Lo siento ya no tienes intentos");
        }
    }
}
