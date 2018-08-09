package com.mutistic.design.simplefactory.structure;

/**
 * @program 产品抽象父类
 * @description 简单工厂模式所创建的所有对象的父类
 * @author mutistic
 * @date 2018年5月14日
 */
public abstract class Product {

	/**
	 * @description 定义所有具体实例所共有的公共接口 
	 * @author mutistic
	 * @date 2018年5月14日
	 */
	public abstract void productInterface();
	
}