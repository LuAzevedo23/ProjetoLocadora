/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolocadora.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projetolocadora.Conexao;
import projetolocadora.entity.Fabricante;

/**
 *
 * @author lucie
 */
public class FabricanteDAO {

    public List<Fabricante> select() {
        List<Fabricante> listaFabricante = new ArrayList<>();

        String query = """
                   SELECT * FROM fabricante;
                   """;

        try (Statement stmt = Conexao.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setId(rs.getInt("id"));
                fabricante.setFabricante(rs.getString("fabricante"));

                listaFabricante.add(fabricante);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return listaFabricante;
    }
}
