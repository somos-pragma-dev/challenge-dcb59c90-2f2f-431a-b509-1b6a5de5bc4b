# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Herencia, polimorfismo y encapsulacion en un sistema academico

### Reto
- Tema: programacion-orientada-a-objetos-con-java
- Seniority: junior-l1
- Tipo: practical
- Título: Diseño de Sistema Académico con POO
- Tiempo estimado: 4 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Modelado de Usuarios — objetivo: Definir la estructura básica de los usuarios en el sistema académico. — entregable (NO resolver): Jerarquía de clases de usuarios con encapsulación de datos.
- Fase 2: Implementación de Comportamientos — objetivo: Implementar comportamientos específicos para cada tipo de usuario utilizando polimorfismo. — entregable (NO resolver): Clases de usuarios con métodos polimórficos implementados.
- Fase 3: Integración y Pruebas — objetivo: Integrar las clases de usuarios en un sistema más grande y realizar pruebas para asegurar que todo funciona como se espera. — entregable (NO resolver): Sistema integrado con pruebas que verifican la correcta implementación de POO.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/academicsystem/users/User.java ===
package com.academicsystem.users;

public abstract class User {
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void performAction();
}

// === ARCHIVO: src/main/java/com/academicsystem/users/Student.java ===
package com.academicsystem.users;

public class Student extends User {

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Student is enrolling in a course.");
    }
}

// === ARCHIVO: src/main/java/com/academicsystem/users/Professor.java ===
package com.academicsystem.users;

public class Professor extends User {

    public Professor(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Professor is creating a course.");
    }
}

// === ARCHIVO: src/main/java/com/academicsystem/users/Administrator.java ===
package com.academicsystem.users;

public class Administrator extends User {

    public Administrator(String name, String id) {
        super(name, id);
    }

    @Override
    public void performAction() {
        System.out.println("Administrator is managing users and courses.");
    }
}

// === ARCHIVO: src/main/java/com/academicsystem/courses/Course.java ===
package com.academicsystem.courses;

public class Course {
    private String name;
    private String id;

    public Course(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// === ARCHIVO: src/main/java/com/academicsystem/evaluations/Evaluation.java ===
package com.academicsystem.evaluations;

public class Evaluation {
    private String name;
    private String id;

    public Evaluation(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// === ARCHIVO: src/test/java/com/academicsystem/UsersTest.java ===
package com.academicsystem;

import com.academicsystem.users.Administrator;
import com.academicsystem.users.Professor;
import com.academicsystem.users.Student;
import com.academicsystem.users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsersTest {

    @Test
    public void testUserEncapsulation() {
        User user = new Student("John Doe", "12345");
        Assertions.assertEquals("John Doe", user.getName());
        Assertions.assertEquals("12345", user.getId());
    }

    @Test
    public void testStudentAction() {
        Student student = new Student("Jane Doe", "67890");
        student.performAction();
    }

    @Test
    public void testProfessorAction() {
        Professor professor = new Professor("Dr. Smith", "54321");
        professor.performAction();
    }

    @Test
    public void testAdministratorAction() {
        Administrator administrator = new Administrator("Admin", "00000");
        administrator.performAction();
    }
}

// === ARCHIVO: src/test/java/com/academicsystem/CoursesTest.java ===
package com.academicsystem;

import com.academicsystem.courses.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoursesTest {

    @Test
    public void testCourseEncapsulation() {
        Course course = new Course("Math", "101");
        Assertions.assertEquals("Math", course.getName());
        Assertions.assertEquals("101", course.getId());
    }
}

// === ARCHIVO: src/test/java/com/academicsystem/EvaluationsTest.java ===
package com.academicsystem;

import com.academicsystem.evaluations.Evaluation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluationsTest {

    @Test
    public void testEvaluationEncapsulation() {
        Evaluation evaluation = new Evaluation("Final Exam", "EX101");
        Assertions.assertEquals("Final Exam", evaluation.getName());
        Assertions.assertEquals("EX101", evaluation.getId());
    }
}

// === ARCHIVO: src/main/resources/application.properties ===
server.port=8080

// === ARCHIVO: src/main/java/com/academicsystem/AcademicSystemApplication.java ===
package com.academicsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcademicSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcademicSystemApplication.class, args);
    }
}

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.academicsystem</groupId>
    <artifactId>academic-system</artifactId>
    <version>1.0-SNAPSHOT</version>
    <name>Academic System</name>
    <description>Academic System with POO</description>

    <properties>
        <java.version>21</java.version>
        <spring-boot.version>3.4.0</spring-boot.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
            <version>${spring-boot.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <version>${spring-boot.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>${spring-boot.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```
