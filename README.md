# Bem-vindo ao desafio

<div align="center">
  <img src="https://www.inbenta.com/wp-content/uploads/2016/11/LojasRennerLogo500x500_2015.jpg" width="300px"/>
</div>


## Documentação útil

1. [Projeto Automação WEB](https://github.com/LuisFelipeSeabra/prova_renner/tree/master/AutomationProject)
2. [Projeto Automação API](https://github.com/LuisFelipeSeabra/prova_renner/tree/master/RegresAPI)


## Projeto Automação WEB
Foi utilizado o Automation Practice (e-commerce website) para criação de testes automatizados e2e.
```
Linguagem: Java
Framework para automação: Selenium Webdriver.
Padrão de projeto: Page Objects
```

#### História do Usuário:
Como um cliente cadastrado no automationpractice.com
Eu quero fazer a compra de ao menos três produtos
Para que eu possa estar bem vestida

Os seguintes produtos do e-commerce devem ser utilizados, no tamanho e cor informada:
 - Printed Chiffon Dress na cor verde e tamanho "M"
 - Faded Short Sleeve T-shirts na cor azul
 - Blouse na quantidade 2
 - Printed Dress



#### Estruturação do Projeto:
```
├── /AutomationProject                                # Projeto                                                                                          
    ├── src/main/java                                 #                                                                                                         
        ├── br.df.lseabra.core                        # Pacote de Core                                                                                        
            ├── BasePage.java                         # Classe que será extendida pelas classes de page/ vários métodos que podem ser utilizados
            ├── BaseTest.java                         # classe que será extendida pelas classes de teste/ método de screenshot
            ├── DriverFactory.java                    # Classe contendo propriedades do ChromeDriver
            ├── Propriedades.java                     # Classe de propriedades
            ├── Steps.java                            # Classe java criada para criação de Jornadas(Métodos com diversos outros métodos das pages)
        ├── br.df.lseabra.page                        # Pacote de Pages
        ├── br.df.lseabra.test                        # Pacote de Testes
        ├── br.df.lseabra.suit                        # Pacote de Suites
            ├── SuiteSemLoginTest.java                # Suite de teste voltada para testes onde o cliente não possui Login e seu cadastro é efetuado durante a compra
            ├── SuiteTest.java                        # Suite de teste voltada para testes onde o cliente efetua Login ao entrar no site
```


#### Executar o Teste
Executar pela IDE de sua preferência os arquivos: 
```
SuiteSemLoginTest.java                             # Suite de teste para quando há cadastro de cliente durante a compra
SuiteTest.java                                     # Suite de teste para quando há login de cliente ao entrar no site
```

#### Execuções das Suites:

![image](https://user-images.githubusercontent.com/49051123/116761573-6662e580-a9ee-11eb-8e93-33ed61bb99e8.png)
![image](https://user-images.githubusercontent.com/49051123/116761604-7d093c80-a9ee-11eb-873b-23980622381a.png)

#### Pontos observados:
Em determinadas horas do dia, o sistema apresenta inconsistências em relação aos recursos do próprio sistema. Caso a execução dos testes apresente erro, favor executar novamente.

Erro:
```
Resource Limit Is Reached
The website is temporarily unable to service your request as it exceeded resource limit. Please try again later.
```

#### Tecnologia

Tecnologias utilizadas no projeto:
  * JRE 1.8.0_281
  * Maven
  * Selenium-java 3.4.0
  * Eclipse


## Projeto Automação API
Foi Desenvolvida uma automação de testes para a API cuja documentação está descrita no site (https://reqres.in/).

#### Endpoints:
- Validar o método POST 
- Validar o método GET SINGLE USER
- Valide o método GET LIST USERS
- Valide o método PATCH

#### Estruturação do Projeto:
```
├── /ReqresAPI                                        # Projeto                                                                                          
    ├── src/main/java                                 #                                                                                                         
        ├── br.df.lseabra.core                        # Pacote de Core                                                                                        
            ├── BaseTest.java                         # classe que será extendida pelas classes de teste
            ├── Constantes.java                       # Interface contendo porta, Url e Content type
        ├── br.df.lseabra.test                        # Pacote de Testes
            ├── ReqresTest.java                       #Classe com testes
```

#### Executar o Teste
Executar pela IDE de sua preferência os arquivos: 
```
Suite.java                                     # Suite de teste para quando há login de cliente ao entrar no site
```

#### Execução dos testes:

![image](https://user-images.githubusercontent.com/49051123/116761488-30bdfc80-a9ee-11eb-9427-db2e093b59fd.png)

#### Tecnologia:

Tecnologias utilizadas no projeto:
  * JRE 1.8.0_281
  * Maven
  * io.rest-assured 4.0.0 
  * groovy 3.0.5
  * Eclipse

