/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.21 : Database - evaluationmanager
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`evaluationmanager` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `evaluationmanager`;

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `classNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `major` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;

/*Data for the table `class` */

insert  into `class`(`id`,`classNo`,`NAME`,`major`) values (1,'3503811','一班','350381'),(2,'3503812','二班','350381'),(3,'3503813','三班','350381'),(4,'3503821','一班','350382'),(5,'3503822','二班','350382'),(6,'3503823','三班','350382'),(7,'3503911','一班','350391'),(8,'3503912','二班','350391'),(9,'3503913','三班','350391'),(10,'3503921','一班','350392'),(11,'3503922','二班','350392'),(12,'3503923','三班','350392'),(13,'3503931','一班','350393'),(14,'3503932','二班','350393'),(15,'3503933','三班','350393'),(16,'3503934','四班','350393'),(17,'3504011','一班','350401'),(18,'3504012','二班','350401'),(19,'3504021','一班','350402'),(20,'3504022','二班','350402'),(21,'3504031','一班','350403'),(22,'3504032','二班','350403'),(23,'3504041','一班','350404'),(24,'3504042','二班','350404'),(25,'3504111','一班','350411'),(26,'3504112','二班','350411'),(27,'3504113','三班','350411'),(28,'3504121','一班','350412'),(29,'3504122','二班','350412'),(30,'3504131','一班','350413'),(31,'3504132','二班','350413'),(32,'3504141','一班','350414'),(33,'3504142','二班','350414'),(34,'3504211','一班','350421'),(35,'3504212','二班','350421'),(36,'3504221','一班','350422'),(37,'3504222','二班','350422'),(38,'3504231','一班','350423'),(39,'3504232','二班','350423'),(40,'3504241','一班','350424'),(41,'3504242','二班','350424'),(42,'3504311','一班','350431'),(43,'3504312','二班','350431'),(44,'3504321','一班','350432'),(45,'3504322','二班','350432'),(46,'3504331','一班','350433'),(47,'3504332','二班','350433'),(48,'3504341','一班','350434'),(49,'3504342','二班','350434'),(50,'3504411','一班','350441'),(51,'3504412','二班','350441'),(52,'3504421','一班','350442'),(53,'3504422','二班','350442'),(54,'3504431','一班','350443'),(55,'3504432','二班','350443'),(56,'3504441','一班','350444'),(57,'3504442','二班','350444'),(58,'3504511','一班','350451'),(59,'3504512','二班','350451'),(60,'3504521','一班','350452'),(61,'3504522','二班','350452'),(62,'3504531','一班','350453'),(63,'3504532','二班','350453'),(64,'3504611','一班','350461'),(65,'3504612','二班','350461'),(66,'3504621','一班','350462'),(67,'3504622','二班','350462'),(68,'3504711','一班','350471'),(69,'3504712','二班','350471'),(70,'3504811','一班','350481'),(71,'3504812','二班','350481'),(72,'3504821','一班','350482'),(73,'3504822','二班','350482'),(74,'3504831','一班','350483'),(75,'3504832','二班','350483'),(76,'3504911','一班','350491'),(77,'3504912','二班','350491'),(78,'3504921','一班','350492'),(79,'3504922','二班','350492'),(80,'3505011','一班','350501'),(81,'3505012','二班','350501'),(82,'3505021','一班','350502'),(83,'3505022','二班','350502'),(84,'3505031','一班','350503'),(85,'3505032','二班','350503'),(86,'3505041','一班','350504'),(87,'3505042','二班','350504');

/*Table structure for table `code` */

DROP TABLE IF EXISTS `code`;

CREATE TABLE `code` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `codeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `typeNo` varchar(16) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codeNo` (`codeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

/*Data for the table `code` */

insert  into `code`(`id`,`codeNo`,`NAME`,`description`,`typeNo`) values (1,'35038','管理系',NULL,'1'),(2,'35039','经济贸易系',NULL,'1'),(3,'35040','信息工程系',NULL,'1'),(4,'35041','建筑工程系',NULL,'1'),(5,'35042','食品与药品工程系',NULL,'1'),(6,'35043','机电工程系',NULL,'1'),(7,'35044','电气与电子工程系',NULL,'1'),(8,'35045','艺术设计系',NULL,'1'),(9,'35046','体育系',NULL,'1'),(10,'35047','动画学院',NULL,'1'),(11,'35048','马克思主义学院',NULL,'1'),(12,'35049','继续教育学院',NULL,'1'),(13,'35050','软件学院',NULL,'1'),(14,'350381','连锁经营管理',NULL,'2'),(15,'350382','物流管理',NULL,'2'),(16,'350391','国际贸易实务',NULL,'2'),(17,'350392','营销与策划',NULL,'2'),(18,'350393','电子商务',NULL,'2'),(19,'350401','计算机应用技术',NULL,'2'),(20,'350402','计算机网络技术',NULL,'2'),(21,'350403','计算机信息管理',NULL,'2'),(22,'350404','信息安全技术',NULL,'2'),(23,'350411','建筑设计技术',NULL,'2'),(24,'350412','工程造价',NULL,'2'),(25,'350413','房地产经营与估价',NULL,'2'),(26,'350414','建筑工程管理',NULL,'2'),(27,'350421','生物制药技术',NULL,'2'),(28,'350422','化学制药',NULL,'2'),(29,'350423','药品经营与管理',NULL,'2'),(30,'350424','精细化学品生产',NULL,'2'),(31,'350431','机械制造与自动化',NULL,'2'),(32,'350432','数控技术',NULL,'2'),(33,'350433','机电一体化技术',NULL,'2'),(34,'350434','模具设计与制造',NULL,'2'),(35,'350441','电气自动化',NULL,'2'),(36,'350442','汽车检测与维修',NULL,'2'),(37,'350443','汽车技术服务与营销',NULL,'2'),(38,'350451','装饰艺术设计',NULL,'2'),(39,'350452','影视动画',NULL,'2'),(40,'350453','数字传媒艺术',NULL,'2'),(41,'350461','体育教育',NULL,'2'),(42,'350462','社会体育',NULL,'2'),(43,'350471','动漫设计与制作',NULL,'2'),(44,'350472','影视动画',NULL,'2'),(45,'350481','马克思主义哲学',NULL,'2'),(46,'350482','马克思主义政治学',NULL,'2'),(47,'350483','马克思主义经济学原理',NULL,'2'),(48,'350491','商务英语',NULL,'2'),(49,'350492','文秘',NULL,'2'),(50,'350501','UI设计',NULL,'2'),(51,'350502','网络系统管理',NULL,'2'),(52,'350503','网站开发',NULL,'2'),(53,'350504','电子商务',NULL,'2');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `courseNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `courseNo` (`courseNo`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `dept_major` */

DROP TABLE IF EXISTS `dept_major`;

CREATE TABLE `dept_major` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `deptNo` varchar(16) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `dept_major` */

insert  into `dept_major`(`id`,`deptNo`,`name`,`description`) values (1,'35038','连锁经营管理',NULL),(2,'35038','物流管理',NULL),(3,'35038','采购供应管理',NULL),(4,'35039','会计电算化',NULL),(5,'35039','国际贸易实务',NULL),(6,'35039','营销与策划',NULL),(7,'35039','电子商务',NULL),(8,'35040','计算机应用技术',NULL),(9,'35040','计算机网络技术',NULL),(10,'35040','计算机信息管理',NULL),(11,'35040','信息安全技术',NULL),(12,'35041','建筑设计技术',NULL),(13,'35041','建筑工程技术',NULL),(14,'35041','工程造价',NULL),(15,'35041','房地产经营与估价',NULL),(16,'35041','建筑工程管理',NULL),(17,'35042','生物制药技术',NULL),(18,'35042','化学制药技术',NULL),(19,'35042','药品经营与管理',NULL),(20,'35042','精细化学品生产',NULL),(21,'35043','机械制造与自动化',NULL),(22,'35043','数控技术',NULL),(23,'35043','机电一体化技术',NULL),(24,'35043','模具设计与制造',NULL),(25,'35044','电气自动化',NULL),(26,'35044','汽车检测与维修',NULL),(27,'35044','汽车技术服务与营销',NULL),(28,'35045','装饰艺术设计',NULL),(29,'35045','影视动画',NULL),(30,'35045','数字传媒艺术',NULL),(31,'35046','体育教育',NULL),(32,'35046','社会体育',NULL),(33,'35047','动漫设计与制作',NULL),(34,'35047','影视动画',NULL),(35,'35048','马克思主义哲学',NULL),(36,'35048','马克思主义政治学',NULL),(37,'35048','马克思主义经济学原理',NULL),(38,'35049','商务英语',NULL),(39,'35049','文秘',NULL),(40,'35050','UI设计',NULL),(41,'35050','网络系统管理',NULL),(42,'35050','网站开发',NULL),(43,'35050','电子商务',NULL);

/*Table structure for table `evaluation_info` */

DROP TABLE IF EXISTS `evaluation_info`;

CREATE TABLE `evaluation_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paper` varchar(16) NOT NULL,
  `user` varchar(16) NOT NULL,
  `teacher` varchar(16) NOT NULL,
  `time` timestamp NOT NULL,
  `options` varchar(50) NOT NULL,
  `score` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `evaluation_info` */

/*Table structure for table `evaluation_record` */

DROP TABLE IF EXISTS `evaluation_record`;

CREATE TABLE `evaluation_record` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `startTime` datetime NOT NULL,
  `endTime` datetime NOT NULL,
  `paper` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `evaluation_record` */

/*Table structure for table `login_log` */

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(16) NOT NULL,
  `loginTime` date NOT NULL,
  `ip` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `login_log` */

/*Table structure for table `operation_log` */

DROP TABLE IF EXISTS `operation_log`;

CREATE TABLE `operation_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(16) NOT NULL,
  `operationTime` date NOT NULL,
  `operation` varchar(200) NOT NULL,
  `state` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `operation_log` */

/*Table structure for table `option` */

DROP TABLE IF EXISTS `option`;

CREATE TABLE `option` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `optionNo` varchar(16) NOT NULL,
  `option` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `option` */

/*Table structure for table `option_option` */

DROP TABLE IF EXISTS `option_option`;

CREATE TABLE `option_option` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `question` varchar(16) NOT NULL,
  `option` varchar(16) NOT NULL,
  `letter` varchar(2) NOT NULL,
  `ratio` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `option_option` */

/*Table structure for table `paper` */

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paperNo` varchar(16) NOT NULL,
  `type` varchar(16) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `paperNo` (`paperNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper` */

/*Table structure for table `paper_question` */

DROP TABLE IF EXISTS `paper_question`;

CREATE TABLE `paper_question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paper` varchar(16) NOT NULL,
  `question` varchar(16) NOT NULL,
  `number` int(2) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_question` */

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `questionNO` varchar(16) NOT NULL,
  `question` varchar(255) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `questionNO` (`questionNO`),
  UNIQUE KEY `question` (`question`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question` */

/*Table structure for table `role_power` */

DROP TABLE IF EXISTS `role_power`;

CREATE TABLE `role_power` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `departmentNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `departmentNo` (`departmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_power` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `stuNo` varchar(20) NOT NULL,
  `USER` varchar(16) NOT NULL,
  `major` varchar(16) NOT NULL,
  `joinTime` date NOT NULL,
  `overTime` date DEFAULT NULL,
  `state` varchar(16) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stuNo` (`stuNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

/*Table structure for table `student_class` */

DROP TABLE IF EXISTS `student_class`;

CREATE TABLE `student_class` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `student` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_class` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacherNo` varchar(16) NOT NULL,
  `USER` varchar(16) NOT NULL,
  `role` varchar(16) NOT NULL,
  `major` varchar(16) NOT NULL,
  `state` varchar(16) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `teacherNo` (`teacherNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

/*Table structure for table `teacher_class_course` */

DROP TABLE IF EXISTS `teacher_class_course`;

CREATE TABLE `teacher_class_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  `course` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher_class_course` */

/*Table structure for table `teacher_course` */

DROP TABLE IF EXISTS `teacher_course`;

CREATE TABLE `teacher_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(10) NOT NULL,
  `course` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher_course` */

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `typeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `typeNo` (`typeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `type` */

insert  into `type`(`id`,`typeNo`,`NAME`,`description`) values (1,'1','院系',NULL),(2,'2','专业',NULL),(3,'3','角色',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
