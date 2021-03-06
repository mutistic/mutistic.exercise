package com.mutistic.behavioral.interpreter.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.mutistic.utils.PrintUtil;

/**
 * @program Context：上下文
 * @description 解析xml的上下文
 * @author mutisitic
 * @date 2018年9月3日
 */
public class Context {
	/** Dom解析XML的Doucument对象 */
	private Document document;
	/** 上一次被处理的元素 */
	private Element preEle;
	
	/**
	 * 构造函数：传入xml文件名获取Document对象
	 * @param fileName
	 */
	public Context(String fileName) {
		this.document = XmlUtil.getRoot(fileName);
	}
	
	/**
	 * @description Expression公用方法：根据父元素和当前元素名称来获取当前元素对象
	 * @author mutisitic
	 * @date 2018年9月3日
	 * @param preEle 父元素
	 * @param eleName 当前元素名称
	 * @return 当前元素对象
	 */
	public Element getNowEle(Element preEle, String eleName) {
		PrintUtil.three("Context.getNowEle()：根据父元素和当前元素名称来获取当前元素对象", "preEle="+ preEle.getNodeName() +"，eleName = "+ eleName);
		
		NodeList list = preEle.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			if(list.item(i) instanceof Element) {
				Element nowEle = (Element) list.item(i);
				if(nowEle.getTagName().equals(eleName)) {
					PrintUtil.three("Context：获取到的当前元素对象", nowEle.getClass());
					return nowEle;
				}
			}
		}
		return null;
	}

	/**
	 * @description 重初始化上下文 
	 * @author mutisitic
	 * @date 2018年9月5日
	 */
	public void resetInit() {
		preEle = null;
	}
	
	public Element getPreEle() {
		return preEle;
	}

	public void setPreEle(Element preEle) {
		this.preEle = preEle;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
}
