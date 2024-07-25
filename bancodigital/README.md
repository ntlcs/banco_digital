Aqui está o README atualizado com as informações sobre o uso do Lombok e Maven:

---

# desafio_banco_digital

## Descrição

Este projeto foi desenvolvido como parte do Bootcamp Santander da Dio. O objetivo principal é criar um banco digital utilizando Java e princípios de orientação a objetos. A aplicação possibilita a criação e gestão de contas correntes e poupança, com funcionalidades para depósito, saque e transferência de valores, além da impressão de extratos detalhados.

## Funcionalidades

- **Criação de Contas:** Permite a criação de contas correntes e poupança com dados básicos.
- **Depósito:** Adiciona valores às contas, atualizando o saldo de forma segura.
- **Saque:** Retira valores das contas, garantindo que o saldo disponível seja respeitado.
- **Transferência:** Transfere valores entre contas, verificando a suficiência do saldo.
- **Extrato:** Imprime um extrato detalhado, contendo informações sobre a agência, número da conta e saldo atual.

## Tecnologias Utilizadas

- **Java 21:** Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Maven:** Ferramenta de gerenciamento de projetos e automação de construção usada para gerenciar dependências e construir o projeto.
- **Lombok:** Biblioteca que simplifica o código Java através da geração automática de métodos como getters, setters e construtores.
- **IntelliJ IDEA:** Ambiente de Desenvolvimento Integrado (IDE) utilizado para codificação.
- **Paradigma de Orientação a Objetos:** Utilização de conceitos como abstração, encapsulamento, herança e polimorfismo para construir uma aplicação modular e extensível.

## Estrutura do Projeto

O projeto é organizado em várias classes que representam as entidades e os comportamentos do banco digital. Aqui está uma visão geral das principais componentes do sistema:

### Interfaces

- **IConta:** Define os métodos essenciais que cada tipo de conta deve implementar, como saque, depósito, transferência e impressão de extrato.

### Classes

- **Conta:** Classe abstrata que serve como base para contas correntes e poupança. Implementa os métodos definidos na interface `IConta` e contém atributos comuns como agência, número da conta e saldo.
- **ContaCorrente e ContaPoupanca:** Classes concretas que estendem a classe `Conta`, podendo adicionar comportamentos específicos de cada tipo de conta.
- **Banco:** Representa a entidade banco com um nome.
- **Cliente:** Representa a entidade cliente com um nome.

## Nível de Conhecimento em Java

Atualmente, estou em um nível intermediário de conhecimento em Java. Tenho uma boa compreensão dos conceitos fundamentais da linguagem e dos princípios de orientação a objetos. Através deste projeto, apliquei e refinei minhas habilidades em:

- **Abstração:** Criação de classes abstratas para representar conceitos gerais que podem ser especificados em subclasses.
- **Encapsulamento:** Utilização de modificadores de acesso para proteger os dados e métodos das classes.
- **Herança:** Extensão de classes para reutilizar código e criar hierarquias de classes.
- **Polimorfismo:** Implementação de métodos que podem ser chamados de maneira uniforme em diferentes tipos de objetos.

## Conclusão

Este projeto de banco digital foi uma excelente oportunidade para consolidar meus conhecimentos em Java e orientação a objetos. Através dele, pude aplicar práticas de programação sólidas e desenvolver uma aplicação funcional e escalável. Estou entusiasmada para continuar aprimorando minhas habilidades e explorar novas possibilidades no desenvolvimento de software.

---

Se precisar de mais alguma coisa ou ajustes adicionais, é só avisar!