/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
public class Porto {
    private boolean traghettoDisponibile = true;

    public synchronized void imbarcaTuristi(String nazionalita) throws InterruptedException {
        while (!traghettoDisponibile) {
            wait(); 
        }

       
        traghettoDisponibile = false;
        System.out.println("Imbarco sul traghetto dei " + nazionalita);
        Logger.scriviLog("Imbarco sul traghetto dei " + nazionalita);
        Thread.sleep(1000); 

        System.out.println("Partenza dal porto dei " + nazionalita);
        Logger.scriviLog("Partenza dal porto dei " + nazionalita);
        Thread.sleep(2000); 

        System.out.println("Ritorno al porto del traghetto");
        Logger.scriviLog("Ritorno al porto del traghetto");
        Thread.sleep(1000); 

       
        traghettoDisponibile = true;
        notifyAll(); 
    }
}