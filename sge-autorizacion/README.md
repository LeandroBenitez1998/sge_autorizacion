### sge-autorizacion
Este proyecto utiliza Quarkus, el Framework Java supersónico y subatómico.

Si querés saber más sobre Quarkus, podés visitar su sitio web: https://quarkus.io/.

### ▶️ Ejecutar la aplicación en modo desarrollo
Podés ejecutar tu aplicación en modo desarrollo (dev mode), lo que habilita recarga en caliente (live coding), utilizando:

bash
Copiar
Editar
./mvnw quarkus:dev
NOTA: Quarkus incluye una Dev UI que solo está disponible en modo desarrollo en: http://localhost:8080/q/dev/

### 📦 Empaquetar y ejecutar la aplicación
La aplicación puede empaquetarse con:

bash
Copiar
Editar
./mvnw package
Esto genera el archivo quarkus-run.jar en el directorio target/quarkus-app/.
Tené en cuenta que no es un über-jar: las dependencias están copiadas en target/quarkus-app/lib/.

Ahora podés ejecutarla con:

bash
Copiar
Editar
java -jar target/quarkus-app/quarkus-run.jar
Si querés crear un über-jar (jar único con todas las dependencias), ejecutá:

bash
Copiar
Editar
./mvnw package -Dquarkus.package.jar.type=uber-jar
Y luego corré la aplicación así:

bash
Copiar
Editar
java -jar target/*-runner.jar
🧊 Crear un ejecutable nativo
Podés generar un ejecutable nativo con:

bash
Copiar
Editar
./mvnw package -Dnative
O, si no tenés GraalVM instalado localmente, podés usar un contenedor para compilarlo:

bash
Copiar
Editar
./mvnw package -Dnative -Dquarkus.native.container-build=true
Luego ejecutalo con:

bash
Copiar
Editar
./target/sge-autorizacion-1.0.0-SNAPSHOT-runner
Más información sobre ejecutables nativos en:
https://quarkus.io/guides/maven-tooling

📚 Guías relacionadas
Recursos REST para Hibernate ORM con Panache
Guía
Generación automática de recursos REST para tus entidades/repositorios con Panache.

REST
Guía
Implementación de Jakarta REST utilizando procesamiento en tiempo de compilación y Vert.x.
⚠️ No es compatible con quarkus-resteasy ni sus extensiones asociadas.

SmallRye OpenTracing
Guía
Permite rastrear (tracear) tus servicios.

Hibernate Validator
Guía
Validación de propiedades de objetos y parámetros de métodos.

### REST Client
Guía
Consumí servicios REST externos de manera declarativa.

### SmallRye OpenAPI
Guía
Documentación de tus APIs REST con OpenAPI y Swagger UI.

### SmallRye JWT
Guía
Seguridad con JSON Web Tokens.

SmallRye Health
Guía
Monitoreo del estado de salud de la aplicación.

Driver JDBC - Oracle
Guía
Conexión a bases de datos Oracle mediante JDBC.

🧪 Código provisto
REST Data con Panache
Generación automática de recursos REST utilizando Panache.

Sección relacionada de la guía...

Cliente REST
Consumí servicios externos vía REST y JSON.

Sección relacionada...

### REST
Arrancá rápido con servicios REST Web.

Sección relacionada...

### SmallRye Health
Monitoreá el estado de salud de tu aplicación con SmallRye Health.

Sección relacionada...

