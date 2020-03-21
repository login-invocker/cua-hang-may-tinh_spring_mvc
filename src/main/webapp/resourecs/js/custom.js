$("body").on("click",".page-item",()=>{
	$(".page-item").remoteClass("active");
	$(this).addClass("active");
	var totalPage=$(this).text;
	var fistProduct = (totalPage-1)*5;
	$.ajax({
		url:"/cuahangmaytinh/api/getproductlimit",
		type:"GET",
		data:{
			fistProduct:fistProduct,
		},success:function(value){
			var tbodyproduct=$("#table-product").find("tbody");
			tbodyproduct.empty();
			tbodyproduct.append(value);
		}
			
	})
})