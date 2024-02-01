/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordar;

/**
 *
 * @author fan1_
 */
public class calcularRaizPotenciaMayorMenor {
    
     
    public void mostrarValores(pardeNumeros par) {
        System.out.println(" numero 1 : "+par.getNum1());
        System.out.println(" numero 2 : "+par.getNum2());
    }
    
    public double devolverMayor(pardeNumeros par) {
        return Math.max(par.getNum1(), par.getNum2());
        
        
    }
    
    public double calcularPotencia(pardeNumeros par) {
        double mayor = devolverMayor(par);
        double menor = (mayor == par.getNum1()) ? par.getNum2() : par.getNum1();
        return Math.pow(Math.round(mayor), Math.round(menor));
    }
       public double calcularRaiz(pardeNumeros par) {
        double menor = Math.min(par.getNum1(), par.getNum2());
        return Math.sqrt(Math.abs(menor));
    }
    
    
    
}
