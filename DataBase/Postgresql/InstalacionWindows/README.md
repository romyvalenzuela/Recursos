# Unidad 3 - Instalación Manual PostgresSQL 9.5 Windows

### E1.2 Descarga
Descargué PostgreSQL 9.5.25 Win x86-32 desde link del curso.

![paso 1 Descarga](../pg_pasos/descargar%20postgres%20.png)

### E1.2 Extracción
Descomprimí el archivo .zip en la carpeta pgsql.

![paso 2 extraccion](../pg_pasos/paso2_extraccion.png)

### E1.3 initdb
Ejecuté el comando: `C:/pgsql/bin> initdb.exe -D DATA_ROMYVALENZUELA -U Postgres -W -E UTF8`
Cambié DATA_Romy por DATA_ROMYVALENZUELA

![paso 3 initdb](../pg_pasos/paso3_initdb.png)

### E1.4 Iniciar servidor
Me paré en la carpeta bin y ejecuté : `C:/pgsql/bin> pg_ctl.exe -D DATA_ROMYVALENZUELA -l logfile start`

![!paso 4 pgctl](../pg_pasos/paso4_pgctl.png)

### E1.5 Conexión con psql
Me conecté con: `psql -U postgres`

![paso 5 psql](../pg_pasos/paso5_psql.png)

### Paso.6 Ejecutar pgAdmin III
Busuqé el programa pgAdmin3.exe dentro de la carpeta C:/pgsql/bin y lo abrí haciendo doble click.
Ahí agregué el servidor localhost:5432 con usuario postgres y contraseña postgres.

![paso_6.1_pgAdmin](../pg_pasos/paso6_pgAdmin3.png)
![paso_6.2_pgAdmin_conectado](../pg_pasos/paso6_2.png)

### Paso.7 Conexion Servidor
Le di click al icono del enchufe `add a connection to a server` y llené los datos.
Name: mi base de datos, Host: localhost, Port:5432, Username: postgres, Password: postgres.

![paso_7_conexion_servidor](../pg_pasos/paso7_conexcion.png)

### Advertencia 
Al darle ok a la conexión, pgAdmin me mostro una advertencia que la contraseña se guardaría. Le di ok para continuar.

![paso_8](


