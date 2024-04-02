/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entities;

import java.time.LocalDateTime;

/**
 *
 * @author lucie
 */
public class AluguelCarros {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarros() {

    }

    public AluguelCarros(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;

    }

    /**
     * @return the start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    /**
     * @return the finish
     */
    public LocalDateTime getFinish() {
        return finish;
    }

    /**
     * @param finish the finish to set
     */
    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the fatura
     */
    public Fatura getFatura() {
        return fatura;
    }

    /**
     * @param fatura the fatura to set
     */
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

}
