-- 1.编码类别表
CREATE TABLE department (
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  typeNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL,
  description VARCHAR(200)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 2.编码信息表
CREATE TABLE CODE(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  codeNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL,
  description VARCHAR(200)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 3.专业-系别关系表
CREATE TABLE dept_major(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  roleNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL,
  description VARCHAR(200)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 4.角色-权限表
CREATE TABLE role_power(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  departmentNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL,
  description VARCHAR(200)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 5.课程信息表
CREATE TABLE course(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  courseNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL UNIQUE
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 6.班级信息表
CREATE TABLE class(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  classNo VARCHAR(16) NOT NULL UNIQUE,
  NAME VARCHAR(20) NOT NULL UNIQUE,
  major VARCHAR(16) NOT NULL
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 7.用户信息表
CREATE TABLE USER(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  account VARCHAR(16) NOT NULL,
  PASSWORD VARCHAR(16) NOT NULL,
  NAME VARCHAR(20) NOT NULL,
  sex VARCHAR(6) NOT NULL,
  age INT(6) NOT NULL,
  role VARCHAR(16) NOT NULL,
  pid VARCHAR(20) NOT NULL UNIQUE 
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 8.教师信息表
CREATE TABLE teacher(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  teacherNo VARCHAR(16) NOT NULL UNIQUE,
  USER VARCHAR(16) NOT NULL,
  role VARCHAR(16) NOT NULL,
  major VARCHAR(16) NOT NULL,
  state VARCHAR(16) NOT NULL 
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 9.教师-课程关系表
CREATE TABLE teacher_course(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  teacher VARCHAR(10) NOT NULL,
  course VARCHAR(10) NOT NULL
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 10.学生信息表
CREATE TABLE student(
  id INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  stuNo VARCHAR(20) NOT NULL UNIQUE,
  USER VARCHAR(16) NOT NULL,
  major VARCHAR(16) NOT NULL,
  joinTime DATE NOT NULL,
  overTime DATE,
  state VARCHAR(16) NOT NULL
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `student_class` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`student` VARCHAR(16) NOT NULL,
	`class` VARCHAR(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建教师-班级信息-课程关系表*/

DROP TABLE IF EXISTS `teacher_class_course`;

CREATE TABLE `teacher_class_course` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`teacher` VARCHAR(16) NOT NULL,
	`class` VARCHAR(16) NOT NULL,
	`course` VARCHAR(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试题信息表*/

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`questionNO` VARCHAR(16) NOT NULL UNIQUE,
	`question` VARCHAR(255) NOT NULL UNIQUE,
	`description` VARCHAR(500)
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建试卷信息表*/

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`paperNo` VARCHAR(16) NOT NULL UNIQUE,
	`type` VARCHAR(16) NOT NULL,
	`description` VARCHAR(500) 
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试卷-试题关系表*/

DROP TABLE IF EXISTS `paper_question`;

CREATE TABLE `paper_question` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`paper` VARCHAR(16) NOT NULL,
	`question` VARCHAR(16) NOT NULL,
	`number` INT(2) NOT NULL,
	`score` INT NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


/*创建试题选项信息表*/

DROP TABLE IF EXISTS `option`;

CREATE TABLE `option` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`optionNo` VARCHAR(16) NOT NULL,
	`option` VARCHAR(150) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;=utf8;

/*创建试题-试题选项关系表*/

DROP TABLE IF EXISTS `paper_option`;

CREATE TABLE `option_option` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`question` VARCHAR(16) NOT NULL,
	`option` VARCHAR(16) NOT NULL,
	`letter` VARCHAR(2) NOT NULL,
	`ratio` INT NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建评测记录信息表*/

DROP TABLE IF EXISTS `evaluation_record`;

CREATE TABLE `evaluation_record` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`startTime` DATETIME NOT NULL,
	`endTime` DATETIME NOT NULL,
	`paper` VARCHAR(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建评测结果详细信息表*/

DROP TABLE IF EXISTS `evaluation_info`;

CREATE TABLE `evaluation_info` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`paper` VARCHAR NOT NULL,
	`user` VARCHAR(16) NOT NULL,
	`teacher` VARCHAR(16) NOT NULL,
	`time` TIMESTAMP NOT NULL,
	`options` VARCHAR(50) NOT NULL,
	`score` DOUBLE NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建登录日志信息表*/

DROP TABLE IF EXISTS `login_log`;

CREATE TABLE `login_log` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`user` VARCHAR(16) NOT NULL,
	`loginTime` DATE NOT NULL,
	`ip` VARCHAR NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*创建操作日志信息表*/

DROP TABLE IF EXISTS `operation_log`;

CREATE TABLE `operation_log` (
	`id` INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`user` VARCHAR(16) NOT NULL,
	`operationTime` DATE NOT NULL,
	`operation` VARCHAR NOT NULL,
	`state` VARCHAR(16) NOT NULL
}ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;






