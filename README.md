# CrudJavaMySQL
CRUD EN JAVA CON MYSQL EN EL EDITOR NETBEANS O ECLIPSE

* SE DEBE ABRIR LA CARPETA DEL PROYECTO COMPLETA EN NETBEANS O IMPORTARLA EN ECLIPSE.
* LOS DRIVERS DE JAVA CON MYSQL YA ESTAN EN LA CARPETA LIBS.
* SOLO SE DEBE CREAR LA BASE DE DATOS EN WORKBEANCH, PHPMYADMIN O DONDE DESEES QUE TE CONECTES CON MYSL.

* ESTE ES LA CONSULTA, O TAMBIEN DEJO EL ARCHIVO.SQL PARA IMPORTAR LA BASE DE DATOS SI SE DESEA.

CREATE DATABASE crudclientesdos;
USE crudclientesdos;

CREATE TABLE clientesdos(        
id INT AUTO_INCREMENT PRIMARY KEY,

nombre_apellido VARCHAR(30),

direccion VARCHAR(30) NOT NULL,

email VARCHAR(30) NOT NULL,

telefono VARCHAR(12),

estado_civil VARCHAR(10)

)


