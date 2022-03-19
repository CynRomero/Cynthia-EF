
public class Tester extends Empleado implements Salario {
    String proyecto;

    public Tester(String nombre, String apellidoP, String apellidoM, int edad, String proyecto) {
        super(nombre, apellidoP, apellidoM, edad);
        this.proyecto = proyecto;
    }

    //Se realiza la sobreescritura del método en la clase hija
    @Override
    public void diasLaborales() {
        System.out.println("1- Un Tester labora de Lunes a Viernes de 9 a 6 con 1 hora de comida");
    }

    @Override
    public void calcularSalario() {
        float salarioTotal;
        salarioTotal = (float) ((salario * 40.5) * 7);
        System.out.println("2- El salario es: " + salarioTotal);
    }

    @Override
    public void aumentoSalario() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("Proyecto Asignado='").append(proyecto).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
