Descripción de la prueba
 - Implementación del patrón Circuit Breaker en un servicio Java para mejorar la disponibilidad y la resiliencia ante fallos de servicios dependientes.

Objetivos de la prueba
 - Asegurar que el sistema pueda manejar fallos en servicios externos sin comprometer la disponibilidad general.
 - Evaluar el comportamiento del sistema bajo condiciones de fallo y recuperación.
   
Pasos implementados para llevar a cabo la prueba
 - Configuración del Entorno: Configurar un proyecto Java y agregar las dependencias necesarias.
 - Implementación del Circuit Breaker: Escribir el código para el patrón Circuit Breaker utilizando Resilience4j.
 - Simulación de Fallos: Simular fallos en el servicio externo para activar el Circuit Breaker.
 - Pruebas de Recuperación: Evaluar el comportamiento del sistema cuando el servicio externo se recupera.
   
Tecnologías usadas en la prueba
 - Lenguaje: Java
 - Bibliotecas: Resilience4j, Spring Boot para facilitar la implementación.

Resultados
 - Estabilidad: El sistema demostró ser estable bajo condiciones de fallo del servicio externo.
 - Recuperación: El Circuit Breaker permitió una recuperación suave una vez que el servicio externo estuvo disponible nuevamente.
 - Métricas: Se registraron tiempos de respuesta mejorados y menor incidencia de errores.

Conclusiones
La implementación del patrón Circuit Breaker mejoró significativamente la resiliencia y disponibilidad del sistema simulado, permitiendo manejar fallos en servicios externos de manera eficiente. 
Las pruebas demostraron que el sistema puede mantener un rendimiento aceptable y recuperarse rápidamente de los fallos.
