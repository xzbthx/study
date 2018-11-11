<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">

	window.onload=function(){
		document.getElementsByTagName("button")[0].onclick=function(){
			$.ajax({
				type:"GET",
				url:"/adjustment/selectByID?adID=1",
				dataType:"json",
				data:{},
				success:function(data){
					alert(data.ad_introduction);
				}
			});  
			/* var request=new XMLHttpRequest();
			request.open("GET","/adjustment/selectByID?adID=1",true);
			request.send(null);
			request.onreadystatechange=function(){
				if(request.readyState==4){
					if(request.status==200||request.status==304){
						alert(request.responseText);
					}
				}
			} */
		} 
	}

</script>
<title>Insert title here</title>
</head>
<body>
	<button>Hello</button>
</body>
</html>