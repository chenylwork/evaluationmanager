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
  UNIQUE KEY `codeNo` (`codeNo`),
  UNIQUE KEY `UKlya03ys01kh916009e314httl` (`codeNo`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;

/*Data for the table `code` */

insert  into `code`(`id`,`codeNo`,`NAME`,`description`,`typeNo`) values (1,'35038','管理系',NULL,'1'),(2,'35039','经济贸易系',NULL,'1'),(3,'35040','信息工程系',NULL,'1'),(4,'35041','建筑工程系',NULL,'1'),(5,'35042','食品与药品工程系',NULL,'1'),(6,'35043','机电工程系',NULL,'1'),(7,'35044','电气与电子工程系',NULL,'1'),(8,'35045','艺术设计系',NULL,'1'),(9,'35046','体育系',NULL,'1'),(10,'35047','动画学院',NULL,'1'),(11,'35048','马克思主义学院',NULL,'1'),(12,'35049','继续教育学院',NULL,'1'),(13,'35050','软件学院',NULL,'1'),(59,'0','男',NULL,'4'),(60,'1','女',NULL,'4'),(61,'TS1','任职',NULL,'5'),(62,'TS2','离职',NULL,'5'),(63,'TS3','请假',NULL,'5'),(64,'SS1','在校',NULL,'6'),(65,'SS2','离校',NULL,'6'),(66,'SS3','请假',NULL,'6'),(67,'p1','常规测评',NULL,'7'),(68,'p2','统一测评',NULL,'7'),(69,'r01','管理员',NULL,'3'),(72,'r02','教师',NULL,'3'),(73,'r03','学生',NULL,'3'),(74,'y01','院领导',NULL,'8'),(77,'y02','系领导',NULL,'8'),(78,'y03','任课教师',NULL,'8');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `evaluation_record` */

insert  into `evaluation_record`(`id`,`startTime`,`endTime`,`paper`) values (1,'2016-09-02 00:00:00','2016-09-07 00:00:00','p001'),(2,'2016-10-02 00:00:00','2016-10-07 00:00:00','p002'),(3,'2016-11-02 00:00:00','2016-11-07 00:00:00','p003'),(4,'2016-12-02 00:00:00','2016-12-07 00:00:00','p004'),(5,'2017-01-02 00:00:00','2017-01-07 00:00:00','p005'),(6,'2017-02-07 00:00:00','2017-02-07 00:00:00','p006'),(7,'2017-03-07 00:00:00','2017-02-07 00:00:00','p007'),(8,'2017-04-07 00:00:00','2017-04-07 00:00:00','p008'),(9,'2017-05-07 00:00:00','2017-05-07 00:00:00','p009'),(10,'2017-06-07 00:00:00','2017-06-07 00:00:00','p010');

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

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `deptNo` varchar(16) NOT NULL,
  `majorNo` varchar(16) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`id`,`deptNo`,`majorNo`,`name`,`description`) values (1,'35038','350381','连锁经营管理',NULL),(2,'35038','350382','物流管理',NULL),(3,'35038','350383','采购供应管理',NULL),(4,'35039','350394','会计电算化',NULL),(5,'35039','350391','国际贸易实务',NULL),(6,'35039','350392','营销与策划',NULL),(7,'35039','350393','电子商务',NULL),(8,'35040','350401','计算机应用技术',NULL),(9,'35040','350402','计算机网络技术',NULL),(10,'35040','350403','计算机信息管理',NULL),(11,'35040','350404','信息安全技术',NULL),(12,'35041','350411','建筑设计技术',NULL),(13,'35041','350415','建筑工程技术',NULL),(14,'35041','350412','工程造价',NULL),(15,'35041','350413','房地产经营与估价',NULL),(16,'35041','350414','建筑工程管理',NULL),(17,'35042','350421','生物制药技术',NULL),(18,'35042','350422','化学制药技术',NULL),(19,'35042','350423','药品经营与管理',NULL),(20,'35042','350424','精细化学品生产',NULL),(21,'35043','350431','机械制造与自动化',NULL),(22,'35043','350432','数控技术',NULL),(23,'35043','350433','机电一体化技术',NULL),(24,'35043','350434','模具设计与制造',NULL),(25,'35044','350441','电气自动化',NULL),(26,'35044','350442','汽车检测与维修',NULL),(27,'35044','350443','汽车技术服务与营销',NULL),(28,'35045','350451','装饰艺术设计',NULL),(29,'35045','350452','影视动画',NULL),(30,'35045','350453','数字传媒艺术',NULL),(31,'35046','350461','体育教育',NULL),(32,'35046','350462','社会体育',NULL),(33,'35047','350471','动漫设计与制作',NULL),(34,'35047','350452','影视动画',NULL),(35,'35048','350481','马克思主义哲学',NULL),(36,'35048','350482','马克思主义政治学',NULL),(37,'35048','350483','马克思主义经济学原理',NULL),(38,'35049','350491','商务英语',NULL),(39,'35049','350492','文秘',NULL),(40,'35050','350501','UI设计',NULL),(41,'35050','350502','网络系统管理',NULL),(42,'35050','350503','网站开发',NULL),(43,'35050','350393','电子商务',NULL);

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
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `paperNo` (`paperNo`),
  UNIQUE KEY `UKf87cedv346bs4cgl8xbqkm0y1` (`paperNo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `paper` */

insert  into `paper`(`id`,`paperNo`,`type`,`description`) values (1,'p001\r\n','p1',NULL),(2,'p002','p2',NULL),(3,'p003','p1',NULL),(4,'p004','p1',NULL),(5,'p005','p2',NULL),(6,'p006','p2',NULL),(7,'p007','p1',NULL),(8,'p008','p2',NULL),(9,'p009','p1',NULL),(10,'p010','p2',NULL);

/*Table structure for table `paper_question` */

DROP TABLE IF EXISTS `paper_question`;

CREATE TABLE `paper_question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `paper` varchar(16) NOT NULL,
  `question` varchar(16) NOT NULL,
  `number` int(2) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `paper_question` */

insert  into `paper_question`(`id`,`paper`,`question`,`number`,`score`) values (1,'p001','q1',1,10),(2,'p002','q2',2,10),(3,'p003','q3',3,10),(4,'p004','q4',4,10),(5,'p005','q5',5,10),(6,'p006','q6',6,10),(7,'p007','q7',7,10),(8,'p008','q8',8,10),(9,'p009','q9',9,10);

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `questionNO` varchar(16) NOT NULL,
  `question` varchar(255) NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `questionNO` (`questionNO`),
  UNIQUE KEY `question` (`question`),
  UNIQUE KEY `UKe16co0pmgyg59b40dyfnvdplf` (`questionNO`),
  UNIQUE KEY `UK9jpxsp4xpwniiuq9fix978jyq` (`question`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`id`,`questionNO`,`question`,`description`) values (1,'q1','你喜欢这个老师吗？',NULL),(2,'q2','上课是否迟到早退？\r\n',NULL),(3,'q3','作业布置量是否合理？',NULL),(4,'q4','板书是否美观',NULL),(5,'q5','是否经常用PPT？',NULL),(6,'q6','讲课是否精彩',NULL),(7,'q7','批改作业是否及时？',NULL),(8,'q8','是否课堂互动？',NULL),(9,'q9','知识讲解清不清楚?',NULL),(10,'q10','老师能否做到一视同仁？',NULL);

/*Table structure for table `question_option` */

DROP TABLE IF EXISTS `question_option`;

CREATE TABLE `question_option` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `question` varchar(16) NOT NULL,
  `option` varchar(16) NOT NULL,
  `letter` varchar(2) NOT NULL,
  `ratio` int(11) NOT NULL,
  `optionNo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `question_option` */

insert  into `question_option`(`id`,`question`,`option`,`letter`,`ratio`,`optionNo`) values (1,'q1','o1','A',25,NULL),(2,'q1','o2','B',25,NULL),(3,'q1','o3','C',25,NULL),(4,'q1','o4','D',25,NULL),(5,'q2','o1','A',25,NULL),(6,'q2','o2','B',25,NULL),(7,'q2','o3','C',25,NULL),(8,'q2','o4','D',25,NULL);

/*Table structure for table `role_power` */

DROP TABLE IF EXISTS `role_power`;

CREATE TABLE `role_power` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `departmentNo` varchar(16) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `departmentNo` (`departmentNo`),
  UNIQUE KEY `UKaccm5h3gefi2dpdua58ge7jb5` (`departmentNo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `role_power` */

insert  into `role_power`(`id`,`departmentNo`,`NAME`,`description`) values (1,'1','超级管理员',NULL),(2,'2','管理员',NULL),(3,'3','普通用户',NULL);

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
  UNIQUE KEY `stuNo` (`stuNo`),
  UNIQUE KEY `UKbowd33lg1v48h4c757qhs2u6i` (`stuNo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`stuNo`,`USER`,`major`,`joinTime`,`overTime`,`state`) values (1,'S001','11','350381','2016-09-04','2019-07-02','SS1'),(2,'S002','12','350391','2016-09-04','2019-07-02','SS1'),(3,'S003','13','350401','2016-09-04','2019-07-02','SS1'),(4,'S004','14','350411','2016-09-04','2019-07-02','SS1'),(5,'S005','15','350421','2016-09-04','2019-07-02','SS1'),(6,'S006','16','350431','2016-09-04','2019-07-02','SS1'),(7,'S007','17','350441','2016-09-04','2019-07-02','SS1'),(8,'S008','18','350451','2016-09-04','2019-07-02','SS1'),(9,'S009','19','350461','2016-09-04','2019-07-02','SS1'),(10,'S010','20','350471','2016-09-04','2019-07-02','SS1');

/*Table structure for table `student_class` */

DROP TABLE IF EXISTS `student_class`;

CREATE TABLE `student_class` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `student` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `student_class` */

insert  into `student_class`(`id`,`student`,`class`) values (1,'1','350501'),(2,'2','350501\r\n'),(3,'3','350502'),(4,'4','350381'),(5,'5','350392'),(6,'6','350401'),(7,'7','350411'),(8,'8','350422'),(9,'9','350432'),(10,'10','350441');

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`id`,`teacherNo`,`USER`,`role`,`major`,`state`) values (1,'T001','1','y01','35050','TS1'),(2,'T002','2','y02','35050','TS1'),(3,'T003','3','y02','35045','TS1'),(4,'T004','4','y02','35038','TS1'),(5,'T005','5','y03','35050','TS1'),(6,'T006','6','y03','35050','TS1'),(7,'T007','7','y03','35050','TS1'),(8,'T008','8','y03','35039','TS1'),(9,'T009','9','y03','35040','TS1'),(10,'T010','10','y03','35041','TS1');

/*Table structure for table `teacher_class_course` */

DROP TABLE IF EXISTS `teacher_class_course`;

CREATE TABLE `teacher_class_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(16) NOT NULL,
  `class` varchar(16) NOT NULL,
  `course` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `teacher_class_course` */

insert  into `teacher_class_course`(`id`,`teacher`,`class`,`course`) values (1,'5','350501\r\n','1'),(2,'6','350502\r\n','2'),(3,'7','350501\r\n','3'),(4,'8','350391\r\n','6'),(5,'9','350402','7'),(6,'10','350411','8');

/*Table structure for table `teacher_course` */

DROP TABLE IF EXISTS `teacher_course`;

CREATE TABLE `teacher_course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `teacher` varchar(10) NOT NULL,
  `course` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `teacher_course` */

insert  into `teacher_course`(`id`,`teacher`,`course`) values (1,'5','1'),(2,'6','2'),(3,'7','3'),(4,'8','6'),(5,'9','7'),(6,'10','8');

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `type` */

insert  into `type`(`id`,`typeNo`,`NAME`,`description`) values (1,'1','院系',NULL),(3,'3','角色',NULL),(4,'4','性别',NULL),(5,'5','教师状态',NULL),(6,'6','学生状态',NULL),(10,'7','试卷类型',NULL),(11,'8','教师职位',NULL);

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
  UNIQUE KEY `pid` (`pid`),
  UNIQUE KEY `UKs6kt3gqh331tdqrjtbxxt49us` (`pid`),
  UNIQUE KEY `UKdnq7r8jcmlft7l8l4j79l1h74` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`account`,`PASSWORD`,`NAME`,`sex`,`age`,`role`,`pid`) values (1,'admin','admin','耿佳琪','男',46,'y01','130131197203045612\r\n'),(2,'gaolegao\r\n','11111','高乐郜','男\r\n',34,'y02','130131198405198941\r\n'),(3,'songyixue','123456','宋伊雪','女',29,'y02','130131198911290029'),(4,'xingyusen','123123','邢玉森','男',39,'y02','130131197912251223'),(5,'zhangyaqian','123123','张雅倩','女',30,'r02','130131198802120026'),(6,'zhangxiaodi','111111','张晓迪','女',28,'r02','130131199005156549'),(7,'wangyajing','123456','王雅静','女',25,'r02','130131199310168979'),(8,'hanxiaohua','	222222','韩晓华','女',32,'r02','130131198611283698'),(9,'chenxingqi','333333','陈兴奇','男',38,'r02','130131198003065646'),(10,'renqizhong','123456','任启钟','男',36,'r02','130131198204114578'),(11,'1635050101','1635050101','韩胜义','男',18,'r03','130131200004055689'),(12,'1635050125','1635050125','陈鹏','男',19,'r03','130131199906065612'),(13,'1635050211','1635050211','李迪蕾','男',18,'r03','130131200009186547'),(14,'1635038120','1635038120','王胜新','男',20,'r03','130131199805195679'),(15,'1635039220','1635039220','李欣','女',18,'r03','130131200008045689'),(16,'1635040112','1635040112','于佳佳','女',19,'r03','130131199911154512'),(17,'1635041110','1635041110','李溪芮','女',19,'r03','130131199912165632'),(18,'1635042206','1635042206','关晓燕','女',20,'r03','130131199812175431'),(19,'1635043214','1635043214','李一涵','女',19,'r03','130131199905047841'),(20,'1635044111','1635044111','陈子阳\r\n','男\r\n',20,'r03','130131199802093142\r\n'),(21,'1635045210','1635045210','陈阳','男',19,'r03','130131199805195434'),(22,'1635046328','1635046328','张苏','女',18,'r03','130131199905130210'),(23,'1635047512','1635047512','宋茜','女',19,'r03','130131199802102334'),(32,'1635048319','1635048319','于放','男',20,'r03','130131199702231517'),(33,'1635049730','1635049730','王强','男',19,'r03','130131199805201727');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
