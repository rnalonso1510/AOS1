# Práctica Arquitectura Orientada a Servicios
## Subsistema 5: Gestión y emisión de facturas de un taller
El subsistema 5 es el encargado de llevar a cabo la emisión de facturas de un taller una vez que se han terminado todos los trabajos pendientes para un cliente. 
El repositorio contiene:
1. **Ficheros YAML** en la carpeta `openapi`, utilizados para llevar a cabo la definición del servicio siguiendo la especificación de OpenApi3 
2. **Archivo Caddyfile** que nos permite simular el funcionamiento del servicio sin necesidad de llevar a cabo su implementación. 
3. **Fichero docker-compose** mediante el cual se posibilita la ejecución de aplicaciones con múltiples contenedores sin necesidad de máquinas virtuales o servidores remotos.

## Consideraciones de diseño


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

Si todo ha ido bien accedemos a http://localhost o http://127.0.0.1 desde nuestro navegador.

Desde SwaggerUI podremos realizar todas las peticiones necesarias para probar el servicio.

