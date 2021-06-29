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
public class Gato extends Animal {
    private String raza;
    private boolean maulla;
    private float peso;

    public Gato() {
    }

    public Gato(String raza, boolean maulla, float peso) {
        this.raza = raza;
        this.maulla = maulla;
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

    public boolean isMaulla() {
        return maulla;
    }

    public void setMaulla(boolean maulla) {
        this.maulla = maulla;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + ", maulla=" + maulla + ", peso=" + peso + '}';
    }
    
}
