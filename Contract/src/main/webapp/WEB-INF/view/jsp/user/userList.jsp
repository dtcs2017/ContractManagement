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
    
    <title>用户列表</title>
    
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
    <link href="${contract}/resources/plugins/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <%-- <link href="${contract}/resources/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet"> --%>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${contract}/resources/plugins/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${contract}/resources/plugins/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="${contract}/resources/plugins/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="${contract}/resources/plugins/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="${contract}/resources/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${contract}/resources/plugins/custom/css/custom.min.css" rel="stylesheet">

  </head>
  
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
      	<div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>首页</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="${contract}/resources/images/img.jpg" alt="..." class="img-circle profile_img">
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
                    	<li><a href="index.html">角色列表</a></li>
                    	<li><a href="index.html">权限列表</a></li>
                      <li><a href="index.html">Dashboard</a></li>
                      <li><a href="index2.html">Dashboard2</a></li>
                      <li><a href="index3.html">Dashboard3</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">General Form</a></li>
                      <li><a href="form_advanced.html">Advanced Components</a></li>
                      <li><a href="form_validation.html">Form Validation</a></li>
                      <li><a href="form_wizards.html">Form Wizard</a></li>
                      <li><a href="form_upload.html">Form Upload</a></li>
                      <li><a href="form_buttons.html">Form Buttons</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i> UI Elements <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="general_elements.html">General Elements</a></li>
                      <li><a href="media_gallery.html">Media Gallery</a></li>
                      <li><a href="typography.html">Typography</a></li>
                      <li><a href="icons.html">Icons</a></li>
                      <li><a href="glyphicons.html">Glyphicons</a></li>
                      <li><a href="widgets.html">Widgets</a></li>
                      <li><a href="invoice.html">Invoice</a></li>
                      <li><a href="inbox.html">Inbox</a></li>
                      <li><a href="calendar.html">Calendar</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> Tables <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="tables.html">Tables</a></li>
                      <li><a href="tables_dynamic.html">Table Dynamic</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i> Data Presentation <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="chartjs.html">Chart JS</a></li>
                      <li><a href="chartjs2.html">Chart JS2</a></li>
                      <li><a href="morisjs.html">Moris JS</a></li>
                      <li><a href="echarts.html">ECharts</a></li>
                      <li><a href="other_charts.html">Other Charts</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
                      <li><a href="fixed_footer.html">Fixed Footer</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
              <div class="menu_section">
                <h3>Live On</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-bug"></i> Additional Pages <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="e_commerce.html">E-commerce</a></li>
                      <li><a href="projects.html">Projects</a></li>
                      <li><a href="project_detail.html">Project Detail</a></li>
                      <li><a href="contacts.html">Contacts</a></li>
                      <li><a href="profile.html">Profile</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-windows"></i> Extras <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="page_403.html">403 Error</a></li>
                      <li><a href="page_404.html">404 Error</a></li>
                      <li><a href="page_500.html">500 Error</a></li>
                      <li><a href="plain_page.html">Plain Page</a></li>
                      <li><a href="login.html">Login Page</a></li>
                      <li><a href="pricing_tables.html">Pricing Tables</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-sitemap"></i> Multilevel Menu <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                        <li><a href="#level1_1">Level One</a>
                        <li><a>Level One<span class="fa fa-chevron-down"></span></a>
                          <ul class="nav child_menu">
                            <li class="sub_menu"><a href="level2.html">Level Two</a>
                            </li>
                            <li><a href="#level2_1">Level Two</a>
                            </li>
                            <li><a href="#level2_2">Level Two</a>
                            </li>
                          </ul>
                        </li>
                        <li><a href="#level1_2">Level One</a>
                        </li>
                    </ul>
                  </li>                  
                  <li><a href="javascript:void(0)"><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
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
                    <img src="${contract}/resources/images/img.jpg" alt="">John Doe
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
                        <span class="image"><img src="${contract}/resources/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${contract}/resources/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${contract}/resources/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${contract}/resources/images/img.jpg" alt="Profile Image" /></span>
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
    	<div class="right_col" role="main">
    	  <div class="">
    		<div class="row">
    		  <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Table design <small>Custom design</small></h2>
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
					<div class="row">
					  <div class="col-sm-12">
					    <div class="card-box table-responsive">
					      <p class="text-muted font-13 m-b-30">Add class <code>bulk_action</code> to table for bulk actions options on row select</p>
					      <div class="dataTables_wrapper form-inline dt-bootstrap no-footer">
					      	<div class="row">
					      	  <div class="col-sm-6">
					      	  	<div class="dataTables_length">
					      	  	  <label>
					      	  	  Show
					      	  	  <select class="form-control input-sm">
					      	  	    <option value="10">10</option>
					      	  	    <option value="20">20</option>
					      	  	    <option value="50">50</option>
					      	  	    <option value="100">100</option>
					      	  	  </select>
					      	  	  entries
					      	  	  </label>
					      	  	</div>
					      	  </div>
					      	  
					      	  <div class="col-sm-6">
					      	    <div class="dataTables_filter">
					      	      <label>
					      	      Serach
					      	      <input class="form-control input-sm" type="search"/>
					      	      </label>
					      	    </div>
					      	  </div>
					      	</div>
					      </div>
					    </div>
					  </div>
					</div>
                    <div class="table-responsive">
                      <table class="table table-striped jambo_table bulk_action">
                        <thead>
                          <tr class="headings">
                            <th>
                              <input type="checkbox" id="check-all" class="flat">
                            </th>
                            <th class="column-title">用户名 </th>
                            <th class="column-title">真实姓名 </th>
                            <th class="column-title">用户角色 </th>
                            <th class="column-title">联系电话 </th>
                            <th class="column-title">邮箱 </th>
                            <th class="column-title">创建时间 </th>
                            <th class="column-title">修改时间 </th>
                            <th class="column-title no-link last"><span class="nobr">Action</span>
                            </th>
                            <th class="bulk-actions" colspan="7">
                              <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
                            </th>
                          </tr>
                        </thead>

                        <tbody>
                          <c:choose>
                          	<c:when test="${empty uList }">
                          		<tr>
                            		<td colspan="10">暂无数据</td>
                        		</tr>
                          	</c:when>
                          	<c:otherwise>
                          		<c:forEach items="${uList}" var="user" varStatus="status">
                          			<c:if test="${status.count%2==0 }">
                          				<tr class="even pointer">
                          					<td class="a-center ">
				                              <input type="checkbox" class="flat" name="table_records">
				                            </td>
				                            <td>${user.userName }</td>
				                            <td>${user.realName }</td>
				                            <td>${user.roleName }</td>
				                            <td>${user.phoneNumber }</td>
				                            <td>${user.email }</td>
				                            <td>
				                            	<fmt:formatDate  value="${user.createTime}" type="Date" pattern="yyyy.MM.dd HH:mm:ss" />
				                            </td>
				                            <td>
				                            	<fmt:formatDate  value="${user.modifyTime}" type="Date" pattern="yyyy.MM.dd HH:mm:ss" />
				                            </td>
				                            <td class=" last"><a href="#">修改</a></td>
                          				</tr>
                          			</c:if>
                          			<c:if test="${status.count%2!=0 }">
                          				<tr class="even pointer">
                          					<td class="a-center ">
				                              <input type="checkbox" class="flat" name="table_records">
				                            </td>
				                            <td>${user.userName }</td>
				                            <td>${user.realName }</td>
				                            <td>${user.roleName }</td>
				                            <td>${user.phoneNumber }</td>
				                            <td>${user.email }</td>
				                            <td>
				                            	<fmt:formatDate  value="${user.createTime}" type="Date" pattern="yyyy.MM.dd HH:mm:ss" />
				                            </td>
				                            <td>
				                            	<fmt:formatDate  value="${user.modifyTime}" type="Date" pattern="yyyy.MM.dd HH:mm:ss" />
				                            </td>
				                            <td class=" last"><a href="#">修改</a></td>
                          				</tr>
                          			</c:if>
                          		</c:forEach>
                          	</c:otherwise>
                          </c:choose>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
    		</div>
    		
    		<div class="box-footer clearfix">
	            	<jsp:include page="../rightFooter.jsp"></jsp:include>
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
    <script src="${contract}/resources/plugins/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${contract}/resources/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${contract}/resources/plugins/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${contract}/resources/plugins/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="${contract}/resources/plugins/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="${contract}/resources/plugins/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="${contract}/resources/plugins/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="${contract}/resources/plugins/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="${contract}/resources/plugins/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="${contract}/resources/plugins/Flot/jquery.flot.js"></script>
    <script src="${contract}/resources/plugins/Flot/jquery.flot.pie.js"></script>
    <script src="${contract}/resources/plugins/Flot/jquery.flot.time.js"></script>
    <script src="${contract}/resources/plugins/Flot/jquery.flot.stack.js"></script>
    <script src="${contract}/resources/plugins/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="${contract}/resources/plugins/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="${contract}/resources/plugins/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="${contract}/resources/plugins/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="${contract}/resources/plugins/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="${contract}/resources/plugins/jqvmap/dist/jquery.vmap.js"></script>
    <script src="${contract}/resources/plugins/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="${contract}/resources/plugins/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="${contract}/resources/plugins/moment/min/moment.min.js"></script>
    <script src="${contract}/resources/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${contract}/resources/plugins/custom/js/custom.min.js"></script>
  </body>
</html>
