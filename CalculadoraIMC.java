/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import javax.swing.JOptionPane;

/**
 *
 * @author patrickordine
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int peso;
        float altura;
        String kg;
        String medida;
        float resultado;
        
        kg = JOptionPane.showInputDialog("Digite o seu peso: ");
        peso = Integer.parseInt(kg);
        medida = JOptionPane.showInputDialog("Digite a sua altura: ");
        altura = Integer.parseInt(medida);
 
        resultado = (peso/((altura/100)*(altura/100)));
        
        if(resultado < 17){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Muito abaixo do peso");
        }else if ((resultado > 17) && (resultado < 18.49)){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Abaixo do peso");
        }else if ((resultado > 18.5) && (resultado < 24.99)){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Peso normal");
        }else if ((resultado > 25) && (resultado < 29.99)){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Acima do peso");
        }else if ((resultado > 30) && (resultado < 34.99)){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Obesidade I");
        }else if ((resultado > 30) && (resultado < 34.99)){
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Obesidade II(severa)");
        }else{
            JOptionPane.showMessageDialog(null,"Indice de massa corporal: " + resultado + " kg/m2 " + " = Obesidade III(mórbida)");
        }
    }
      
}
