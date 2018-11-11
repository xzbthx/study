<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>在线教育平台</title>
		<meta name="viewport" content="width=device-width initial-scale=1"/>
		<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
		
		
		<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="Home.css" type="text/css">
		<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
		
		<script type="text/javascript">
			function usersout(){
				var username=document.getElementsByName("uname")[0].value;
				var a="用户不存在";
				var b="验证成功";
				var c="";
				if(username==""){
					document.getElementsByName("usersMistake")[0].innerHTML=c;
					document.getElementsByName("passwordTo")[0].href="";
				}else{
					$.ajax({
						type:"GET",
						url:"/users/querySelective?username="+username,
						dataType:"json",
						data:{},
						success:function(data){
							if(data[0]==null){
								document.getElementsByName("usersMistake")[0].innerHTML=a;
								document.getElementsByName("passwordTo")[0].href="";
							}else{
								document.getElementsByName("usersMistake")[0].innerHTML="验证成功";
								document.getElementsByName("passwordTo")[0].href="";
							}
						}
					});
				}
			}
			
			function passwordout(){
				var passwords=document.getElementsByName("upwd")[0].value;
				var a="请输入正确的用户名";
				var b="密码错误";
				var c="验证成功";
				var d="";
				var e="";
				if(passwords==""||document.getElementsByName("uname")[0].value==""){
					document.getElementsByName("passwordMistake")[0].innerHTML=d;
					document.getElementsByName("passwordTo")[0].href="";
				}else if(document.getElementsByName("usersMistake")[0].innerHTML=="用户不存在"){
					document.getElementsByName("passwordMistake")[0].innerHTML=a;
					document.getElementsByName("passwordTo")[0].href="";
				}else{
					$.ajax({
						type:"GET",
						url:"/users/querySelective?passwords="+passwords,
						dataType:"json",
						data:{},
						success:function(data){
							for(var i=0;;i++){
								if(data[i]==null){
									document.getElementsByName("passwordMistake")[0].innerHTML=b;
									document.getElementsByName("passwordTo")[0].href="";
									break;
								}else if(data[i].username!=document.getElementsByName("uname")[0].value){
									document.getElementsByName("passwordMistake")[0].innerHTML=b;
									document.getElementsByName("passwordTo")[0].href="";
								}else{
									document.getElementsByName("passwordMistake")[0].innerHTML=c;
									document.getElementsByName("passwordTo")[0].href="/student?username="+document.getElementsByName("uname")[0].value;
									e=document.getElementsByName("uname")[0].value;
									break;
								}
							}
						}
					});
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
							<li><a class="nav-login" href="javascript:;">登录</a></li>
							<li><a class="nav-signup" href="javascript:;">注册</a></li>
							<li><a  href="#">关于我们</a></li>
							<li><input type="text" id="myInput" onkeyup="myFunction()" placeholder="搜索..." /></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		
	<div class="login-form">
		<div class="login-header">
			<a href="javascript:;" title="关闭" class="login-close close">×</a>
			<h3 class="loginlabel">用户登录</h3>
		</div>
		<div class="col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
			<form action="main.html" method="get" >
				<div class="input">
					<label>用户名</label>
					<input type="text" class="uname" id="uname" name="uname" autocomplete="off" spellcheck="false" placeholder="请输入用户名" onblur="usersout()"/>
					<span name="usersMistake"></span>
				</div>
				<div class="input">
					<label>密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
					<input type="password" class="upwd" id="upwd" name="upwd" autocomplete="off" spellcheck="false" placeholder="请输入密码"  onblur="passwordout()"/>
					<span name="passwordMistake"></span>
				</div>
				<div class="form-group">
					<div class="checkbox">
						<label><input type="checkbox"  name="checkname" id="checkid" onchange="changeval()" value="0">下次自动登录</label>
						<div class="pull-right">
							<a href="" class="text-right">忘记密码？</a>
						</div>
					</div>
				</div>
				<div class="form-group">
					<a type="submit" class="btn btn-info btn-lg btn-block" name="passwordTo" >登    录</a>
				</div>
				<div class="nav-signup">
					<a href="javascript:;" class="register-btn btn btn-info btn-lg btn-block" >注册新账号</a>
				</div>
			</form>
		</div>
	</div>
	
	<div class="login-form-mask"></div>
		<div class="signup-form">
			<div class="signup-header">
				<a href="javascript:;" title="关闭" class="signup-close close">×</a>
				<h3 class="signuplabel">用户注册</h3>
			</div>
			<div class="col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
				<form action="main.html" method="get">
					<table>
					    <tr><td><span>用户名</span></td><td><input type="text" name="user_name"/></td></tr>
					    <tr><td><span>email</span></td><td><input type="text" name="user_email"/></td></tr>
					    <tr><td><span>密码</span></td><td><input type="password" name="user_password"/></td></tr>
					    <tr><td><span>确认密码</span></td><td><input type="password" name="user_confirm_password"/><span id="where"></span></td></tr>   
					    <tr><td>性别</td><td><input type="radio" id="male" name="user_sex" checked />男<input type="radio" id="female" name="user_sex" />女</td></tr>
					    <tr><td>手机号码</td><td><input type="text" name="user_phone1"/></td></tr>
					    <tr><td colspan="2"><input type="checkbox" checked/>我已看过并接受<a href="#">《用户协议》</a></td></tr>
					    <tr><td colspan="2">
						<div class="form-group">
							<button type="submit" class="btn btn-info btn-lg btn-block">立即注册</button>
						</div></td></tr>
					</table>
				</form>
			</div>
		</div>
		<div class="signup-form-mask"></div>
		<div id="main">
			<!--<div class="biaoyu">
				<span>教育平台</span>
			</div>-->
			<div id="headline">
					<ul>
						<li style="background-image: url(img/L1.jpg);background-size: 100% 100%;"></li>
					    <li style="background-image: url(img/L2.jpg);background-size: 100% 100%; "></li>
						<li style="background-image: url(img/L1.jpg);background-size: 100% 100%; "></li>
						<li style="background-image: url(img/L2.jpg);background-size: 100% 100%;"></li>
						<li style="background-image: url(img/L1.jpg);background-size: 100% 100%;"></li>
					    <li style="background-image: url(img/L2.jpg);background-size: 100% 100%;"></li>
						<li style="background-image: url(img/L1.jpg);background-size: 100% 100%;"></li>
						<li style="background-image: url(img/L1.jpg);background-size: 100% 100%;"></li>
						<li style="background-image: url(img/L2.jpg);background-size: 100% 100%;"></li>
						<li style="background-image: url(img/L2.jpg);background-size: 100% 100%;"></li>
					</ul>
					
			</div>
		</div>
		
		<div id="brief">
			<div class="classification">
				<img src="img/P1.png"/>
				<span class="biaoyu">学生课表管理</span>
			</div>
			<div class="classification">
				<img src="img/P2.png" />
				<span class="biaoyu">自动化考试系统</span>
			</div>
			<div class="classification">
				<img src="img/P3.png" />
				<span class="biaoyu">任务式教学计划</span>
			</div>
			<div class="classification">
				<img src="img/P4.png" /> 
				<span class="biaoyu">师生多渠道互动</span>
				
			</div>
			
		</div>
		
		<div class="row">
				<div class="col-lg-12">
					<div class="title" id="nature">
						<span>自然语言类</span> 
						<span class=gengduo>
							<a href="#">更多></a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/z1.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="" onclick="c()">职场沟通英语</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/z2.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">大学日语</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/z3.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">魅力语言学</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/z4.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">交替传译</a>
							</span>
						</div>
					</div>
				</div>

			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="title" id="kexue">
						<span>科学类</span>
						<span class=gengduo>
							<a href="#">更多></a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/k1.png" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">化学</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/k2.png" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">走进地理学</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/k3.png" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">数学零距离</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/k4.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">物理-力学</a>
							</span>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<div class="title" id="code">
						<span>计算机语言类</span>
						<span class=gengduo>
							<a href="#">更多></a>
						</span>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/j1.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">Retrofit网络库</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/j2.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">Java Web强化</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/j3.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">PHP高级应用</a>
							</span>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="items">
						<div class="itemsTop">
							<img src="img/j4.jpg" width="100%" />
						</div>
						<div class="itemsBottom">
							<span class="name">
								<a href="#">Python最火爬虫框架</a>
							</span>
						</div>
					</div>
				</div>
			</div>
			
			<div id="chakan">
				<p><button type="button" class="btn btn-info btn-lg">查看更多课程信息</button></p>
            </div>			

		<script type="text/javascript">
			window.onload=function(){ 
				var main = document.getElementById('main');
				var imgs = main.getElementsByTagName('li')[0];
				var imgw = imgs.offsetWidth * 5;
				var timer = null;
				var fx = 0;
	
				moveleft();
				main.onmouseover = function() {
					clearInterval(timer); 
				}
				main.onmouseout = function() {
					clearInterval(timer);
					if(fx == 0) {
						moveleft();
					}
					if(fx == 1) {
						moveright();
					}
				}
				function moveleft() {
					timer = setInterval(function() {
						main.scrollLeft++;
						
						if(main.scrollLeft >= imgw) {
							main.scrollLeft = 0;
						}
					}, 1)
				}
				
	
				function moveright() { //图片向右滚动函数
					timer = setInterval(function() {
						main.scrollLeft--;
						// 判断整个循环临界值及处理方式
						if(main.scrollLeft <= 0) {
							main.scrollLeft = imgw;
						}
					})
				}
			}

		</script>
		
		<script>
		        //设置登录页面弹出效果
			jQuery(document).ready(function($) {
			$('.nav-login').click(function() {
			$('.login-form-mask').fadeIn(100);
			$('.login-form').slideDown(200);
			})
			$('.login-close').click(function() {
			$('.login-form-mask').fadeOut(100);
			$('.login-form').slideUp(200);
			})
			})
		</script>
		<script>
        //设置注册页面弹出效果
			jQuery(document).ready(function($) {
			$('.nav-signup').click(function() {
			$('.signupn-form-mask').fadeIn(100);
			$('.signup-form').slideDown(200);
			})
			$('.signup-close').click(function() {
			$('.signup-form-mask').fadeOut(100);
			$('.signup-form').slideUp(200);
			})
			})
		</script>
		
	</body>
 
</html>
