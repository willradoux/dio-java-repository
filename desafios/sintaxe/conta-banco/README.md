# Desafio ContaBanco

Exercicio do modulo **Sintaxe** da trilha Java Basico da DIO.

## Objetivo

Criar um programa Java que recebe dados de uma conta bancaria pelo terminal e,
ao final, exibe uma mensagem com as informacoes digitadas pelo usuario.

## Dados solicitados

| Atributo | Tipo | Exemplo |
| --- | --- | --- |
| Numero | Inteiro | `1021` |
| Agencia | Texto | `067-8` |
| Nome Cliente | Texto | `MARIO ANDRADE` |
| Saldo | Decimal | `237.48` |

## Arquivos

- `ContaTerminal.java`: classe principal, responsavel pela leitura dos dados e exibicao da mensagem final.
- `Conta.java`: classe que representa os dados da conta.

## Como executar

Na raiz do repositorio:

```bash
javac -d out desafios/sintaxe/conta-banco/src/*.java
java -cp out ContaTerminal
```

Mensagem esperada:

```text
Ola [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agencia e [Agencia], conta [Numero] e seu saldo [Saldo] ja esta disponivel para saque.
```
