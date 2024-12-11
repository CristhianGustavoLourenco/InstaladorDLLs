/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application;

import entities.ScriptLaucher;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class InstaladorDLLsQuestor {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("      INSTALADOR DLL'S DA QUESTOR      ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("                OPCÇÕES");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("1 - INSTALAR DLLS");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("2 - DESINSTALAR DLLS");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("3 - SAIR DO PROGRAMA");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.print("OPÇÃO SELECIONADA: ");
        int selectedOption = scan.nextInt();
        
        try {
            ScriptLaucher script = new ScriptLaucher();
            while (selectedOption != 3) {

                switch (selectedOption) {
                    case 1:
                        script.installDLLs();
                        System.out.println("Instalação das Dlls Concluídas");
                        break;

                    case 2:
                        script.uninstallDLLS();
                        System.out.println("Desinstalação das Dlls Concluídas");
                        break;
                }

                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.println("      INSTALADOR DLL'S DA QUESTOR      ");
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.println("                OPCÇÕES");
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.println("1 - INSTALAR DLLS");
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.println("2 - DESINSTALAR DLLS");
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.println("3 - SAIR DO PROGRAMA");
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                System.out.print("OPÇÃO SELECIONADA: ");
                selectedOption = scan.nextInt();

            }
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }

    }
}
