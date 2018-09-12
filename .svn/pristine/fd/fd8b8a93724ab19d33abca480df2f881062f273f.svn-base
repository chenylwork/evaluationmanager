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
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKc7gu3o4cguwm0677gsndh2cx4` (`classNo`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8;

/*Data for the table `class` */

insert  into `class`(`id`,`classNo`,`NAME`,`major`) values (1,'3503811','连锁经营管理一班','350381'),(2,'3503812','连锁经营管理二班','350381'),(3,'3503813','连锁经营管理三班','350381'),(4,'3503821','物流管理一班','350382'),(5,'3503822','物流管理二班','350382'),(6,'3503823','物流管理三班','350382'),(7,'3503911','国际贸易实务一班','350391'),(8,'3503912','国际贸易实务二班','350391'),(9,'3503913','国际贸易实务三班','350391'),(10,'3503921','营销与策划一班','350392'),(11,'3503922','营销与策划二班','350392'),(12,'3503923','营销与策划三班','350392'),(13,'3503931','电子商务一班','350393'),(14,'3503932','电子商务二班','350393'),(15,'3503933','电子商务三班','350393'),(16,'3503934','电子商务四班','350393'),(17,'3504011','计算机应用技术一班','350401'),(18,'3504012','计算机应用技术二班','350401'),(19,'3504021','计算机网络技术一班','350402'),(20,'3504022','计算机网络技术二班','350402'),(21,'3504031','计算机信息管理一班','350403'),(22,'3504032','计算机信息管理二班','350403'),(23,'3504041','信息安全技术一班','350404'),(24,'3504042','信息安全技术二班','350404'),(25,'3504111','建筑设计技术一班','350411'),(26,'3504112','建筑设计技术二班','350411'),(27,'3504113','建筑设计技术三班','350411'),(28,'3504121','工程造价一班','350412'),(29,'3504122','工程造价二班','350412'),(30,'3504131','房地产经营与估价一班','350413'),(31,'3504132','房地产经营与估价二班','350413'),(32,'3504141','建筑工程管理一班','350414'),(33,'3504142','建筑工程管理二班','350414'),(34,'3504211','生物制药技术一班','350421'),(35,'3504212','生物制药技术二班','350421'),(36,'3504221','化学制药技术一班','350422'),(37,'3504222','化学制药技术二班','350422'),(38,'3504231','药品经营与管理一班','350423'),(39,'3504232','药品经营与管理二班','350423'),(40,'3504241','精细化学品生产一班','350424'),(41,'3504242','精细化学品生产二班','350424'),(42,'3504311','机械制造与自动化一班','350431'),(43,'3504312','机械制造与自动化二班','350431'),(44,'3504321','数控技术一班','350432'),(45,'3504322','数控技术二班','350432'),(46,'3504331','机电一体化技术一班','350433'),(47,'3504332','机电一体化技术二班','350433'),(48,'3504341','模具设计与制造一班','350434'),(49,'3504342','模具设计与制造二班','350434'),(50,'3504411','电气自动化一班','350441'),(51,'3504412','电气自动化二班','350441'),(52,'3504421','汽车检测与维修一班','350442'),(53,'3504422','汽车检测与维修二班','350442'),(54,'3504431','汽车技术服务与营销一班','350443'),(55,'3504432','汽车技术服务与营销二班','350443'),(56,'3504441','一班','350444'),(57,'3504442','二班','350444'),(58,'3504511','装饰艺术设计一班','350451'),(59,'3504512','装饰艺术设计二班','350451'),(60,'3504521','影视动画一班','350452'),(61,'3504522','影视动画二班','350452'),(62,'3504531','数字传媒艺术一班','350453'),(63,'3504532','数字传媒艺术二班','350453'),(64,'3504611','体育教育一班','350461'),(65,'3504612','体育教育二班','350461'),(66,'3504621','社会体育一班','350462'),(67,'3504622','社会体育二班','350462'),(68,'3504711','动漫设计与制作一班','350471'),(69,'3504712','动漫设计与制作二班','350471'),(70,'3504811','马克思主义哲学一班','350481'),(71,'3504812','马克思主义哲学二班','350481'),(72,'3504821','马克思主义政治学一班','350482'),(73,'3504822','马克思主义政治学二班','350482'),(74,'3504831','马克思主义经济学原理一班','350483'),(75,'3504832','马克思主义经济学原理二班','350483'),(76,'3504911','商务英语一班','350491'),(77,'3504912','商务英语二班','350491'),(78,'3504921','文秘一班','350492'),(79,'3504922','文秘二班','350492'),(80,'3505011','UI设计一班','350501'),(81,'3505012','UI设计二班','350501'),(82,'3505021','网络系统管理一班','350502'),(83,'3505022','网络系统管理二班','350502'),(84,'3505031','网站开发一班','350503'),(85,'3505032','网站开发二班','350503'),(86,'3505041','一班','350504'),(87,'3505042','二班','350504'),(88,'3503939','自增长','350393'),(89,'2222333','乒乓球一般班','2222333');

/*Table structure for table `code` */

DROP TABLE IF EXISTS `code`;

CREATE TABLE `code` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `codeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `typeNo` varchar(16) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codeNo` (`codeNo`),
  UNIQUE KEY `UKlya03ys01kh916009e314httl` (`codeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8;

/*Data for the table `code` */

insert  into `code`(`id`,`codeNo`,`NAME`,`description`,`typeNo`) values (1,'35038','管理系','院系类别','1'),(2,'35039','经济贸易系','院系类别','1'),(3,'35040','信息工程系','院系类别','1'),(4,'35041','建筑工程系','院系类别','1'),(5,'35042','食品与药品工程系','院系类别','1'),(6,'35043','机电工程系','院系类别','1'),(7,'35044','电气与电子工程系','院系类别','1'),(8,'35045','艺术设计系','院系类别','1'),(9,'35046','体育系','院系类别','1'),(10,'35047','动画学院','院系类别','1'),(11,'35048','马克思主义学院','院系类别','1'),(12,'35049','继续教育学院','院系类别','1'),(13,'35050','软件学院','院系类','1'),(59,'0','男','性别类型','4'),(60,'1','女','性别类型','4'),(61,'TS1','任职','老师状态','5'),(62,'TS2','离职','老师状态','5'),(63,'TS3','请假','老师状态','5'),(64,'SS1','在校','学生状态','6'),(65,'SS2','离校','学生状态','6'),(66,'SS3','请假','学生状态','6'),(67,'P1','常规测评','测评类型','7'),(68,'P2','统一测评','测评类型','7'),(69,'R00','管理员','用户类型','3'),(72,'R01','教师','用户类型','3'),(73,'R02','学生','用户类型','3'),(74,'Y01','院领导','角色(权限)','8'),(77,'Y02','系领导','角色(权限)','8'),(78,'Y03','教师','角色(权限)','8'),(116,'Y04','学生','角色(权限)','8'),(118,'Q','前台界面','界面类型','9'),(119,'H','后台界面','界面类型','9'),(123,'222333','体育运动系','新添加的一个体育西','1');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `courseNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `courseNo` (`courseNo`),
  UNIQUE KEY `NAME` (`NAME`),
  UNIQUE KEY `UKo0hh8l6jkv4bi2ddg3v5cuemk` (`courseNo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`id`,`courseNo`,`NAME`) values (1,'c001','Java Web'),(2,'c002','HTML5+CSS3'),(3,'c003','JQuery'),(4,'c004','Java Script'),(5,'c005','基础会计学'),(6,'c006','经济法概论'),(7,'c007','高等数学'),(8,'c008','基础英语'),(9,'c009','毛泽东思想概论'),(10,'c010','思想道德修养与法律基础');

/*Table structure for table `evaluation_info` */

DROP TABLE IF EXISTS `evaluation_info`;

CREATE TABLE `evaluation_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paper` varchar(16) NOT NULL,
  `user` varchar(16) NOT NULL,
  `teacher` varchar(16) NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `options` varchar(50) NOT NULL,
  `score` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `evaluation_info` */

insert  into `evaluation_info`(`id`,`paper`,`user`,`teacher`,`time`,`options`,`score`) values (1,'1226955136','songyixue','renqizhong','2018-08-26 02:31:07','AAAAAAAAAA',98),(2,'1226955136','songyixue','renqizhong','2018-08-27 21:24:51','AAAAAAAAAA',98),(3,'589479987','songyixue','renqizhong','2018-08-27 22:58:25','AAAAAAAAAA',98),(4,'589479987','songyixue','hanruoyi','2018-08-27 23:13:40','AAAAAAAAAA',98),(5,'589479987','songyixue','yuhao','2018-08-27 23:16:21','AAAAAAAAAA',98),(6,'674401836','songyixue','hanruoyi','2018-08-27 23:18:25','AAAAAAAAAA',100),(7,'1226970113','songyixue','hanruoyi','2018-08-27 23:19:33','AAAAAAAAAA',100),(8,'674401836','songyixue','yuhao','2018-08-27 23:22:23','AAAAAAAAAA',100);

/*Table structure for table `login_log` */

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(16) NOT NULL,
  `loginTime` date NOT NULL,
  `ip` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=utf8;

/*Data for the table `login_log` */

insert  into `login_log`(`id`,`user`,`loginTime`,`ip`) values (1,'gengjiaqi','2018-08-10','172.16.6.22'),(2,'gengjiaqi','2018-08-10','172.16.6.22'),(3,'gengjiaqi','2018-08-10','172.16.6.22'),(4,'gengjiaqi','2018-08-10','172.16.6.22'),(5,'gaolegao','2018-08-10','192.168.2.1'),(6,'gengjiaqi','2018-08-13','172.16.6.22'),(9,'songyixue','2018-08-13','172.16.6.20'),(10,'songyixue','2018-08-13','172.16.6.20'),(11,'songyixue','2018-08-13','172.16.6.20'),(12,'gengjiaqi','2018-08-14','172.16.6.21'),(13,'songyixue','2018-08-14','172.16.6.21'),(14,'songyixue','2018-08-14','172.16.6.21'),(15,'songyixue','2018-08-14','172.16.6.21'),(16,'songyixue','2018-08-14','172.16.6.21'),(17,'songyixue','2018-08-14','172.16.6.21'),(18,'songyixue','2018-08-14','172.16.6.21'),(19,'songyixue','2018-08-14','172.16.6.21'),(20,'songyixue','2018-08-14','172.16.6.21'),(24,'songyixue','2018-08-17','172.16.6.20'),(25,'songyixue','2018-08-17','172.16.6.20'),(26,'songyixue','2018-08-17','172.16.6.22'),(27,'songyixue','2018-08-17','172.16.6.22'),(28,'songyixue','2018-08-17','172.16.6.22'),(29,'songyixue','2018-08-17','172.16.6.22'),(30,'songyixue','2018-08-17','172.16.6.22'),(31,'songyixue','2018-08-17','172.16.6.22'),(32,'songyixue','2018-08-17','172.16.6.37'),(33,'songyixue','2018-08-17','172.16.6.22'),(34,'songyixue','2018-08-17','172.16.6.22'),(35,'songyixue','2018-08-17','172.16.6.22'),(36,'songyixue','2018-08-17','172.16.6.22'),(67,'1635050349','2018-08-20','172.16.6.20'),(68,'songyixue','2018-08-20','172.16.6.20'),(69,'songyixue','2018-08-20','172.16.6.20'),(70,'songyixue','2018-08-20','172.16.6.20'),(71,'songyixue','2018-08-20','172.16.6.20'),(72,'songyixue','2018-08-21','172.16.6.22'),(73,'songyixue','2018-08-21','172.16.6.22'),(74,'songyixue','2018-08-21','172.16.6.22'),(75,'1635050331','2018-08-21','172.16.6.22'),(76,'1635050331','2018-08-21','172.16.6.22'),(77,'1635050331','2018-08-21','172.16.6.22'),(78,'songyixue','2018-08-21','172.16.6.22'),(79,'songyixue','2018-08-21','172.16.6.22'),(80,'songyixue','2018-08-21','172.16.6.22'),(81,'songyixue','2018-08-21','172.16.6.22'),(82,'songyixue','2018-08-21','172.16.6.22'),(83,'songyixue','2018-08-23','172.16.6.20'),(84,'songyixue','2018-08-23','172.16.6.20'),(85,'songyixue','2018-08-23','172.16.6.20'),(86,'songyixue','2018-08-23','172.16.6.20'),(87,'songyixue','2018-08-23','172.16.6.20'),(88,'songyixue','2018-08-24','172.16.6.20'),(89,'1635050349','2018-08-24','172.16.6.20'),(90,'1635050349','2018-08-24','172.16.6.20'),(91,'1635050349','2018-08-24','172.16.6.20'),(92,'songyixue','2018-08-24','172.16.6.20'),(93,'songyixue','2018-08-24','172.16.6.20'),(94,'songyixue','2018-08-27','172.16.6.22'),(95,'1635050331','2018-08-27','172.16.6.22'),(96,'1635050966','2018-08-27','172.16.6.22'),(97,'songyixue','2018-08-27','172.16.6.22'),(98,'1635050966','2018-08-27','172.16.6.22'),(99,'1635050966','2018-08-27','172.16.6.22'),(100,'1635050966','2018-08-27','172.16.6.22'),(101,'songyixue','2018-08-27','169.254.24.175'),(102,'songyixue','2018-08-27','169.254.24.175'),(103,'songyixue','2018-08-27','169.254.24.175'),(104,'songyixue','2018-08-27','169.254.24.175'),(105,'songyixue','2018-08-27','169.254.24.175'),(106,'songyixue','2018-08-27','169.254.24.175'),(107,'songyixue','2018-08-27','169.254.24.175'),(108,'songyixue','2018-08-27','169.254.24.175'),(109,'songyixue','2018-08-27','169.254.24.175'),(110,'songyixue','2018-08-28','169.254.24.175'),(111,'songyixue','2018-08-28','169.254.24.175'),(112,'songyixue','2018-08-28','169.254.24.175'),(113,'songyixue','2018-08-28','169.254.24.175'),(114,'songyixue','2018-08-28','169.254.24.175'),(115,'songyixue','2018-08-28','169.254.24.175');

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `deptNo` varchar(16) NOT NULL,
  `majorNo` varchar(16) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`id`,`deptNo`,`majorNo`,`name`,`description`) values (6,'35039','350392','营销与策划','大大'),(7,'35039','350393','电子商务',NULL),(8,'35040','350401','计算机应用技术',NULL),(9,'35040','350402','计算机网络技术',NULL),(10,'35040','350403','计算机信息管理',NULL),(11,'35040','350404','信息安全技术',NULL),(12,'35041','350411','建筑设计技术',NULL),(13,'35041','350415','建筑工程技术',NULL),(14,'35041','350412','工程造价',NULL),(15,'35041','350413','房地产经营与估价','大大'),(16,'35041','350414','建筑工程管理',NULL),(17,'35042','350421','生物制药技术',NULL),(18,'35042','350422','化学制药技术',NULL),(19,'35042','350423','药品经营与管理',NULL),(20,'35042','350424','精细化学品生产',NULL),(21,'35043','350431','机械制造与自动化',NULL),(22,'35043','350432','数控技术',NULL),(23,'35043','350433','机电一体化技术',NULL),(24,'35043','350434','模具设计与制造',NULL),(25,'35044','350441','电气自动化',NULL),(26,'35044','350442','汽车检测与维修',NULL),(27,'35044','350443','汽车技术服务与营销',NULL),(28,'35045','350451','装饰艺术设计',NULL),(29,'35045','350452','影视动画',NULL),(30,'35045','350453','数字传媒艺术',NULL),(31,'35046','350461','体育教育',NULL),(32,'35046','350462','社会体育',NULL),(33,'35047','350471','动漫设计与制作',NULL),(35,'35048','350481','马克思主义哲学',NULL),(36,'35048','350482','马克思主义政治学',NULL),(37,'35048','350483','马克思主义经济学原理',NULL),(38,'35049','350491','商务英语',NULL),(39,'35049','350492','文秘',NULL),(40,'35050','350501','UI设计',NULL),(41,'35050','350502','网络系统管理',NULL),(42,'35050','350503','网站开发11','自知则知之'),(45,'222333','2222333','乒乓球专业','专业信息');

/*Table structure for table `newmajor` */

DROP TABLE IF EXISTS `newmajor`;

CREATE TABLE `newmajor` (
  `id` int(10) NOT NULL DEFAULT '0',
  `deptNo` varchar(16) NOT NULL,
  `majorNo` varchar(16) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `newmajor` */

insert  into `newmajor`(`id`,`deptNo`,`majorNo`,`name`,`description`) values (6,'35039','350392','营销与策划1','大大'),(7,'35039','350393','电子商务',NULL),(8,'35040','350401','计算机应用技术',NULL),(9,'35040','350402','计算机网络技术',NULL),(10,'35040','350403','计算机信息管理',NULL),(11,'35040','350404','信息安全技术',NULL),(12,'35041','350411','建筑设计技术',NULL),(13,'35041','350415','建筑工程技术',NULL),(14,'35041','350412','工程造价',NULL),(15,'35041','350413','房地产经营与估价','大大'),(16,'35041','350414','建筑工程管理',NULL),(17,'35042','350421','生物制药技术',NULL),(18,'35042','350422','化学制药技术',NULL),(19,'35042','350423','药品经营与管理',NULL),(20,'35042','350424','精细化学品生产',NULL),(21,'35043','350431','机械制造与自动化',NULL),(22,'35043','350432','数控技术',NULL),(23,'35043','350433','机电一体化技术',NULL),(24,'35043','350434','模具设计与制造',NULL),(25,'35044','350441','电气自动化',NULL),(26,'35044','350442','汽车检测与维修',NULL),(27,'35044','350443','汽车技术服务与营销',NULL),(28,'35045','350451','装饰艺术设计',NULL),(29,'35045','350452','影视动画',NULL),(30,'35045','350453','数字传媒艺术',NULL),(31,'35046','350461','体育教育',NULL),(32,'35046','350462','社会体育',NULL),(33,'35047','350471','动漫设计与制作',NULL),(35,'35048','350481','马克思主义哲学',NULL),(36,'35048','350482','马克思主义政治学',NULL),(37,'35048','350483','马克思主义经济学原理',NULL),(38,'35049','350491','商务英语',NULL),(39,'35049','350492','文秘',NULL),(40,'35050','350501','UI设计',NULL),(41,'35050','350502','网络系统管理',NULL),(42,'35050','350503','网站开发',NULL),(44,'35038','35038','计算机','zzzzzzzz'),(48,'35044','56565','65656','5656'),(60,'35039','350388','我喜欢你1','zxczxc'),(66,'35038','1111222','wqeqw','aaaa');

/*Table structure for table `operation_log` */

DROP TABLE IF EXISTS `operation_log`;

CREATE TABLE `operation_log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(16) NOT NULL,
  `operationTime` date NOT NULL,
  `operation` varchar(200) NOT NULL,
  `state` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

/*Data for the table `operation_log` */

insert  into `operation_log`(`id`,`user`,`operationTime`,`operation`,`state`) values (1,'songyixue','2018-08-14','删除教师','成功'),(2,'songyixue','2018-08-14','修改教师','成功'),(3,'songyixue','2018-08-14','重置教师密码','成功'),(4,'songyixue','2018-08-17','专业修改','失败'),(5,'songyixue','2018-08-17','专业删除','成功'),(6,'songyixue','2018-08-17','专业删除','成功'),(7,'songyixue','2018-08-17','专业修改','失败'),(8,'songyixue','2018-08-17','专业修改','失败'),(9,'songyixue','2018-08-17','删除学生','成功'),(10,'songyixue','2018-08-17','删除学生','成功'),(27,'songyixue','2018-08-19','专业修改','失败'),(28,'songyixue','2018-08-19','专业修改','成功'),(29,'songyixue','2018-08-21','修改学生','成功'),(30,'songyixue','2018-08-23','删除学生','成功'),(31,'songyixue','2018-08-23','删除学生','成功'),(32,'songyixue','2018-08-23','删除学生','成功'),(33,'songyixue','2018-08-23','专业删除','成功'),(34,'songyixue','2018-08-23','删除院系','成功'),(35,'songyixue','2018-08-23','专业删除','成功'),(36,'songyixue','2018-08-27','院系修改','成功'),(37,'songyixue','2018-08-27','删除院系','成功'),(38,'songyixue','2018-08-27','专业修改','成功'),(39,'songyixue','2018-08-27','专业修改','成功'),(40,'songyixue','2018-08-27','专业修改','成功'),(41,'songyixue','2018-08-27','专业修改','成功'),(42,'songyixue','2018-08-27','专业修改','成功'),(43,'songyixue','2018-08-27','专业修改','成功'),(44,'songyixue','2018-08-27','专业修改','成功'),(45,'songyixue','2018-08-27','专业修改','成功');

/*Table structure for table `optioninfo` */

DROP TABLE IF EXISTS `optioninfo`;

CREATE TABLE `optioninfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(255) DEFAULT NULL,
  `optionNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `optioninfo` */

insert  into `optioninfo`(`id`,`info`,`optionNo`) values (1,'非常满意','o1'),(2,'比较满意','o2'),(3,'满意','o3'),(4,'一般','o4'),(5,'不满意','o5');

/*Table structure for table `paper` */

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paperNo` varchar(16) NOT NULL,
  `type` varchar(16) NOT NULL,
  `description` varchar(500) NOT NULL,
  `startTime` date NOT NULL,
  `endTime` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `paperNo` (`paperNo`),
  UNIQUE KEY `UKf87cedv346bs4cgl8xbqkm0y1` (`paperNo`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `paper` */

insert  into `paper`(`id`,`paperNo`,`type`,`description`,`startTime`,`endTime`) values (18,'1226955136','P1','ddffdd','2018-08-08','2018-07-30'),(19,'1226970113','P1','dfdfddf','2018-08-13','2018-08-06'),(20,'674401836','P1','一组试卷','2018-08-07','2018-08-31'),(21,'589479987','P2','一张统一测评','2018-07-29','2018-09-07');

/*Table structure for table `paper_question` */

DROP TABLE IF EXISTS `paper_question`;

CREATE TABLE `paper_question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paper` varchar(16) NOT NULL,
  `question` varchar(16) NOT NULL,
  `number` int(2) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8;

/*Data for the table `paper_question` */

insert  into `paper_question`(`id`,`paper`,`question`,`number`,`score`) values (81,'1226955136','1534132327804',1,10),(82,'1226955136','1534084848725',2,10),(83,'1226955136','1534084830138',3,10),(84,'1226955136','1534084560168',4,10),(85,'1226955136','1534084520836',5,10),(86,'1226955136','1534084510568',6,10),(87,'1226955136','1534084478022',7,10),(88,'1226955136','1534084467528',8,10),(89,'1226955136','1534084430903',9,10),(90,'1226955136','1534083985619',10,10),(91,'1226970113','1534084863981',1,10),(92,'1226970113','1534084848725',2,10),(93,'1226970113','1534084744524',3,10),(94,'1226970113','1534084712805',4,10),(95,'1226970113','1534084668366',5,10),(96,'1226970113','1534084656102',6,10),(97,'1226970113','1534084545965',7,10),(98,'1226970113','1534084467528',8,10),(99,'1226970113','1534084443525',9,10),(100,'1226970113','1534084337950',10,10),(101,'674401836','1534084863981',1,10),(102,'674401836','1534084830138',2,10),(103,'674401836','1534084732510',3,10),(104,'674401836','1534084656102',4,10),(105,'674401836','1534084545965',5,10),(106,'674401836','1534084520836',6,10),(107,'674401836','1534084510568',7,10),(108,'674401836','1534084488484',8,10),(109,'674401836','1534084457066',9,10),(110,'674401836','1534084430903',10,10),(111,'589479987','1534132327804',1,10),(112,'589479987','1534084732510',2,10),(113,'589479987','1534084712805',3,10),(114,'589479987','1534084656102',4,10),(115,'589479987','1534084639608',5,10),(116,'589479987','1534084560168',6,10),(117,'589479987','1534084545965',7,10),(118,'589479987','1534084498999',8,10),(119,'589479987','1534084457066',9,10),(120,'589479987','1534084443525',10,10);

/*Table structure for table `paper_teacher` */

DROP TABLE IF EXISTS `paper_teacher`;

CREATE TABLE `paper_teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `paper` varchar(200) NOT NULL,
  `teacher` varchar(255) NOT NULL,
  `startTime` date NOT NULL,
  `endTime` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_teacher` */

/*Table structure for table `paper_teacher_user` */

DROP TABLE IF EXISTS `paper_teacher_user`;

CREATE TABLE `paper_teacher_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(255) NOT NULL,
  `teacher_paper` int(11) NOT NULL,
  `isUse` char(2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `teacher_paper` (`teacher_paper`),
  CONSTRAINT `paper_teacher_user_ibfk_1` FOREIGN KEY (`teacher_paper`) REFERENCES `paper_teacher` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_teacher_user` */

/*Table structure for table `powerinfo` */

DROP TABLE IF EXISTS `powerinfo`;

CREATE TABLE `powerinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `powerInfoNo` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK7ibe26cwog1ep5058xevsn1is` (`powerInfoNo`)
) ENGINE=MyISAM AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

/*Data for the table `powerinfo` */

insert  into `powerinfo`(`id`,`name`,`powerInfoNo`,`type`,`uri`) values (1,'添加院系信息','0101','01','admin/department/dept_add.jsp'),(2,'查询院系信息','0102','01','admin/department/paginAll?pagin.pageNo=1&pagin.display=5'),(3,'添加专业信息','0201','02','admin/major/allDept'),(4,'查询专业信息','0202','02','admin/major/pagin?paginMap.pageNo=1&paginMap.display=10'),(5,'添加班级信息','0301','03','admin/class/class_add.jsp'),(6,'查询班级信息','0302','03','admin/class/class_list.jsp'),(7,'添加教师信息','0401','04','admin/teacher/selectType'),(8,'查询教师信息','0402','04','admin/teacher/select?paginMap.pageNo=1&paginMap.display=10'),(9,'添加学生信息','0501','05','admin/student/selectType'),(10,'查询学生信息','0502','05','admin/student/paginAll?paginMap.pageNo=1&paginMap.display=5'),(11,'查询用户信息','0601','06','admin/user/user_list.jsp'),(12,'查询测评记录','0701','07','admin/evaluation/paginAll?paginMap.pageNo=1&paginMap.display=5'),(13,'查询测评结果','0702','07','admin/evaluation/cartogram'),(14,'添加试题信息','0801','08','admin/question/questionInfo.html'),(15,'查询试题列表','0802','08','admin/question/question.html'),(16,'添加角色信息','1001','10','admin/role/selectType'),(17,'查询角色信息','1002','10','admin/role/getRole'),(18,'角色权限管理','1101','11','admin/power/getAllRole'),(19,'用户权限管理','1102','11','admin/power/getAllUser?paginMap.pageNo=1&paginMap.display=10'),(20,'查询登录日志','1201','12','admin/log/pagin?paginMap.pageNo=1&paginMap.display=10'),(21,'查询操作日志','1202','12','admin/olog/pagin?paginMap.pageNo=1&paginMap.display=5'),(22,'试卷列表','0902','09','admin/paper/showPaper?paginMap.pageNo=1&paginMap.display=10'),(23,'组装试卷','0901','09','admin/paper/paper_form.jsp'),(24,'分配试题','0903','09',NULL),(25,'查询数据','1301','13','admin/data/DataBackup.jsp'),(26,'Excel导入','1401','14','common/excelImport.html'),(27,'学生信息','1501','15','admin/student/paginAll?paginMap.pageNo=1&paginMap.display=5'),(28,'班级信息','1502','15','admin/class/class_list.jsp'),(29,'教师信息','1503','15','admin/teacher/select?paginMap.pageNo=1&paginMap.display=10'),(30,'院系信息','1504','15','admin/department/paginAll?pagin.pageNo=1&pagin.display=5'),(35,'查看个人资料','1601','16','admin/user/user_details.jsp?id=\" class=\"power_1601'),(36,'修改个人信息','1602','16','admin/user/user_update.jsp?id=\" class=\"power_1602'),(38,'开始评教','1801','18','admin/paper/evaluationList?data=\" class=\"power_1801'),(39,'开始测评','1901','19',NULL),(40,'查询测评记录','1902','19',NULL),(41,'查看测评结果','1903','19',NULL);

/*Table structure for table `powertype` */

DROP TABLE IF EXISTS `powertype`;

CREATE TABLE `powertype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `powerTypeNo` varchar(255) NOT NULL,
  `codeNo` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK3oo26q5e62f0iwwt1bj2i0t43` (`powerTypeNo`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `powertype` */

insert  into `powertype`(`id`,`name`,`powerTypeNo`,`codeNo`) values (1,'院系管理','01','H'),(2,'专业管理','02','H'),(3,'班级管理','03','H'),(4,'教师管理','04','H'),(5,'学生管理','05','H'),(6,'用户管理','06','H'),(7,'测评管理','07','H'),(8,'试题管理','08','H'),(9,'试卷管理','09','H'),(10,'角色管理','10','H'),(11,'权限管理','11','H'),(12,'日志管理','12','H'),(13,'数据管理','13','H'),(14,'公用界面','14','H'),(15,'信息查询','15','Q'),(16,'个人信息','16','Q'),(18,'同事评教','18','Q'),(19,'学期测评','19','Q');

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `questionNO` varchar(255) NOT NULL,
  `question` varchar(255) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `questionNO` (`questionNO`),
  UNIQUE KEY `question` (`question`),
  UNIQUE KEY `UKe16co0pmgyg59b40dyfnvdplf` (`questionNO`),
  UNIQUE KEY `UK9jpxsp4xpwniiuq9fix978jyq` (`question`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`id`,`questionNO`,`question`,`description`) values (17,'1534083985619','课堂信息量适当，内容充实，重视教学内容的改革与更新',NULL),(19,'1534084337950','你认为老师的分析、解决问题的能力和方法',NULL),(20,'1534084430903','老师的备课的认真程度',NULL),(21,'1534084443525','你认为老师的上课重点突出及条理清晰程度',NULL),(22,'1534084457066','你认为老师授课时启发学生思考和调动学习兴趣情况',NULL),(23,'1534084467528','老师恰当使用现代化教学手段情况',NULL),(24,'1534084478022','老师在课堂中重视研究性学习的程度',NULL),(25,'1534084488484','对老师讲课内容听懂的程度',NULL),(26,'1534084498999','老师对学习困难学生的关心程度',NULL),(27,'1534084510568','你认为老师的课堂组织管理',NULL),(28,'1534084520836','老师对班级同学学习习惯的培养和学习方法的指导情况',NULL),(29,'1534084545965','老师对同学的作业的批改和反馈的认真程度情况',NULL),(30,'1534084560168','老师对班级同学辅优补差、辅导答疑的情况（包括课外活动、兴趣小组等）',NULL),(31,'1534084639608','你认为任课教师讲课重点突出，详略得当，难度适宜?',NULL),(32,'1534084656102','你认为任课教师讲课理论联系实际，传播学习和研究方法?',NULL),(33,'1534084668366','你认为任课教师备课充分，对本课程教学计划明确?',NULL),(37,'1534084712805','你认为任课教师教学认真，对我们的要求严格?',NULL),(38,'1534084732510','你认为任课教师仪表整洁，举止端庄，关心爱护学生，为人师表?',NULL),(39,'1534084744524','你认为任课教师业务熟练，对重难点问题的处理妥当，注重理论联系实际?',NULL),(40,'1534084756986','你认为任课教师充分发挥学生的自学能力和互助合作能力?',NULL),(41,'1534084830138','你认为任课教师妥善组织各个教学环节，结合学生实际达到教学大纲要求?',NULL),(42,'1534084848725','你认为任课教师能从教学实际出发，不唯教材，科学有效的整合教材，创新教学?',NULL),(43,'1534084863981','你认为任课教师能和学生一起学习，探究，倾听，交流?',NULL),(45,'1534132327804','你喜欢吃米饭吗？',NULL),(46,'1535390272673','新添加的试题信息',NULL);

/*Table structure for table `question_option` */

DROP TABLE IF EXISTS `question_option`;

CREATE TABLE `question_option` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  `letter` varchar(2) NOT NULL,
  `ratio` int(11) NOT NULL,
  `optionNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8;

/*Data for the table `question_option` */

insert  into `question_option`(`id`,`question`,`letter`,`ratio`,`optionNo`) values (9,'1534083985619','A',100,'o1'),(10,'1534083985619','B',90,'o2'),(11,'1534083985619','C',80,'o3'),(12,'1534083985619','D',70,'o4'),(17,'1534084337950','A',100,'o1'),(18,'1534084337950','B',90,'o2'),(19,'1534084337950','C',80,'o3'),(20,'1534084337950','D',70,'o4'),(21,'1534084430903','A',100,'o1'),(22,'1534084430903','B',90,'o2'),(23,'1534084430903','C',80,'o3'),(24,'1534084430903','D',70,'o4'),(25,'1534084443525','A',100,'o1'),(26,'1534084443525','B',90,'o2'),(27,'1534084443525','C',80,'o3'),(28,'1534084443525','D',70,'o4'),(29,'1534084457066','A',100,'o1'),(30,'1534084457066','B',90,'o2'),(31,'1534084457066','C',80,'o3'),(32,'1534084457066','D',70,'o4'),(33,'1534084467528','A',100,'o1'),(34,'1534084467528','B',90,'o2'),(35,'1534084467528','C',80,'o3'),(36,'1534084467528','D',70,'o4'),(37,'1534084478022','A',100,'o1'),(38,'1534084478022','B',90,'o2'),(39,'1534084478022','C',80,'o3'),(40,'1534084478022','D',70,'o4'),(41,'1534084488484','A',100,'o1'),(42,'1534084488484','B',90,'o2'),(43,'1534084488484','C',80,'o3'),(44,'1534084488484','D',70,'o4'),(45,'1534084498999','A',100,'o1'),(46,'1534084498999','B',90,'o2'),(47,'1534084498999','C',80,'o3'),(48,'1534084498999','D',70,'o4'),(49,'1534084510568','A',100,'o1'),(50,'1534084510568','B',90,'o2'),(51,'1534084510568','C',80,'o3'),(52,'1534084510568','D',70,'o4'),(53,'1534084520836','A',100,'o1'),(54,'1534084520836','B',90,'o2'),(55,'1534084520836','C',80,'o3'),(56,'1534084520836','D',70,'o4'),(57,'1534084545965','A',100,'o1'),(58,'1534084545965','B',90,'o2'),(59,'1534084545965','C',80,'o3'),(60,'1534084545965','D',70,'o4'),(61,'1534084560168','A',100,'o1'),(62,'1534084560168','B',90,'o2'),(63,'1534084560168','C',80,'o3'),(64,'1534084560168','D',70,'o4'),(65,'1534084639608','A',100,'o1'),(66,'1534084639608','B',90,'o2'),(67,'1534084639608','C',80,'o3'),(68,'1534084639608','D',70,'o4'),(69,'1534084656102','A',100,'o1'),(70,'1534084656102','B',90,'o2'),(71,'1534084656102','C',80,'o3'),(72,'1534084656102','D',70,'o4'),(73,'1534084668366','A',100,'o1'),(74,'1534084668366','B',90,'o2'),(75,'1534084668366','C',80,'o3'),(76,'1534084668366','D',70,'o4'),(89,'1534084712805','A',100,'o1'),(90,'1534084712805','B',90,'o2'),(91,'1534084712805','C',80,'o3'),(92,'1534084712805','D',70,'o4'),(93,'1534084732510','A',100,'o1'),(94,'1534084732510','B',90,'o2'),(95,'1534084732510','C',80,'o3'),(96,'1534084732510','D',70,'o4'),(97,'1534084744524','A',100,'o1'),(98,'1534084744524','B',90,'o2'),(99,'1534084744524','C',80,'o3'),(100,'1534084744524','D',70,'o4'),(101,'1534084756986','A',100,'o1'),(102,'1534084756986','B',90,'o2'),(103,'1534084756986','C',80,'o3'),(104,'1534084756986','D',70,'o4'),(105,'1534084830138','A',100,'o1'),(106,'1534084830138','B',90,'o2'),(107,'1534084830138','C',80,'o3'),(108,'1534084830138','D',70,'o4'),(109,'1534084848725','A',100,'o1'),(110,'1534084848725','B',90,'o2'),(111,'1534084848725','C',80,'o3'),(112,'1534084848725','D',70,'o4'),(113,'1534084863981','A',100,'o1'),(114,'1534084863981','B',90,'o2'),(115,'1534084863981','C',80,'o3'),(116,'1534084863981','D',70,'o4'),(117,'1534132327804','A',80,'o1'),(118,'1534132327804','B',50,'o2'),(119,'1534132327804','C',80,'o3'),(120,'1534132327804','D',70,'o4'),(121,'1535390272673','A',100,'o1'),(122,'1535390272673','B',90,'o2'),(123,'1535390272673','C',80,'o3'),(124,'1535390272673','D',30,'o5');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(20) NOT NULL COMMENT '编号',
  `name` varchar(25) NOT NULL COMMENT '名称',
  `type` varchar(25) NOT NULL COMMENT '角色类型',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`no`,`name`,`type`,`description`) values (1,'0001','高级管理员','R00',NULL),(2,'0002','中级管理员','R00',NULL),(3,'0003','初级管理员','R00',NULL),(4,'0100','院长','R01',NULL),(5,'0101','教学督导','R01',NULL),(6,'0102','院领导','R01',NULL),(7,'0103','系领导','R01',NULL),(8,'0104','授课教师','R01',NULL),(12,'0203','普通学生','R02',NULL);

/*Table structure for table `role_power` */

DROP TABLE IF EXISTS `role_power`;

CREATE TABLE `role_power` (
  `id` int(101) NOT NULL AUTO_INCREMENT,
  `powerinfo` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `departmentNo` (`powerinfo`),
  UNIQUE KEY `UKaccm5h3gefi2dpdua58ge7jb5` (`powerinfo`)
) ENGINE=InnoDB AUTO_INCREMENT=673 DEFAULT CHARSET=utf8;

/*Data for the table `role_power` */

insert  into `role_power`(`id`,`powerinfo`,`role`) values (666,'0101, 0102, 0201, 0202, 0301, 0302, 0401, 0402, 0501, 0502, 0601, 0701, 0702, 0801, 0802, 1001, 1002, 1101, 1102, 1201, 1202, 0902, 0901, 0903, 1301, 1401, 1501, 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1601, 1602, 1801, 1901, 1902, 1903','0001'),(667,'0102, 0202, 0302, 0702, 1201, 1301, 1502, 1505, 1506, 1601','0102'),(668,'1601, 1602, 1801','0203'),(669,'1501, 1502, 1601, 1602, 1801','0104'),(670,'1501, 1502, 1503, 1504, 1601, 1602, 1901, 1902, 1903','0103'),(671,'0102, 0302, 0402, 0502, 1601, 1602, 1801, 1901, 1902, 1903','0101'),(672,'0102, 0202, 0302, 0402, 1601, 1602, 1801, 1901, 1902, 1903','0100');

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
  `classNo` varchar(16) NOT NULL,
  `role` varchar(16) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stuNo` (`stuNo`),
  UNIQUE KEY `UKbowd33lg1v48h4c757qhs2u6i` (`stuNo`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`stuNo`,`USER`,`major`,`joinTime`,`overTime`,`state`,`classNo`,`role`) values (34,'1635050349','1635050349','350421','2018-08-02',NULL,'SS1','3504212','0203'),(35,'1635050334','1635050334','350424','2018-08-08',NULL,'SS1','3504241','0203'),(36,'1635050301','1635050301','350422','2018-08-08',NULL,'SS1','3504221','0203'),(37,'1635050304','1635050304','350431','2018-08-08',NULL,'SS1','3504311','0203'),(38,'1635050345','1635050345','350404','2018-08-04',NULL,'SS1','3504042','0203'),(39,'1635050331','1635050331','350424','2018-08-09',NULL,'SS1','3504241','0203'),(40,'1635050101','1635050101','350421','2018-08-15',NULL,'SS1','3504211','0203'),(41,'1635050102','1635050102','350492','2018-08-24',NULL,'SS1','3504921','0203'),(42,'1635050103','1635050103','350414','2018-08-08',NULL,'SS1','3504141','0203'),(44,'1635050105','1635050105','350402','2018-08-01',NULL,'SS1','3504022','0203'),(45,'1635050106','1635050106','350413','2018-08-09',NULL,'SS1','3504131','0203'),(46,'1635050107','1635050107','350471','2018-08-08',NULL,'SS1','3504711','0203'),(47,'1635050108','1635050108','350491','2018-08-09',NULL,'SS1','3504911','0203'),(48,'1635050109','1635050109','350424','2018-08-08',NULL,'SS1','3504241','0203'),(49,'1635050110','1635050110','350441','2018-08-08',NULL,'SS1','3504411','0203'),(50,'1635050201','1635050201','350422','2018-08-02',NULL,'SS1','3504221','0203'),(52,'1635050203','1635050203','350422','2018-08-07',NULL,'SS1','3504221','0203'),(53,'1635050204','1635050204','350443','2018-08-08',NULL,'SS1','3504431','0203'),(54,'1635050701','1635050701','350471','2018-08-09',NULL,'SS1','3504711','0203'),(55,'1635050801','1635050801','350421','2018-08-09',NULL,'SS1','3504211','0203'),(56,'1635050117','1635050117','350422','2018-08-08',NULL,'SS2','3504221','0203'),(57,'1635050219','1635050219','350413','2018-08-07',NULL,'SS1','3504131','0203'),(58,'1635050910','1635050910','350483','2018-08-07',NULL,'SS1','3504831','0203'),(59,'1635050609','1635050609','350462','2018-08-08',NULL,'SS1','3504621','0203'),(60,'1635050619','1635050619','350434','2018-08-07',NULL,'SS1','3504341','0203'),(62,'1635050398','1635050398','350424','2018-08-06',NULL,'SS1','3504241','0203'),(65,'1265446514','1265446514','350431','2018-08-08',NULL,'SS3','3504311','0203'),(66,'1635050966','1635050966','350411','2018-08-08',NULL,'SS3','3504111','0203'),(67,'1635050777','1635050777','350424','2018-08-03',NULL,'SS1','3504241','0203'),(69,'1635050702','1635050702','350471','2018-08-08',NULL,'SS3','3504711','0203'),(70,'1635050622','1635050622','350414','2018-08-08',NULL,'SS2','3504141','0203'),(72,'1635050211','1635050211','350431','2018-08-09',NULL,'SS1','3504311','0203'),(73,'1635050455','1635050455','350414','2018-08-09',NULL,'SS1','3504141','0203'),(74,'164651','164651','350432','2018-08-08',NULL,'SS1','3504321','0203'),(75,'10102002','10102002','350422','2018-08-23',NULL,'SS1','3504221','0203'),(76,'45645','45645','350423','2018-08-22',NULL,'SS1','3504232','0203'),(77,'56514621','56514621','350402','2018-08-08',NULL,'SS1','3504021','0203'),(78,'66898777','66898777','2222333','2018-08-06',NULL,'SS1','2222333','0203');

/*Table structure for table `student_class` */

DROP TABLE IF EXISTS `student_class`;

CREATE TABLE `student_class` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `student` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `student_class` */

insert  into `student_class`(`id`,`student`,`class`) values (1,'1635050101','350501'),(2,'1635050125','350501\r\n'),(3,'1635050211','350502'),(4,'1635038120','350381'),(5,'1635039220','350392'),(6,'1635040112','350401'),(7,'1635041110','350411'),(8,'1635042206','350422'),(9,'1635043214','350432'),(10,'1635044111','350441');

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
  UNIQUE KEY `teacherNo` (`teacherNo`),
  UNIQUE KEY `UKsbr6lkscwwj329mqxt5qtw2f1` (`teacherNo`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`teacherNo`,`USER`,`role`,`major`,`state`) values (1,'gengjiaqi','gengjiaqi','0100','350501','TS1'),(3,'songyixue','songyixue','0001','350452','TS1'),(5,'zhangyaqian','zhangyaqian','0001','350501','TS1'),(6,'zhangxiaodi','zhangxiaodi','0100','350502','TS1'),(7,'wangyajing','wangyajing','0101','350501','TS1'),(10,'renqizhong','renqizhong','0101','350411','TS1'),(13,'hanruoyi','hanruoyi','0102','350414','TS1'),(14,'gaoyunxi','gaoyunxi','0102','350452','TS1'),(15,'xinghaoyun','xinghaoyun','0103','350503','TS1'),(16,'yijiaming','yijiaming','0103','350462','TS1'),(20,'hanhan','hanhan','0104','350471','TS1'),(21,'gaobailing','gaobailing','0104','350451','TS1'),(22,'yuhao','yuhao','0104','350422','TS1'),(24,'gaobaihe','gaobaihe','0104','350424','TS1'),(25,'332255','332255','0102','2222333','TS1');

/*Table structure for table `teacher_class_course` */

DROP TABLE IF EXISTS `teacher_class_course`;

CREATE TABLE `teacher_class_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  `course` varchar(16) NOT NULL,
  `classes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `teacher_class_course` */

insert  into `teacher_class_course`(`id`,`teacher`,`class`,`course`,`classes`) values (1,'gengjiaqi','350501\r\n1','c001',NULL),(2,'gaolegao','350502\r\n1','c002',NULL),(3,'songyixue','350501\r\n1','c003',NULL),(4,'xingyusen','350391\r\n1','c004',NULL),(5,'zhangyaqian','3504021','c005',NULL),(6,'zhangxiaodi','3504111','c006',NULL),(7,'wangyajing','3505011','c007',NULL),(8,'hanxiaohua','3505021','c008',NULL),(9,'chenxingqi','3504521','c009',NULL),(10,'renqizhong','3503811','c010',NULL);

/*Table structure for table `teacher_course` */

DROP TABLE IF EXISTS `teacher_course`;

CREATE TABLE `teacher_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(10) NOT NULL,
  `course` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `teacher_course` */

insert  into `teacher_course`(`id`,`teacher`,`course`) values (1,'gengjiaqi','c001'),(2,'gaolegao','c002'),(3,'songyixue','c003'),(4,'xingyusen','c004'),(5,'zhangyaqia','c005'),(6,'zhangxiaod','c006'),(7,'wangyajing','c007'),(8,'hanxiaohua','c009'),(9,'chenxingqi','c008'),(10,'renqizhong','c010');

/*Table structure for table `type` */

DROP TABLE IF EXISTS `type`;

CREATE TABLE `type` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `typeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `typeNo` (`typeNo`),
  UNIQUE KEY `UKb8fviye2g4slpoyhgbeaq4gfg` (`typeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `type` */

insert  into `type`(`id`,`typeNo`,`NAME`,`description`) values (1,'1','院系',NULL),(3,'3','角色类型',NULL),(4,'4','性别',NULL),(5,'5','教师状态',NULL),(6,'6','学生状态',NULL),(10,'7','试卷类型',NULL),(12,'9','页面类型',NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(16) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `age` int(6) NOT NULL,
  `role` varchar(16) NOT NULL,
  `pid` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pid` (`pid`),
  UNIQUE KEY `UKs6kt3gqh331tdqrjtbxxt49us` (`pid`),
  UNIQUE KEY `UKdnq7r8jcmlft7l8l4j79l1h74` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`account`,`PASSWORD`,`NAME`,`sex`,`age`,`role`,`pid`) values (1,'gengjiaqi','E10ADC3949BA59ABBE56E057F20F883E','耿佳琪','男',46,'0100','130131197203045612'),(3,'songyixue','E10ADC3949BA59ABBE56E057F20F883E','宋伊雪','女',29,'0001','130131198911290029'),(5,'zhangyaqian','E10ADC3949BA59ABBE56E057F20F883E','张雅倩','女',30,'0102','130131198802120026'),(6,'zhangxiaodi','E10ADC3949BA59ABBE56E057F20F883E','张晓迪','女',28,'0102','130131199005156549'),(7,'wangyajing','E10ADC3949BA59ABBE56E057F20F883E','王雅静','女',25,'0103','130131199310168979'),(10,'renqizhong','E10ADC3949BA59ABBE56E057F20F883E','任启钟1','男',36,'0103','130131198204114578'),(57,'hanruoyi','E10ADC3949BA59ABBE56E057F20F883E','韩若忆','男',33,'0104','784213213698523158'),(58,'gaoyunxi','E10ADC3949BA59ABBE56E057F20F883E','高芸熙','女',28,'0104','856823256442236616'),(59,'xinghaoyun','E10ADC3949BA59ABBE56E057F20F883E','邢皓云1','男',43,'0104','444554879693233685'),(60,'yijiaming','E10ADC3949BA59ABBE56E057F20F883E','易佳铭','男',26,'0104','542176645236987542'),(62,'1635050349','E10ADC3949BA59ABBE56E057F20F883E','邢燕蕊','女',20,'0203','130103199804060000'),(63,'1635050334','E10ADC3949BA59ABBE56E057F20F883E','韩笑','女',20,'0203','130103199809210000'),(64,'1635050301','E10ADC3949BA59ABBE56E057F20F883E','耿佳康','男',20,'0203','130103199804060001'),(65,'1635050304','E10ADC3949BA59ABBE56E057F20F883E','陈彦磊','男',20,'0203','130103199804040000'),(66,'1635050345','E10ADC3949BA59ABBE56E057F20F883E','张鼎瑜','男',20,'0203','130103199811150000'),(67,'1635050331','E10ADC3949BA59ABBE56E057F20F883E','任少华','男',20,'0203','130103199810220000'),(68,'1635050101','E10ADC3949BA59ABBE56E057F20F883E','杨艺玲','女',20,'0203','130103199804210000'),(69,'1635050102','E10ADC3949BA59ABBE56E057F20F883E','张时竹','男',20,'0203','130103199805060000'),(70,'1635050103','E10ADC3949BA59ABBE56E057F20F883E','林子竹','男',20,'0203','130103199811220000'),(72,'1635050105','F59BD65F7EDAFB087A81D4DCA06C4910','王薇璇','女',20,'0203','130103199812080000'),(73,'1635050106','E10ADC3949BA59ABBE56E057F20F883E','郑博','男',20,'0203','130103199807120000'),(74,'1635050107','E10ADC3949BA59ABBE56E057F20F883E','谢秀娟','女',20,'0203','130103199809260000'),(75,'1635050108','E10ADC3949BA59ABBE56E057F20F883E','郭冰冰','女',20,'0203','130103199806230000'),(76,'1635050109','E10ADC3949BA59ABBE56E057F20F883E','王华','男',20,'0203','130103199807050000'),(77,'1635050110','E10ADC3949BA59ABBE56E057F20F883E','张嘉琪','男',20,'0203','130103199805200000'),(78,'1635050201','E10ADC3949BA59ABBE56E057F20F883E','陈世阳','男',20,'0203','130103199704130000'),(80,'1635050203','E10ADC3949BA59ABBE56E057F20F883E','吴培林','男',20,'0203','130103199705190000'),(81,'1635050204','E10ADC3949BA59ABBE56E057F20F883E','刘友纯','男',21,'0203','130103199701020000'),(82,'1635050701','E10ADC3949BA59ABBE56E057F20F883E','杨凡静','女',20,'0203','130103199712120000'),(83,'1635050801','E10ADC3949BA59ABBE56E057F20F883E','潘友博','男',20,'0203','130103199811110000'),(84,'1635050117','E10ADC3949BA59ABBE56E057F20F883E','林晨','女',21,'0203','130103199708090000'),(85,'1635050219','E10ADC3949BA59ABBE56E057F20F883E','叶紫','女',20,'0203','130103199806300000'),(86,'1635050910','E10ADC3949BA59ABBE56E057F20F883E','谢一忠','男',20,'0203','130103199706040000'),(87,'1635050609','E10ADC3949BA59ABBE56E057F20F883E','林家阳','男',20,'0203','130103199803160000'),(88,'1635050619','E10ADC3949BA59ABBE56E057F20F883E','陈坤绍','男',21,'0203','130103199705170000'),(91,'1635050398','E10ADC3949BA59ABBE56E057F20F883E','asdasd','女',21,'0203','111111111111111122'),(96,'hanhan','E10ADC3949BA59ABBE56E057F20F883E','韩涵','女',33,'0104','345646437685654756'),(97,'gaobailing','E10ADC3949BA59ABBE56E057F20F883E','高百灵','女',23,'0104','314654765876845644'),(98,'yuhao','E10ADC3949BA59ABBE56E057F20F883E','于浩','男',26,'0104','248412137452137445'),(102,'gaobaihe','F59BD65F7EDAFB087A81D4DCA06C4910','高百合','女',24,'0103','854736765874676556'),(107,'1265446514','E10ADC3949BA59ABBE56E057F20F883E','大部分','女',20,'0203','244546132112000000'),(108,'1635050966','E10ADC3949BA59ABBE56E057F20F883E','孙志','男',20,'0203','130103199504060000'),(109,'1635050777','E10ADC3949BA59ABBE56E057F20F883E','王艺海','男',20,'0203','130103199504070000'),(110,'1635050702','E10ADC3949BA59ABBE56E057F20F883E','李文星','男',20,'0203','130103199504080000'),(111,'1635050622','E10ADC3949BA59ABBE56E057F20F883E','年广嗣','男',10,'0203','130103199504090000'),(113,'1635050211','E10ADC3949BA59ABBE56E057F20F883E','汤念祖','男',20,'0203','130103199504110000'),(114,'1635050455','E10ADC3949BA59ABBE56E057F20F883E','林亚荣','男',19,'0203','130103199904060003'),(115,'164651','E10ADC3949BA59ABBE56E057F20F883E','水电费','男',10,'0203','525240001111111111'),(116,'10102002','E10ADC3949BA59ABBE56E057F20F883E','幸福','男',20,'0203','124563201000000011'),(117,'45645','E10ADC3949BA59ABBE56E057F20F883E','广发华福 ','男',20,'0203','546150214337978888'),(119,'56514621','E10ADC3949BA59ABBE56E057F20F883E','fg大概','男',20,'0203','458085300000001111'),(120,'332255','E10ADC3949BA59ABBE56E057F20F883E','张志忠','男',65,'0102','123456789996547854'),(121,'66898777','E10ADC3949BA59ABBE56E057F20F883E','李自成','男',20,'0203','355698874521455855');

/*Table structure for table `user_power` */

DROP TABLE IF EXISTS `user_power`;

CREATE TABLE `user_power` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `powerInfo` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_power` */

insert  into `user_power`(`id`,`powerInfo`,`user`) values (1,NULL,NULL);

/*Table structure for table `v_evaluation` */

DROP TABLE IF EXISTS `v_evaluation`;

/*!50001 DROP VIEW IF EXISTS `v_evaluation` */;
/*!50001 DROP TABLE IF EXISTS `v_evaluation` */;

/*!50001 CREATE TABLE  `v_evaluation`(
 `id` int(10) ,
 `paper` varchar(16) ,
 `user` varchar(16) ,
 `teacher` varchar(16) ,
 `time` timestamp ,
 `options` varchar(50) ,
 `score` double ,
 `paperType` varchar(16) ,
 `userName` varchar(20) ,
 `userSex` varchar(6) ,
 `userRole` varchar(16) ,
 `userRoleName` varchar(25) ,
 `userRoleTypeName` varchar(20) ,
 `teacherAccount` varchar(16) ,
 `teacherName` varchar(20) ,
 `teacherRole` varchar(16) ,
 `teacherMajor` varchar(16) ,
 `teacherRoleName` varchar(25) ,
 `teacherRoleTypeName` varchar(20) ,
 `teacherMajorName` varchar(20) ,
 `teacherDept` varchar(16) ,
 `teacherDeptName` varchar(20) 
)*/;

/*Table structure for table `v_paper` */

DROP TABLE IF EXISTS `v_paper`;

/*!50001 DROP VIEW IF EXISTS `v_paper` */;
/*!50001 DROP TABLE IF EXISTS `v_paper` */;

/*!50001 CREATE TABLE  `v_paper`(
 `paperNo` varchar(16) ,
 `paperType` varchar(16) ,
 `description` varchar(500) ,
 `startTime` date ,
 `endTime` date ,
 `questionNo` varchar(16) ,
 `number` int(2) ,
 `score` int(11) ,
 `questionInfo` varchar(255) ,
 `letter` varchar(2) ,
 `ratio` int(11) ,
 `optionNo` varchar(255) ,
 `optionInfo` varchar(255) 
)*/;

/*Table structure for table `v_paper_teacher` */

DROP TABLE IF EXISTS `v_paper_teacher`;

/*!50001 DROP VIEW IF EXISTS `v_paper_teacher` */;
/*!50001 DROP TABLE IF EXISTS `v_paper_teacher` */;

/*!50001 CREATE TABLE  `v_paper_teacher`(
 `id` varchar(32) ,
 `paperNo` varchar(16) ,
 `TYPE` varchar(16) ,
 `typeName` varchar(20) ,
 `description` varchar(500) ,
 `startTime` date ,
 `endTime` date ,
 `teacherNo` varchar(16) ,
 `name` varchar(20) ,
 `role` varchar(16) ,
 `major` varchar(16) ,
 `state` varchar(16) ,
 `dept` varchar(16) 
)*/;

/*Table structure for table `v_student` */

DROP TABLE IF EXISTS `v_student`;

/*!50001 DROP VIEW IF EXISTS `v_student` */;
/*!50001 DROP TABLE IF EXISTS `v_student` */;

/*!50001 CREATE TABLE  `v_student`(
 `NO` varchar(20) ,
 `account` varchar(16) ,
 `NAME` varchar(20) ,
 `PASSWORD` varchar(255) ,
 `sex` varchar(6) ,
 `age` int(6) ,
 `pid` varchar(20) ,
 `joinTime` date ,
 `overTime` date ,
 `classNo` varchar(16) ,
 `className` varchar(20) ,
 `roleNo` varchar(16) ,
 `stateName` varchar(20) ,
 `roleName` varchar(25) ,
 `majorNo` varchar(16) ,
 `majorName` varchar(20) ,
 `state` varchar(16) ,
 `deptNo` varchar(16) ,
 `deptName` varchar(20) 
)*/;

/*Table structure for table `v_teacher` */

DROP TABLE IF EXISTS `v_teacher`;

/*!50001 DROP VIEW IF EXISTS `v_teacher` */;
/*!50001 DROP TABLE IF EXISTS `v_teacher` */;

/*!50001 CREATE TABLE  `v_teacher`(
 `NO` varchar(16) ,
 `account` varchar(16) ,
 `name` varchar(20) ,
 `password` varchar(255) ,
 `sex` varchar(6) ,
 `age` int(6) ,
 `pid` varchar(20) ,
 `roleNo` varchar(16) ,
 `roleName` varchar(25) ,
 `majorNo` varchar(16) ,
 `majorName` varchar(20) ,
 `state` varchar(16) ,
 `stateName` varchar(20) ,
 `deptNo` varchar(16) ,
 `deptName` varchar(20) 
)*/;

/*View structure for view v_evaluation */

/*!50001 DROP TABLE IF EXISTS `v_evaluation` */;
/*!50001 DROP VIEW IF EXISTS `v_evaluation` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_evaluation` AS select `e`.`id` AS `id`,`e`.`paper` AS `paper`,`e`.`user` AS `user`,`e`.`teacher` AS `teacher`,`e`.`time` AS `time`,`e`.`options` AS `options`,`e`.`score` AS `score`,`p`.`type` AS `paperType`,`u`.`NAME` AS `userName`,`u`.`sex` AS `userSex`,`u`.`role` AS `userRole`,`ur`.`name` AS `userRoleName`,`uc`.`NAME` AS `userRoleTypeName`,`t`.`USER` AS `teacherAccount`,`tu`.`NAME` AS `teacherName`,`t`.`role` AS `teacherRole`,`t`.`major` AS `teacherMajor`,`tr`.`name` AS `teacherRoleName`,`tc`.`NAME` AS `teacherRoleTypeName`,`m`.`name` AS `teacherMajorName`,`m`.`deptNo` AS `teacherDept`,`mc`.`NAME` AS `teacherDeptName` from ((((((((((`evaluation_info` `e` join `paper` `p`) join `user` `u`) join `teacher` `t`) join `user` `tu`) join `role` `ur`) join `code` `uc`) join `role` `tr`) join `code` `tc`) join `major` `m`) join `code` `mc`) where ((`e`.`user` = `u`.`account`) and (`e`.`paper` = `p`.`paperNo`) and (`e`.`teacher` = `t`.`teacherNo`) and (`u`.`role` = `ur`.`no`) and (`ur`.`type` = `uc`.`codeNo`) and (`t`.`role` = `tr`.`no`) and (`t`.`USER` = `tu`.`account`) and (`tr`.`type` = `tc`.`codeNo`) and (`t`.`major` = `m`.`majorNo`) and (`m`.`deptNo` = `mc`.`codeNo`)) */;

/*View structure for view v_paper */

/*!50001 DROP TABLE IF EXISTS `v_paper` */;
/*!50001 DROP VIEW IF EXISTS `v_paper` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_paper` AS select `pq`.`paper` AS `paperNo`,`p`.`type` AS `paperType`,`p`.`description` AS `description`,`p`.`startTime` AS `startTime`,`p`.`endTime` AS `endTime`,`pq`.`question` AS `questionNo`,`pq`.`number` AS `number`,`pq`.`score` AS `score`,`q`.`question` AS `questionInfo`,`qo`.`letter` AS `letter`,`qo`.`ratio` AS `ratio`,`qo`.`optionNo` AS `optionNo`,`o`.`info` AS `optionInfo` from ((((`paper_question` `pq` join `question_option` `qo`) join `paper` `p`) join `question` `q`) join `optioninfo` `o`) where ((`pq`.`question` = `qo`.`question`) and (`pq`.`question` = `q`.`questionNO`) and (`pq`.`paper` = `p`.`paperNo`) and (`qo`.`optionNo` = `o`.`optionNo`)) order by `pq`.`number`,`qo`.`letter` */;

/*View structure for view v_paper_teacher */

/*!50001 DROP TABLE IF EXISTS `v_paper_teacher` */;
/*!50001 DROP VIEW IF EXISTS `v_paper_teacher` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_paper_teacher` AS select `a`.`id` AS `id`,`a`.`paperNo` AS `paperNo`,`a`.`TYPE` AS `TYPE`,`a`.`typeName` AS `typeName`,`a`.`description` AS `description`,`a`.`startTime` AS `startTime`,`a`.`endTime` AS `endTime`,`a`.`teacherNo` AS `teacherNo`,`a`.`name` AS `name`,`a`.`role` AS `role`,`a`.`major` AS `major`,`a`.`state` AS `state`,`a`.`dept` AS `dept` from (select concat(`p`.`paperNo`,`t`.`teacherNo`) AS `id`,`p`.`paperNo` AS `paperNo`,`p`.`type` AS `TYPE`,`pc`.`NAME` AS `typeName`,`p`.`description` AS `description`,`p`.`startTime` AS `startTime`,`p`.`endTime` AS `endTime`,`t`.`teacherNo` AS `teacherNo`,`t`.`name` AS `name`,`t`.`role` AS `role`,`t`.`major` AS `major`,`t`.`state` AS `state`,`m`.`deptNo` AS `dept` from (((`evaluationmanager`.`paper` `p` join `evaluationmanager`.`code` `pc`) join (select `t`.`id` AS `id`,`t`.`teacherNo` AS `teacherNo`,`t`.`USER` AS `USER`,`t`.`role` AS `role`,`t`.`major` AS `major`,`t`.`state` AS `state`,`u`.`NAME` AS `name` from (`evaluationmanager`.`teacher` `t` join `evaluationmanager`.`user` `u`) where (`t`.`USER` = `u`.`account`)) `t`) join `evaluationmanager`.`major` `m`) where ((`p`.`type` = `pc`.`codeNo`) and (`t`.`major` = `m`.`majorNo`))) `a` */;

/*View structure for view v_student */

/*!50001 DROP TABLE IF EXISTS `v_student` */;
/*!50001 DROP VIEW IF EXISTS `v_student` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_student` AS select `s`.`stuNo` AS `NO`,`u`.`account` AS `account`,`u`.`NAME` AS `NAME`,`u`.`PASSWORD` AS `PASSWORD`,`u`.`sex` AS `sex`,`u`.`age` AS `age`,`u`.`pid` AS `pid`,`s`.`joinTime` AS `joinTime`,`s`.`overTime` AS `overTime`,`s`.`classNo` AS `classNo`,`cl`.`NAME` AS `className`,`s`.`role` AS `roleNo`,`st`.`NAME` AS `stateName`,`r`.`name` AS `roleName`,`s`.`major` AS `majorNo`,`m`.`name` AS `majorName`,`s`.`state` AS `state`,`m`.`deptNo` AS `deptNo`,`c`.`NAME` AS `deptName` from ((((((`user` `u` join `student` `s`) join `major` `m`) join `code` `c`) join `role` `r`) join `class` `cl`) join `code` `st`) where ((`s`.`USER` = `u`.`account`) and (`s`.`major` = `m`.`majorNo`) and (`m`.`deptNo` = `c`.`codeNo`) and (`u`.`role` = `r`.`no`) and (`s`.`classNo` = `cl`.`classNo`) and (`s`.`state` = `st`.`codeNo`)) */;

/*View structure for view v_teacher */

/*!50001 DROP TABLE IF EXISTS `v_teacher` */;
/*!50001 DROP VIEW IF EXISTS `v_teacher` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `v_teacher` AS select `t`.`teacherNo` AS `NO`,`u`.`account` AS `account`,`u`.`NAME` AS `name`,`u`.`PASSWORD` AS `password`,`u`.`sex` AS `sex`,`u`.`age` AS `age`,`u`.`pid` AS `pid`,`t`.`role` AS `roleNo`,`r`.`name` AS `roleName`,`t`.`major` AS `majorNo`,`m`.`name` AS `majorName`,`t`.`state` AS `state`,`st`.`NAME` AS `stateName`,`m`.`deptNo` AS `deptNo`,`c`.`NAME` AS `deptName` from (((((`user` `u` join `teacher` `t`) join `major` `m`) join `code` `c`) join `role` `r`) join `code` `st`) where ((`t`.`USER` = `u`.`account`) and (`t`.`major` = `m`.`majorNo`) and (`m`.`deptNo` = `c`.`codeNo`) and (`u`.`role` = `r`.`no`) and (`t`.`state` = `st`.`codeNo`)) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
