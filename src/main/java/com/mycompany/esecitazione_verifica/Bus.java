/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
public class Bus extends Thread {
    private String targa;
    private String nazionalita;

    public Bus(String targa, String nazionalita) {
        this.targa = targa;
        this.nazionalita = nazionalita;
    }

    @Override
    public void run() {
        try {
            System.out.println("Bus con targa " + targa + " parte dagli alloggi dei " + nazionalita);
             Logger.scriviLog("Bus con targa " + targa + " parte dagli alloggi dei " + nazionalita);
            Thread.sleep(1000); // Simula il viaggio verso il porto
            System.out.println("Bus con targa " + targa + " arriva al porto con i " + nazionalita);
            Logger.scriviLog("Bus con targa " + targa + " arriva al porto con i " + nazionalita);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
