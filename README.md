# Microservice-spring-boot-devdojo

## Subir o MySQL via docker
```bash
# Executando a image mysql
# Apartir da raiz do microservice 'course' executa:
docker-compose -f stack.yml up

# Após instalar a imagem, executa
docker run -e MYSQL_ROOT_PASSWORD=<password> mysql

#Verifique o seu container
docker container ps

#Pegue o IPAddress do cantainer: Apos isso use ele na sua datasource url no 'application.yml'
sudo docker inspect <containerId>

# Apos rodar a imagem mysql, executa o comando abaixo
sudo docker exec -it <containerId> bash

#Após abrir o bash do container, executa 
mysql -uroot -p

#Após isso crie o banco de dados devdojo
create database devdojo
```
