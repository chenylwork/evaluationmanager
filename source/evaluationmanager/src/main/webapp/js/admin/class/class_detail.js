function getStudent(classNo){
	 var students;
	 $.ajax({
		 url:"http://localhost:8080/evaluationmanager/admin/class/getStudentByclassNo",
		 data:{"classes.classNo":classNo},
		 type:"post",
		 async:false,
		 success:function(data){
			 students = data;
				console.log(students);
			}
	 });
	 return students;
 }
 function initStudents(){
	 $(".student_row").remove();
	 var data=eval('('+getStudent("${param.classNo}")+')');
	 $("#student_th").remove();
	 var initHtml = "<tr id='student_th'><th>学号</th><th>姓名</th><th>性别</th><th>入学时间</th></tr>";
	 $("#detailAll").append(initHtml);
	 for(var i in data.student) {
 		initStudent(data.student[i]);
 	}

 }
 function initStudent(student){
	 var initHtml="<tr class='student_row'>";
	 initHtml+="<td>"+student.stuNo+"</td>";
	 initHtml+="<td>"+student.user.name+"</td>";
	 initHtml+="<td>"+student.user.sex.name+"</td>";
	 initHtml+="<td>"+student.joinTime+"</td>";
	 initHtml+="</tr>";
	 $("#detailAll").append(initHtml);
 }
 $(function(){
	 initStudents();
	})