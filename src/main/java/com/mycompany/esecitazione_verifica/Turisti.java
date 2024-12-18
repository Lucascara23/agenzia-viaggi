/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
public class Turisti extends Thread {
    private String nazionalita;
    private Porto porto;
    private Rivenditore_biglietti rivenditore;

    public Turisti(String nazionalita, Porto porto, Rivenditore_biglietti rivenditore) {
        this.nazionalita = nazionalita;
        this.porto = porto;
        this.rivenditore = rivenditore;
    }

    @Override
    public void run() {
        try {
            // Simula il pagamento dei biglietti
            rivenditore.vendiBiglietti(nazionalita);

            // Simula l'imbarco e il viaggio
            porto.imbarcaTuristi(nazionalita);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
