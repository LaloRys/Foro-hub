# ForoHub API

Desafío Back End de Alura Latam

ForoHub es una API REST desarrollada con Spring para gestionar un foro donde los participantes pueden plantear preguntas sobre diferentes tópicos. Este proyecto replica el funcionamiento del foro a nivel de back end, permitiendo a los usuarios realizar operaciones CRUD sobre los tópicos.

## Descripción del Proyecto

En este proyecto, hemos implementado una API REST que permite:

- **Crear un nuevo tópico**
- **Mostrar todos los tópicos creados**
- **Mostrar un tópico específico**
- **Actualizar un tópico**
- **Eliminar un tópico**

Estas operaciones CRUD se han desarrollado siguiendo las mejores prácticas del modelo REST, incluyendo validaciones según las reglas de negocio, y utilizando una base de datos relacional para la persistencia de la información. Además, hemos implementado un servicio de autenticación y autorización para restringir el acceso a la información.

## Características

- **API REST**: Implementación de rutas siguiendo las mejores prácticas del modelo REST.
- **Validaciones**: Validaciones realizadas según las reglas de negocio.
- **Base de Datos**: Implementación de una base de datos relacional para la persistencia de la información.
- **Autenticación y Autorización**: Servicio para restringir el acceso a la información.


## Tecnologías Utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **H2 Database** (para pruebas y desarrollo)
- **MySQL** (para producción)
- **Maven**

## Instalación

Para ejecutar este proyecto localmente, sigue estos pasos:

1. **Clonar el repositorio**:

    ```sh
    git clone https://github.com/tu-usuario/forohub.git
    cd forohub
    ```

2. **Configurar la base de datos**:
    - Edita el archivo `src/main/resources/application.properties` para configurar la base de datos según tu entorno.

3. **Compilar y ejecutar la aplicación**:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

La aplicación estará disponible en `http://localhost:8080`.

## Uso

Puedes interactuar con la API utilizando herramientas como `Postman` o `cURL`. Aquí tienes algunos ejemplos de las rutas disponibles:

- **Crear un nuevo tópico**:

    ```
    POST /topics
    Content-Type: application/json
    
    {
        "title": "Título del Tópico",
        "message": "Mensaje del Tópico",
        "author": "Autor del Tópico"
    }
    ```

- **Mostrar todos los tópicos**:

    ```
    GET /topics
    ```

- **Mostrar un tópico específico**:

    ```
    GET /topics/{id}
    ```

- **Actualizar un tópico**:

    ```
    PUT /topics/{id}
    Content-Type: application/json
    
    {
        "title": "Nuevo Título del Tópico",
        "message": "Nuevo Mensaje del Tópico"
    }
    ```

- **Eliminar un tópico**:

    ```
    DELETE /topics/{id}
    ```
  
## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

