package com.mutistic.creational.simplefactory.animal;

/**
 * @program 气候 
 * @description 
 * @author mutistic
 * @date 2018年5月12日
 */
public class Climate {

	/**
	 * 天气
	 */
	public String weather;

	/**
	 * 构造器
	 * @param weather 天气
	 */
	public Climate(String weather) {
		super();
		this.weather = weather;
		System.out.println(this.weather);
	}
	
}
