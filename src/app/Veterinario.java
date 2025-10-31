package app;

public class Veterinario extends Persona implements Reportable {
    private String especialidad;
    private double salarioBase;
    private String nombreMascota;

    public Veterinario (String nombre, String identificacion, int edad, String especialidad, double salarioBase, String nombreMascota){
        super(nombre, identificacion, edad);
        this.especialidad = especialidad;
        this.salarioBase = salarioBase;
        this.nombreMascota = nombreMascota;
    }

    public Veterinario (String nombre, String identificacion){
        super(nombre, identificacion,0);
        this.salarioBase = 0.0;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String describir() {return "Soy un empleado especializado en " + especialidad;}

    @Override
    public double calcularPago (){return getSalarioBase() * 1.10;}


    @Override
    public String generarReporte() {
        return "Nombre: " + getNombre() + "\n" +
                "Especialidad: " + getEspecialidad() +"\n"+
                "Pago Calculado: " + salarioBase ;
    }

}
