-- 创建教师信息视图start
DROP VIEW IF EXISTS v_teacher;
CREATE VIEW v_teacher AS 
SELECT 
t.teacherNo NO,u.account,u.name,u.password,u.sex,u.age,u.pid,t.role roleNo,r.name roleName,t.major majorNo,m.name majorName,t.state,st.name stateName,m.deptNo,c.name deptName
FROM USER u, teacher t,major m ,CODE c,role r ,CODE st
WHERE t.user = u.account AND t.major = m.majorNo AND m.deptNo = c.codeNo AND u.role = r.no AND t.state = st.codeNo

SELECT * FROM v_teacher;

--**********************************************************************************************************************
--**********************************************************************************************************************

-- 创建试卷教师关系视图start
DROP VIEW IF EXISTS v_paper_teacher;
CREATE VIEW v_paper_teacher AS 
SELECT * FROM (
SELECT CONCAT(p.paperNo,t.teacherNo) id, p.paperNo,p.TYPE,pc.name typeName,p.description,p.startTime,p.endTime,t.teacherNo,t.name,t.role,t.major,t.state,m.deptNo dept
FROM paper p ,CODE pc, (SELECT t.*,u.name FROM teacher t ,USER u WHERE t.user = u.account ) t,major m
WHERE p.type = pc.codeNo AND t.`major` = m.`majorNo`) a;
--**********************************************************************************************************************
--***********************************************************************************************************************

--创建学生视图
DROP VIEW IF EXISTS v_student;
CREATE VIEW v_student AS SELECT 
s.stuno NO,u.`account`,u.`NAME`,u.`PASSWORD`,u.`sex`,u.`age`,u.`pid`,s.`joinTime`,s.`overTime`,s.`classNo`,cl.`NAME` className,s.`role` roleNo,st.name stateName,r.`name` roleName,
s.`major` majorNo,m.`name` majorName,s.`state`,m.`deptNo`,c.`NAME` deptName
FROM USER u, student s,major m ,CODE c,role r ,class cl,CODE st
WHERE s.user = u.account AND s.major = m.majorNo AND m.deptNo = c.codeNo AND u.role = r.no AND s.classNo = cl.classNo AND s.state = st.codeNo;

--***********************************************************************************************************************
--**********************************************************************************************************************

-- 试卷详情信息视图（包括试卷信息、问题信息、选项信息）
DROP VIEW IF EXISTS v_paper;
CREATE VIEW v_paper AS
SELECT  pq.`paper` paperNo,p.type paperType,p.description,p.startTime,p.endTime, pq.`question` questionNo,pq.`number`,pq.`score`,q.`question` questionInfo, qo.`letter`,qo.`ratio`,qo.`optionNo`,o.`info` optionInfo
FROM paper_question pq , question_option qo, paper p,question q,optioninfo o 
WHERE pq.`question` = qo.`question` AND pq.`question` = q.`questionNO` AND pq.paper = p.paperNo AND qo.`optionNo` = o.`optionNo`
ORDER BY pq.`number`,qo.`letter`;

--**********************************************************************************************************************
--**********************************************************************************************************************
-- 创建测评结果视图
DROP VIEW IF EXISTS v_evaluation;
CREATE VIEW v_evaluation AS
SELECT e.*, u.name userName,u.sex userSex,u.role userRole,ur.name userRoleName,uc.name userRoleTypeName,t.user teacherAccount,tu.name teacherName,
t.role teacherRole,t.major teacherMajor,tr.name teacherRoleName,tc.name teacherRoleTypeName,m.name teacherMajorName,m.deptno teacherDept,mc.name teacherDeptName
FROM evaluation_info e,USER u ,teacher t, USER tu,role ur,CODE uc,role tr,CODE tc,major m,CODE mc
WHERE e.user = u.account AND e.teacher = t.teacherNo AND u.role = ur.`no` 
AND ur.type = uc.codeNo AND t.role = tr.`no` AND t.user = tu.account AND tr.`type` = tc.codeNo AND t.major = m.majorNo AND m.deptno = mc.codeno