package com.suppresswarnings.corpus.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public interface Const {
	String delimiter = ".";
	String data = "Data";
	String count= "Count";
	String yes  = "yes";
	String no   = "no";
	String exit = "exit()";
	String continueTitle = "请问是否继续？yes/no";
	public interface Version {
		String V1 = "001";
		String V2 = "002";
	}
	/**
	 * collection or question or classify or reply or produce or unknown
	 * @author lijiaming
	 *
	 */
	public interface TextDataType {
		String collection = "collection";
		String question   = "question";
		String classify   = "classify";
		String reply      = "reply";
		String setthepapar= "setthepapar";
		String unknown    = "unknown";
	}
	
	public interface SetThePaper {
		String question = "question";
		String answer   = "answer";
		String keywords = "keywords";
		String classify = "classify";
		String[] quiz = {question,answer,keywords,classify};
		String[] title= {"请输入问题，例如'请回复与电影相关的语句：'","请给出示例回复，例如'最近新上映了一部黑客帝国'","请给出关键词，多个以逗号分隔，如果没有请回复'无'","请输入该问题类别，例如'电影'"};
	}

	public interface InteractionTTL {
		long userReply = TimeUnit.MINUTES.toMillis(3);
		long setThePaper = TimeUnit.MINUTES.toMillis(5);
		long clearCache = TimeUnit.MINUTES.toMillis(2);
	}
	
	public interface CounterName {
		String data = "Data";
		String type = "Type";
	}
	
	public interface WXmsg {
		int msgTypeIndex = 3;
		String openid = "gh_a1fe05b98706";
		String uri = "action={action}&signature={signature}&timestamp={timestamp}&nonce={nonce}&openid={openid}";
		String xml  = "<xml><ToUserName><![CDATA[%s]]></ToUserName><FromUserName><![CDATA[%s]]></FromUserName><CreateTime>%s</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[%s]]></Content></xml>";
		String news = "<xml><ToUserName><![CDATA[%s]]></ToUserName><FromUserName><![CDATA[%s]]></FromUserName><CreateTime>%s</CreateTime><MsgType><![CDATA[news]]></MsgType><ArticleCount>1</ArticleCount><Articles><item><Title><![CDATA[%s]]></Title><Description><![CDATA[%s]]></Description><PicUrl><![CDATA[%s]]></PicUrl><Url><![CDATA[%s]]></Url></item></Articles></xml>";
		String[] keys = {
				"ToUserName",
				"FromUserName",
				"CreateTime", 
				"MsgType",
				"MediaId",
				"Content",
				"MsgId",
				"PicUrl",
				"Location_X",
				"Location_Y", 
				"Scale", 
				"Latitude","Longitude","Precision",
				"Label", 
				"Recognition"
		};
		
		String[] values = {
				"gh_a1fe05b98706",
				"ot2GL05lU3rpJnJ7Hf_HTVjrozgk"
		};
		
		String[] msgFormat = {
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><Location_X>{Location_X}</Location_X><Location_Y>{Location_Y}</Location_Y><Scale>{Scale}</Scale><Label><![CDATA[{Label}]]></Label><MsgId>{MsgId}</MsgId></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><MediaId><![CDATA[{MediaId}]]></MediaId><Format><![CDATA[{Format}]]></Format><MsgId>{MsgId}</MsgId><Recognition><![CDATA[{Recognition}]]></Recognition></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><Event><![CDATA[{event}]]></Event><Latitude>{Latitude}</Latitude><Longitude>{Longitude}</Longitude><Precision>{Precision}</Precision></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><MediaId><![CDATA[{MediaId}]]></MediaId><ThumbMediaId><![CDATA[{ThumbMediaId}]]></ThumbMediaId><MsgId>{MsgId}</MsgId></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><Event><![CDATA[{event}]]></Event><EventKey><![CDATA[{EventKey}]]></EventKey><Ticket><![CDATA[{Ticket}]]></Ticket></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><PicUrl><![CDATA[{PicUrl}]]></PicUrl><MsgId>{MsgId}</MsgId><MediaId><![CDATA[{MediaId}]]></MediaId></xml>",
				"<xml><ToUserName><![CDATA[{ToUserName}]]></ToUserName><FromUserName><![CDATA[{FromUserName}]]></FromUserName><CreateTime>{CreateTime}</CreateTime><MsgType><![CDATA[{MsgType}]]></MsgType><Content><![CDATA[{Content}]]></Content><MsgId>{MsgId}</MsgId></xml>"
		};
		
		String[] secret = {
				"lijiaming2018123", 
				"2a6mVPNhf1iNxJMCXoZUomUrS323MVzsSHkpAn4ZwWp", 
				"wx1f95008283948d0b"
		};
		
		Map<String, String> types = new HashMap<String,String>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 4208011498374070759L;

			{
				put("image",     "图片");
				put("location",  "位置");
				put("voice",     "语音");
				put("video",     "视频");
				put("text",      "文字");
				put("event",     "事件");
				put("subscribe", "关注");
				put("unsubscribe", "取消关注");
			}
		};

		String[] reply = {
				"签名不对不处理：",
				"格式不对不处理：",
				"该类型不会处理："
		};
	}
}
