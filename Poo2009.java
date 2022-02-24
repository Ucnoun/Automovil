/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2009;
import java.awt.Color;
/**
 *
 * @author eli
 */
public class Poo2009 {
    
    
    public static void main(String[] args) {
        auto vocho=new auto();
        vocho.marca="VW";
        vocho.submarca="Sedan";
        vocho.submarca="1970";
       // vocho.setColor=(Color.BLUE);
        
        vocho.enciende();
        vocho.acelera();
        vocho.avanzar();
        System.out.println("Marca "+vocho.marca);
        System.out.println("Submarca "+vocho.submarca);
        System.out.println("Marca "+vocho.modelo);
        //System.out.println("Color "+vocho.getcolor()):
        
   
        auto acura=new auto();
        acura.marca="Acura";
        acura.submarca="NSX";
        acura.modelo="2013";
        //acura.setColor=(Color.GRAY);
        
        acura.enciende();
        acura.acelera();
        acura.avanzar();
        System.out.println("Marca "+acura.marca);
        System.out.println("Submarca "+acura.submarca);
        System.out.println("Marca "+acura.modelo);
        //System.out.println("Color "+acura.getcolor()):
        
        
        auto mustang=new auto();
        mustang.marca="Ford";
        mustang.submarca="Mustang";
        mustang.modelo="2010";
        //mustang.setColor=(Color.YELLOW);
        
        mustang.enciende();
        mustang.acelera();
        mustang.avanzar();
        System.out.println("Marca "+mustang.marca);
        System.out.println("Submarca "+mustang.submarca);
        System.out.println("Marca "+mustang.modelo);
        //System.out.println("Color "+mustang.getcolor()):
        
    }
    
}