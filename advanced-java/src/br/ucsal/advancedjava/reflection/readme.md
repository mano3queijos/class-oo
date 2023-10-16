> # "Reflection" em Java é uma característica que permite que um programa acesse informações sobre classes, métodos, campos e outros elementos em tempo de execução. Com a reflexão, você pode inspecionar e manipular a estrutura e o comportamento de classes Java de maneira dinâmica.

## Acesso a informações de classes: Você pode usar a reflexão para obter informações sobre uma classe, como nome, métodos, campos, construtores e interfaces implementadas. Por exemplo:

```css
Class<?> myClass = MyClass.class;
String className = myClass.getName();
Method[] methods = myClass.getMethods();
Field[] fields = myClass.getDeclaredFields();
```

### Criação de objetos dinamicamente: A reflexão permite criar instâncias de classes em tempo de execução, o que pode ser útil ao trabalhar com classes desconhecidas em tempo de compilação:

```css
Class<?> myClass = Class.forName("com.example.MyClass");
Object obj = myClass.newInstance();
```
