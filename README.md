# Encapsulamento---Cofrinho-Virtual

# Sistema de Cofrinho

## Descrição

Este projeto implementa uma classe `Cofrinho` em Java para controlar uma economia de dinheiro.

O sistema permite adicionar e retirar dinheiro, consultar o saldo, acompanhar o progresso em relação a uma meta e verificar automaticamente o status da economia.

O projeto foi desenvolvido com foco nos conceitos de Programação Orientada a Objetos, principalmente encapsulamento e regras de negócio.

## Funcionalidades

* Criar um cofrinho informando o nome e a meta.
* Iniciar o saldo automaticamente em R$ 0,00.
* Adicionar dinheiro ao cofrinho.
* Impedir a adição de valores negativos ou iguais a zero.
* Retirar dinheiro do cofrinho.
* Impedir retiradas maiores que o saldo disponível.
* Consultar o saldo atual.
* Consultar o nome e a meta.
* Calcular automaticamente o progresso da meta.
* Informar automaticamente o status da economia.

## Regras de Negócio

A classe `Cofrinho` possui os atributos:

```java
private String nome;
private double saldo;
private double meta;
```

Todos os atributos são privados para garantir o encapsulamento.

O saldo sempre começa em zero e não existe um método `setSaldo()`. Dessa forma, o saldo só pode ser alterado através dos métodos `adicionarDinheiro()` e `retirarDinheiro()`.

### Adicionar dinheiro

O método `adicionarDinheiro(double valor)` aceita somente valores positivos.

Exemplo:

```java
cofrinho.adicionarDinheiro(200);
```

Valores negativos ou iguais a zero são rejeitados.

### Retirar dinheiro

O método `retirarDinheiro(double valor)` verifica se existe saldo suficiente antes de realizar a retirada.

Exemplo:

```java
cofrinho.retirarDinheiro(100);
```

Não é possível retirar um valor maior que o saldo disponível.

### Progresso

O método `getProgresso()` calcula automaticamente a porcentagem da meta alcançada.

A fórmula utilizada é:

```text
(saldo / meta) * 100
```

Por exemplo, se a meta for R$ 1.000,00 e o saldo for R$ 500,00, o progresso será de 50%.

### Status

O método `getStatus()` determina automaticamente o estado atual do cofrinho:

| Condição                                | Status            |
| --------------------------------------- | ----------------- |
| Saldo igual a zero                      | Meta não iniciada |
| Saldo maior que zero e menor que a meta | Economizando      |
| Saldo igual ou maior que a meta         | Meta alcançada    |

Não existe um atributo `status` nem um método `setStatus()`. O status é calculado com base no saldo atual.

## Estrutura do Projeto

```text
cofrinho-java/
│
├── src/
│   ├── Cofrinho.java
│   └── Main.java
│
└── README.md
```

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* Encapsulamento
* Git
* GitHub

## Como Executar

### 1. Clonar o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

### 2. Acessar a pasta do projeto

```bash
cd cofrinho-java
```

### 3. Compilar os arquivos

```bash
javac src/*.java
```

### 4. Executar o programa

```bash
java -cp src Main
```

## Exemplo de Uso

```java
public class Main {

    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho("Thiago", 1000);

        cofrinho.adicionarDinheiro(500);

        System.out.println("Nome: " + cofrinho.getNome());
        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Meta: R$ " + cofrinho.getMeta());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());
    }
}
```

Resultado esperado:

```text
Nome: Thiago
Saldo: R$ 500.0
Meta: R$ 1000.0
Progresso: 50.0%
Status: Economizando
```

## Testes das Regras de Negócio

O programa também testa situações inválidas e válidas, incluindo:

* Criação do cofrinho com saldo inicial igual a zero.
* Adição de valores positivos.
* Tentativa de adicionar valores negativos.
* Retirada de valores disponíveis.
* Tentativa de retirar mais dinheiro do que o saldo.
* Cálculo do progresso da meta.
* Alteração automática do status ao atingir a meta.
* Ultrapassagem da meta.

## Objetivo do Projeto

O objetivo deste projeto é desenvolver uma classe seguindo princípios de encapsulamento e implementar regras de negócio diretamente na classe, evitando que atributos importantes sejam alterados de forma indevida.

O projeto também demonstra como métodos podem calcular informações automaticamente, sem a necessidade de armazenar dados que podem ser obtidos a partir do estado atual do objeto.

## Autor

Thiago Pereira da Silva
