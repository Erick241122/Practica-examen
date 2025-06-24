/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenuno;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Empleado {
    private String nombre;
    private String id;
    private String compania;
    private String codigo;
    private String internacional;
    private String carga;
    private String turno;
    private int fecha;
    private double distancia;
    private double bonoInternacional = 0;
    private double bonoTurno = 0;
    private double puntosTurno = 0;
    private double bonoCarga = 0;
    private double puntosCarga = 0;
    private double bonoDistancia = 0;
    private double puntosDistacia = 0;
    private double salarioBono= 0;
    private double puntosFinales = 0;
    private double salarioBase = 0;
    private double salarioKm = 10;
    private double salarioFinal = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getInternacional() {
        return internacional;
    }

    public void setInternacional(String internacional) {
        this.internacional = internacional;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFecha() {
        String mes;
        switch (fecha) {
                case 1 -> mes = "Enero";
                case 2 -> mes = "Marzo";
                case 3 -> mes = "Marzo";
                case 4 -> mes = "Abril";
                case 5 -> mes = "Mayo";
                case 6 -> mes = "Junio";
                case 7 -> mes = "Julio";
                case 8 -> mes = "Agosto";
                case 9 -> mes = "Septiembre";
                case 10 -> mes = "Octubre";
                case 11 -> mes = "Noviembre";
                case 12 -> mes = "Noviembre";
            default -> throw new AssertionError();
        }
        return mes;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getBonoInternacional() {
        if (internacional.equals("Si")) {
        bonoInternacional = (distancia * salarioKm) * 0.15;
        }
        return bonoInternacional;
    }

    public void setBonoInternacional(double bonoInternacional) {
        this.bonoInternacional = bonoInternacional;
    }

    public double getBonoTurno() {
        if (turno.equals("Noche")) {
            bonoTurno = (distancia * salarioKm) * 0.10;
        }
        return bonoTurno;
    }

    public void setBonoTurno(double bonoTurno) {
        this.bonoTurno = bonoTurno;
    }

    public double getPuntosTurno() {
        if (turno.equals("Noche")) {
            puntosTurno = 2;
        }
        return puntosTurno;
    }

    public void setPuntosTurno(double puntosTurno) {
        this.puntosTurno = puntosTurno;
    }

    public double getBonoCarga() {
        if (carga.equals("Pesada")) {
            bonoCarga = (distancia * salarioKm) * 0.20;
        }
        return bonoCarga;
    }

    public void setBonoCarga(double bonoCarga) {
        this.bonoCarga = bonoCarga;
    }

    public double getPuntosCarga() {
        if (carga.equals("Pesada")) {
        puntosCarga = 3;
        }
        return puntosCarga;
    }

    public void setPuntosCarga(double puntosCarga) {
        this.puntosCarga = puntosCarga;
    }

    public double getBonoDistancia() {
        if (distancia >= 200) {
            bonoDistancia = (distancia * salarioKm) * 0.10;
        } 
        return bonoDistancia;
    }

    public void setBonoDistancia(double bonoDistancia) {
        this.bonoDistancia = bonoDistancia;
    }

    public double getPuntosDistacia() {
        if (distancia>=200) {
        puntosDistacia = 3;
        }
        return puntosDistacia;
    }

    public void setPuntosDistacia(double puntosDistacia) {
        this.puntosDistacia = puntosDistacia;
    }

    public double getSalarioBono() {
        salarioBono = getBonoCarga() + getBonoDistancia() + getBonoTurno() + getBonoInternacional();
        return salarioBono;
    }

    public void setSalarioBono(double salarioBono) {
        this.salarioBono = salarioBono;
    }

    public double getPuntosFinales() {
        puntosFinales = getPuntosCarga() + getPuntosDistacia() + getPuntosTurno();
        return puntosFinales;
    }

    public void setPuntosFinales(double puntosFinales) {
        this.puntosFinales = puntosFinales;
    }

    public double getSalarioBase() {
        salarioBase = distancia + salarioKm;
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioKm() {
        return salarioKm;
    }

    public void setSalarioKm(double salarioKm) {
        this.salarioKm = salarioKm;
    }

    public double getSalarioFinal() {
        salarioFinal = salarioBono + salarioBase;
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre: " + nombre + ", Identificacion: " + id + ", Compania: " + compania + ", Codigo: " + codigo + ", Internacional: " + internacional + ", Carga: " + carga + ", Turno: " + turno + " Distancia recorrida: " + distancia +"Km" + ", Fecha: " + getFecha() + "\nBono Internacional: " + getBonoInternacional() + ", Bono Turno: " + getBonoTurno() + ", Puntos Turno: " + getPuntosTurno() + ", Bono Carga: " + getBonoCarga() + ", Puntos Carga: " + getPuntosCarga() + ", Bono Distancia: " + getBonoDistancia() + ", Puntos Distacia: " + getPuntosDistacia() + ", Salario Bono: " + getSalarioBono() + ", Puntos Finales: " + getPuntosFinales() + ", Salario Base: " + getSalarioBase() + ", Salario por Km: " + salarioKm + ", Salario Final: " + getSalarioFinal() + '}';
    }

    
}
