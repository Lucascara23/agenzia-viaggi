/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esecitazione_verifica;

/**
 *
 * @author lucascarabattoli
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Logger {
   private static final String file_log = "file_viaggio.txt";

    public static synchronized void scriviLog(String messaggio) {
        LocalDate dataOdierna = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormattata = dataOdierna.format(formatter);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_log, true))) {
            writer.write(messaggio);
            writer.newLine();
        } catch (IOException e) {
        }
    }
}