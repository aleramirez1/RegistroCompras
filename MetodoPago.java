package models;
public class MetodoPago {
    private String nombre;
    private int dinnerAportado;

    public MetodoPago(String nombre, int dinnerAportado) {
        this.nombre = nombre;
        this.dinnerAportado = dinnerAportado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDineroAportado() {
        return dinnerAportado;
    }
    }
