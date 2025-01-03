## Strategy Pattern

### Definição
O Strategy Pattern é um padrão de design comportamental que permite selecionar um algoritmo ou comportamento específico em tempo de execução, sem alterar o código do objeto que usa esse comportamento.

### Explicação simples:

Imagine que você tem um sistema com vários métodos de pagamento, cada um com regras diferentes, e que é escolhido pelo cliente.

    Pagamento via cartão de crédito.
    Pagamento via boleto.
    Pagamento via pix.

Em vez de encher o código de ifs e complicar a lógica, o Strategy Pattern organiza cada regra (ou estratégia) como uma classe separada. O programa simplesmente escolhe qual estratégia usar no momento certo.

### Benefícios:

    Facilita a adição de novas estratégias sem alterar o código existente.
    Reduz acoplamento: alterar uma regra não implica em alterar uma regra já definida. 
    Reduz o uso de condicionais.
    Torna o código mais modular e fácil de testar.

É como escolher a "ferramenta certa" para cada situação, sem bagunçar o resto do programa.

## Material de apoio

[ Strategy Pattern in Action - Resolvendo um problema real ](https://www.youtube.com/watch?v=-h14L7LzqYc)