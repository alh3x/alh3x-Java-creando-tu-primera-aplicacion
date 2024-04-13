public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1990;
        // boolean incluidoEnElPlan = true;
        // double nota = 8.1;

        double media = (8.2+6.0+9.0)/3;

        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor pelicula de fin del milenio.
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) media;
        System.out.println(clasificacion);

    }
}