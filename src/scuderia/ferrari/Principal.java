/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scuderia.ferrari;

import java.util.Scanner;
import java.lang.Thread; 
/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
       Carro carro = new Carro();
       
       double velA=0,velM,vel=0;
       long temp=800;
       boolean ligar;
       String cor, modelo;
       
       System.out.printf("Cor do carro: \n");
       cor = sc.next();
       System.out.printf("Modelo do carro: \n");
       modelo = sc.next();
       System.out.printf("Velocidade Maxima do carro: \n");
       velM = sc.nextDouble();
       
       carro.setCor(cor);
       carro.setModelo(modelo);
       carro.setVelMax(velM);
       carro.setVelAtual(velA);
       
       System.out.printf("\nCor:"+carro.getCor());
       System.out.printf("\nModelo: "+carro.getModelo());
       System.out.printf("\nVelocidade Maxima:"+carro.getVelMax()+"Km/h");
       
       System.out.printf("\nDeseja ligar o carro? (true ou false):\n");
       ligar = sc.nextBoolean();
       
       carro.ligar(ligar);
       if(ligar) 
       while(vel <= carro.getVelMax()){
            carro.acelerar(vel);
            vel++;
            Thread.sleep(temp);
            temp-=100;
            if(temp<=0)
                temp+=100;
        }
    }
    
}
