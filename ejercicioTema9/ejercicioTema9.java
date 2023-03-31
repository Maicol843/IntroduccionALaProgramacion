public class ejercicioTema9{
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Maicol";
        cliente.edad = 34;
        cliente.telefono = 4292656;
        cliente.credito = 230.68;
        System.out.println("Nombre del Cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito disponible: " + cliente.credito + " pesos argentinos");

        trabajador.nombre = "Maria";
        trabajador.edad = 59;
        trabajador.telefono = 4234126;
        trabajador.salario = 85000.35;
        System.out.println("Nombre del Trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Credito disponible: " + trabajador.salario + " pesos argentinos");
    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}