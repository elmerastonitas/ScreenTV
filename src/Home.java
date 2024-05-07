import modelo.Movie;
import modelo.Series;

import java.util.Scanner;

public class Home {
    private Movie peliculaUsuario = new Movie();
    private Series serieUsuario = new Series();
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 4) {
            String menu = """
                    Bienvenido(a) a ScreenTV
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calculadora de tiempo
                    4) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    String nombre = teclado.nextLine();

                    System.out.println("Ingrese año de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese la duración en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();

                    System.out.println("Ingrese el año de lanzamiento");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese cantidad de temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese cantidad de episodios por temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 4:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
