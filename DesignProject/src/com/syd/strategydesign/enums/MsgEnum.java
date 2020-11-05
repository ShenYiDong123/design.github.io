package com.syd.strategydesign.enums;

import java.util.HashMap;
import java.util.Map;

public enum MsgEnum {
	
	MS028("MS028", "com.syd.strategydesign.service.impl.MS028"),MS003("MS003", "com.syd.strategydesign.service.impl.MS003"),
	;
	private String msgid;
	private String clazz;

	public static Map<String, String> getAllClazz() {
		Map<String, String> map = new HashMap<String, String>();
		for (MsgEnum msgEnum : MsgEnum.values()) {
			map.put(msgEnum.getMsgid(), msgEnum.getClazz());
		}
		return map;
	}

	MsgEnum(String msgid, String clazz) {
		this.msgid = msgid;
		this.clazz = clazz;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

}
