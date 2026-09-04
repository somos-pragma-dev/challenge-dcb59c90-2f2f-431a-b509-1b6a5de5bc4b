# Diseño de Sistema Académico con POO

En un sistema académico, se necesita modelar diferentes tipos de usuarios (estudiantes, profesores, administradores) y sus interacciones con cursos y evaluaciones. Los estudiantes pueden inscribirse en cursos, los profesores pueden crear y evaluar cursos, y los administradores pueden gestionar usuarios y cursos. El sistema debe asegurar la encapsulación de datos sensibles, utilizar herencia para compartir funcionalidad común entre tipos de usuarios, y aplicar polimorfismo para manejar diferentes comportamientos de usuarios.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | programacion-orientada-a-objetos-con-java |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de Usuarios

**Objetivo:** Definir la estructura básica de los usuarios en el sistema académico.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Crea una jerarquía de clases para representar diferentes tipos de usuarios (estudiantes, profesores, administradores).
- Asegura que cada tipo de usuario encapsule sus datos sensibles.

**Entregable:** Jerarquía de clases de usuarios con encapsulación de datos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo la herencia puede ayudar a compartir funcionalidad común.
- Piensa en cómo la encapsulación protege los datos de acceso no autorizado.

</details>

### Fase 2: Implementación de Comportamientos

**Objetivo:** Implementar comportamientos específicos para cada tipo de usuario utilizando polimorfismo.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Define métodos que permitan a cada tipo de usuario realizar acciones específicas (por ejemplo, inscribirse en un curso para estudiantes, crear un curso para profesores).
- Utiliza polimorfismo para manejar diferentes comportamientos de usuarios.

**Entregable:** Clases de usuarios con métodos polimórficos implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Reflexiona sobre cómo el polimorfismo permite tratar diferentes tipos de objetos de manera uniforme.
- Considera los posibles errores comunes al implementar polimorfismo y cómo evitarlos.

</details>

### Fase 3: Integración y Pruebas

**Objetivo:** Integrar las clases de usuarios en un sistema más grande y realizar pruebas para asegurar que todo funciona como se espera.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Integra las clases de usuarios en un sistema más grande que incluya cursos y evaluaciones.
- Realiza pruebas para asegurar que la encapsulación, herencia y polimorfismo funcionan correctamente.

**Entregable:** Sistema integrado con pruebas que verifican la correcta implementación de POO.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo puedes probar efectivamente la encapsulación, herencia y polimorfismo.
- Considera cómo manejarías posibles errores o fallas en las pruebas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la encapsulación y cómo se aplica en el modelado de usuarios?
- **paraQueSirve**: ¿Para qué sirve la herencia en la jerarquía de usuarios y cómo mejora el diseño del sistema?
- **comoSeUsa**: ¿Cómo se usa el polimorfismo para manejar diferentes comportamientos de usuarios?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar herencia y polimorfismo y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de la jerarquía de usuarios y cómo afectan al sistema en general?

## Criterios de Evaluacion

- Implementación correcta de encapsulación en las clases de usuarios.
- Uso efectivo de herencia para compartir funcionalidad común.
- Aplicación de polimorfismo para manejar diferentes comportamientos de usuarios.
- Identificación y manejo de errores comunes en la implementación de POO.
- Justificación de decisiones de diseño en la jerarquía de usuarios.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
