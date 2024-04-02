/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolocadora.entity;

/**
 *
 * @author lucie
 */
public class Modelo {
    
    public int id;
    public String modelo;
    public int id_fabricante;

    public Modelo(int id, String modelo, int id_fabricante) {
        this.id = id;
        this.modelo = modelo;
        this.id_fabricante = id_fabricante;
        
    }

    public Modelo(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the id_fabricante
     */
    public int getId_fabricante() {
        return id_fabricante;
    }

    /**
     * @param id_fabricante the id_fabricante to set
     */
    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }
   
    }
        

    
            
       
    
    

