package com.fxd.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.entity.Goods;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("goods")
public class GoodsController extends BaseController {
	
	@RequestMapping("getGoodsList")
	public String getGoodsList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<Goods> page=goodsService.getGoodsList(pageNo,pageSize);
		List<Goods> gList=page.getList();
		model.addAttribute("gList", gList);
		model.addAttribute("page", page);
		return "goods/goodsList";
	}
}
