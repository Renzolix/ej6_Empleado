# Ejercicio 6: Empleado

## Explicación Lógica
1. **Garantía del Invariante de Clase:** El constructor evalúa los argumentos numéricos para evitar que el objeto nazca en un estado inconsistente (sueldos o años de antigüedad negativos), reajustándolos a `0.0` o `0`.
2. **Métodos de Negocio en lugar de Setters:** No se provee setter para el sueldo; las modificaciones deben pasar por `aplicarAumento()`, validando incrementos estrictamente positivos.