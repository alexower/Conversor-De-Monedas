# CONVERSOR DE MONEDAS
![Static Badge](https://img.shields.io/badge/Version-1.1-green)

Este proyecto es una aplicación de consola en Java que permite convertir diferentes monedas utilizando una API de tasas de cambio.
 
## Características
- Conversión entre diversas monedas, incluyendo:
  - Dólar a Peso Mexicano
  - Peso Mexicano a Dólar
  - Euro a Dólar
  - Dólar a Euro
  - Yen a Dólar
  - Dólar a Yen
  - Real Brasileño a Dólar
  - Dólar a Real Brasileño
  - Peso Colombiano a Dólar
  - Dólar a Peso Colombiano
- Manejo de excepciones para entradas no válidas y números negativos.
- Utilización de una API para obtener las tasas de conversión actualizadas.
- Interfaz de usuario en consola para facilitar las operaciones.

## Dependencias

Este proyecto utiliza la biblioteca [Gson](https://github.com/google/gson) para parsear JSON. Asegúrate de incluir `gson-2.11.0.jar` en tu classpath.

## Estructura del Proyecto

- `Conversor.java`: Clase principal que contiene el menú y la lógica principal de la aplicación.
- `Escaner.java`: Clase que contiene métodos para escanear la entrada del usuario y validar montos.
- `ApiConnector.java`: Clase que maneja la conexión con la API de tasas de cambio.
- `Conversion.java`: Clase que realiza la conversión de monedas y muestra los resultados.
- `Moneda.java`: Record que representa una moneda y su tasa de conversión.
- `NegativeNumberException.java`: Excepción personalizada para manejar números negativos.

## Uso

1. Clona este repositorio en tu máquina local.
``` git clone https://github.com/alexower/Conversor-De-Monedas.git ```
2. Asegúrate de tener `gson-2.11.0.jar` en tu classpath.
3. Compila y ejecuta el programa.

## API de Tasas de Cambio

Este proyecto utiliza una API de tasas de cambio. Asegúrate de obtener tu propia clave de API y reemplazar `"key"` en la URL de la API.
[https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)


## Manejo de Excepciones

El programa maneja las siguientes excepciones:

- `NumberFormatException`: Para entradas no válidas que no son números.
- `NegativeNumberException`: Para manejar entradas de montos negativos.

## Autor
Alex Milak
