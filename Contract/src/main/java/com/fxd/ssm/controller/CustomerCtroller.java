package com.fxd.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.entity.Customer;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("customer")
public class CustomerCtroller extends BaseController {
	
	@RequestMapping("getCustomerList")
	public String getCustomerList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<Customer> page=customerService.getCustomerList(pageNo,pageSize);
		List<Customer> cList=page.getList();
		model.addAttribute("cList", cList);
		model.addAttribute("page", page);
		return "customer/customerList";
	}
}
