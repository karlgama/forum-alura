<img src="https://img.shields.io/static/v1?label=Java&labelColor=red&message=11&color=gray&style=%3CSTYLE%3E&logo=java"> <img src="https://img.shields.io/static/v1?label=Spring%20Boot&labelColor=gray&message=11&color=lemon&style=%3CSTYLE%3E&logo=spring">

# Fórum

## Descrição do projeto

<p align="justify">É um projeto para reproduzir a dinâmica do fórum alura, utilizando boas práticas de programação:
<li>DTO's</li>
<li>Autenticação com <b>JWTToken</b></li>
<li>Proteção de rotas usando <b>Spring Security</b></li>
<li>monitoramento da <b>API.</b></li>
<li>E claro não poderia faltar documentação automatica usando o famoso <b>swagger springfox</b> </li><li>E testes automatizados com o <b>Junit</b></p> </li></p>


### Documentação, a porta e a url completa vai depender da sua aplicação caso queira rodar na sua máquina:`/swagger-ui.html` :smile:

### Projeto de monitoramento se encontra em outro repositório que é este <a href="https://github.com/karlgama/monitoramento-spring">aqui</a>: 

## Gerando um jar da aplicação
<p>Uma das opções é pela própria IDE, no caso do eclipse botão direito em cima do projeto, run as-> maven install ou</p>
<p> Maven build, em goals normalmente se coloca clean package que recompila as classes e gera o pacote </p>
<p>E claro é possível usar o terminal usando o mvn clean package</p>
<p>Por padrão o spring boot não gera um arquivo .war e sim .jar</p>
<p>Lembrando que se algum dos testes falhar ele interrompe o processo </p>

## Como rodar um jar?

### Fácil só digitar no terminal do seu servidor ```java -jar arquivo.jar```
### da mesma forma que você faria em um app standalone java
## Ainda em progresso
