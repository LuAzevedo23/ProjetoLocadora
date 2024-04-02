/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entities;

/**
 *
 * @author lucie
 */
public class Fatura {

    private Double pagamento;
    private Double imposto;

    //public Fatura(){
    public Fatura(Double pagamento, Double imposto) {
        this.pagamento = pagamento;
        this.imposto = imposto;
    }

    /**
     * @return the pagamento
     */
    public Double getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the imposto
     */
    public Double getImposto() {
        return imposto;
    }

    /**
     * @param imposto the imposto to set
     */
    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getvalorCalculado() {
        return getPagamento() - getImposto();
    }
}


