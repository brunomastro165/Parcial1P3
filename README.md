# API REST con Spring Boot

## Prototipo de API utilizando Spring Boot

Este repositorio contiene un prototipo de una API REST construida utilizando Spring Boot. A continuación, se describen los principales componentes y características del proyecto.

### Creación de la base de datos SQL

Se ha implementado una base de datos SQL para respaldar la funcionalidad de la API.

![Esquema de la Base de Datos](https://github.com/brunomastro165/Parcial1P3/assets/127962081/ec0699e8-1e7a-4456-b2a1-7ac2b918908c)

### Prueba de métodos propios de la API usando Swagger (Ejemplos)

La API se ha documentado y se pueden probar sus métodos utilizando Swagger. Aquí se presentan ejemplos de cómo interactuar con la API:

![Ejemplo 1](https://github.com/brunomastro165/Parcial1P3/assets/127962081/0c56e589-bd78-4e60-8cfc-b5dbfc30d58e)

![Ejemplo 2](https://github.com/brunomastro165/Parcial1P3/assets/127962081/445504a3-979a-4a72-be6e-0af10aa3372d)

![Ejemplo 3](https://github.com/brunomastro165/Parcial1P3/assets/127962081/ace4b183-9338-4310-b439-92db7dbfb242)

![Ejemplo 4](https://github.com/brunomastro165/Parcial1P3/assets/127962081/69276b78-3426-4a02-ac27-d6a1e58ddf76)

### Acceso a Swagger

Puedes acceder a Swagger y probar todos los métodos de la API utilizando el siguiente enlace:

[Swagger UI](http://localhost:8080/swagger-ui/index.html)

README - Spring Boot API REST
Descripción General
Esta aplicación es una API REST desarrollada en Spring Boot que proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en entidades como Autor, Localidad, y Persona. También se ha implementado el sistema de auditoría de Hibernate Envers para realizar un seguimiento de las revisiones en la entidad Revision.

Estructura de Carpetas
com.example.springbootapirest.config: Contiene la configuración personalizada, como CustomRevisionListener, que se utiliza para la auditoría de revisiones.
com.example.springbootapirest.controllers: Contiene los controladores que manejan las solicitudes HTTP y las respuestas.
com.example.springbootapirest.entities: Contiene las clases de entidades como Autor, Localidad, Persona, etc.
com.example.springbootapirest.repositories: Contiene las interfaces de repositorio para las entidades.
com.example.springbootapirest.services: Contiene las interfaces y las implementaciones de los servicios que gestionan la lógica de negocio.
resources: Contiene el archivo de configuración de la base de datos (application.properties) y la configuración para la consola H2 (h2-console).
Controladores
AutorController, LocalidadController, PersonaController: Controladores que manejan las operaciones CRUD para las entidades Autor, Localidad, y Persona.
Servicios
AutorServiceImpl, LocalidadServiceImpl, PersonaServiceImpl: Implementaciones de servicios que realizan operaciones en las entidades correspondientes.
Auditoría
Revision: Clase de entidad que almacena información de revisiones, como fecha y hora.
CustomRevisionListener: Clase de configuración que escucha las revisiones de las entidades y realiza acciones personalizadas, si es necesario.
Base de Datos
La aplicación utiliza una base de datos H2 en memoria con la consola H2 habilitada para facilitar la depuración y el desarrollo. Puedes acceder a la consola H2 a través de http://localhost:8080/h2-console/. La configuración de la base de datos se encuentra en application.properties.

Documentación API
La API está documentada utilizando Springdoc OpenAPI. Puedes acceder a la documentación de la API en http://localhost:8080/swagger-ui/index.html una vez que la aplicación esté en funcionamiento.

Ejecución de la Aplicación
Para ejecutar la aplicación, puedes utilizar el método main en la clase SpringbootApiRestApplication. Asegúrate de que la base de datos esté configurada correctamente en application.properties antes de ejecutar la aplicación.

Notas Adicionales
La aplicación utiliza anotaciones de Lombok para generar automáticamente los métodos getters, setters y otros métodos de acceso en las clases de entidad.
Hibernate Envers se utiliza para auditar las revisiones de las entidades, lo que permite realizar un seguimiento de los cambios en los datos a lo largo del tiempo.
Esta es una descripción general de alto nivel de la aplicación Spring Boot API REST. Puedes explorar las clases y los paquetes individuales para obtener más detalles sobre la implementación y la funcionalidad específica de cada componente
