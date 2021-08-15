<img src="https://img.shields.io/static/v1?label=Java&labelColor=red&message=11&color=gray&style=%3CSTYLE%3E&logo=java"> <img src="https://img.shields.io/static/v1?label=Spring%20Boot&labelColor=gray&message=11&color=lemon&style=%3CSTYLE%3E&logo=spring">

# Fórum

## Descrição do projeto

<p align="justify">É um projeto para reproduzir a dinâmica do fórum alura, utilizando boas práticas de programação:
<li>DTO's</li>
<li>Autenticação com <b>JWTToken</b></li>
<li>Proteção de rotas usando <b>Spring Security</b></li>
<li>Paginação</li>
<li>monitoramento da <b>API.</b></li>
<li>E claro não poderia faltar documentação automatica usando o famoso <b>swagger springfox</b> </li><li>E testes automatizados com o <b>Junit</b></p> </li></p>

##
### Documentação, a porta e a url completa vai depender da sua aplicação caso queira rodar na sua máquina:`/swagger-ui.html` :smile:
##
### Projeto de monitoramento se encontra em outro repositório que é este <a href="https://github.com/karlgama/monitoramento-spring">aqui</a>: 

##
## Gerando um jar da aplicação
#### Uma das opções é pela própria IDE, no caso do eclipse botão direito em cima do projeto, run as-> maven install ou Maven build, em goals normalmente se coloca clean package que recompila as classes e gera o pacote. E claro é possível usar o terminal usando o mvn clean package, por padrão o spring boot não gera um arquivo .war e sim .jar.Lembrando que se algum dos testes falhar ele interrompe o processo

##

## Como rodar um jar?

#### Fácil só digitar no terminal do seu servidor ```java -jar arquivo.jar``` da mesma forma que você faria em um app standalone java porém cuidado ao fazer deploy em um servidor você precisa indicar qual o profile que vai rodar a aplicação dessa forma ```java -jar -Dspring.profiles.active=prod arquivo.jar```

##
## como usar suas variáveis de ambiente?

#### fácil também, para quem usa ambientes linux/mac basta apenas rodar no seu terminal ```export NOME_DA_SUA_VARIAVEL=VALOR_DA_SUA_VARIAVEL```, exemplo prático vamos supor que minha variável FORUM_DATABASE_USERNAME fosse "teste" então eu rodaria:
#### ```export FORUM_DATABASE_USERNAME=teste ```

#### Uma forma mais rústica seria assim:
#### ```java -jar -Dspring.profiles.active=prod -DFORUM_DATABASE_URL=jdbc:h2:mem:alura-forum -DFORUM_DATABASE_USERNAME=sa -DFORUM_DATABASE_PASSWORD= -DFORUM_JWT_SECRET=123456 seuarquivo.jar```

##
#### É possível, se for necessário gerar um arquivo do tipo war (lembrando você pode mudar o servidor imbutido no jar) você precisa adicionar a tag packaging no pom.xml passando war, adicionar a dependencia do tomcat que na verdade já está no projeto mas ao passar essa dependência no pom vc usa a tag *scope* com o parâmetro *provided* para indicar para o maven que vc não quer incluir a biblioteca do tomcat no arquivo final. E por último é necessário herdar da classe SpringBootInitializer na sua classe principal e sobreescrever o método configure e retornar:
#### ```builder.sources(suaClassePrincipal.class)```

## É claro podemos usar docker
### Existe um dockerfile no projeto para montar uma imagem com jdk 11, crie a imagem usando ```sudo docker build -t nomeDaImagemQueVocêQuer .``` dentro do diretório onde se encontra o dockerfile, isso é um docker bem simplificado existe muitas outras coisas possíveis de se colocar e fazer com a docker.

### Depois que a image for criada para rodar a imagem use:
#### ```sudo docker run -p 8080:8080 -e SPRING_PROFILES_ACTIVE='profile que quer usar' -e FORUM_DATABASE_URL='suaUrlDeBanco' -e FORUM_DATABASE_USERNAME='seuUsuarioDoBanco' -e FORUM_DATABASE_PASSWORD='suaSenhaDoBanco' -e FORUM_JWT_SECRET='seuSecret' nomeDaImagem```
#### claro o comando acima pode ser alterado de acordo com a necessidade como por exemplo a porta que a aplicação vai rodar se não quiser ficar executando com sudo os comandos apenas adicione seu usuário ao grupo docker.

#### O deploy foi realizado no heroku, porém o link não está mais disponivel com se trata apenas de um projeto didático, não renovarei a URL.
