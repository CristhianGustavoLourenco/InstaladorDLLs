package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author crist
 */
public class ScriptLaucher {

    public void installDLLs() {

        try {
            String currentDir = System.getProperty("user.dir");
            String strPath = currentDir + "\\ArquivosExecutaveis\\instalador";
            File pathInstalars = new File(strPath);
            File[] listBatLauch = pathInstalars.listFiles((dir, name) -> name.endsWith(".bat"));

            if (listBatLauch != null) {
                for (File fileBat : listBatLauch) {
                    if (fileBat.canExecute()) {
                        // Executa o arquivo .bat
                        Process process = new ProcessBuilder(fileBat.getAbsolutePath()).start();
                        process.waitFor(); // Espera até que o processo termine
                        System.out.println("Executado: " + fileBat.getName());
                        Thread.sleep(4000); // Atraso de 5 segundos entre execuções
                    } else {
                        System.out.println("Arquivo não é executável: " + fileBat.getName());
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void uninstallDLLS() {
        try {
            String currentDir = System.getProperty("user.dir");
            String strPath = currentDir + "\\ArquivosExecutaveis\\desinstalador";
            File pathInstalars = new File(strPath);
            File[] listBatLauch = pathInstalars.listFiles((dir, name) -> name.endsWith(".bat"));

            if (listBatLauch != null) {
                for (File fileBat : listBatLauch) {
                    if (fileBat.canExecute()) {
                        // Executa o arquivo .bat
                        Process process = new ProcessBuilder(fileBat.getAbsolutePath()).start();
                        process.waitFor(); // Espera até que o processo termine
                        System.out.println("Executado: " + fileBat.getName());
                        Thread.sleep(5000); // Atraso de 5 segundos entre execuções
                    } else {
                        System.out.println("Arquivo não é executável: " + fileBat.getName());
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
