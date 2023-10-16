> # SOLID

# S (Single Responsibility Principle):

Este princípio estabelece que uma classe deve ter apenas um motivo para mudar, ou seja, deve ter uma única responsabilidade. Isso ajuda a manter o código coeso e facilita a manutenção.

```java

class Customer {
    // A classe Customer agora tem apenas a responsabilidade de representar um cliente.
}

class InvoicePrinter {
    void printInvoice(Customer customer) {
        // Lógica para imprimir uma fatura
    }
}

class EmailSender {
    void sendEmail(Customer customer) {
        // Lógica para enviar um e-mail
    }
}

```

# O (Open/Closed Principle):

Este princípio afirma que as entidades de software (classes, módulos, etc.) devem ser abertas para extensão, mas fechadas para modificação. Isso significa que você pode adicionar novos comportamentos sem alterar o código existente.

A modularidade e a extensibilidade são muito melhores, pois você não precisa abrir e modificar classes existentes sempre que uma nova forma é introduzida.

Portanto, mesmo que as mudanças imediatas nas classes pareçam pequenas, o impacto na manutenção e na evolução do código ao longo do tempo é substancial quando você segue o Princípio do Aberto/Fechado. Isso permite um design mais flexível e preparado para mudanças futuras.

```java

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

```

Se quisermos adicionar suporte para calcular a circunferência, teríamos que modificar a classe Circle, violando o OCP.

```java
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

```

Agora podemos adicionar novas formas (por exemplo, retângulos) sem modificar a classe Shape.

# L (Substitution Principle):

Se uma classe é uma subclasse de outra, ela deve ser capaz de ser usada em qualquer lugar em que a classe pai é usada, sem causar resultados inesperados ou erros. Isso significa que as subclasses não devem quebrar o contrato definido pela classe pai.

Este princípio afirma que objetos de subclasses devem ser substituíveis por objetos de suas classes base sem afetar a corretude do programa.

```java
class Bird {
    void move() {
        // Implementação do movimento comum para aves
    }
}

class Sparrow extends Bird {
    void move() {
        // Implementação de voo para pardais
    }
}

class Ostrich extends Bird {
    void move() {
        // Implementação de corrida para avestruzes
    }
}

```

# I (Interface Segregation Principle):

Este princípio declara que uma classe não deve ser forçada a implementar interfaces que ela não usa. Basicamente diz que é melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

```java
interface Worker {
    void work();
    void eat();
}
```

Se uma classe implementar Worker, ela deve implementar ambos os métodos work e eat, mesmo que não necessite de ambos.

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Worker implements Workable, Eatable {
    // Implementações apropriadas de work() e eat()
}
```

Agora, as classes podem implementar apenas as interfaces que precisam.

# D (Dependency Inversion Principle):

### Este princípio sugere que módulos de alto nível não devem depender de módulos de baixo nível; ambos devem depender de abstrações.

Isso significa que os componentes ou módulos principais (de alto nível) de um sistema não devem depender diretamente dos componentes mais específicos (de baixo nível). Em vez disso, ambos os níveis devem depender de abstrações (interfaces ou classes abstratas) que definem um conjunto de comportamentos comuns.

### Além disso, abstrações não devem depender de detalhes; detalhes devem depender de abstrações.

Isso implica que as abstrações, que representam comportamentos genéricos ou contratos, não devem ser afetadas por detalhes específicos de implementação. Em vez disso, os detalhes específicos devem seguir as abstrações, ou seja, implementar os contratos definidos pelas abstrações.

O DIP promove a inversão da relação de dependência tradicional, em que os módulos de alto nível dependem dos módulos de baixo nível, o que pode tornar o sistema rígido e difícil de estender e manter. Em vez disso, ele incentiva uma estrutura mais flexível, onde as abstrações são usadas para definir os contratos entre diferentes partes do sistema, permitindo que novos módulos sejam adicionados ou substituídos sem afetar as partes existentes do sistema.

```java
class MessageSender {
    void sendEmail(String message) {
        // Lógica para enviar um email
    }
}
```

Nesse caso, MessageSender está diretamente acoplado à implementação de envio de email. Se você desejar adicionar suporte para enviar mensagens por SMS, seria tentador modificar a classe MessageSender, mas isso violaria o DIP.

```java
Interface MessageProvider {
    void sendMessage(String message);
}

class EmailSender implements MessageProvider {
    @Override
    void sendMessage(String message) {
        // Lógica para enviar um email
    }
}

class SMSSender implements MessageProvider {
    @Override
    void sendMessage(String message) {
        // Lógica para enviar uma mensagem SMS
    }
}

class MessageSender {
    private MessageProvider provider;

    MessageSender(MessageProvider provider) {
        this.provider = provider;
    }

    void sendMessage(String message) {
        provider.sendMessage(message);
    }
}

```

A classe MessageSender não está mais diretamente acoplada à lógica de envio de email ou SMS. Em vez disso, ela depende de uma abstração MessageProvider.

As classes EmailSender e SMSSender implementam essa abstração, fornecendo a implementação real dos métodos sendMessage.

# SOLID

Exemplo aplicando todos os princípios SOLID em Java:

```java
package br.ucsal.advancedjava.Solid.SOLID;

import java.util.List;

public class Solid {

    interface Worker {
        void work();
    }

    interface Eater {
        void eat();
    }

    class Employee implements Worker, Eater {
        @Override
        public void work() {
            // Implementação do trabalho do funcionário
        }

        @Override
        public void eat() {
            // Implementação de como o funcionário come
        }
    }

    class Robot implements Worker {
        @Override
        public void work() {
            // Implementação do trabalho do robô
        }
    }

    class TaskManager {
        List<Worker> workers;

        TaskManager(List<Worker> workers) {
            this.workers = workers;
        }

        void assignTasks() {
            for (Worker worker : workers) {
                worker.work();
            }
        }
    }
}

```
