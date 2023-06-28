-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_sistema_facturacion
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `mae_categoria`
--

DROP TABLE IF EXISTS `mae_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mae_categoria` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae_categoria`
--

LOCK TABLES `mae_categoria` WRITE;
/*!40000 ALTER TABLE `mae_categoria` DISABLE KEYS */;
INSERT INTO `mae_categoria` VALUES (1,'Bebidas Alcoholicas',1),(2,'Embutidos',1);
/*!40000 ALTER TABLE `mae_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mae_cliente`
--

DROP TABLE IF EXISTS `mae_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mae_cliente` (
  `idCliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `DNI` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae_cliente`
--

LOCK TABLES `mae_cliente` WRITE;
/*!40000 ALTER TABLE `mae_cliente` DISABLE KEYS */;
INSERT INTO `mae_cliente` VALUES (1,'Adrian','Calderon','70368311','913066846','Adepa F-18',0),(3,'Felix','Bernabé','72504887','995588001','Paucarpata 204',1);
/*!40000 ALTER TABLE `mae_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mae_producto`
--

DROP TABLE IF EXISTS `mae_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mae_producto` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `cantidad` int NOT NULL,
  `precio` double(10,2) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `porcentajeIGV` int NOT NULL,
  `idCategoria` int NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae_producto`
--

LOCK TABLES `mae_producto` WRITE;
/*!40000 ALTER TABLE `mae_producto` DISABLE KEYS */;
INSERT INTO `mae_producto` VALUES (1,'Blue Label',14,500.50,'Es un elixir',18,1,1),(2,'Pisco',44,100.00,'Pisco para tomar',18,1,1),(4,'Whiskey',295,50.00,'Whiskey a las rocas',18,1,1),(5,'Vodka',30,35.00,'Vodka sabor manzana',18,1,1),(6,'Salchichas',100,4.00,'Salchichas con mas tamaño',18,2,1);
/*!40000 ALTER TABLE `mae_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mae_usuario`
--

DROP TABLE IF EXISTS `mae_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mae_usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mae_usuario`
--

LOCK TABLES `mae_usuario` WRITE;
/*!40000 ALTER TABLE `mae_usuario` DISABLE KEYS */;
INSERT INTO `mae_usuario` VALUES (1,'Adrian','Calderon','adrito','calderonbegazo','913066846',1),(6,'jordy','turpo','jordyenp','1234','912099345',1),(7,'Emmanuel','Salamanca','fastor','michulin','955026431',1);
/*!40000 ALTER TABLE `mae_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trs_detalle_facturacion`
--

DROP TABLE IF EXISTS `trs_detalle_facturacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trs_detalle_facturacion` (
  `idDetalleFacturacion` int NOT NULL AUTO_INCREMENT,
  `idVentaFacturacion` int NOT NULL,
  `idProducto` int NOT NULL,
  `cantidad` int NOT NULL,
  `precioUnitario` double(10,2) NOT NULL,
  `subtotal` double(10,2) NOT NULL,
  `descuento` double(10,2) NOT NULL,
  `IGV` double(10,2) NOT NULL,
  `totalPagar` double(10,2) NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idDetalleFacturacion`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trs_detalle_facturacion`
--

LOCK TABLES `trs_detalle_facturacion` WRITE;
/*!40000 ALTER TABLE `trs_detalle_facturacion` DISABLE KEYS */;
INSERT INTO `trs_detalle_facturacion` VALUES (1,1,1,1,500.50,500.50,0.00,0.00,500.50,1),(2,1,2,2,100.00,200.00,0.00,0.00,200.00,1),(3,2,1,2,500.50,1001.00,0.00,0.00,1001.00,1),(4,2,2,3,100.00,300.00,0.00,0.00,300.00,1),(5,3,1,1,500.50,500.50,0.00,90.09,590.59,1),(6,3,3,4,5.00,20.00,0.00,0.00,20.00,1),(7,3,4,3,50.00,150.00,0.00,0.00,150.00,1),(8,3,2,1,100.00,100.00,0.00,18.00,118.00,1),(9,4,1,2,500.50,1001.00,0.00,180.18,1181.18,1),(10,4,4,2,50.00,100.00,0.00,18.00,118.00,1);
/*!40000 ALTER TABLE `trs_detalle_facturacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trs_venta_facturacion`
--

DROP TABLE IF EXISTS `trs_venta_facturacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trs_venta_facturacion` (
  `idVentaFacturacion` int NOT NULL AUTO_INCREMENT,
  `idCliente` int NOT NULL,
  `valorPagar` double(10,2) NOT NULL,
  `fechaVenta` date NOT NULL,
  `estado` int NOT NULL,
  PRIMARY KEY (`idVentaFacturacion`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trs_venta_facturacion`
--

LOCK TABLES `trs_venta_facturacion` WRITE;
/*!40000 ALTER TABLE `trs_venta_facturacion` DISABLE KEYS */;
INSERT INTO `trs_venta_facturacion` VALUES (1,1,700.50,'2023-06-27',1),(2,1,1301.00,'2023-06-27',1),(3,3,878.59,'2023-06-27',0),(4,1,1299.18,'2023-06-28',1);
/*!40000 ALTER TABLE `trs_venta_facturacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-28  2:40:17
