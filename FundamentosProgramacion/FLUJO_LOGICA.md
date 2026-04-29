# Diagrama de Flujo - Etapa 5

## Método: esta_vivo

Este método verifica si el personaje sigue con vida comparando su atributo `vida` con 0

```mermaid
flowchart TD
A[Inicio] --> B{¿vida > 0?}
B -->|Sí|  C[Retornar True]
B -->|No|  D[Retornar False]
C --> E[Fin]
D --> E

```
