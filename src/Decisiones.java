public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1990;
        boolean incluidoEnElPlan = false;
        double nota = 8.1;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 1990) {
            System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Pelicula retro que aún vale la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        }else{
            System.out.println("Pelicula no siponible para su plan");
        }
    }
}
