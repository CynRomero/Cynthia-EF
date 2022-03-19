//Usando el concepto de herencia Simple

public class Empleado extends Persona {
    public int id;
    private String departamento;

    //Usando los atributos de la clase padre
    public Empleado(String nombre, String apellidoP, String apellidoM, int edad) {
        super(nombre, apellidoP, apellidoM, edad);
        this.id = id;
        this.departamento = departamento;
    }

    public Empleado() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Modificando el método que extiende de Object


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("IdEmleado=").append(id);
        sb.append(", Departamento='").append(departamento).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accionPersona() {
        System.out.println("\nDatos del empleado responsable:");
        System.out.println("1- El empleado Hereda los atributos de la clase Persona-");
    }

    //Se declara el método de la clase padre
    public void diasLaborales() {
        System.out.println("2- Los días laborales de un empleado pueden variar de acuerdo al puesto.");

    }

}
