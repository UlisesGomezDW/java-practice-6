-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: banco
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuentas` (
  `numCuenta` int NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `saldo` double DEFAULT NULL,
  `sucursal` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`numCuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
INSERT INTO `cuentas` VALUES (1020,'Juan Hidalgo',1780,'AZC'),(1021,'Luis Castro',2258,'AZC'),(1022,'Jaime Ortiz',1250,'AZC'),(1024,'Luis Piza',1600,'AZC'),(1025,'Jorge Fuentes',1400,'AZC'),(1120,'Maria Villanueva',1698,'CUA'),(1121,'Guillermo Parra',880,'CUA'),(1122,'Lucia Guerrero',800,'CUA'),(1123,'Gina Morales',900,'CUA'),(1124,'Alberto Cuadros',1100,'CUA'),(1125,'Milton Quiroz',1600,'CUA'),(1126,'Alicia Martínez',1250,'CUA'),(1127,'Oscar Pérez',1457,'CUA'),(1128,'Samuel Vieyra',1697,'CUA'),(1220,'Jorge Padilla',4710,'XOC'),(1221,'Fernanda Oseguera',3690,'XOC'),(1222,'Alondra Rojas',1200,'XOC'),(1223,'Andrea Cardona',1350,'XOC'),(1224,'Pedro Flores',1150,'XOC'),(1225,'Noé Castro',1236,'XOC'),(1226,'Raúl Pinto',1345,'XOC'),(1227,'Mireya Vidal',1310,'XOC');
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-16  0:42:27
