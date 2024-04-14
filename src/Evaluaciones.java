import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;
        boolean bandera = true;

        System.out.println("Bienvenido escribe notas para obtener la media. Para salir ingresa un numero negativo");
        while (bandera) {
            System.out.println("Escribe la nota que le daria a la pelicula Matrix");
            nota = teclado.nextDouble();
            if(nota >= 0){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }else{
                bandera=false;
            }

        }
        System.out.println("La media de evaluaciones para matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}
