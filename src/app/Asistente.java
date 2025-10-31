package app;

public class Asistente extends Persona {
    private int turnosTrabajados;
    private double pagoPorTurno;

    public Asistente(String nombre, String identificacion, int edad, int turnosTrabajados, double pagoPorTurno) {
        super(nombre, identificacion, edad);
        this.turnosTrabajados = turnosTrabajados;
        this.pagoPorTurno = pagoPorTurno;
    }

    public Asistente(String nombre, String identificacion) {
        super(nombre, identificacion, 0);
        this.turnosTrabajados = 0;
        this.pagoPorTurno = 0.0;
    }

    public int getTurnosTrabajados() {
        return turnosTrabajados;
    }

    public void setTurnosTrabajados(int turnosTrabajados) {
        this.turnosTrabajados = turnosTrabajados;
    }

    public double getPagoPorTurno() {
        return pagoPorTurno;
    }

    public void setPagoPorTurno(double pagoPorTurno) {
        this.pagoPorTurno = pagoPorTurno;
    }

    @Override
    public String describir() {
        return "Soy un asistente veterinario";
    }

    @Override
    public double calcularPago() {
        return turnosTrabajados * pagoPorTurno;
    }


}



