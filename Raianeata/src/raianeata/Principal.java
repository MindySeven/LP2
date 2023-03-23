
package raianeata;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main (String args[]){
        Apolice novoobj = new Apolice(); //Nome da classe+nome do objeto = new nome da classe
        
        String teclado;
        teclado = JOptionPane.showInputDialog("Informe o seu nome: ");
        novoobj.setNomesegurado(teclado);
        
        teclado = JOptionPane.showInputDialog("Informe a idade: ");
        novoobj.setId(Integer.parseInt (teclado));
        
        teclado = JOptionPane.showInputDialog("Informe o valor do premio: ");
        novoobj.setValorpremio(Double.parseDouble (teclado));
        
        novoobj.imprimir();
        
        novoobj.calcularPremioApolice();
        
        novoobj.imprimir();
        
        teclado = JOptionPane.showInputDialog("Informe a sua cidade: ");
        novoobj.oferecerDesconto(teclado);
        
        
        novoobj.imprimir();
    }
    
    
    
}
