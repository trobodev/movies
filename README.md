# Movies API

API REST en Java con Spring Boot y MySQL para la gestión de películas y sus valoraciones. Backend de una aplicación de rating de películas, desarrollado a partir de un taller de Spring Boot.

## Tecnologías

- Java 21
- Spring Boot 3.5 (Spring Web y Spring Data JPA)
- MySQL 8
- Maven (incluye el wrapper mvnw, no hace falta instalar Maven)
- NetBeans

## Endpoints

Todos cuelgan de /api/movies:

- GET /api/movies: lista todas las películas
- GET /api/movies/{id}: devuelve una película (404 si no existe)
- POST /api/movies: crea una película (201)
- PUT /api/movies/{id}: actualiza una película (404 si no existe)
- DELETE /api/movies/{id}: elimina una película (204)
- GET /api/movies/vote/{id}/{rating}: añade un voto y recalcula la media

## Cómo ejecutarlo

1. Crea la base de datos en MySQL:

        CREATE DATABASE movies;

2. Copia src/main/resources/application.properties.example como src/main/resources/application.properties y rellena tu usuario y contraseña de MySQL. 

3. Arranca la aplicación desde la raíz del proyecto:

        ./mvnw spring-boot:run

   En Windows con PowerShell o CMD:

        .\mvnw spring-boot:run

La API queda disponible en http://localhost:8080/api/movies. Las tablas se crean automáticamente al arrancar (ddl-auto=update).

## Limitaciones conocidas

Proyecto con fines didácticos, por lo que hay aspectos que no se han abordado:

- No hay autenticación ni autorización (no se usa Spring Security).
- @CrossOrigin sin restricciones, pensado para desarrollo local.
- No hay validación de datos de entrada. Por ejemplo, el voto no comprueba el rango de la puntuación.
- El voto se hace mediante GET, cuando por convención REST debería ser POST o PATCH.
