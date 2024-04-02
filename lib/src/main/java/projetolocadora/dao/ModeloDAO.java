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
import projetolocadora.entity.Modelo;

/**
 *
 * @author lucie
 */
public class ModeloDAO {

    public int insert(String nome, Integer id) {
        String query = String.format("""
                   INSERT INTO modelo (modelo, id_fabricante) VALUES ('%s', '%d');
                   """, nome, id);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int update(int id, String modelo) {
        String query = String.format("""
                       UPDATE modelo 
                        SET 
                          modelo = '%s'
                        WHERE id=%d;
                        """, modelo, id);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int delete(int id) {
        String query = String.format("""
                       DELETE FROM modelo                  
                        WHERE id=%d;
                        """, id);

        try (Statement stmt = Conexao.getConn().createStatement();) {
            return stmt.executeUpdate(query);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Modelo select(int id) {
        String query = String.format("""
                   SELECT * FROM modelo WHERE id = %d;
                   """, id);

        try (Statement stmt = Conexao.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setModelo(rs.getString("modelo"));
                modelo.setId_fabricante(id);

                return modelo;
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return null;
    }
    public List<Modelo> select() {
        List<Modelo> listaModelo = new ArrayList<>();

        String query = """
                   SELECT * FROM modelo;
                   """;

        try (Statement stmt = Conexao.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setModelo(rs.getString("modelo"));
                modelo.setId_fabricante(2);

                listaModelo.add(modelo);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return listaModelo;
    }
}
