# API REST GAMES
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Matheus-RC/projeto-game/blob/main/LICENSE) 

# Sobre o projeto

Esse projeto se trata de uma API Rest onde é possível: consultar os games cadastrados, visualizar as listas (agrupamento por tipo de game) e  reordenar as posições dos games em uma lista. Projeto desenvolvido na **Semana DevSuperior**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").


## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven


## Implantação em produção
- Banco de dados: Postgresql
- Banco de teste: H2

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/Matheus-RC/projeto-game.git

# entrar na pasta do projeto back end
cd demo

# Instalar dependencias (Apenas na primeira vez)
 ./mvnw clean install

# executar o projeto
./mvnw spring-boot:run
```
# End - points
- (GET) http://localhost:8080/games -> Busca todos os games cadastrados
- (GET) http://localhost:8080/games/{id_do_game} -> Busca um game específico
- (GET) http://localhost:8080/list -> Busca as listas de games (tipos)
- (GET) http://localhost:8080/list/{id_da_lista}/games -> Busca todos os games pertencentes a uma lista específica
- (POST) http://localhost:8080/list/{id_da_lista}/replacement -> Reordena a posição de um game em uma lista específica
- - Para isso precisamos enviar no corpo da requisição a posição de origem e a posição de destino do game a ser reposicionado:
- - - {
    "sourceIndex":3,
    "destinationIndex":1
    }


# Autor

Matheus Ribeiro Cardoso

https://www.linkedin.com/in/matheus-r-cardoso

