-- 后台主页面数据信息统计

SELECT 
	(SELECT COUNT(*) deptNo FROM CODE WHERE typeNo = "1") deptNo ,
	(SELECT COUNT(id)  FROM major) majorSize,
	(SELECT COUNT(id) FROM teacher) teacherSize,
	(SELECT COUNT(id) FROM student) studentSize,
	(SELECT COUNT(id) FROM evaluation_Info) evaluationSize
FROM mysql.user LIMIT 1;