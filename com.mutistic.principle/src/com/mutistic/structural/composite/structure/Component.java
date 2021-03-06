package com.mutistic.structural.composite.structure;

/**
 * @program Component：
 * @description 抽象的组件对象，为组合中的对象什么接口，让客户端可以通过这个接口来访问和管理整个对象结构，可以在内部为定义的功能提供默认的实现
 * @author mutisitic
 * @date 2018年8月24日
 */
public abstract class Component {
	/**
	 * @description 示意方法，子组件对象可能有的功能方法 
	 * @author mutisitic
	 * @date 2018年8月24日
	 */
	public abstract void opeartion();
	
	/**
	 * @description 向组合对象中加入组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被加入组合对象中的组件对象
	 */
	public void addChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持addChild()方法");
	}
	
	/**
	 * @description 从组合对象中移除组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param child 被移除组件对象
	 */
	public void removeChild(Component child) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持removeChild()方法");
	}
	
	/**
	 * @description 获取某个索引对应的组件对象
	 * @author mutisitic
	 * @date 2018年8月24日
	 * @param index 索引
	 * @return 索引对应的组件对象
	 */
	public Component getChildrend(int index) {
		// 默认的实现，抛出异常，叶子对象或子组件未重写该方法时，Component对象本身不支持该方法
		throw new UnsupportedOperationException("Component对象不支持getChildrend()方法");
	}
}
