# Unidad 3 - Instalación Manual PostgresSQL 9.5 Windows

### E1.2 Descarga
Descargué PostgreSQL 9.5.25 Win x86-32 desde link del curso.
![paso 1 Descarga](paso1_descarga.png)

### E1.2 Extracción
Descomprimí el archivo .zip en la carpeta pgsql.
![paso 2 extraccion](paso2_extraccion.png)

### E1.4 initdb
Ejecuté el comando: `initdb.exe -D DATA_TUNOMBRE -U Postgres -W -E UTF8`
Cambié DATA_TUNOMBRE por DATA_ROMY
![paso 3 initdb](paso3_initdb.png)

### E1.4 Iniciar sevidor
Comando usado: `pg_ctl.exe -D DATA_NOMBRE -l logfile start`
![paso 4 pgctl](paso4_pgctl.png)

### E1.4 Conexión con psql
Me conecté con: `psql -U postgres`
![paso 5 psql](paso5_psql.png)


