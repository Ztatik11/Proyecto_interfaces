//INSTALAR CONTENEDOR
docker run -it -p 3306:3306 --name mango_games -e MYSQL_ROOT_PASSWORD=root -d mysql

//INICIAR CONTENEDOR
docker exec -it mango_games mysql -uroot -p