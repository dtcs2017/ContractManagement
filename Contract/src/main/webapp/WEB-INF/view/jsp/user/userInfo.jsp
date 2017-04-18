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
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>首页</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="resources/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>欢迎您，</span>
                <h2>美男子！</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> 系统管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="user/userList">用户列表</a></li>
                      <li><a href="role/roleList">角色列表</a></li>
                      <li><a href="authority/authorityList">权限列表</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> 客户信息管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">客户列表</a></li>
                      <li><a href="form.html">新增客户</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i> 商品信息管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="general_elements.html">商品列表</a></li>
                      <li><a href="general_elements.html">新增商品</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> 合同管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="tables.html">合同列表</a></li>
                      <li><a href="tables_dynamic.html">新增合同</a></li>
                      <li><a href="tables_dynamic.html">合同审核</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i> 我的信息 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="chartjs.html">个人资料</a></li>
                      <li><a href="chartjs.html">修改密码</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
            
         </div>
        </div>   
        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="resources/images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="resources/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
	        
        <!-- page content -->
        <div class="right_col">
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
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">用户角色</td>
    		              <td style="text-align:left">${userInfo.roleName }</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
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
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
    		            </tr>
    		            <tr>
    		              <td style="text-align:right">所属公司</td>
    		              <td style="text-align:left">################</td>
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
    <script src="resources/plugins/jquery/dist/jquery.js"></script>
    <!-- Bootstrap -->
    <script src="resources/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="resources/plugins/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="resources/plugins/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="resources/plugins/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="resources/plugins/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="resources/plugins/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="resources/plugins/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="resources/plugins/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="resources/plugins/Flot/jquery.flot.js"></script>
    <script src="resources/plugins/Flot/jquery.flot.pie.js"></script>
    <script src="resources/plugins/Flot/jquery.flot.time.js"></script>
    <script src="resources/plugins/Flot/jquery.flot.stack.js"></script>
    <script src="resources/plugins/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="resources/plugins/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="resources/plugins/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="resources/plugins/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="resources/plugins/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="resources/plugins/jqvmap/dist/jquery.vmap.js"></script>
    <script src="resources/plugins/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="resources/plugins/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="resources/plugins/moment/min/moment.min.js"></script>
    <script src="resources/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="resources/plugins/custom/js/custom.min.js"></script>
  </body>
</html>
