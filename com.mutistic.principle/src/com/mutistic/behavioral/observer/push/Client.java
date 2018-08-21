package com.mutistic.behavioral.observer.push;

import com.mutistic.utils.PrintUtil;

public class Client {
	public static void main(String[] args) {
		PrintUtil.one("观察者模式[Observer Pattern]-推模型");
		// 创建报纸，作为被观察者
		NewsPaper paper = new NewsPaper();
		
		// 创建读者，作为观察者
		Reader r1 = new Reader();
		r1.setName("AAA");
		Reader r2 = new Reader();
		r2.setName("BBB");
		Reader r3 = new Reader();
		r3.setName("CCC");
		
		// 注册观察者
		paper.attach(r1);
		paper.attach(r2);
		paper.attach(r3);
		
		// 新报纸，通知观察者-推模型
		paper.setContent("1111111111111111111111");
	}
}
