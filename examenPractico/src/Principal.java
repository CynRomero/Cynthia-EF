import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        if (EstatusPrograma.estatusActiva) {//Lammando a una constante de clase
            System.out.println("-El estatus del programa de la empresa esta ACTIVA...-");
            System.out.println("Se inicia el proceso....");
            Empleado empleado1 = new Empleado();
            empleado1.accionPersona();
            horario(empleado1);
            empleado1.setId(007654);
            empleado1.setDepartamento("Sistemas");
            empleado1.setNombre("Pablo");
            empleado1.setApellidoP("Flores");
            empleado1.setApellidoM("López");
            empleado1.setEdad(44);
            System.out.println(empleado1);

            //Se llama al constructor con sobrecarga
            Tester tester1 = new Tester("Pedro", "Rojas", "Morales", 18, "QA-INFONAVIT");

            //Usando los métodos set para manipular la información
            tester1.setDepartamento("Fabrica de Software");
            tester1.setId(100020000);

            System.out.println("\nDatos de un Tester : ");
            horario(tester1);
            tester1.calcularSalario();
            System.out.println(tester1.toString());
            tester1.aumentoSalario();

            //Objeto de tipo cliente
            Cliente cliente1 = new Cliente(new Date(), true, "Miriam", "Olivares", "Cedillo", 21);
            System.out.println("\nDatos del cliente: ");
            cliente1.accionPersona();
            System.out.println(cliente1.toString());

        } else {
            System.out.println("El estatus de la sección de la empresa NO ESTA ACTIVA");
            System.out.println("no se puede continuar con el proceso...");
        }
    }

    //Método en dónde se usa la definición de polimorfismo debido a su relación
    public static void horario(Empleado empleado) {
        empleado.diasLaborales();
    }

}
