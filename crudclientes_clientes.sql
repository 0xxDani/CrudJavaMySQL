-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: crudclientes
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre_apellido` varchar(30) NOT NULL,
  `direccion` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(30) NOT NULL,
  `telefono` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `estado_civil` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'DANIEL BUSTAMANTE','VEREDA KELYIMPORTA','dfkdfjsdb@gmail.com','23545667','Soltero'),(2,'ELIZABETH PEREZ ','clle 0000 666','jbfhsdbh@gmail.com','222445','Soltero'),(3,'GALI GALEANO','Calle 20 # 50-70','gali@gmail.com','5550103','Casado@'),(5,'PAQUITA LA DEL BARRIO','Crr 50 # 20-30','paquita@gmail.com','5550101','Solter@'),(7,'DAVID','DFGHIKUJYU','DFGDFG','67788','Casado@'),(8,'RUBEN AGUIRRE','avenida salsipuedes # 23-45','kiko@gmail.com','5550106','Solter@'),(9,'FLORINDA MEZA','clle 45#23-42','flori@gmail.com','5550104','Divorciad@'),(11,'VALENTINA HENAO','CIRCULAR 50#25-30','vale@gmail.com','5550102','Divorciad@'),(12,'EDGAR VIVAR','CORREGIMIENTO PTO TELUNDO','barriga@gmail.com','5550108','Divorciad@'),(14,'GLORIA ESTER ORTEGA','av34c # 43b29','gloria@gmail.com','3116284293','Divorciad@'),(15,'PACHO BUSTAMANTE','IUSDFHSDJBNH','SDJFHSDIHSD','23456','Solter@'),(16,'KASE O','AV. galicia # 45-50','kase@gmail.com','5550109','Casado@'),(18,'Daniel Bustamante','guarne','oxsnake@gmail.com','5550101','soltero');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-21 22:31:10
