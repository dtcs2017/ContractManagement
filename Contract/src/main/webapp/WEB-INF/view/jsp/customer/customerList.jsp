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
    
    <title>权限列表</title>
    
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
    		  <!-- table plush design -->
    		  <div class="col-md-12 col-sm-12 col-xs-12">
          <div class="x_panel">
            <div class="x_title">
              <h2>客户列表</small></h2>
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
              <div class="well" style="overflow: auto">
                <form id="queryform" action="customer/getCustomerList" class="form-horizontal" >
                  <div class="col-sm-3" style="margin-left:-10px" >
                    <label>用户角色</label>
                    <select class="form-control input-sm" name="roleId">
                      <option value="">请选择</option>
                      <option value="1">管理员</option>
                      <option value="2">采购员</option>
                      <option value="3">采购经理</option>
                      <option value="4">财务员</option>
                      <option value="5">法务员</option>
                      <option value="6">CEO</option>
                    </select>
                  </div>
                  <div class="col-sm-4">
                    <label>所属公司</label>
                    <select class="form-control input-sm">
                      <option value="">请选择</option>
                      <option value="">付晓东</option>
                      <option value="">付晓东</option>
                    </select>
                  </div>
                  <div class="col-sm-4">
                    <label>用户名、真实姓名、联系电话</label>
                    <div class="input-group">
                      <input class="form-control input-sm" type="text">
                      <span class="input-group-btn">
                        <button class="btn btn-primary input-sm" type="button">查询</button>
                      </span>
                    </div>
                  </div>
                  <div class="col-sm-1">
                    <br>
                    <button class="btn btn-primary input-sm" type="reset" style="margin-top:5px;">重置选项</button>
                  </div>
              	</form>
              </div>
              
              <div class="dataTables_wrapper form-inline dt-bootstrap no-footer">
              	<div class="row">
              	  <div class="col-sm-12">
              	    <table id="datatable-checkbox" class="table table-striped table-bordered bulk_action">
	                <thead>
	                  <tr class="headings">
	                    <th>
	                    <th>
	                      <div class="icheckbox_flat-green" style="position: relative;">
	                        <input type="checkbox" id="check-all" class="flat">
	                      </div>
	                    </th>
	                    <th class="column-title">客户名称</th>
	                    <th class="column-title">客户地址</th>
	                    <th class="column-title">代理人</th>
	                    <th class="column-title">手机</th>
	                    <th class="column-title">开户行</th>
	                    <th class="column-title no-link last"><span class="nobr">操作</span>
	                    </th>
	                    <th class="bulk-actions" colspan="7">
	                      <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
	                    </th>
	                  </tr>
	                </thead>
	
	
	                <tbody>
	                  <c:choose>
	                    <c:when test="${empty cList }">
	                      <tr>
	                       	<td colspan="10">暂无数据</td>
	                   	  </tr>
	                      </c:when>
	                     	<c:otherwise>
	                     	  <c:forEach items="${cList}" var="customer" varStatus="status">
	                     		<c:if test="${status.count%2==0 }">
	                     		  <tr class="even pointer">
	                     		    <td></td>
	                     		    <th>
	                     		      <div class="icheckbox_flat-green" style="position: relative;">
	                     		        <input type="checkbox" class="flat"/>
	                     		      </div>
	                     		    </th>
				                    <td>${customer.customerName }</td>
				                    <td>${customer.customerAddress }</td>
				                    <td>${customer.agent }</td>
				                    <td>${customer.mobileNum }</td>
				                    <td>${customer.bankName }</td>
				                    <td class=" last">
				                      <div class="btn-group">
				                        <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="View" href="customer/viewCutomer?customerId=${customer.customerId }">
		                                  <i class="fa fa-eye"></i>
		                                </a>
		                                <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="Edit" href="customer/toUpdateCustomer?customerId=${customer.customerId }">
		                                  <i class="fa fa-pencil"></i>
		                                </a>
		                                <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="Delete" href="javascript:void(0);" onclick="deleteCustomer(${customer.customerId })">
		                                  <i class="fa fa-trash"></i>
		                                </a>
		                              </div>
				                    </td>
	                     		  </tr>
	                     	    </c:if>
	                     		<c:if test="${status.count%2!=0 }">
	                     		  <tr class="even pointer">
	                     			<td></td>
	                     		    <th>
	                     		      <div class="icheckbox_flat-green" style="position: relative;">
	                     		        <input type="checkbox" class="flat"/>
	                     		      </div>
	                     		    </th>
		                            <td>${customer.customerName }</td>
				                    <td>${customer.customerAddress }</td>
				                    <td>${customer.agent }</td>
				                    <td>${customer.mobileNum }</td>
				                    <td>${customer.bankName }</td>
		                            <td class=" last">
		                              <div class="btn-group">
		                                <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="View" href="customer/viewCutomer?customerId=${customer.customerId }">
		                                  <i class="fa fa-eye"></i>
		                                </a>
		                                <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="Edit" href="customer/toUpdateCustomer?customerId=${customer.customerId }">
		                                  <i class="fa fa-pencil"></i>
		                                </a>
		                                <a class="btn btn-sm btn-default" data-placement="top" data-toggle="tooltip" 
		                                	data-original-title="Delete" href="javascript:void(0);" onclick="deleteCustomer(${customer.customerId })">
		                                  <i class="fa fa-trash"></i>
		                                </a>
		                              </div>
		                            </td>
                    			  </tr>
	                     		</c:if>
	                     	  </c:forEach>
	                     	</c:otherwise>
	                     </c:choose>
	                  </tbody>
	                </table>
              	  </div>
              	</div>
              	<div class="row">
              	    <div class="dataTables_paginate paging_simple_numbers">
	            	<jsp:include page="../rightFooter.jsp"></jsp:include>
	            	</div>
              	</div>
              </div>
	              
            </div>
          </div>
        </div>
    		  <!-- /table plush design -->
    		
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
    <!-- iCheck -->
    <script src="resources/plugins/iCheck/icheck.min.js"></script>
    <script src="resources/plugins/jszip/dist/jszip.min.js"></script>
    <script src="resources/plugins/pdfmake/build/pdfmake.min.js"></script>
    <script src="resources/plugins/pdfmake/build/vfs_fonts.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="resources/plugins/custom/js/custom.min.js"></script>
    
    <script type="text/javascript">
      function deleteRole(authorityId){
    	  $.ajax({
  			type:"post",
  			url:"authority/deleteAuthority",
  			data:{'authorityId':authorityId},
  			dataType:"json",
  			success:function(data){
  				if(data.resultCode==1){
  					alert("删除成功");
  					window.location.href="authority/getAuthorityList";
  				}
  			}
  		});
      }
    </script>
  </body>
</html>
