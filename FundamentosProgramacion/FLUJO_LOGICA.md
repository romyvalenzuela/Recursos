# Diagrama de Flujo - Etapa 5

## método: [nombre del método que elijas]

```mermaid
flowchart TD
A[Inicio] --> b{¿Condición?}
B --> |Sí| C[Acción si es verdad]
B --> |No| D[Acción si es falso]
c --> E[Fin]
D --> E
