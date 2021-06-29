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
public class Perro extends Animal {

    private String raza;
    private boolean ladra;
    private float peso;

    public Perro() {
    }

    public Perro(String raza, boolean ladra, float peso) {
        this.raza = raza;
        this.ladra = ladra;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isLadra() {
        return ladra;
    }

    public void setLadra(boolean ladra) {
        this.ladra = ladra;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", ladra=" + ladra + ", peso=" + peso + '}';
    }
    
    
    

}
