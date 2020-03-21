<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="./config.jsp"></jsp:include>
<script >
$(".agileinfo-nav_search").click(function() {
	  
	});
</script>
</head>
<body>
    <div class="row">
        <div class="col-2">
            <div class="float-left">
                <ul>
                    <a href="<c:url value="/addproduct" />"><li>Sản Phẩm</li></a>
                    <a href=""><li>DashBoard</li></a>
                    <a href=""><li>DashBoard</li></a>
                    <a href=""><li>DashBoard</li></a>
                    <a href=""><li>DashBoard</li></a>
                    <a href=""><li>DashBoard</li></a>
                    
                </ul>
            </div>
        </div>
        
        <div class="col-10 ">
        <div class="card" style="width: 80%;">
	    	<div class="input-group mb-3">
				<div class="agileits-navi_search">
					<form action="#" method="post">
						<select id="agileinfo-nav_search" name="agileinfo_search" class="border" required="">
							<option value="">Tất cả các hãng</option>
							<c:forEach var="brand" items="${listbrand }">
								<option value="${brand.getId_trademark() }">${brand.getName()}</option>
							</c:forEach>
						</select>
					</form>
				</div>
				  <div class="row ">
					  <div class="col-8 ">
						  <input type="text" class="form-control" placeholder="name=${signlebrand.getName() }" >
					  </div>
					  <div class="col-4">
						  <input type="text" class="form-control" placeholder="id brand=${signlebrand.getId_trademark()} ">	
					  </div>
				  </div>
			 </div>
	    </div>
        </div>
    </div>
</body>
</html>