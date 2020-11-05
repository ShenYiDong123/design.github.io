package com.syd.strategydesign;

import com.syd.strategydesign.service.MsgInterface;
import com.syd.strategydesign.service.context.MsgContext;

/**
 * 策略模式优化过多的if/else
 * @author shenyidong
 *
 */
public class MainStart {
	
	public static void main(String[] args) throws Exception {
//        String message = "MS066";
//        if(message.equals("MS066")){
//            System.out.println("MS066");
//        }else if (message.equals("MS034")){
//            System.out.println("MS034");
//        }else if (message.equals("MS064")){
//            System.out.println("MS064");
//        }else{
//            System.out.println("no msgid!");
//        }
		
		String message = "MS003";
        MsgInterface msgInterface = MsgContext.getInstance(message); 
        msgInterface.manage(message);
    }
}
