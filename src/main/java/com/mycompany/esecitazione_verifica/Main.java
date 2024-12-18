/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
public class Main {
    public static void main(String[] args) {
        // Creazione del porto
        Porto porto = new Porto();

        // Creazione dei rivenditori di biglietti
        Rivenditore_biglietti rivenditore1 = new Rivenditore_biglietti("Luca");
        Rivenditore_biglietti rivenditore2 = new Rivenditore_biglietti("James");
        Rivenditore_biglietti rivenditore3 = new Rivenditore_biglietti("Chiara");

        // Creazione dei bus
        Bus busFrancesi = new Bus("AA120BB", "francesi");
        Bus busTedeschi = new Bus("CC230DD", "tedeschi");
        Bus busSpagnoli = new Bus("EE340FF", "spagnoli");

        // Creazione dei gruppi di turisti
        Turisti turistiFrancesi = new Turisti("francesi", porto, rivenditore1);
        Turisti turistiTedeschi = new Turisti("tedeschi", porto, rivenditore2);
        Turisti turistiSpagnoli = new Turisti("spagnoli", porto, rivenditore3);

        // Avvio dei bus
        busFrancesi.start();
        busTedeschi.start();
        busSpagnoli.start();

        try {
            // Aspetta che i bus arrivino al porto
            busFrancesi.join();
            busTedeschi.join();
            busSpagnoli.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Avvio dei turisti
        turistiFrancesi.start();
        turistiTedeschi.start();
        turistiSpagnoli.start();

        try {
            // Aspetta che tutti i gruppi di turisti completino il viaggio
            turistiFrancesi.join();
            turistiTedeschi.join();
            turistiSpagnoli.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tutti i gruppi sono stati trasportati sull'isola");
        Logger.scriviLog("Tutti i gruppi sono stati trasportati sull'isola");
    }
    
}

