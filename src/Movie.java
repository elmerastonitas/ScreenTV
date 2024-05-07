public class Movie {
    String nombre;
    int fechaDeLanzamiento;
    int tiempoDeDuracionEnMinutos;
    double evaluacion;
    boolean incluidoEnElPlanBasico;
    String sinopsis;

    void muestraFichaTecnica() {
        System.out.println("********** Ficha técnica **********");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración: " + tiempoDeDuracionEnMinutos + " minutos");
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
    }
}
