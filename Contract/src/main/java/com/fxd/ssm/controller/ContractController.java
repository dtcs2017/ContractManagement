package com.fxd.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fxd.ssm.base.BaseController;
import com.fxd.ssm.common.JsonResult;
import com.fxd.ssm.entity.Contract;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("contract")
public class ContractController extends BaseController {
	
	@RequestMapping("getContractList")
	public String getContractList(HttpSession session,ModelMap model,
			@RequestParam(required = false, defaultValue = PAGE_NO) int pageNo,
			@RequestParam(required = false, defaultValue = PAGE_SIZE) int pageSize){
		PageInfo<Contract> page=contractService.getContractList(pageNo,pageSize);
		List<Contract> cList=page.getList();
		model.addAttribute("page", page);
		model.addAttribute("cList", cList);
		return "contract/contractList";
	}
	
	@RequestMapping("viewContract")
	public String getContractInfoById(HttpSession session,ModelMap model,
			@RequestParam(required=true) Long contractId){
		Contract contract=contractService.getContractInfoById(contractId);
		model.addAttribute("contractInfo",contract);
		return "contract/contractInfo";
	}
	
	@RequestMapping("toUpdateContract")
	public String toUpdateContract(HttpSession session,ModelMap model,
			@RequestParam(required=true) Long contractId){
		Contract contract=contractService.getContractInfoById(contractId);
		model.addAttribute("contractInfo", contract);
		return "contract/updateContract";
	}
	
	@RequestMapping("updateContract")
	@ResponseBody
	public JsonResult updateContract(HttpSession session,Contract contract){
		JsonResult jResult=new JsonResult();
		String user=getShiroUser();
		contract.setModifier(user);
		int result=contractService.updateContractByRecord(contract);
		if(result>0){
			jResult.setResultCode(1);
			jResult.setErrormsg("合同修改成功");
		}else {
			jResult.setResultCode(0);
			jResult.setErrormsg("合同修改失败");
		}
		return jResult;
	}
}
