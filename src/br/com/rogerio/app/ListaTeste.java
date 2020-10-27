/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.app;

import br.com.rogerio.model.Lista;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class ListaTeste {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        try {
            for (int i = 0; i < 100; i++) {
                lista.inserePosicao(i, 10 - i);
            }
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

        System.out.println("Imprimindo os elementos da lista");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + lista.getPosicao(i));
        }
        System.out.println("\n\nElemento do início > " + lista.getInicio());
        System.out.println("\nElemento do fim > " + lista.getFim());

    }

}
