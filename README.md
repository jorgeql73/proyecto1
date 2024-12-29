# Proyecto Java con Spring Boot

## Descripción
Este proyecto está desarrollado utilizando **Java 23** y el framework **Spring Boot**. Está configurado como un proyecto Maven para la gestión de dependencias y construcción del proyecto. Por defecto, la aplicación se ejecuta en **localhost:8080**.

## Prerrequisitos

Antes de comenzar, asegúrate de tener instalados los siguientes elementos en tu sistema:

- **JDK 23**
- **IntelliJ IDEA** (se recomienda para facilitar el desarrollo)
- **Git** (para el control de versiones)
- **Maven** (generalmente incluido con IntelliJ IDEA o configurable)

## Instalación

1. **Clonar el repositorio**:

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_PROYECTO>
   ```

2. **Descargar dependencias Maven**:

   Maven gestionará automáticamente las dependencias del proyecto especificadas en el archivo `pom.xml`. Para descargarlas, ejecuta:

   ```bash
   mvn clean install
   ```

   Este comando:
   - Limpia los archivos de construcción anteriores.
   - Descarga todas las dependencias necesarias.
   - Construye el proyecto.

3. **Abrir en IntelliJ IDEA**:

   - Abre IntelliJ IDEA y selecciona **Open** para importar el proyecto.
   - IntelliJ detectará automáticamente que es un proyecto Maven y descargará cualquier dependencia faltante.

4. **Configurar y ejecutar el proyecto**:

   - Verifica que el puerto por defecto sea el `8080`. Puedes cambiarlo en el archivo `application.properties` si es necesario:

     ```properties
     server.port=8080
     ```

   - Ejecuta la clase principal (generalmente ubicada en el paquete raíz con una anotación `@SpringBootApplication`).

5. **Ejecutar la aplicación**:

   Ejecuta el proyecto en IntelliJ IDEA o utiliza Maven desde la línea de comandos:

   ```bash
   mvn spring-boot:run
   ```

   La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

## Estructura del proyecto

El proyecto sigue la estructura estándar de Maven:

```
src/
|-- main/
|   |-- java/
|   |   `-- com/example/<nombre_del_proyecto>/
|   |       `-- Application.java
|   `-- resources/
|       |-- application.properties
|       `-- static/
|-- test/
```

## Comandos útiles de Maven

- **Compilar el proyecto**:
  ```bash
  mvn compile
  ```

- **Ejecutar pruebas**:
  ```bash
  mvn test
  ```

- **Construir un archivo JAR**:
  ```bash
  mvn package
  ```

- **Ejecutar la aplicación desde el archivo JAR**:
  ```bash
  java -jar target/<nombre-del-jar>.jar
  ```

## Contribución

Si deseas contribuir a este proyecto:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tus cambios:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Realiza tus cambios y haz commits con mensajes claros.
4. Sube tus cambios:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
5. Crea un Pull Request desde tu repositorio.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

¡Gracias por utilizar este proyecto como base para tus desarrollos!

