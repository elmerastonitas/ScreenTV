# ScreenTV

ScreenTV plataforma de streaming para ver películas.

## Detalles del proyecto

Este proyecto calcula la media de las evaluaciones de los usuarios para la película "Matrix":

- Declarar variables utilizando tipos de datos primitivos (`int`, `double`, `boolean`, y `String`).
- Utilizar ciclos `for` y `while` para recopilar las evaluaciones de los usuarios.
- Utilizar un condicional `if` para determinar el tipo de película en base a su fecha de lanzamiento.
- Calcular la media de las evaluaciones ingresadas por los usuarios.
- Mostrar mensajes en la consola para interactuar con el usuario.

## Desafíos
1. Crear el `Readme.md` con lo desarrollado en la clase.
2. Refactorizar código de ciclo `for` a `while`.

#### Ciclo for
Recopilando evaluación de usuarios con ciclo `for`:
```bash
Scanner teclado = new Scanner(System.in);
for (int i = 0; i < 3; i++) {
    System.out.println("Ingresa la evaluacion que darías a Matrix:");
    double notaMatrix = teclado.nextDouble();
    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
}
```
#### Ciclo while
Refactorizando código para recopilar evaluaciones de usuarios con el ciclo `while`:

```bash
int contador = 0;
while (contador < 3) {
    System.out.println("Ingresa la evaluacion que darías a Matrix:");
    double notaMatrix = teclado.nextDouble();
    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
    contador++;
}
```

## Uso

Para ejecutar este proyecto, necesitarás tener instalado:

- **Java JDK 17.0.7**, descargar de https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- **IntelliJ IDEA Community Edition**, descargar de https://www.jetbrains.com/idea/download/

Sigue estos pasos para ejecutar el proyecto en tu máquina local:

1. Clona este repositorio en tu máquina local usando Git:

   ```bash
   git clone https://github.com/elmerastonitas/ScreenTV.git
   ```
Nota: si no tienes instalado Git, descargar e instalar de https://git-scm.com/downloads.

3. Abre el proyecto en IntelliJ IDEA Community Edition o en tu IDE preferido.

4. Ejecuta el archivo `Main.java`.

5. Sigue las instrucciones en la consola para ingresar las evaluaciones de la película "Matrix".

## Demostración

Demostración del proyecto:

![Demostración del proyecto](https://github.com/elmerastonitas/ScreenTV/blob/clase-1/demhttps://github.com/elmerastonitas/ScreenTV/blob/main/src/main/resources/images/demo.gif)