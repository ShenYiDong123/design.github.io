package com.syd.strategydesign.service.impl;

import com.syd.strategydesign.service.MsgInterface;

public class MS003 implements MsgInterface{

	@Override
	public void manage(String msg) {
		System.out.println("MS003");
	}

}
