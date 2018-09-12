package com.evaluationmanager.common;

import java.util.Collection;

import org.springframework.stereotype.Component;
/**
 * 
 * @author chenyl
 * @Date 2018年7月19日-下午12:49:16
 * @Description  分页对象，主要用来对数据分页操作
 * @param <T> 对象中存储的数据对应的实体类对应的类
 */
@Component("pagin")
public class Pagin<T> {
	
	private long pageNo; // 当前页码
	private long display; // 每页显示数
	private long count;// 总记录数
	private long pages; // 总页数
	private Collection<T> data = null; // 当前页数据信息
	public Pagin() {}
	public Pagin(int pageNo, int display) {
		super();
		this.pageNo = pageNo;
		this.display = display;
	}
	/**
	 * 获取页码
	 * @return
	 */
	public long getPageNo() {
		return pageNo;
	}
	/**
	 * 设置页码
	 * @param pageNo
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	/**
	 * 获取总页数
	 * @return
	 */
	public long getPages() {
		if(this.count%this.display == 0) {
			return this.count/this.display;
		}
		this.pages =  this.count/this.display + 1;
		return pages;
	}
	private void setPages(long pages) {
		this.pages = pages;
	}
	/**
	 * 获取每页显示数
	 * @return
	 */
	public long getDisplay() {
		return display;
	}
	/**
	 * 设置每页显示数
	 * @param display
	 */
	public void setDisplay(long display) {
		this.display = display;
		if (this.count != 0) {
			this.setPages(this.getPages());
		}
	}
	/**
	 * 获取总记录数
	 * @return
	 */
	public long getCount() {
		return count;
	}
	/**
	 * 设置总记录数
	 * @param count
	 */
	public void setCount(long count) {
		this.count = count;
		if (this.display != 0) {
			this.setPages(this.getPages());
		}
	}
	/**
	 * 获取当前页数据
	 * @return
	 */
	public Collection<T> getData() {
		return data;
	}
	/**
	 * 设置当前页数据
	 * @param data
	 */
	public Collection<T> setData(Collection<T> data) {
		return (this.data = data);
	}
	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}
	@Override
	public String toString() {
		return "Pagin [pageNo=" + pageNo + ", display=" + display + ", count=" + count + ", pages=" + pages + ", data="
				+ data + "]";
	}
	
	
	
}
