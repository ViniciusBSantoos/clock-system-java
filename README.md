# 🕒 Sistema de Relógios com Fuso e Formatos em Java

Projeto desenvolvido para simular diferentes tipos de relógios (formato 24h e 12h), aplicando conceitos avançados de Programação Orientada a Objetos (POO), como **herança**, **classes abstratas** e **polimorfismo**.

---

## 🚀 Funcionalidades

* Criar relógios com:

  * Hora
  * Minuto
  * Segundo

* Exibir horário no formato:

  * `HH:MM:SS`

* Suporte para diferentes tipos de relógio:

  * Relógio Brasileiro (formato 24h)
  * Relógio Americano (formato 12h)

* Conversão de horário entre diferentes tipos de relógio

---

## 📋 Regras de Negócio

### ⏱️ Relógio (classe base)

* Possui:

  * Hora (0–23)
  * Minuto (0–59)
  * Segundo (0–59)

* Deve:

  * Validar valores ao definir hora, minuto e segundo
  * Retornar horário formatado (HH:MM:SS)
  * Definir um método abstrato para conversão de horário

---

### 🇧🇷 Relógio Brasileiro

* Trabalha no formato **24 horas**
* Aceita horas de 0 até 23
* Implementa a conversão de horário a partir de outro relógio

---

### 🇺🇸 Relógio Americano

* Trabalha no formato **12 horas**
* Aceita horas de 1 até 12
* Não permite horas entre 13 e 24
* Converte automaticamente horários do formato 24h para 12h

---

## 🧠 Conceitos aplicados

* Herança (`extends`)
* Classe abstrata (`abstract`)
* Método abstrato
* Polimorfismo (`@Override`)
* Encapsulamento (getters e setters)
* Validação de dados

---

## 🛠 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)



---

## 📂 Estrutura do Projeto

```
Relogio.java
RelogioBrasileiro.java
RelogioAmericano.java
Main.java
```



---

## 👨‍💻 Autor

Vinicius Batista Santos
