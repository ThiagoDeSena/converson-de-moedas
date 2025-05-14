package org.example;

import org.example.api.ExchangeRateApiClient;
import org.example.service.CurrencyConverter;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        String menu = "***************************************************************************\n" +
                "Seja Bem-vindo(a) ao Conversor de Moedas :)\n" +
                "\n" +
                "1) Dólar =>> Peso Argentino\n" +
                "2) Peso Argentino =>> Dólar\n" +
                "3) Dólar =>> Real Brasileiro\n" +
                "4) Real Brasileiro =>> Dólar\n" +
                "5) Dólar =>> Peso Colombiano\n" +
                "6) Peso Colombiano =>> Dólar\n" +
                "7) Sair\n" +
                "Escolha uma opção válida:\n" +
                "***************************************************************************\n";

        int resposta = 0;
        do {
            System.out.println(menu);
            resposta = scanner.nextInt();
            scanner.nextLine();

            switch (resposta){
                case 1:
                    System.out.println("Digite o valor em Dólar: $ ");
                    BigDecimal dolar = scanner.nextBigDecimal();
                    BigDecimal ars = currencyConverter.dolarParaPesoArgentino(dolar,"USD");
                    System.out.printf(Locale.US,"%.2f USD = %.2f ARS%n",dolar,ars);
                    break;
                case 2:
                    System.out.println("Digite o valor em Peso Argentino: $ ");
                    ars = scanner.nextBigDecimal();
                    dolar = currencyConverter.pesoArgentinoParaDolar(ars,"ARS");
                    System.out.printf(Locale.US,"%.2f ARS = %.2f USD%n",ars,dolar);
                    break;
                case 3:
                    System.out.println("Digite o valor em Dólar: $ ");
                    dolar = scanner.nextBigDecimal();
                    BigDecimal real = currencyConverter.dolarParaRealBrasileiro(dolar,"USD");
                    System.out.printf(Locale.US,"%.2f USD = %.2f BRL%n",dolar,real);
                    break;
                case 4:
                    System.out.println("Digite o valor em Real: R$ ");
                    real = scanner.nextBigDecimal();
                    dolar = currencyConverter.realBrasileiroParadolar(real,"BRL");
                    System.out.printf(Locale.US,"%.2f BRL = %.2f USD%n",real,dolar);
                    break;
                case 5:
                    System.out.println("Digite o valor em Dólar: $ ");
                    dolar = scanner.nextBigDecimal();
                    BigDecimal cop = currencyConverter.dolarParaPesoColombiano(dolar,"USD");
                    System.out.printf(Locale.US,"%.2f USD = %.2f COP%n",dolar,cop);
                    break;
                case 6:
                    System.out.println("Digite o valor em Peso Colombiano: $ ");
                    cop = scanner.nextBigDecimal();
                    dolar = currencyConverter.pesoColombianoParaDolar(cop,"COP");
                    System.out.printf(Locale.US,"%.2f COP = %.2f USD%n",cop,dolar);
                    break;
                case 7:
                    System.out.println("Saindo.....");
                    break;
                default:
                    System.out.println("Opção inválido! Digite uma opção válida");
            }

        }while (resposta!=7);
    }
}