# Metaclasse

![Alt text](image-5.png)


![Alt text](image-6.png)

# Objeto Genérico
![Alt text](image-10.png)

![Alt text](image-8.png)

![Alt text](image-11.png)

![Alt text](image-12.png)
# Metodos e atributos

![Alt text](image-13.png)


# Reflexão e Introspecção


> Introspecção: habilidade de um programa de examinar suas próprias estruturas de dados e de programação durante a execução.

> Reflexão: habilidade de um programa de examinar e modificar suas próprias estruturas de dados e de programação durante a execução.


### assim não é legal
```java
public class Candidato {
private String nome;
private String cpf;
private int posicao;
private BigDecimal nota;
}

```


> [!IMPORTANT]
> Refatorar
reduzir acoplamento


```java
public class Validador {

public List<String> validar(Candidato candidato){
	List<String> invalidos = new ArrayList();
	if(candidato.getNome()==null)
		invalidos.add("nome");
	if(candidato.getCpf()==null)
		invalidos.add("cpf");
	
...
	
return invalidos;
}
}

```

> [!IMPORTANT]
> O atributo está no modelo Classe

```java
public class Validador {

public List<String> validar(Candidato candidato){
List<String> invalidos = new ArrayList<>(); 
Classe classe = candidato.getClasse(); 
Atributo[] atributos = classe.getAtributos();
for(Atributo atributo : atributos){
if(atributo.getValue() == null)
invalidos.add(atributo.getNome()); 
} 
return invalidos;  
}
}

```

> [!IMPORTANT]
> O valor do atributo fica no objeto

```java
public class Validador {

public List<String> validar(Candidato candidato){
List<String> invalidos = new ArrayList<>(); 
Classe classe = candidato.getClasse(); 
Atributo[] atributos = classe.getAtributos();
for(Atributo atributo : atributos){
	Objeto valor = atributo.buscar(candidato)
if(valor == null)
invalidos.add(atributo.getNome()); 
} 
return invalidos;  
}
}

```


### Class
```css
java.lang.Class
candidato.getClass(); 
Candidato.class; Class.forName("pacote.Candidato");

```

### Field


```css
java.lang.reflect.Field
clazz.getFields();
clazz.getDeclaredFields();
```