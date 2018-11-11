<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="/demos/googlegg.js"></script>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" >
	window.onload=function(){
		var username=document.getElementsByName("getUsername")[0].value;
		var stuID;
		var clID;
		//获取学生信息
		$.ajax({
			type:"GET",
			url:"/student/querySelective?username="+username,
			dataType:"json",
			data:{},
			success:function(data){
				stuID=data[0].id;
				document.getElementsByName("selfName")[0].innerHTML=data[0].s_name;
				document.getElementsByName("sex")[0].innerHTML=data[0].s_sex;
				//获取课表信息，包括学生ID、老师ID和课程ID，通过课程ID获得课程信息
				$.ajax({
					type:"GET",
					url:"/sc/querySelective?stuID="+stuID,
					dataType:"json",
					data:{},
					success:function(data){
						clID=data[0].cl_ID;
						//通过上面获取的课程ID，获取课程信息信息,并填写入页面
						$.ajax({
							type:"GET",
							url:"/allclass/querySelective?clID="+clID,
							dataType:"json",
							data:{},
							success:function(data){
								document.getElementsByName("className")[0].innerHTML=data[0].cl_name+data[0].cl_number+"班\r开始时间为:"+data[0].cl_startTime+"结束时间为:"+data[0].cl_endTime;
							}
						});
					}
				});
			}
		});
	}
</script>
<title>个人中心</title>
</head>
<body style="background-color: gainsboro;">
<!--<div id="container">-->
		<div id="mainNav">
			<!--<div id="logo"></div>-->
			<ul>
				<li style="font-size: 2em;margin-top: 1%;"><a href="/home">在线教育平台</a></li>
				<li><a href="/home">首页</a></li>
				<li><a href="">帮助</a></li>
				<li><a href="">关于我们</a></li>
				<li><a href="">注销</a></li>
			</ul>
		</div>
		
		<div id="header">
			<img src="img/头像.jpg" />
			<ul id="name">
				<li class="font" name="selfName"></li>
			</ul>
			<ul>
				<li class="font" name="sex"></li>
				<li class="font"><a href="">个人资料</a></li>
			</ul>
		</div>
<div class="o-m">
	<div class="ul-o">
		<ul>
			<li class="li-o font"><span></span><p>已选课</p><div class="clear"></div><b></b></li>
			<li class="li-t font"><span></span><p>课程表</p><div class="clear"></div><b></b></li>
			<li class="li-s font"><span></span><p>购物车</p><div class="clear"></div><b></b></li>
			<li class="li-f"><span></span><p>已评论</p><div class="clear"></div><b></b></li>
			<li class="li-w"><span></span><p>全部订单</p><div class="clear"></div><b></b></li>
			<li class="li-l"><span></span><p>安全中心</p><div class="clear"></div><b></b></li>
			<div class="li-mask"></div>
		</ul>
	</div>
	<div class="ul-t">
		<li style="display:block" style="float:right;">
			<div class="li-top"  ">
				<div>
					<img src="img/Ajax全接触.jpg" style="margin-top: 0;" />
					<span style="color: black;"><a href="" name="className">dafd</a></span>
				</div>
				<input type="button" value="上一页" id="id1" name="last" style="cursor: pointer;"/>
				<input type="button" value="下一页" id="id2" name="next" style="cursor: pointer;"/>
			</div>
		</li>
		<li>
			<div class="li-top">				
			</div>
		</li>
		<li>
			<div class="li-top">				
			</div>
		</li>
		<li>
			<div class="li-top">				
			</div>
		</li>
		<li>
			<div class="li-top">
			</div>
		</li>
		<li>
			<div class="li-top">
			</div>
		</li>
	</div>
	<div class="clear"></div>
</div>

	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$('.o-m .ul-o li').hover(function () {
			var linum = $(this).index()
			$('.o-m .ul-t li').eq(linum).stop().show().siblings().hide()
		})
		$(function () {
			var slip = $('.li-mask');
			var a = $('.o-m .ul-o li:first');
			//初始化滑块
			slip.css({
				'top': parseInt(a.position().top) + 'px'
			});
			$('.o-m .ul-o li').mouseenter(function () {
				//显示滑块
				if (slip.css('display') == 'none') {
					slip.show();
				};
				//移动滑块
				slip.stop().animate({
					top: parseInt($(this).position().top) + 'px'
				}, 300);
			});
		});
	</script>

	<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">
		<p> 版权所属：江西财经大学软件与物联网工程学院软件工程166班学习小组。成员：徐郑波、唐晶、李婉、彭海霞</p>
		<p>组号：<a href="http://www.lanrenzhijia.com/" target="_blank">第四小组</a></p>
	</div>
	<input style="display:none" name="getUsername" value="${param.username }"/>
</body>
</html>

