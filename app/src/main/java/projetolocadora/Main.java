/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolocadora;

import projetolocadora.gui.TelaPrincipal;

/**
 *
 * @author lucie
 */
public class Main {

    public static void main(String[] args) {
        Conexao.iniciarBanco("localhost", "5432", "luciene locadora", "postgres", "postgres");

        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
    }
}
