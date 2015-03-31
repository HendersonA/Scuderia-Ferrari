/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scuderia.ferrari;

/**
 *
 * @author Asus
 */
public class Carro {
    
    private String cor;
    private String modelo;
    private double VelAtual;
    private double VelMax;
    
    public String getCor(){
        return this.cor;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getVelAtual(){
        return this.VelAtual;
    }
    public double getVelMax(){
        return this.VelMax;
    }
    public String setCor(String cor){
        this.cor = cor;
        return cor;
    }
    public String setModelo(String modelo){
        this.modelo = modelo;
        return modelo;
    }
    public double setVelAtual(double VelAtual){
        this.VelAtual = VelAtual;
        return VelAtual;
    }
    public double setVelMax(double VelMax){
        this.VelMax = VelMax;
        return VelMax;
    }
    
    public boolean ligar(boolean liga){
        if(liga)
            System.out.printf("\nCarro ligado\n");
        else
            System.out.printf("\nCarro desligado\n");
        return liga;
    }
    public double acelerar(double vel){
        this.VelAtual = vel;
         System.out.printf("\nVelociodade: "+ this.VelAtual+"Km/h");
        if(this.VelAtual==this.VelMax )
             System.out.printf("\nVelociodade Excedida"); 
         return this.VelAtual;
    }  
}