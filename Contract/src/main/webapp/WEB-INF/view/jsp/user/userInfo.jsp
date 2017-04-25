<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contract" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- Bootstrap -->
    <link href="resources/plugins/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <%-- <link href="resources/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet"> --%>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="resources/plugins/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="resources/plugins/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="resources/plugins/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="resources/plugins/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="resources/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="resources/plugins/custom/css/custom.min.css" rel="stylesheet">
  </head>
  
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
      	<div class="col-md-3 left_col menu_fixed mCustomScrollbar _mCS_1 mCS-autoHide" style="overflow: visible;">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="home" class="site_title"><i class="fa fa-paw"></i> <span>首页</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <jsp:include page="../menuProfile.jsp"></jsp:include>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <jsp:include page="../sideMenu.jsp"></jsp:include>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <jsp:include page="../menuFooter.jsp"></jsp:include>
            <!-- /menu footer buttons -->
            
         </div>
        </div>   
        <!-- top navigation -->
        <jsp:include page="../topNavigation.jsp"></jsp:include>
        <!-- /top navigation -->
	        
        <!-- page content -->
        <div class="right_col" role="main">
    	  <div class="">
    	    <div class="clearfix"></div>
    		<div class="row">
    		  <div class="col-md-12">
    		    <div class="x_panel">
    		      <div class="x_title">
    		        <h2>用户信息</h2>
    		        <div class="clearfix"></div>
    		      </div>
    		      <div class="x_content">
    		        <table class="table" style="border:0">
    		          <tbody>
    		            <tr>
    		              <td style="text-align:right">用户名</td>
    		              <td style="text-align:left">${userInfo.userName }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">真实姓名</td>
    		              <td style="text-align:left">${userInfo.realName }</td>
    		            <tr>
    		              <td style="text-align:right">性别</td>
    		              <td style="text-align:left">${userInfo.gender }</td>
    		            </tr>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">用户角色</td>
    		              <td style="text-align:left">${userInfo.roleName }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">${userInfo.company }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">联系电话</td>
    		              <td style="text-align:left">${userInfo.phoneNumber }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">电子邮箱</td>
    		              <td style="text-align:left">${userInfo.email }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">创建时间 </td>
    		              <td style="text-align:left">
    		                <fmt:formatDate  value="${userInfo.createTime}" type="Date" pattern="yyyy-MM-dd HH:mm:ss" />
    		              </td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">修改时间 </td>
    		              <td style="text-align:left">
    		                <fmt:formatDate  value="${userInfo.modifyTime}" type="Date" pattern="yyyy-MM-dd HH:mm:ss" />
    		              </td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">用户状态</td>
    		              <td style="text-align:left">${userInfo.userState }</td>
    		            </tr>
    		          </tbody>
    		          
    		        </table>
    		      </div>
    		    </div>
    		  </div>
    		</div>
    	  </div>
       	<!-- /page content -->
       	
       	<!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by Colorlib. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>
    <!-- jQuery -->
    <script src="resources/plugins/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="resources/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="resources/plugins/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="resources/plugins/nprogress/nprogress.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="resources/plugins/custom/js/custom.min.js"></script>
  </body>
</html>
