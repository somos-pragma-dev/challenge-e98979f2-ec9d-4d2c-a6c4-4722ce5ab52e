# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
API REST con H2 y Swagger

### Reto
- Tema: Java Spring Boot REST API
- Seniority: junior-l2
- Tipo: practical
- Título: Desarrollo de una API REST para gestión de productos
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición y validación de productos — objetivo: Definir la estructura de los productos y validar las restricciones de negocio. — entregable (NO resolver): Especificación de la estructura de datos de los productos y validaciones implementadas.
- Fase 2: Implementación de endpoints REST — objetivo: Implementar los endpoints REST para crear, leer, actualizar y eliminar productos. — entregable (NO resolver): Endpoints REST implementados y funcionales para las operaciones CRUD de productos.
- Fase 3: Integración con base de datos y documentación — objetivo: Integrar la API con una base de datos y documentar los endpoints utilizando Swagger. — entregable (NO resolver): API integrada con base de datos y documentación de los endpoints utilizando Swagger.

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
// === ARCHIVO: src/main/java/com/pragma/api/ProductController.java ===
package com.pragma.api;

import com.pragma.domain.Product;
import com.pragma.domain.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Operation(summary = "Create a new product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Product created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
            @ApiResponse(responseCode = "400", description = "Invalid input", content = @Content)
    })
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @Operation(summary = "Get all products")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Products found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class)))
    })
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @Operation(summary = "Get product by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @Operation(summary = "Update product by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)
    })
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @Operation(summary = "Delete product by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Product deleted", content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content)
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
// === ARCHIVO: src/main/java/com/pragma/domain/Product.java ===
package com.pragma.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Price is mandatory")
    @Min(value = 0, message = "Price must be non-negative")
    private Double price;

    @NotNull(message = "Stock is mandatory")
    @Min(value = 0, message = "Stock must be non-negative")
    private Integer stock;

    @NotBlank(message = "Category is mandatory")
    private String category;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
// === ARCHIVO: src/main/java/com/pragma/domain/ProductService.java ===
package com.pragma.domain;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public Product createProduct(Product product) {
        // Logic to create product
        return product;
    }

    public List<Product> getAllProducts() {
        // Logic to get all products
        return List.of();
    }

    public Product getProductById(Long id) {
        // Logic to get product by ID
        return new Product();
    }

    public Product updateProduct(Long id, Product product) {
        // Logic to update product
        return product;
    }

    public void deleteProduct(Long id) {
        // Logic to delete product
    }
}
// === ARCHIVO: src/main/resources/application.properties ===
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
// === ARCHIVO: src/main/resources/db/migration/V1__Create_Product_Table.sql ===
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL,
    category VARCHAR(255) NOT NULL
);
// === ARCHIVO: src/test/java/com/pragma/api/ProductControllerTest.java ===
package com.pragma.api;

import com.pragma.domain.Product;
import com.pragma.domain.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        when(productService.createProduct(any(Product.class))).thenReturn(product);

        mockMvc.perform(post("/products")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Test Product\",\"price\":10.0,\"stock\":100,\"category\":\"Test Category\"}"))
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.name").value("Test Product"));
    }

    @Test
    public void testGetAllProducts() throws Exception {
        when(productService.getAllProducts()).thenReturn(Collections.singletonList(new Product()));

        mockMvc.perform(get("/products"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.[0].name").exists());
    }

    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        when(productService.getProductById(1L)).thenReturn(product);

        mockMvc.perform(get("/products/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Test Product"));
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Updated Product");
        product.setPrice(20.0);
        product.setStock(200);
        product.setCategory("Updated Category");

        when(productService.updateProduct(1L, any(Product.class))).thenReturn(product);

        mockMvc.perform(put("/products/1")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Updated Product\",\"price\":20.0,\"stock\":200,\"category\":\"Updated Category\"}"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Updated Product"));
    }

    @Test
    public void testDeleteProduct() throws Exception {
        doNothing().when(productService).deleteProduct(1L);

        mockMvc.perform(delete("/products/1"))
               .andExpect(status().isNoContent());
    }
}
// === ARCHIVO: src/test/java/com/pragma/domain/ProductServiceTest.java ===
package com.pragma.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product createdProduct = productService.createProduct(product);

        assertNotNull(createdProduct);
        assertEquals(product.getName(), createdProduct.getName());
        assertEquals(product.getPrice(), createdProduct.getPrice());
        assertEquals(product.getStock(), createdProduct.getStock());
        assertEquals(product.getCategory(), createdProduct.getCategory());
    }

    @Test
    public void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();

        assertNotNull(products);
        assertEquals(Collections.emptyList(), products);
    }

    @Test
    public void testGetProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product retrievedProduct = productService.getProductById(1L);

        assertNotNull(retrievedProduct);
        assertEquals(product.getId(), retrievedProduct.getId());
        assertEquals(product.getName(), retrievedProduct.getName());
        assertEquals(product.getPrice(), retrievedProduct.getPrice());
        assertEquals(product.getStock(), retrievedProduct.getStock());
        assertEquals(product.getCategory(), retrievedProduct.getCategory());
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product updatedProduct = productService.updateProduct(1L, product);

        assertNotNull(updatedProduct);
        assertEquals(product.getId(), updatedProduct.getId());
        assertEquals(product.getName(), updatedProduct.getName());
        assertEquals(product.getPrice(), updatedProduct.getPrice());
        assertEquals(product.getStock(), updatedProduct.getStock());
        assertEquals(product.getCategory(), updatedProduct.getCategory());
    }

    @Test
    public void testDeleteProduct() {
        productService.deleteProduct(1L);
        // No assertion needed as it's a void method
    }
}
// === ARCHIVO: src/main/resources/openapi.yaml ===
openapi: 3.0.0
info:
  title: Product API
  version: 1.0.0
paths:
  /products:
    post:
      summary: Create a new product
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Product'
      responses:
        '201':
          description: Product created
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Product'
    get:
      summary: Get all products
      responses:
        '200':
          description: Products found
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/Product'
  /products/{id}:
    get:
      summary: Get product by ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Product found
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Product'
    put:
      summary: Update product by ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Product'
      responses:
        '200':
          description: Product updated
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Product'
    delete:
      summary: Delete product by ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '204':
          description: Product deleted
components:
  schemas:
    Product:
      type: object
      properties:
        id:
          type: integer
          format: int64
        name:
          type: string
        price:
          type: number
          format: double
        stock:
          type: integer
          format: int32
        category:
          type: string
      required:
        - name
        - price
        - stock
        - category

```
