# 💱 Conversor de Moedas - Java

<div align="center">
  <img src="https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Gson-2.10.1-brightgreen?logo=google" />
  <img src="https://img.shields.io/badge/API-Exchange%20Rate%20API-yellow?logo=cloud" />
</div>

> Projeto simples em Java que consome uma API de câmbio para converter moedas entre **USD, ARS, BRL e COP**, usando boas práticas com `BigDecimal`, formatação localizada e modularização de código.

---

## 🖼️ Demonstração

### 💡 Menu principal:

<img src="https://github.com/user-attachments/assets/c17d59d8-4bc0-4115-b708-c89b097f3564" width="600" alt="Menu do conversor" />

### 🧾 Exemplo de conversão:

<img src="https://github.com/user-attachments/assets/0d546bf2-ba7d-44c9-bc13-6366abaab3e3" width="600" alt="Conversão de dólar para peso argentino" />

---

## 🚀 Funcionalidades

- ✅ Conversão de:
  - Dólar (USD) ⇄ Peso Argentino (ARS)
  - Dólar (USD) ⇄ Real Brasileiro (BRL)
  - Dólar (USD) ⇄ Peso Colombiano (COP)
- ✅ Consumo da API [ExchangeRate API](https://www.exchangerate-api.com/)
- ✅ Arredondamento e precisão com `BigDecimal`
- ✅ Uso de `Locale.US` para entrada e saída
- ✅ Projeto modular com separação por responsabilidade (SRP)

---

## 🛠️ Tecnologias utilizadas

- [Java 17+](https://www.oracle.com/java/)
- [Gson](https://github.com/google/gson)
- [ExchangeRate API](https://www.exchangerate-api.com/)

---

## 📦 Estrutura do Projeto

```bash
src/
├── org.example.Main                   # Interface com o usuário
├── org.example.service.CurrencyConverter   # Lógica de conversão
├── org.example.api.ExchangeRateApiClient  # Requisição à API
└── org.example.model.ExchangeRateResponse # Record para resposta JSON

