/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.julca_1.model;

public class Empleado {
    private double sueldoBase;
    private int horasExtra;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    // Método para calcular el sueldo total
    public double calcularSueldoTotal() {
        double sueldoHorasExtra = horasExtra * 8;
        return sueldoBase + sueldoHorasExtra;
    }
}
