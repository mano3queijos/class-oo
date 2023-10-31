# Web Scraping com Java

Web scraping refere-se à prática de extrair dados de páginas web. Quando combinado com multithreading, você pode acelerar o processo de coleta de dados de múltiplas páginas simultaneamente.
> ## Jsoup:
Uma biblioteca java para trabalhar com html. Ela fornece uma API muioto conveniente para extrair e manipular dados.



```ruby
Document doc = null;
try {
doc = Jsoup.connect("https://ucsal.br/atos-editais-e-resolucoes-2/").get();
} catch (IOException e) {
throw new RuntimeException(e);
}
Elements ps = doc.getElementById("elementor-tab-content-5491").select("p");
for (Element p : ps) {
String pText = p.ownText();
String aText = p.select("a").text();
System.out.println(pText + " " + aText);
}

```




> ## HtmlUnit:0
Um navegador web sem interface gráfica para Java que é usado principalmente para testes unitários, mas também pode ser usado para web scraping


```ruby
<dependency>
            <groupId>org.htmlunit</groupId>
            <artifactId>htmlunit</artifactId>
            <version>3.7.0</version>
        </dependency>
```

```ruby
try (final WebClient webClient = new WebClient()) {
   webClient.getOptions().setJavaScriptEnabled(false);
   webClient.getOptions().setThrowExceptionOnScriptError(false);
   webClient.getOptions().setCssEnabled(false);
   webClient.setCssErrorHandler(new SilentCssErrorHandler());
   HtmlPage page = webClient.getPage("https://ucsal.br/atos-editais-e-resolucoes-2/");
   List<HtmlElement> ps =page.getByXPath("//div[@id='elementor-tab-content-5491']/p");

//Proximo slide
            
} catch (Exception e) {
e.printStackTrace();
}

```
```ruby
List<HtmlElement> ps = page.getByXPath("//div[@id='elementor-tab-content-5491']/p");
for (HtmlElement p : ps) {
   String pText = p.getTextContent().trim();
   HtmlAnchor aElement = p.getFirstByXPath("./a");
   String aText = "";
   if (aElement != null) {
      aText = aElement.getTextContent();
      pText = pText.replace(aText, "").trim();
   }
   System.out.println(pText + " " + aText);
}

```

 > ## Threads
 

```ruby
ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable weeklyTask = new Runnable() {
            public void run() {
                System.out.println("Executando tarefa semanal...");
                // Adicione sua lógica de tarefa aqui.
            }
        };
        scheduler.scheduleAtFixedRate(weeklyTask, 7, 7, TimeUnit.DAYS);
    }

```

# Importante

Respeito ao robots.txt: Sempre verifique o arquivo robots.txt de um site antes de começar a raspar. Ele contém regras sobre quais páginas podem ou não ser raspadas. Ignorar essas regras pode resultar em seu IP sendo bloqueado.
Limitar a Taxa de Requisição: Mesmo com threads, é vital não sobrecarregar o servidor do site. Fazer muitas requisições em um curto espaço de tempo pode ser considerado um ataque DDoS. Use atrasos adequados entre as requisições.
Páginas Dinâmicas: Muitos sites modernos carregam conteúdo dinamicamente usando JavaScript. Bibliotecas como Jsoup não podem lidar com conteúdo carregado dinamicamente. Ferramentas como Selenium ou HtmlUnit, que podem executar JavaScript, podem ser necessárias.

