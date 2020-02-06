CREATE DATABASE  IF NOT EXISTS `creditcard` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `creditcard`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: creditcard
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `accounts` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `cardId` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`accountId`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `fk_contacts_creditcards_cardId_idx` (`cardId`),
  CONSTRAINT `fk_contacts_creditcards_cardId` FOREIGN KEY (`cardId`) REFERENCES `creditcards` (`cardId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `applications`
--

DROP TABLE IF EXISTS `applications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `applications` (
  `applicationId` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) NOT NULL,
  `questionId` tinyint(1) NOT NULL,
  `word` varchar(45) NOT NULL,
  PRIMARY KEY (`applicationId`),
  KEY `fk_applications_customers_customerId_idx` (`customerId`),
  KEY `fk_applications_security_questions_questionId_idx` (`questionId`),
  CONSTRAINT `fk_applications_customers_customerId` FOREIGN KEY (`customerId`) REFERENCES `customers` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_applications_security_questions_questionId` FOREIGN KEY (`questionId`) REFERENCES `security_questions` (`questionId`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applications`
--

LOCK TABLES `applications` WRITE;
/*!40000 ALTER TABLE `applications` DISABLE KEYS */;
/*!40000 ALTER TABLE `applications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacts`
--

DROP TABLE IF EXISTS `contacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `contacts` (
  `contactId` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `apt` varchar(20) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  `zipcode` varchar(5) DEFAULT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`contactId`),
  KEY `fk_contacts_customers_customerId_idx` (`customerId`),
  CONSTRAINT `fk_contacts_customers_customerId` FOREIGN KEY (`customerId`) REFERENCES `customers` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacts`
--

LOCK TABLES `contacts` WRITE;
/*!40000 ALTER TABLE `contacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `creditcards`
--

DROP TABLE IF EXISTS `creditcards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `creditcards` (
  `cardId` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) NOT NULL,
  `cardNo` varchar(16) NOT NULL,
  `cvv` varchar(3) NOT NULL,
  `creditLimit` int(11) DEFAULT '0',
  `activationStatus` tinyint(1) DEFAULT '0',
  `approvedDate` date NOT NULL,
  `expirationDate` date DEFAULT NULL,
  PRIMARY KEY (`cardId`),
  UNIQUE KEY `cardNo_UNIQUE` (`cardNo`),
  KEY `fk_creditcards_customers_customerId_idx` (`customerId`),
  CONSTRAINT `fk_creditcards_customers_customerId` FOREIGN KEY (`customerId`) REFERENCES `customers` (`customerId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `creditcards`
--

LOCK TABLES `creditcards` WRITE;
/*!40000 ALTER TABLE `creditcards` DISABLE KEYS */;
/*!40000 ALTER TABLE `creditcards` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customers` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) NOT NULL,
  `middleName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) NOT NULL,
  `ssn` varchar(9) NOT NULL,
  `birthDate` date NOT NULL,
  `annualIncome` int(11) NOT NULL,
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `ssn_UNIQUE` (`ssn`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `security_questions`
--

DROP TABLE IF EXISTS `security_questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `security_questions` (
  `questionId` tinyint(1) NOT NULL,
  `question` varchar(70) NOT NULL,
  PRIMARY KEY (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `security_questions`
--

LOCK TABLES `security_questions` WRITE;
/*!40000 ALTER TABLE `security_questions` DISABLE KEYS */;
INSERT INTO `security_questions` VALUES (1,'What was the house number and street name you lived in as a child?'),(2,'What were the last four digits of your childhood telephone number?'),(3,'What primary school did you attend?'),(4,'In what town or city was your first full time job?'),(5,'In what town or city did you meet your spouse/partner?'),(6,'What is the middle name of your oldest child?');
/*!40000 ALTER TABLE `security_questions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-30  0:03:57
