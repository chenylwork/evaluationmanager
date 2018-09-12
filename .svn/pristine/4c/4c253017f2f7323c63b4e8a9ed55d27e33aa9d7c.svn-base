package com.evaluationmanager.unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 * 自定义迷你不是Map的类Map对象
 * 仅用于本项目中Excel文件导入导出中数据头的控制
 * @Author 陈彦磊
 * @DateTime 2018年8月17日-上午1:14:06
 *
 * @param <K> 键类型
 * @param <V> 值类型
 */
public class NoMap<K,V>{

	transient List<Node<K,V>> table;
	transient List<K> listK;
	transient List<V> listV;
	public NoMap() {
		super();
		table = new ArrayList<>();
		listK = new ArrayList<>();
		listV = new ArrayList<>();
	}

	public V put(K key, V value) {
		V result = null;
		if (exists(key)) {
			int index = listK.indexOf(key);
			result = listV.get(index);
			table.set(index, new Node<K, V>(key, value));
			listV.set(index, value);
		} else {
			table.add(new Node<K, V>(key, value));
			listK.add(key);
			listV.add(result = value);
		}
		return result;
	}
	public boolean exists(K newKey) {
		for (K key : listK) {
			if (key.equals(newKey)) return true;
		}
		return false;
	}
	
	public Collection<V> values() {
		return listV;
	}
	public Collection<K> keys() {
		return listK;
	}
	
	static class Node<K,V>{
		final K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
	}

}
