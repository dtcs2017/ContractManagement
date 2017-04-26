<%@ page language="java"  pageEncoding="UTF-8"%> 
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
  <div class="menu_section">
    <h3>General</h3>
    <ul class="nav side-menu">
      <li><a><i class="fa fa-home"></i> 系统管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="user/getUserList">用户列表</a></li>
          <li><a href="role/getRoleList">角色列表</a></li>
          <li><a href="authority/getAuthorityList">权限列表</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-edit"></i> 客户信息管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="customer/getCustomerList">客户列表</a></li>
          <li><a href="customer/toAddCustomer">新增客户</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-desktop"></i> 商品信息管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="goods/getGoodsList">商品列表</a></li>
          <li><a href="goods/toAddGoods">新增商品</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-table"></i> 合同管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="contract/getContractList">合同列表</a></li>
          <li><a href="contract/toAddContract">新增合同</a></li>
          <li><a href="contract/checkContract">合同审核</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-bar-chart-o"></i> 我的信息 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="myInformation/personalData">个人资料</a></li>
          <li><a href="myInformation/toChangePwd">修改密码</a></li>
        </ul>
      </li>
    </ul>
  </div>
</div>