package com.mutistic.structural.adapter.basketball;

import com.mutistic.utils.PrintUtil;

/**
 * @program 适配器：翻译官
 * @description
 * @author mutisitic
 * @date 2018年8月10日
 */
public class Translate extends Player {
	private ForeignCenter fc = new ForeignCenter();
	
	public Translate(String name) {
		super(name);
		fc.name = name;
	}

	public void attack() {
		PrintUtil.three("翻译官开始进行翻译：", name + "进攻");
		fc.attack();
	}

	public void defense() {
		PrintUtil.three("翻译官开始进行翻译：", name + "防守");
		fc.defense();
	}

}
