/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
public class Rivenditore_biglietti {
    private String nome;

    public Rivenditore_biglietti(String nome) {
        this.nome = nome;
    }

    public void vendiBiglietti(String nazionalita) {
        try {
            System.out.println(nome + " sta vendendo i biglietti per i " + nazionalita);
            Logger.scriviLog(nome + " sta vendendo i biglietti per i " + nazionalita);
            Thread.sleep(1000); // Simula il tempo per vendere i biglietti
            System.out.println("Biglietti venduti ai " + nazionalita + " da " + nome);
            Logger.scriviLog("Biglietti venduti ai " + nazionalita + " da " + nome);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}

