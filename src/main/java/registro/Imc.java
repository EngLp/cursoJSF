/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author leandropontes
 */
public class Imc {

    private float peso;
    private float altura;
   

    public Imc() {
    }

    public Imc(int peso, float result) {
        this.peso = peso;
        this.altura = altura;
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

  

    public String getResultado() {
        String resultado = "";
        float somatorio = 0;
        somatorio = peso / (altura * altura);

        if (somatorio <= 18.4) {
            resultado = "IMC=" + somatorio + " - Abaixo do peso";
        } else if (18.5 <= somatorio && somatorio <= 24.9) {
            resultado = "IMC=" + somatorio + " - Peso normal";
        } else if (25 <= somatorio && somatorio <= 29.9) {
            resultado = "IMC=" + somatorio + " - Acima do peso";
        } else if (30 <= somatorio && somatorio <= 34.9) {
            resultado = "IMC=" + somatorio + " - Obesidade Grau 1";
        } else if (35 <= somatorio && somatorio <= 40) {
            resultado = "IMC=" + somatorio + " - Obesidade Grau 2";
        } else if (somatorio > 40) {
            resultado = "IMC=" + somatorio + " - Obesidade Grau 3";
        }

        return resultado;
    }

}
