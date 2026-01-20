# ☕ Espresso API — Sabrina Carpenter Edition

> “If my code’s gonna hit, it better hit like *Espresso*.”

A **Espresso API** é uma mini API REST desenvolvida em **Java + Spring Boot**, inspirada na música *Espresso* da Sabrina Carpenter.  
O objetivo do projeto é praticar fundamentos de backend, organização de camadas e construção de APIs de forma criativa e consistente.

Este projeto faz parte do desafio pessoal **#30DaysOfJavaWithKay**.

---

## ✨ Features

- ☕ Criar pedidos de café  
- 📋 Listar pedidos  
- 🔄 Atualizar status do pedido  
- 💰 Calcular valor total  
- 🚦 Status: `PREPARANDO`, `PRONTO`, `ENTREGUE`  

---

## 🛠️ Stack

- Java 17  
- Spring Boot  
- Maven  
- API REST  

---

## 📁 Estrutura do Projeto

```text
espresso
 └── src/main/java/com/kay/espresso
      ├── EspressoApplication.java
      ├── controller
      │    └── OrderController.java
      ├── service
      │    └── OrderService.java
      └── model
           ├── Order.java
           └── OrderStatus.java

