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
    
    <title>修改用户信息</title>
    
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
    
    <style type="text/css">
    .my_right_col{
    	min-height: 3825px;
    	padding: 10px 20px 0;
		margin-left: 230px;
		background: #F7F7F7;
    }
    </style>
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
        <div class="right_col" role="main" style="min-height: 100%;">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>修改用户信息 </h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>用户信息 </h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="editUser" action="user/updateUser" method="psot" data-parsley-validate class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >用户名 <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12" name="userName" value="${userInfo.userName }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" >真实姓名 <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input type="text" id="last-name" name="realName" required="required" class="form-control col-md-7 col-xs-12" name="realName" value="${userInfo.realName }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">性别</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <div id="gender" class="btn-group" data-toggle="buttons">
                            <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="0"> 男 
                            </label>
                            <label class="btn btn-primary" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="1"> 女
                            </label>
                          </div>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">电话号码</label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input id="phoneNumber" class="form-control col-md-4 col-xs-12" type="text" name="phoneNumber" value="${userInfo.phoneNumber }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">电子邮箱</label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input id="email" class="form-control col-md-4 col-xs-12" type="text" name="eamil" value="${userInfo.email }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">所属公司</label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input id="company" class="date-picker form-control col-md-7 col-xs-12" type="text" name="company" value="${userInfo.company }">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">用户角色</label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <select class="form-control" name="roleId">
                            <option value="">请选择</option>
                            <option value="1" <c:if test="${userInfo.roleId==1 }">selected="selected"</c:if>>系统管理员</option>
                            <option value="2" <c:if test="${userInfo.roleId==2 }">selected="selected"</c:if>>采购员</option>
                            <option value="3" <c:if test="${userInfo.roleId==3 }">selected="selected"</c:if>>采购经理</option>
                            <option value="4" <c:if test="${userInfo.roleId==4 }">selected="selected"</c:if>>财务审核员</option>
                            <option value="5" <c:if test="${userInfo.roleId==5 }">selected="selected"</c:if>>法务审核员</option>
                            <option value="6" <c:if test="${userInfo.roleId==6 }">selected="selected"</c:if>>CEO</option>
                          </select>
                        </div>
                      </div>
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button class="btn btn-primary" type="button">Cancel</button>
						  <button class="btn btn-primary" type="reset">Reset</button>
                          <button id="submit-btn" type="button" class="btn btn-success">Submit</button>
                        </div>
                      </div>
					  <input type="hidden" name="userId" value="${userInfo.userId }">
                    </form>
                  </div>
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
    <!-- bootstrap-progressbar -->
    <script src="resources/plugins/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="resources/plugins/iCheck/icheck.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="resources/plugins/moment/min/moment.min.js"></script>
    <script src="resources/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- bootstrap-wysiwyg -->
    <script src="resources/plugins/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js"></script>
    <script src="resources/plugins/jquery.hotkeys/jquery.hotkeys.js"></script>
    <script src="resources/plugins/google-code-prettify/src/prettify.js"></script>
    <!-- jQuery Tags Input -->
    <script src="resources/plugins/jquery.tagsinput/src/jquery.tagsinput.js"></script>
    <!-- Switchery -->
    <script src="resources/plugins/switchery/dist/switchery.min.js"></script>
    <!-- Select2 -->
    <script src="resources/plugins/select2/dist/js/select2.full.min.js"></script>
    <!-- Parsley -->
    <script src="resources/plugins/parsleyjs/dist/parsley.min.js"></script>
    <!-- Autosize -->
    <script src="resources/plugins/autosize/dist/autosize.min.js"></script>
    <!-- jQuery autocomplete -->
    <script src="resources/plugins/devbridge-autocomplete/dist/jquery.autocomplete.min.js"></script>
    <!-- starrr -->
    <script src="resources/plugins/starrr/dist/starrr.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="resources/plugins/custom/js/custom.min.js"></script>
    
    <script type="text/javascript">
    $(function(){
    	$("#submit-btn").click(function(){
    		$.ajax({
    			type:"post",
    			url:"user/updateUser",
    			data:$("#editUser").serialize(),
    			dataType:"json",
    			success:function(data){
    				if(data.resultCode==1){
    					alert("修改成功");
    					window.location.href="user/getUserList";
    				}
    			}
    		});
    	});
    });
    </script>
  </body>
</html>
