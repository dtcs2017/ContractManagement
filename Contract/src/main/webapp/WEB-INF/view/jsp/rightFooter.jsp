<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="contract" value="${pageContext.request.contextPath}"/>
<style>
<!--
.mysss {
    background-color: #1b559f;
    border-color: #1b559f;
}
-->
</style>
<script type="text/javascript">  
 var $queryform = $("#queryform");
 function pageClick(pNo){
	  var psize = $("#pageSize").val();
	  $("#queryform").append('<input type="hidden" name="pageNo" value="' + pNo + '" />');
	  $("#queryform").append('<input type="hidden" name="pageSize" value="' + psize + '" />');
      $queryform.submit();
 }
  
 function pageSizeClick(){
	 var psize = $("#pageSize").val();
	 $("#queryform").append('<input type="hidden" name="pageSize" value="' + psize + '" />');
     $queryform.submit();
 }
  
  function toGo(){
	  var gonum = $("#go").val();
	  if(gonum==''){
		  return;
	  }
	  pageClick(gonum);
  }
  function verificationGo(){
	  var reg = /^[0-9]{1,9}$/;
	  var gonum = $("#go").val();
	  var total = " ${page.pages}";
	  if(!reg.test(gonum)){
		  $("#go").val("");
		  return;
	  }
	  if( parseInt(gonum) > parseInt(total)){
		  $("#go").val("");
		  return;
	  }
	  if(parseInt(gonum) == 0){
		  $("#go").val("");
		  return;
	  }
  }
  
</script>
  <c:if test="${(! empty (page.list))&&(fn:length(page.list)>0)}">
	<ul class="pagination pagination-sm no-margin pull-right pages-ul">
		<li style="font-size: 12px; margin-left: 10px;padding:6px 10px;">跳转:</li>
		<li style="border:0;padding:0;"><input type="text" id="go" onblur="verificationGo()" style="height:31px;width: 40px;padding: 3px;border: 1px solid #bbb;text-align:center;"/></li>
		<li onclick="toGo()" style="font-size:12px;padding:6px 10px;">GO</li>
		<li style="font-size: 12px; margin-left: 10px;border:0;padding:0;"><span style="float:left;background:none;border:0;color:#333;">每页显示</span>
			<select id="pageSize" style="width: 50px;padding: 3px;border: 1px solid #bbb;margin-left: 10px;text-align:center;float:left;margin-top:2px;" onchange="pageSizeClick()">
				<option value="10" <c:if test="${page.pageSize==10 }">selected="selected"</c:if>>10</option>
				<option value="20" <c:if test="${page.pageSize==20 }">selected="selected"</c:if>>20</option>
				<option value="50" <c:if test="${page.pageSize==50 }">selected="selected"</c:if>>50</option>
				<option value="100" <c:if test="${page.pageSize==100 }">selected="selected"</c:if>>100</option>
				<option value="200" <c:if test="${page.pageSize==200 }">selected="selected"</c:if>>200</option>
				<option value="500" <c:if test="${page.pageSize==500 }">selected="selected"</c:if>>500</option>
			</select>
		</li>
	</ul>	
	<span class="pull-left">共 ${page.total } 条数据</span>
	<ul class="pagination pagination-sm no-margin pull-right pages-ul">
		<c:if test="${page.isFirstPage}">
			<li style="color:#bbb;">首页</li>
	    </c:if>
	    <c:if test="${!page.isFirstPage}">
	    	<li onclick="pageClick(1)">首页</li>
	    </c:if>
		
		 <c:forEach items="${page.navigatepageNums}" var="nav">
            <c:if test="${nav == page.pageNum}">
                <li class="mysss">${ nav}</li>
            </c:if>
            <c:if test="${nav != page.pageNum}">
            	<li onclick="pageClick(${nav})">${nav}</li>
            </c:if>
        </c:forEach>
		
		<c:if test="${page.isLastPage}">
			<li style="color:#bbb;">尾页</li>
	    </c:if>
	    <c:if test="${!page.isLastPage}">
	    	<li onclick="pageClick(${page.pages})">尾页</li>
	    </c:if>
	    
		<li style="font-size: 12px; margin-left: 10px;font-weight: bold;border:0; ">共${page.pages }页</li>
	</ul>
</c:if>