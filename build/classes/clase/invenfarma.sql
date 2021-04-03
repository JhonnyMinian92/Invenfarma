/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.3.16-MariaDB : Database - invenfarma
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`invenfarma` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `invenfarma`;

/*Table structure for table `inventario` */

DROP TABLE IF EXISTS `inventario`;

CREATE TABLE `inventario` (
  `id_inven` int(11) NOT NULL AUTO_INCREMENT,
  `cant_inven` int(11) DEFAULT NULL,
  `id_prod` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_inven`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `inventario` */

insert  into `inventario`(`id_inven`,`cant_inven`,`id_prod`) values (1,10,1),(2,5,1),(3,8,2),(4,7,2),(5,5,1),(6,6,2);

/*Table structure for table `producto` */

DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `id_prod` int(11) NOT NULL AUTO_INCREMENT,
  `nom_prod` varchar(50) DEFAULT NULL,
  `tipo_prod` int(11) DEFAULT NULL,
  `peso_prod` int(11) DEFAULT NULL,
  `marca_prod` varchar(50) DEFAULT NULL,
  `lote_prod` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_prod`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `producto` */

insert  into `producto`(`id_prod`,`nom_prod`,`tipo_prod`,`peso_prod`,`marca_prod`,`lote_prod`) values (1,'Paracetamol',1,1,'Generico','EL5350'),(2,'Tempra',2,2,'Generico','AV400R');

/*Table structure for table `usuarios` */

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nom_user` varchar(30) DEFAULT NULL,
  `pas_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `usuarios` */

insert  into `usuarios`(`id_user`,`nom_user`,`pas_user`) values (1,'jminan','12345');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
