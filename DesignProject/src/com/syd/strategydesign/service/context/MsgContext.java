package com.syd.strategydesign.service.context;

import java.util.Map;

import javax.xml.ws.handler.MessageContext;

import com.syd.strategydesign.enums.MsgEnum;
import com.syd.strategydesign.service.MsgInterface;

/**
 * 策略上下文
 * @author shenyidong
 *
 */
public class MsgContext {
	
	public static MsgInterface getInstance(String message) throws Exception{
		MsgInterface inter=null;
		Map<String, String> allClazz = MsgEnum.getAllClazz();
		String clazz = allClazz.get(message);
		if (message!=null && message.trim().length()>0) {
            inter = (MsgInterface) Class.forName(clazz).newInstance();//调用无参构造器创建实例
		}
		return inter;
	}
}
