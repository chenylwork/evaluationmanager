
/*创建学生-班级关系表*/

DROP TABLE IF EXISTS `student_class`;

CREATE TABLE `student_class` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`student` int(10) NOT NULL,
	`class` int(10) NOT NUll
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建教师-班级信息-课程关系表*/

DROP TABLE IF EXISTS `teacher_class_course`;

CREATE TABLE `teacher_class_course` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`teacher` int(10) NOT NULL,
	`class` int(10) NOT NULL,
	`course` int(10) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试题信息表*/

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`questionNO` varchar(6) NOT NULL UNIQUE,
	`question` varchar(255) NOT NULL,
	`description` varchar(500)
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建试卷信息表*/

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`paperNo` varchar(6) NOT NULL UNIQUE,
	`type` varchar(16) NOT NULL,
	`description` varchar(500) 
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试卷-试题关系表*/

DROP TABLE IF EXISTS `paper_question`;

CREATE TABLE `paper_question` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`paper` int(10) NOT NULL,
	`question` int(10) NOT NUll,
	`number` int(2) NOT NULL,
	`score` int NOT NUll
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试题选项信息表*/

DROP TABLE IF EXISTS `option`;

CREATE TABLE `option` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`optionNo` varchar(16) NOT NULL,
	`option` varchar(150) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;=utf8;

/*创建试题-试题选项关系表*/

DROP TABLE IF EXISTS `paper_option`;

CREATE TABLE `option_option` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`question` int(10) NOT NULL,
	`option` int(10) NOT NULL,
	`letter` varchar(2) NOT NULL,
	`ratio` int NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建评测记录信息表*/

DROP TABLE IF EXISTS `evaluation_record`;

CREATE TABLE `evaluation_record` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`startTime` datetime NOT NULL,
	`endTime` datetime NOT NULL,
	`paper` varchar(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建评测结果详细信息表*/

DROP TABLE IF EXISTS `evaluation_info`;

CREATE TABLE `evaluation_info` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`paper` varchar NOT NULL,
	`user` int(10) NOT NULL,
	`teacher` int(10) NOT NULL,
	`time` timestamp NOT NULL,
	`options` varchar(50) NOT NULL,
	`score` double NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建登录日志信息表*/

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`user` int NOT NULL,
	`loginTime` date NOT NULL,
	`ip` varchar NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建操作日志信息表*/

DROP TABLE IF EXISTS `operation_log`;

CREATE TABLE `operation_log` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`user` int(10) NOT NULL,
	`operationTime` date NOT NULL,
	`operation` varchar NOT NULL,
	`state` varchar(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;











