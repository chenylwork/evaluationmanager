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
  UNIQUE KEY `classNo` (`classNo`),
  UNIQUE KEY `NAME` (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class` */

/*Table structure for table `code` */

DROP TABLE IF EXISTS `code`;

CREATE TABLE `code` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `codeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codeNo` (`codeNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `code` */

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

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `typeNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `typeNo` (`typeNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `dept_major` */

DROP TABLE IF EXISTS `dept_major`;

CREATE TABLE `dept_major` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `roleNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `roleNo` (`roleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dept_major` */

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

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `account` varchar(16) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `sex` varchar(6) NOT NULL,
  `age` int(6) NOT NULL,
  `role` varchar(16) NOT NULL,
  `pid` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pid` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
