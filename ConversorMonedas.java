import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tasaEUR_USD = 1.18; // Tasa de cambio actual de EUR a USD
        double tasaEUR_GBP = 0.86; // Tasa de cambio actual de EUR a GBP
        double tasaEUR_JPY = 128.70; // Tasa de cambio actual de EUR a JPY
        double tasaEUR_CAD = 1.48; // Tasa de cambio actual de EUR a CAD
        double tasaEUR_AUD = 1.58; // Tasa de cambio actual de EUR a AUD
        double tasaEUR_DOP = 68.29; // Tasa de cambio actual de EUR a DOP
        double euros, dolares, libras, yenes, dolaresCA, dolaresAU, pesosDR;
        
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        euros = input.nextDouble();
        
        dolares = euros * tasaEUR_USD;
        libras = euros * tasaEUR_GBP;
        yenes = euros * tasaEUR_JPY;
        dolaresCA = euros * tasaEUR_CAD;
        dolaresAU = euros * tasaEUR_AUD;
        pesosDR = euros * tasaEUR_DOP;
        
        System.out.println(euros + " euros es equivalente a:");
        System.out.println(dolares + " dólares estadounidenses.");
        System.out.println(libras + " libras esterlinas.");
        System.out.println(yenes + " yenes japoneses.");
        System.out.println(dolaresCA + " dólares canadienses.");
        System.out.println(dolaresAU + " dólares australianos.");
        System.out.println(pesosDR + " pesos dominicanos.");
    }
}