package com.fxd.ssm.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;

@XmlRootElement(name = "jsonResult")
public class JsonResult implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int OK = 1;

	private static final int FAIL = 0;

	/**
	 * 默认是成功的
	 */
	private int resultCode = 1;// 0-失败,1-成功
	private Map<String, Object> data;// 传到前台的数据
	private String url;// 需要跳转的URI
	private String message;// 成功的消息,如果要显示的话
	private String errormsg;// 失败的消息
	private String errorCode;// 失败代码,用于restAPI
	private boolean validateFlag; // 前台校验

	public JsonResult()
	{
	}

	public JsonResult(int resultCode)
	{
		this.resultCode = resultCode;
	}

	public static JsonResult buildFailureJsonResult()
	{
		return new JsonResult(FAIL);
	}

	public static JsonResult buildSuccessJsonResult()
	{
		return new JsonResult(OK);
	}

	public JsonResult(int resultCode, String errorCode, String errormsg)
	{
		this.resultCode = resultCode;
		this.errormsg = errormsg;
		this.errorCode = errorCode;
	}

	public int getResultCode()
	{
		return resultCode;
	}

	public void setResultCode(int resultCode)
	{
		this.resultCode = resultCode;
	}

	public Map<String, Object> getData()
	{
		return data;
	}

	public void setData(String key, Object value)
	{
		if (null == this.data)
		{
			this.data = new HashMap<String, Object>();
		}
		this.data.put(key, value);
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getErrormsg()
	{
		return errormsg;
	}

	public void setErrormsg(String errormsg)
	{
		this.errormsg = errormsg;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public boolean isValidateFlag()
	{
		return validateFlag;
	}

	public void setValidateFlag(boolean validateFlag)
	{
		this.validateFlag = validateFlag;
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String toString()
	{
		return ToStringBuilder.reflectionToString(this);
	}
}
