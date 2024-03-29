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

    public int insert(String fabricante) {
        String query = String.format("""
                   INSERT INTO fabricante (fabricante) VALUES ('%s');
                   """, fabricante);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int update(int id, String fabricante) {
        String query = String.format("""
                       UPDATE fabricante 
                        SET 
                          fabricante = '%s'
                        WHERE id=%d;
                        """, fabricante, id);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int delete(int id) {
        String query = String.format("""
                       DELETE FROM fabricante                  
                        WHERE id=%d;
                        """, id);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Fabricante select(int id) {
        String query = String.format("""
                   SELECT * FROM fabricante WHERE id = %d;
                   """, id);

        try (Statement stmt = Conexao.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setId(rs.getInt("id"));
                fabricante.setFabricante(rs.getString("fabricante"));

                return fabricante;
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return null;
    }
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
