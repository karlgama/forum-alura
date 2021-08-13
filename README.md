<img src="https://img.shields.io/static/v1?label=Java&labelColor=red&message=11&color=gray&style=%3CSTYLE%3E&logo=java"> <img src="https://img.shields.io/static/v1?label=Spring%20Boot&labelColor=gray&message=11&color=lemon&style=%3CSTYLE%3E&logo=spring">

# Fórum

## Descrição do projeto
##
<p align="justify">É um projeto para reproduzir a dinâmica do fórum alura, utilizando boas práticas de programação:
<li>DTO's</li>
<li>Autenticação com <b>JWTToken</b></li>
<li>Proteção de rotas usando <b>Spring Security</b></li>
<li>monitoramento da <b>API.</b></li>
<li>E claro não poderia faltar documentação automatica usando o famoso <b>swagger springfox</b> </li><li>E testes automatizados com o <b>Junit</b></p> </li></p>

##
### Documentação, a porta e a url completa vai depender da sua aplicação caso queira rodar na sua máquina:`/swagger-ui.html` :smile:
##
### Projeto de monitoramento se encontra em outro repositório que é este <a href="https://github.com/karlgama/monitoramento-spring">aqui</a>: 

##
## Gerando um jar da aplicação
<p>Uma das opções é pela própria IDE, no caso do eclipse botão direito em cima do projeto, run as-> maven install ou</p>
<p> Maven build, em goals normalmente se coloca clean package que recompila as classes e gera o pacote </p>
<p>E claro é possível usar o terminal usando o mvn clean package</p>
<p>Por padrão o spring boot não gera um arquivo .war e sim .jar</p>
<p>Lembrando que se algum dos testes falhar ele interrompe o processo </p>

##

## Como rodar um jar?

### Fácil só digitar no terminal do seu servidor ```java -jar arquivo.jar```
### da mesma forma que você faria em um app standalone java
### porém cuidado ao fazer deploy em um servidor você precisa indicar qual o profile que vai rodar a aplicação dessa forma ```java -jar -Dspring.profiles.active=prod arquivo.jar```

##
## como usar suas variáveis de ambiente?

### fácil também para quem usa ambientes linux/mac basta apenas rodar no seu terminar export ```NOME_DA_SUA_VARIAVEL=VALOR_DA_SUA_VARIAVEL```

### exemplo prático vamos supor que minha variável FORUM_DATABASE_USERNAME fosse "teste" então eu rodaria:
```export FORUM_DATABASE_USERNAME=teste ```

### Uma forma mais rústica seria assim:
### ```java -jar -Dspring.profiles.active=prod -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 seuarquivo.jar```

##
## É possível, se for necessário gerar um arquivo do tipo war
<p> (lembrando você pode mudar o servidor imbutido no jar) você precisa adiconar a tag packaging no pom.xml passando war, adicionar a dependencia do tomcat que na verdade já está no projeto mas ao passar essa dependência no pom vc usa a tag scope com o parametro *provided* para indicar para o maven que vc não quer incluir a biblioteca do tomcat no arquivo final.
E por último é necessário herdar da classe SpringBootInitializer na sua classe principal e sobreescrever o método configure e retornar:</p> 

```builder.sources(suaClassePrincipal.class)```