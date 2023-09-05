> # SOLID

# S (Single Responsibility Principle):

Este princípio estabelece que uma classe deve ter apenas um motivo para mudar, ou seja, deve ter uma única responsabilidade. Isso ajuda a manter o código coeso e facilita a manutenção.

# O (Open/Closed Principle):

Este princípio afirma que as entidades de software (classes, módulos, etc.) devem ser abertas para extensão, mas fechadas para modificação. Isso significa que você pode adicionar novos comportamentos sem alterar o código existente.

A modularidade e a extensibilidade são muito melhores, pois você não precisa abrir e modificar classes existentes sempre que uma nova forma é introduzida.

Portanto, mesmo que as mudanças imediatas nas classes pareçam pequenas, o impacto na manutenção e na evolução do código ao longo do tempo é substancial quando você segue o Princípio do Aberto/Fechado. Isso permite um design mais flexível e preparado para mudanças futuras.

# L (Substitution Principle):

Se uma classe é uma subclasse de outra, ela deve ser capaz de ser usada em qualquer lugar em que a classe pai é usada, sem causar resultados inesperados ou erros. Isso significa que as subclasses não devem quebrar o contrato definido pela classe pai.

# I:

# D:




<!--
>Se para cada objeto o1 do tipo S há um objeto 02 do tipo T de forma que, para todos os programas P definidos em termos de T, o comportamento de P é inalterado quando o1 é substituido por 02 então S é um subtipo de T -->
