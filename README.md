# Screenmatch sem Web

## Descrição

Screenmatch é um projeto desenvolvido durante o curso de "Java: trabalhando com lambdas, streams e Spring Framework" da Alura. O objetivo do projeto é consumir dados de séries da API OMDb, processar essas informações e exibi-las de forma estruturada. A aplicação é construída utilizando o Spring Framework e Maven, iniciando como uma aplicação de linha de comando.

![Demonstração do Screenmatch sem Web ](https://github.com/SamilMoret/Screenmatch/blob/main/Anima%C3%A7%C3%A3o.gif)


## Objetivos do Curso

Durante a formação de Java com Orientação a Objetos, aprendemos a buscar dados de uma API OMDb e trabalhar com coleções. Agora, com o Screenmatch, nosso objetivo é avançar trabalhando com dados mais complexos, incluindo informações detalhadas de séries, temporadas e episódios.

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **Maven**
- **OMDb API**

## Estrutura do Projeto

O projeto foi iniciado com o Spring Initializr e possui a seguinte estrutura básica:

- **src/main/java**: Contém o código-fonte da aplicação.
  - **br.com.alura.screenmatch**: Pacote principal do projeto.
    - **ScreenmatchApplication.java**: Classe principal que inicializa a aplicação.
    - **principal**: Contém a classe `Principal` que exibe o menu e processa as informações.
    - **model**: Contém as classes de modelo (`DadosSerie`, `DadosTemporada`, `DadosEpisodio`, `Episodio`).
    - **service**: Contém as classes de serviço (`ConsumoApi`, `ConverteDados`, `IConverteDados`).
- **src/test/java**: Contém os testes da aplicação.
- **pom.xml**: Arquivo de configuração do Maven.

## Funcionalidades

1. **Buscar dados de séries**: Consome dados de séries da API OMDb.
2. **Exibir informações gerais**: Exibe informações gerais da série, incluindo temporadas e episódios.
3. **Filtrar e processar dados**: Filtra os episódios com base em critérios específicos, como número de visualizações e avaliações.
4. **Log de transações**: Utiliza a Stream API para processar e logar transações bancárias fictícias com valores superiores a 5000.

## Início Rápido

### Pré-requisitos

- **Java 17**
- **Maven**

### Passos para Rodar a Aplicação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/screenmatch.git
   cd screenmatch
   ```
2. Compile o projeto usando Maven:

  ```
  mvn clean install

  ```
3. Execute a aplicação:
    Pelo terminal:
   ```
    mvn spring-boot:run

   ```
    Pelo IntelliJ IDEA:
     Abra o projeto no IntelliJ.
     Navegue até ScreenmatchApplication.java.
     Clique no ícone de play ao lado do método main.
   
## Exemplo de Execução
  Ao rodar a aplicação, você verá no terminal:

```
Primeiro projeto Spring sem web.
Digite o nome da série:

```
   Você poderá inserir o nome de uma série e visualizar as informações retornadas da API OMDb, juntamente com logs detalhados das transações e processamento de dados.

## Próximos Passos
1. Adicionar novas funcionalidades: Continuar desenvolvendo a aplicação para incluir mais funcionalidades.
2. Transformar em aplicação web: Expandir o projeto para uma aplicação web utilizando Spring Web.
3. Implementar testes: Adicionar testes unitários e de integração para garantir a qualidade do código.

 
 <h3>🧑‍💻 Feito por:</h3>
<p>Samil Moret</p>
<a href="https://www.linkedin.com/in/samilmoret/"><img width="48" height="48" src="https://img.icons8.com/color/48/linkedin.png" alt="linkedin"/></a>
<a href="https://linkwhats.app/f27e11"><img width="48" height="48" src="https://img.icons8.com/color/48/whatsapp--v1.png" alt="whatsapp--v1"/></a>
