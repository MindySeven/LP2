/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raianeata;

/**
 *
 * @author aluno
 */
public class Apolice {
    String nomesegurado;
    int id;
    double valorpremio;

    public String getNomesegurado() {
        return nomesegurado;
    }

    public void setNomesegurado(String nomesegurado) {
        this.nomesegurado = nomesegurado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorpremio() {
        return valorpremio;
    }

    public void setValorpremio(double valorpremio) {
        this.valorpremio = valorpremio;
    }
    
    public void imprimir () {
     System.out.println(this);
}

    @Override
    public String toString() {
        return "Apolice{" + "nomesegurado=" + nomesegurado + ", id=" + id + ", valorpremio=" + valorpremio + '}';
    }
    
    public void calcularPremioApolice (){
        if (id>=18 && id<=25){
            valorpremio += (valorpremio*20)/100;
        } else if (id>25 && id<=36){
            valorpremio += (valorpremio*15)/100;
        } else if (id>36){
            valorpremio += (valorpremio*10)/100;
        }
    }
    
    public void oferecerDesconto (String cidade){
        if (cidade.equals("Curitiba")){
            valorpremio -= (valorpremio*20)/100; //+= significa somar e atribuir
        }
        if (cidade.equals("Rio de Janeiro")){
            valorpremio -= (valorpremio*15)/100;
        }
        if (cidade.equals("São Paulo")){
            valorpremio -= (valorpremio*10)/100; 
        }
        if (cidade.equals("Belo Horizonte")){
            valorpremio -= (valorpremio*5)/100; 
        }
    }
    
    
    
    
}
