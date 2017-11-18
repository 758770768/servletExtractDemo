<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-3.0.0.js"></script>
</head>
<body>
	<script type="text/javascript">
		$(function() {
			$.ajax({
				url : "servletOne",
				data:{method:"two"},
				success : function(data, sta) {
					alert(data);
					if(data=="one"){
						confirm("需要发送到servletTwo之three吗?");
						$.ajax({
							url:"servletTwo",
							data:{method:"three"},
							success:function(data,sta){
								alert(data);
							}
						});
					}else if(data=="two"){
						confirm("需要发送到servletTwo之four吗?");
						$.ajax({
							url:"servletTwo",
							data:{method:"four"},
							success:function(data,sta){
								alert(data);
							}
						});
						
					}
				}

			});

		});
	</script>
</body>
</html>