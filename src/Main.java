import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie matrix = new Movie();

        matrix.nombre = "The Matrix";
        matrix.tiempoDeDuracionEnMinutos = 136;
        matrix.fechaDeLanzamiento = 1999;

       matrix.muestraFichaTecnica();

        Movie encanto = new Movie();
        encanto.nombre = "Encanto";
        encanto.tiempoDeDuracionEnMinutos = 102;
        encanto.fechaDeLanzamiento = 2021;

        encanto.muestraFichaTecnica();
    }

}