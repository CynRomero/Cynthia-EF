/*Clase Abstracta con método abstracto*/

public abstract class Persona {
    //Atributos de la clase con encapsulamiento
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    public static float salario = 107.23f;


    //Constructor por definición
    public Persona() {

    }

    //Constructor con sobrecarga
    public Persona(String nombre, String apellidoP, String apellidoM, int edad) {
        //atriburo de la clase /variable de la clase
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }

    //Getters y Setters de los atributos para recuperarlos y modificarlos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Método Imprimir lo información
    /*public  void imprimirNombre(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido Paterno: "+ this.apellidoP);
        System.out.println("Apellido Materno: "+ this.apellidoM);
        System.out.println("Edad: "+ this.edad);
    }  */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Nombre='").append(nombre).append('\'');
        sb.append(", Apellido Paterno='").append(apellidoP).append('\'');
        sb.append(", Apellido Materno='").append(apellidoM).append('\'');
        sb.append(", Edad=").append(edad);
        sb.append(' ');
        return sb.toString();
    }

    //Método abstracto dentro de una clase abstracta
    public abstract void accionPersona();

}
