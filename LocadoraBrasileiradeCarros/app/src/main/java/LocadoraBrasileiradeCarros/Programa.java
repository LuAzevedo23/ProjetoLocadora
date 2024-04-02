/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LocadoraBrasileiradeCarros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;
import modelo.entities.AluguelCarros;
import modelo.entities.Veiculo;
import modelo.services.CalcularImposto;

/**
 *
 * @author lucie
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner sc = new Scanner (System.in);
       
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        AluguelCarros ac = new AluguelCarros(start, finish, new Veiculo(carModel));
        
        CalcularImposto calcularimposto = new CalcularImposto();
        System.out.println(calcularimposto.imposto(50.0));
        
        sc.close();
    }
    
}
