import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        double mediaEvaluacionUsuario = 0;

        // Mostrar información de la película
        System.out.println("Pelicula: " + nombre);
        System.out.println("Año lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluaciones: " + evaluacion);
        System.out.println("Incluido en plan básico: " + incluidoEnElPlanBasico);

        // Calcular la media de las evaluaciones
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluacion de Matrix: " + mediaEvaluacion);

        // Determinar el tipo de película
        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Peliculas populares del momento");
        } else {
            System.out.println("Peliculas retro que vale la pena ver");
        }

        // Recopilar evaluaciones de los usuarios con for
        //Scanner teclado = new Scanner(System.in);
        //for (int i = 0; i < 3; i++) {
            //System.out.println("Ingresa la evaluación que darías a Matrix:");
            //double notaMatrix = teclado.nextDouble();
            //mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        //}

        // Recopilar evaluaciones de los usuarios con while
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        while (contador < 3) {
            System.out.println("Ingresa la evaluación que darías a Matrix:");
            double notaMatrix = teclado.nextDouble();
           mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            contador++;
        }

        // Calcular y mostrar la media de las evaluaciones de los usuarios redondeada a 2 decimales
        double mediaEvaluacionRedondeada = Math.round((mediaEvaluacionUsuario / 3) * 100.0) / 100.0;
        System.out.println("La media de la evaluacion de la película Matrix es: " + mediaEvaluacionRedondeada);

    }
}