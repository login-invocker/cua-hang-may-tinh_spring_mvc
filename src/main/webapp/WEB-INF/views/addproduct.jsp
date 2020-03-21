<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="./config.jsp"></jsp:include>
</head>
<body>
 <div class="row">
        <div class="col-2">
            <div>
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
        <div class="col-10">
        	<div class="row">
        		<table class="table-product table">
        			<thead><tr>
        				<td>
	        				<div class="checkbox">
		        				<label>
		        					<input type="checkbox" value="">
		        				</label>
	        				</div>
        				</td>
        				<td>Ten san pham</td>
        				<td>gia tien</td>
        				<td>trang thai</td>
        				<td>hang san xuat</td>
        			</tr></thead>
        			<tbody>
        				<c:forEach var="product" items="${ listProduct}">
        					<tr>
        						<td>
		        				<div class="checkbox">
			        				<label>
			        					<input type="checkbox" value="">
			        				</label>
		        				</div>
        						</td>
        						<td class="tenSP" data-masp="${product.getId_product() }">${product.getName()}</td>
        						<td class="giatien" data-value="${product.getPrice() }">${product.getPrice() }</td>
        						<td class="status" data-value="${product.getStatus() }">${product.getStatus() }</td>
        						<td class="price" data-value="${product.getPrice() }">${product.getPrice() }</td>
        					</tr>
        					<tr>
        						<td class="Create_by" data-masp="${product.getCreate_by() }">${product.getCreate_by()}</td>
        						<td class="Update_by" data-value="${product.getUpdate_by() }">${product.getUpdate_by() }</td>
        						<td class="Create_at" data-value="${product.getCreate_at() }">${product.getCreate_at() }</td>
        						<td class="Update_at" data-value="${product.getUpdate_at() }">${product.getUpdate_at() }</td>
        					</tr>
        				</c:forEach>
        			</tbody>
        		</table>
    <nav aria-label="...">
	  <ul class="pagination pagination-sm">
		  <c:forEach var="page" begin="1" end = "${totalPage }">
		  	<c:choose>
		  		<c:when test="${page==1 }">
		  			<li class="page-item active"><a class="page-link" href="#">${page }</a></li>
		  		</c:when>
		  		<c:otherwise><li class="page-item"><a class="page-link" href="#">${page }</a></li></c:otherwise>
		  	</c:choose>
		  </c:forEach>
	  </ul>
	</nav>
        	</div>
        </div>
        </div>
</body>
</html>