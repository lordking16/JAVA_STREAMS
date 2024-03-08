import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private int antiguedad;

    private List<Empleado> empleados =new ArrayList<>(); //SE CREA LA LISTA EMPLEADOS

    public Empleado(){

    }
    public Empleado(String nombre, int edad, double salario, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


}
