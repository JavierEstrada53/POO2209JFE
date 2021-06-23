/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.hardware.CPU;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * @author javie
 */
public class Computadora {
    private String marca;
    private String modelo;

    public Computadora() {
    }

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    public static void main (String[] args){
        /*Info del Monitor*/
        Monitor monitor1=new Monitor("HP","IPO95H2H", 12 );
        System.out.println(monitor1.getPulgadas()+" pulgadas");
        
        /*Info del CPU*/
        CPU cpu1=new CPU("Intel","Pentium Gold", 2.30);
        System.out.println(cpu1.getVelocidadProcesador()+" Ghz");
        /*Info del trackpad*/
        Mouse raton=new Mouse("HP","IPO95H2H","Trackpad") ;
        // info del teclado
        Teclado teclado1=new Teclado("HP","IPO95H2H",102,2);
        System.out.println(teclado1.getNumeroDeTeclas()+" Teclas");
        System.out.println(teclado1.getMultimedia()+" teclas multimedia");
        //Fin de la composición
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        
}
