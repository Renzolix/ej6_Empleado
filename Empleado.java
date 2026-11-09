public class Empleado {
    private String legajo;
    private String nombre;
    private double sueldoBase;
    private int antiguedad;

    public Empleado(String legajo, String nombre, double sueldoBase, int antiguedad) {
        this.legajo = legajo;
        this.nombre = nombre;
        // Validación defensiva en constructor
        this.sueldoBase = (sueldoBase >= 0) ? sueldoBase : 0.0;
        this.antiguedad = (antiguedad >= 0) ? antiguedad : 0;
    }

    public String getLegajo() { return legajo; }
    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }
    public int getAntiguedad() { return antiguedad; }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = this.sueldoBase * (porcentaje / 100.0);
            this.sueldoBase += aumento;
            System.out.println(String.format("Aumento del %.1f%% aplicado a %s. Nuevo sueldo: $%.2f", porcentaje, nombre, sueldoBase));
        } else {
            System.out.println("Error: El porcentaje de aumento debe ser estrictamente mayor a 0.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Instanciando Empleado con sueldo y antigüedad negativos ---");
        Empleado emp = new Empleado("EMP-102", "Lucas Gomez", -350000.0, -2);
        System.out.println("Sueldo asignado por seguridad: $" + emp.getSueldoBase() + " | Antigüedad: " + emp.getAntiguedad());

        System.out.println("\n--- Probando Aumento ---");
        emp.aplicarAumento(-10.0); // Inválido
        emp.aplicarAumento(15.0);  // Válido
    }
}