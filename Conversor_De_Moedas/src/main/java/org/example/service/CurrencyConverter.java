package org.example.service;

import com.google.gson.Gson;
import org.example.api.ExchangeRateApiClient;
import org.example.models.ExchangeRateResponse;

import java.math.BigDecimal;

public class CurrencyConverter {

    private ExchangeRateApiClient exchangeRateApiClient;
    private Gson gson = new Gson();

    public BigDecimal dolarParaPesoArgentino(BigDecimal dolar, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        //Taxa de câmbio de USD para ARS
        BigDecimal taxa = response.conversion_rates().get("ARS");

        BigDecimal resultado = dolar.multiply(taxa);

        return resultado;

    }

    public BigDecimal pesoArgentinoParaDolar(BigDecimal ars, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        BigDecimal taxa = response.conversion_rates().get("USD");

        BigDecimal resultado = ars.multiply(taxa);

        return resultado;
    }

    public BigDecimal dolarParaRealBrasileiro(BigDecimal dolar, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        BigDecimal taxa = response.conversion_rates().get("BRL");

        BigDecimal resultado = dolar.multiply(taxa);

        return resultado;
    }

    public BigDecimal realBrasileiroParadolar(BigDecimal real, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        BigDecimal taxa = response.conversion_rates().get("USD");

        BigDecimal resultado = real.multiply(taxa);

        return resultado;
    }

    public BigDecimal dolarParaPesoColombiano(BigDecimal dolar, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        BigDecimal taxa = response.conversion_rates().get("COP");

        BigDecimal resultado = dolar.multiply(taxa);

        return resultado;
    }

    public BigDecimal pesoColombianoParaDolar(BigDecimal cop, String moeda) {
        exchangeRateApiClient = new ExchangeRateApiClient(moeda);
        String json = exchangeRateApiClient.respostaApi();

        ExchangeRateResponse response = gson.fromJson(json,ExchangeRateResponse.class);

        BigDecimal taxa = response.conversion_rates().get("USD");

        BigDecimal resultado = cop.multiply(taxa);

        return resultado;
    }
}
