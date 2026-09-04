# Desarrollo de una API REST para gestión de productos

Se requiere desarrollar una API REST que permita la gestión de productos en un sistema de inventario. La API debe soportar la creación, lectura, actualización y eliminación de productos. Los productos tienen atributos como nombre, precio, stock y categoría. La API debe validar que los precios no sean negativos y que los nombres de los productos no se dupliquen. Además, debe manejar adecuadamente los errores y casos límite del dominio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición y validación de productos

**Objetivo:** Definir la estructura de los productos y validar las restricciones de negocio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña la estructura de datos para representar un producto, incluyendo los atributos nombre, precio, stock y categoría.
- Implementa la validación para asegurar que los precios no sean negativos y que los nombres de los productos no se dupliquen.

**Entregable:** Especificación de la estructura de datos de los productos y validaciones implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo representar y validar los atributos de los productos.
- Piensa en los posibles errores y cómo manejarlos.

</details>

### Fase 2: Implementación de endpoints REST

**Objetivo:** Implementar los endpoints REST para crear, leer, actualizar y eliminar productos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crea los endpoints REST para las operaciones CRUD de productos.
- Asegúrate de que los endpoints manejen adecuadamente las validaciones y errores definidos en la fase anterior.

**Entregable:** Endpoints REST implementados y funcionales para las operaciones CRUD de productos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar los endpoints para que sean claros y consistentes.
- Piensa en cómo manejar las respuestas y errores en los endpoints.

</details>

### Fase 3: Integración con base de datos y documentación

**Objetivo:** Integrar la API con una base de datos y documentar los endpoints utilizando Swagger.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Integra la API con una base de datos para persistir los productos.
- Documenta los endpoints utilizando Swagger para que sean fácilmente comprensibles por otros desarrolladores.

**Entregable:** API integrada con base de datos y documentación de los endpoints utilizando Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo persistir los productos de manera eficiente y segura.
- Piensa en cómo documentar los endpoints de manera clara y completa.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un producto en el contexto de esta API?
- **paraQueSirve**: ¿Para qué sirven las validaciones implementadas en la fase 1?
- **comoSeUsa**: ¿Cómo se usan los endpoints REST para crear, leer, actualizar y eliminar productos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al manejar productos y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración con la base de datos y la documentación de los endpoints?

## Criterios de Evaluacion

- Definición clara y correcta de la estructura de datos de los productos.
- Validaciones implementadas para precios y nombres de productos.
- Endpoints REST funcionales para las operaciones CRUD de productos.
- Integración eficiente y segura con la base de datos.
- Documentación clara y completa de los endpoints utilizando Swagger.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
