<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <script type="text/javascript" src="../../js/echarts.js" charset="utf-8"></script>
</head>
<body class="layui-anim layui-anim-up">
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">测评管理</a>
        <a><cite>测评数据统计</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
        	<div class="layui-input-inline">
	            <select name="">
	              <option value="">选择院系</option>
					<c:forEach var="d" items="${deptList}">
						<option value="${d.codeNo}">${d.name}</option>
					</c:forEach>
	            </select>
          	</div>
          	<div class="layui-input-inline">
	            <select name="">
	              	<option value="">选择专业</option>
	                <c:forEach var="m" items="${majorList}">
	              		<option value="${m.majorNo}">${m.name}</option>
			  		</c:forEach>
	            </select>
          	</div>
			<input type="text" name=""  placeholder="测评人" autocomplete="off" class="layui-input">
			<input class="layui-input" name="" placeholder="评教开始日期" id="start">
			<input class="layui-input" name="" placeholder="评教结束日期" id="end">
			<button class="layui-btn"  lay-submit="" lay-filter="sreach">
          <i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      
      <div id="main" style="width: 100%;height:400px;"></div>
      
    </div>
    
    <script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
	var myChart = echarts.init(document.getElementById('main'));

	var option = {
	    tooltip: {
	        trigger: 'item',
	        formatter: "{a} <br/>{b}: {c} ({d}%)"
	    },
	    legend: {
	        orient: 'vertical',
	        x: 'left',
	        data:['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']
	    },
	    series: [
	        {
	            name:'访问来源',
	            type:'pie',
	            selectedMode: 'single',
	            radius: [0, '30%'],
	
	            label: {
	                normal: {
	                    position: 'inner'
	                }
	            },
	            labelLine: {
	                normal: {
	                    show: false
	                }
	            },
	            data:[
	                {value:335, name:'直达', selected:true},
	                {value:679, name:'营销广告'},
	                {value:1548, name:'搜索引擎'}
	            ]
	        },
	        {
	            name:'访问来源',
	            type:'pie',
	            radius: ['40%', '55%'],
	            label: {
	                normal: {
	                    formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
	                    backgroundColor: '#eee',
	                    borderColor: '#aaa',
	                    borderWidth: 1,
	                    borderRadius: 4,
	                    // shadowBlur:3,
	                    // shadowOffsetX: 2,
	                    // shadowOffsetY: 2,
	                    // shadowColor: '#999',
	                    // padding: [0, 7],
	                    rich: {
	                        a: {
	                            color: '#999',
	                            lineHeight: 22,
	                            align: 'center'
	                        },
	                        // abg: {
	                        //     backgroundColor: '#333',
	                        //     width: '100%',
	                        //     align: 'right',
	                        //     height: 22,
	                        //     borderRadius: [4, 4, 0, 0]
	                        // },
	                        hr: {
	                            borderColor: '#aaa',
	                            width: '100%',
	                            borderWidth: 0.5,
	                            height: 0
	                        },
	                        b: {
	                            fontSize: 16,
	                            lineHeight: 33
	                        },
	                        per: {
	                            color: '#eee',
	                            backgroundColor: '#334455',
	                            padding: [2, 4],
	                            borderRadius: 2
	                        }
	                    }
	                }
	            },
	            data:[
	                {value:335, name:'直达'},
	                {value:310, name:'邮件营销'},
	                {value:234, name:'联盟广告'},
	                {value:135, name:'视频广告'},
	                {value:1048, name:'百度'},
	                {value:251, name:'谷歌'},
	                {value:147, name:'必应'},
	                {value:102, name:'其他'}
	            ]
	        }
	    ]
	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
    
    <script type="text/javascript">
	    layui.use('laydate', function(){
	        var laydate = layui.laydate;
	      
	        //执行一个laydate实例
	        laydate.render({
	          elem: '#start' //指定元素
	        });
	
	        //执行一个laydate实例
	        laydate.render({
	          elem: '#end' //指定元素
	        });
	      });
    </script>
</body>
</html>