/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author javie
 */
public class Animal {

    private int NumeroPatas;
    private String tipo;
    private int edad;

    public Animal() {
    }

    public Animal(int NumeroPatas, String tipo, int edad) {
        this.NumeroPatas = NumeroPatas;
        this.tipo = tipo;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" + "NumeroPatas=" + NumeroPatas + ", tipo=" + tipo + ", edad=" + edad + '}';
    }

    public static void main(String[] args) {
        Animal periquito1 = new Animal(2, "Ave", 4);
        System.out.println(periquito1 + " años");
        Perro escandaloso1 = new Perro("Labrador", true, 15);
        System.out.println(escandaloso1 +" kilos");
        Gato peludito1=new Gato ("Garfield", true, 6);
        System.out.println(peludito1 +" kilos");

    }
}
