import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        //CREAR INSTANCIA nombres PARA CLASE ClaseLista Y USAR SUS MÉTODOS
        List<String> nombres = new ArrayList<>();
        nombres.add("LORENZO");
        nombres.add("CARLOS");
        nombres.add("EDUARDO");
        nombres.add("AXEL");
        nombres.add("JUAN");
        nombres.add("LORENA");
        nombres.add("ANALY");
        nombres.add("OYUKI");
        nombres.add("OLGA");
        nombres.add("MARCOS");
        nombres.add("RODOLFO");
        nombres.add("RODRIGO");
        //    IMPRIMIR LISTA DE NOMBRES CON STREAM
        nombres.stream().forEach(System.out::println);
        }
        //Imprimir Lista de nombres que contengan la letra "A
        System.out.println("NOMBRES CON A\n");
        nombres.stream()
                .filter(nombre -> nombre.contains("A"))
                .forEach(System.out::println);
        //Imprimir Lista de nombres que contengan más de 3 caracteres
        System.out.println("NOMBRES CON MÁS DE 3 CARACTERES\n");
        nombres.stream()
                .filter(nombre -> nombre.length() > 3)
                .forEach(System.out::println);
        //Lista de nombres que contengan mas de 4 caracteres y la letra ‘A’
        System.out.println("NOMBRES CON MÁS DE 4 CARACTERES Y LA LETRA A\n");
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .filter(nombre -> nombre.contains("A"))
                .forEach(System.out::println);

        //EJECICIOS DE LISTA DE EDADES
        List<Integer> edades = new ArrayList<>(); //Definición de Lista edades
        edades.add(31);
        edades.add(28);
        edades.add(15);
        edades.add(32);
        edades.add(67);
        edades.add(12);
        edades.add(23);
        edades.add(45);
        edades.add(11);
        edades.add(42);
        edades.add(17);
        edades.add(19);

        System.out.println("IMPRESION DE LISTA EDADES CON STREAM\n");
        System.out.println(edades); //LISTAR TODOS LOS ELEMENTOS DE LISTA edades

        //Imprimir Lista de edades mayores a 18
        System.out.println("EDADES MAYORES A 18 AÑOS\n");
        edades.stream()
                .filter(edad->(edad>18))
                .forEach( System.out::println);

        //Imprimir Lista de edades mayores a 18 y menores de 30 años
        System.out.println("EDADES MAYORES A 18 AÑOS Y MENORES DE 30 AÑOS\n");
        edades.stream()
                .filter(edad->(edad>18)&& (edad<30))
                .forEach( System.out::println);

        //EJERCICIOS CON EMPLEADOS
        List<Empleado> empleados =new ArrayList<>();
        empleados.add(new Empleado("Lorenzo",31,15000.00,4));    //Agregar los elementos de tipo Empleado a la lista
        empleados.add(new Empleado("Juan",12,25000.00,2));
        empleados.add(new Empleado("David",11,35000.00,3));
        empleados.add(new Empleado("Carlos",51,500.00,1));
        empleados.add(new Empleado("Pedro",25,300.00,5));
        empleados.add(new Empleado("Analy",53,200.00,3));
        empleados.add(new Empleado("Rodrigo",76,8000.00,4));
        empleados.add(new Empleado("Perla",67,900.00,2));
        empleados.add(new Empleado("Victor",34,9000.00,1));
        empleados.add(new Empleado("Alejandro",12,10000.00,6));

        //EJERCICIOS CON FUNCION .filter()

        //Lista de empleados que tengan más de 3 años de antiguedad
        System.out.println("EMPLEADOS CON MÁS DE 3 O MÁS AÑOS DE ANTIGUEDAD\n");
        empleados.stream()
                .filter(empleado -> empleado.getAntiguedad()>=3)
                .forEach(empleado -> System.out.println("Nombre: " + empleado.getNombre() + "| Antiguedad: " + empleado.getAntiguedad()));

        System.out.println("EMPLEADOS CON UN SALARIO MAYOR A 1000\n");
        empleados.stream()
                .filter(empleado -> empleado.getSalario()>1000)
                .forEach(empleado -> System.out.println("Nombre: " + empleado.getNombre() + "| Salario: " + empleado.getSalario()));

        //Lista de empleados mayores de edad
        System.out.println("EMPLEADOS MAYORES DE EDAD\n");
        empleados.stream()
                .filter(empleado -> empleado.getEdad()>=18)
                .forEach(empleado -> System.out.println("Nombre: " + empleado.getNombre() + "| Edad: " + empleado.getEdad()));

        //EJERCICIOS CON FUNCION .map()
        // Imprimir los nombres de los empleados
        System.out.println("IMPRESION DE LOS EMPLEADOS CON STREAM\n");
        empleados.stream()
                .map(Empleado::getNombre)
                .forEach(System.out::println);

        // Imprimir las edades de los empleados
        System.out.println("IMPRESION DE LAS EDADES CON STREAM\n");
        empleados.stream()
                .map(Empleado::getEdad)
                .forEach(System.out::println);

        // Imprimir las antiguedades de los empleados
        System.out.println("IMPRESION DE LAS ANTIGUEDADES CON STREAM\n");
        empleados.stream()
                .map(Empleado::getAntiguedad)
                .forEach(System.out::println);

        // Imprimir los salarios de los empleados
        System.out.println("IMPRESION DE LOS SALARIOS CON STREAM\n");
        empleados.stream()
                .map(Empleado::getSalario)
                .forEach(System.out::println);
        */
        List<Persona> personas=new ArrayList<>();                   //CREAR OBJETOS DE TIPO PERSONA Y ASIGNARLOS A UNA LISTA
        personas.add(new Persona("Lorenzo",31));
        personas.add(new Persona("Francisco",38));
        personas.add(new Persona("Juan",54));
        personas.add(new Persona("Lafredo",21));
        personas.add(new Persona("Axel",12));
        personas.add(new Persona("Teresa",15));
        personas.add(new Persona("Rocío",9));
        personas.add(new Persona("Juana",18));
        personas.add(new Persona("Lázaro",17));
        personas.add(new Persona("Anastacio",8));

        //ITERAR SOBRE LOS ELEMENTOS DE LA LISTA USANDO MÉTODO .PEEK()
        personas.stream()
                .peek(persona -> System.out.println("Procesando elemento: " + persona))
                .map(Persona::getNombre)
                .forEach(System.out::println); // Imprimir cada elemento del stream

        //Utiliza un metodo filter que filtre a las personas por edad mayor a 18
        personas.stream()
                .filter(persona -> persona.getEdad()>=18)
                .map(Persona::getEdad)
                .forEach(System.out::println); // Imprimir cada elemento del stream

        //Utiliza otro metodo peek que muestre toda la informacion de persona.
        personas.stream()
                .peek(persona-> System.out.println("Procesando elemento: " + persona))
                .forEach(System.out::println); // Imprimir cada elemento del stream
    }
}