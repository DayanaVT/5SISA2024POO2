import java.util.*;

public class ManipularPersona {
    
    public void menu(){

        Scanner entrada = new Scanner (System.in);
        int op, edad;
        String nombre, opc;

        AccionesPersona gestionar = new AccionesPersona();

        gestionar.agregarPersona(new Persona("Ian", 19));
        gestionar.agregarPersona(new Persona("Matilde", 20));
        gestionar.agregarPersona(new Persona("Marco", 16));
        gestionar.agregarPersona(new Persona("Farid", 21));
        gestionar.agregarPersona(new Persona("Jessica", 23));


            System.out.println("Bienvenido a este programa");
            System.out.println("Elija una opcion validad");
            System.out.println("1.-Mostrar todos los registros de personas");
            System.out.println("2.-Registrar un nuevo objeto");
            System.out.println("3.-Editar ese objeto");
            System.out.println("4.-Borrar el objeto");
            System.out.println("5.-Salir");

            switch (op) {
                case 1:
                    gestionar.mostrarRegistro();
                    break;

                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese la edad:");
                    edad = entrada.nextInt();

                    gestionar.agregarPersona(new Persona(nombre, edad));
                    System.out.println("Registrado completo:)");
                    break;

                case 3:
                   System.out.println("Ingresa el ID de la persona a editar:");
                   int editadoID = entrada.nextInt();

                   System.out.println("Editando personita: ");
                   Persona editarPersona = gestionar.buscarPersona(editadoID);
                   
                   if(editarPersona != null) {
                    //ingresar datos nuevos
                    System.out.println("Ingrese nombre:");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese edad:");
                    edad = entrada.nextInt();

                    editarPersona.setNombre(nombre);
                    editarPersona.setEdad(edad);

                    System.out.println("Editando...");
                    gestionar.editarPersona(editarPersona);
                    System.out.println("Editado correctamente");
                   }
                    break;

                case 4: 
                    System.out.println("Ingresa el ID de la persona a eliminar:");
                    int eliminadoID = entrada.nextInt();

                    System.out.println("Eliminando:");
                    Persona eliminarPers = gestionar.buscarPersona(eliminadoID);
                    
                    if (eliminarPers != null) {
                        gestionar.eliminarPersona(eliminarPers);
                        System.out.println("Persona eliminada");
                    }
                break;

                case 5:
                    System.out.println("Adios, gracias por utilizarme jiji");

                break;
                   
                default:
                    System.out.println("Opcion no valida intenta de nuevo");
                    break;
            }


    }
}
