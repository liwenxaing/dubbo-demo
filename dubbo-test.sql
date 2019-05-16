/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.1.73 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `ment` */

DROP TABLE IF EXISTS `ment`;

CREATE TABLE `ment` (
  `bid` int(9) NOT NULL COMMENT '部门编号',
  `bname` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '部门名称',
  `logical_deletion` tinyint(1) NOT NULL COMMENT '是否被删除(0否1是)',
  PRIMARY KEY (`bid`),
  KEY `bname` (`bname`(5)),
  KEY `bid` (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `ment` */

insert  into `ment`(`bid`,`bname`,`logical_deletion`) values (1001,'技术部',0),(1002,'财务部',0),(1003,'就业部',0),(1004,'会计部',0),(1005,'激光部',0),(1006,'研发部',0);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `pk_id` int(9) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `name` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '员工姓名',
  `age` tinyint(3) NOT NULL COMMENT '员工年龄',
  `in_date` datetime NOT NULL COMMENT '进入公司日期',
  `bid` int(11) NOT NULL COMMENT '部门id 编号',
  `gender` tinyint(1) NOT NULL COMMENT '员工性别',
  PRIMARY KEY (`pk_id`),
  KEY `bid` (`bid`),
  KEY `age` (`age`),
  KEY `gender` (`gender`),
  KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `staff` */

insert  into `staff`(`pk_id`,`name`,`age`,`in_date`,`bid`,`gender`) values (1,'李文祥',19,'2019-05-29 00:00:00',1001,0),(2,'张三丰',20,'2019-05-21 00:00:00',1002,0),(3,'小红',20,'2019-04-30 00:00:00',1001,1),(4,'李四',20,'2019-05-10 00:00:00',1003,0),(5,'王五',22,'2019-05-26 00:00:00',1001,0),(6,'小青',21,'2019-11-10 00:00:00',1002,1),(7,'李大状',22,'2019-03-28 00:00:00',1001,0),(8,'火龙谷',20,'2019-05-09 00:00:00',1002,0),(10,'大象',20,'2019-05-15 00:00:00',1002,0),(11,'丁宁宁',22,'2019-05-13 10:16:40',1004,1),(12,'杨柯凡',100,'2019-05-27 10:25:45',1005,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
