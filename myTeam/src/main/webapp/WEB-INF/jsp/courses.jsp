<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>课程详情页</title>
		<meta name="viewport" content="width=device-width initial-scale=1"/>
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		<link href="Courses.css" type="text/css" rel="stylesheet">
		<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		<script type="text/javascript" >
			window.onload=function(){
				var coID=document.getElementsByName("first")[0].value;
				var k=new Array();
				var p=new Array();
				//获取课程信息
				$.ajax({
					type:"GET",
					url:"/courses/querySelective?coID="+coID,
					dataType:"json",
					data:{},
					success:function(data){
						document.getElementsByName("second")[0].innerHTML=data[0].co_name;
						document.getElementsByName("second")[3].innerHTML="课程ID："+data[0].co_ID+"<br>所属模块ID："
								+data[0].m_ID+"<br>详细介绍："+data[0].co_introduction+"<br>";
						//获取班级信息
						$.ajax({
							type:"GET",
							url:"/allclass/querySelective?coID="+coID,
							dataType:"json",
							data:{},
							success:function(data){
								for(var i=0;i<data.length;i++){
									if(data[i]!=null){//获取班级各项信息
										var one=document.getElementById("just");
										var two=document.createElement("span");
										two.class="la";two.name="al";two.id=i+1;
										var three=document.createElement("input");
										three.class="lc";three.type="submit";three.name="cl";three.onclick="cli()";three.style="width:100%;line-height: 50px;font-size: 40px;color:white;background-color:orangered;"
										one.appendChild(two);
										two.appendChild(three);
										document.getElementsByName("cl")[i].value="班级:"+data[i].cl_name+data[i].cl_number+
											"; 课程容量:"+data[i].cl_capacity+"; 开课时间:"+data[i].cl_startTime+"; 结课时间:"+data[i].cl_endTime;
										k[i]=data[i].cl_ID;
										p[i]=data[i].id;
										document.getElementsByName("cl")[i].onclick=function(){
											var m=this.parentNode.id;
											//获取班级及其价格
											$.ajax({
												type:"GET",
												url:"/allclass/querySelective?clID="+k[m-1],
												dataType:"json",
												data:{},
												success:function(data){
													document.getElementsByName("second")[1].innerHTML="班 级："+data[0].cl_name+data[0].cl_number;
													document.getElementsByName("second")[2].innerHTML="价 格："+data[0].cl_price;
												}
											});
											
										}
										
									}else{
										document.getElementsByName("al")[i].style.display="none";
									}
								}
								//获取教师信息，并填入
								var q=new Array();
								q[0]=p[0];
								for(var i=1;i<p.length;i++){
									for(var j=0;j<q.length;j++){
										if(p[i]==q[j]){
											break;
										}else if(j==q.length-1){
											q[q.length]=p[i];
											break;
										}
									}
								}
								for(var i=0;i<q.length;i++){
									$.ajax({
										type:"GET",
										url:"/teacher/querySelective?ID="+q[i],
										dataType:"json",
										data:{},
										success:function(data){
											var fis=document.createElement("span");
											fis.innerHTML="老师ID:"+data[0].id+" 姓名:"+data[0].t_name
												+" 性别:"+data[0].t_sex+" QQ:"+data[0].t_QQ+" 微信:"+data[0].t_wei+" 电话:"
												+data[0].t_mobile+" 简介:"+data[0].t_introduction;
											var lll=document.getElementById("teaa");
											lll.appendChild(fis);
											fis.style="border:2px solid gray;font-size: 2em;font-family: 微软雅黑;line-height: 50px;display:block;text-align:center;background:red;color:white;";
										}
									});
								}
							}
						}); 
					}
				});
			}
			
			function buy(){
				if(document.getElementById("price").childNodes[1].innerHTML=="班 级：****"){
					alert("请先选择班级！");
				}else{
					var theClass=document.getElementById("price").parentNode.childNodes[3].childNodes[1].innerHTML;
					var thePrice=document.getElementById("price").parentNode.childNodes[5].childNodes[1].innerHTML;
					
					var message=confirm(theClass+"\r"+thePrice+"\r是否确定购买？");
					if(message==true){
						alert("购买成功！");
					}else{
						alert("交易失败！");
					}
				}
			}
			
		</script>
		
		
	</head>
	<body>
		<div class="header">
			<nav class="navbar navbar-default" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="/home">在线教育平台</a> 
						<ul class="nav navbar-nav">
						<li><a  href="/home">首页</a></li>
							<li><a  href="/student">个人中心</a></li>
						</ul>					
					</div>
				</div>		
			</nav>
		</div>
		
		<div id="back">
			<div id="innerback">
				<div id=tupian>
					<div class="tupian">
					<!--	<span>计算机语言类>Java Web强化</span>-->
						<img src="img/j2.jpg" />
						
					</div>
				</div>
				<div id="buy">
					<span id="ziti" name="second"></span>
					<div id="price" class="ziti">
						<span name="second">班 级：****</span>
					</div>
					<div id="classname" class="ziti">
						<span name="second">价 格：****</span>
					</div>
					<div id="buy1">
						<input type="button" value="立即购买" onclick="buy()"/>
						<input type="button" value="收藏" />	
					</div>
				</div>
			</div>
		</div>
		<div id="box">
            <div id="head_list">
                <input type="button" value="课程简介" />
                <input type="button" value="所有班级" />
                <input type="button" value="教师简介" />
                <input type="button" value="菜单四" />
            </div>
            <div id="menu_content">
                <div class="ziti2" style="display:block;" name="second"></div>
                <div style="display:none;" name="second" id="just"></div>
                <div style="display:none;" name="second" id="teaa"></div>
                <div style="display:none;" name="second">Hello,I am the forth!</div>
            </div>
        </div>
        
        <script>
            var head_list = document.getElementById("head_list");
            var menu_content = document.getElementById("menu_content");
            var oli = head_list.getElementsByTagName("input");//获取tab列表
            var odiv = menu_content.getElementsByTagName("div");//获取tab内容列表
            for(var i=0 ; i<oli.length ; i++){
                oli[i].index = i;//定义index变量，以便让tab按钮和tab内容相互对应
                    oli[i].onclick = function( ){//移除全部tab样式和tab内容
                    for(var i =0; i < oli.length; i++){
                        oli[i].className = "";
                        odiv[i].style.display = "none";
                    }
                    this.className = "active";//为当前tab添加样式
                    odiv[this.index].style.display="block";//显示当前tab对应的内容
                }
            }
        </script>
		<input style="display:none" name="first" value="${param.coID }"/>
	</body>
</html>
