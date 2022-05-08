# Práctica 1. Arquitectura Orientada a Servicios 1
## Subsistema 5: Gestión y emisión de facturas de un taller
El subsistema 5 es el encargado de llevar a cabo la emisión de facturas de un taller una vez que se han terminado todos los trabajos pendientes para un cliente. 
El repositorio contiene:
1. **Ficheros YAML** en la carpeta `openapi`, utilizados para llevar a cabo la definición del servicio siguiendo la especificación de OpenApi3 
2. **Archivo Caddyfile** reverse-proxy que nos permite simular el funcionamiento del servicio sin necesidad de llevar a cabo su implementación. 
3. **Fichero docker-compose** mediante el cual se posibilita la ejecución de aplicaciones con múltiples contenedores sin necesidad de máquinas virtuales o servidores remotos.

## Consideraciones de diseño

- Una factura es una relación entre un usuario y los trabajos solicitados (conceptos) terminados. Por ello, necesitamos conocer el identificador de usuario, así como la información relevante del trabajo (cliente, vehículo, trabajo realizado, fechas e importe).
La información correspondiente al trabajo será facilitada desde dicho servicio cuando se realicen las llamadas de creación o actualización.

- Al crear una factura (POST), a esta se le asigna un identificador que servirá para realizar el resto de peticiones, ya sea modificación, eliminación o consulta individual, devolviendo esta última petición como resultado de la creación.
Se permite consultar todas las facturas, para lo que no hará falta especificar ningún identificador.

- Aparte de por identificador de factura, permitimos la consulta de todas las facturas pertenecientes a un cliente, por medio de su identificador de cliente.

## Despliegue


### 1. Obtener el código
Obtenemos el código mediante ```git clone rutadelrepositorio``` o mediante el fichero .zip suministrado, el cual descomprimiriamos en una ruta de fácil acceso.

### 2. Abrir un terminal desde el cual iniciar los servicios

Una de las ventajas de docker es la posibilidad de ejecutar los contenedores en cualquier máquina, ya sea esta Linux, Windows o MacOs.

En Windows:
- `Tecla de Windows + R` para abrir la ventana de Ejecutar
- Escribimos `cmd` y le damos a `ENTER`

En Linux:
- `Control + T` para abrir un terminal

En MacOS:

- `Tecla OPTION + tecla ESPACIO`. Escribimos `Terminal` y presionamos `INTRO`

### 3. Comprobar la ruta del repositorio

Para el funcionamiento del comando `docker-compose up` es imprescindible estar situados en la carpeta correspondiente al repositorio descargado.

Para ello escribimos `cd ruta/proeycto` en el terminal de nuestro sistema.

Podemos listar los ficheros utilizando `dir` o `ls` para verificar que vemos el fichero  `docker-composse.yml`

### 4. Ejecutar docker compose

Desde el mismo terminal escribimos `docker-compose up`

### 5. Acceso desde el navegador

Si todo ha ido bien accedemos http://127.0.0.1 desde nuestro navegador.

Desde SwaggerUI podremos realizar todas las peticiones necesarias para probar el servicio.

Para la simulación del servicio se crean 3 contenedores:

1.**Reverse Proxy** Servidor encargado de resolver las rutas cuando se consulte a nuestro servidor. Es la puerta de entrada a nuestra aplicación.

2.**Backend**:  Simula la funcionalidad del servicio mediante Spotlight Prism sin necesidad de implementación.

3.**Frontend**: Interfaz de Swagger-UI desde la cual realizar las peticiones de prueba y consultar la especificación de la API en OpenAPI3.