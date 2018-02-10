package com.suppresswarnings.osgi.corpus;

import java.util.List;

import com.suppresswarnings.osgi.alone.Format.KeyValue;

public class WXvoice extends WXmsg {
	public String MediaID;
	public String Format;
	public String MsgID;
	public String Recognition;
	@Override
	public void set(List<KeyValue> kvs) {
		this.MediaID = kvs.get(4).value();
		this.Format = kvs.get(5).value();
		this.MsgID = kvs.get(6).value();
		this.Recognition = kvs.get(7).value();
	}

}