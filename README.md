# Práctica Arquitectura Orientada a Servicios
## Subsistema 5: Gestión y emisión de facturas de un taller
El subsistema 5 es el encargado de llevar a cabo la emisión de facturas de un taller una vez que se han terminado todos los trabajos pendientes para un cliente. 
El repositorio contiene:
1. **Ficheros YAML** utilizados para llevar a cabo la especificación del servicio. 
2. **Archivo Caddyfile** que nos permite simular el funcionamiento del servicio sin necesidad de llevar a cabo su implementación. 
3. **Fichero docker-compose** mediante el cual se posibilita la ejecución de aplicaciones con múltiples contenedores.

### Uso de la práctica
Una vez que hemos clonado el repositorio mediante Git, deberemos de situarnos en el directorio del proyecto y ejecutar el siguiente comando en el terminal:  ```docker-compose up```
Éste comando lanza los siguientes servicios:
1. **Caddy:** servidor web open-source
2. **Prism4:** prism es un conjunto de paquetes especializado en el testeo de APIs con OpenAPI (swagger).
3. **Swagger-UI**: Swagger-UI posibilita a los usuarios visualizar e interactuar con los recursos especificados en la API sin que sea necesaria la implementación. Esta simulación es posible gracias a la especificación de swagger. 

Tras ejecutar el comando, podemos realizar peticiones a la api accediendo a la ruta y puerto correspondientes.
Si deseamos visualizar la especificación de la API mediante el cliente de Swagger debemos de ir a la siguiente dirección:```http://127.0.0.1:8000/```
