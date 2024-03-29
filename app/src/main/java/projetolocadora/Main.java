
package projetolocadora;

import projetolocadora.gui.TelaPrincipal;



public class Main {

    public static void main(String[] args) {
        Conexao.iniciarBanco("localhost", "5432", "luciene locadora", "postgres", "postgres");

        TelaPrincipal form = new TelaPrincipal();
        form.setVisible(true);
    }
}
