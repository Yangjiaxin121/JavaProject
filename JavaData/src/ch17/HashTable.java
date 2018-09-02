package ch17;

import java.math.BigInteger;

public class HashTable {
	private LinkList[] arr;
	/**
	 * 默认构造方法
	 * @return 
	 */
	public  HashTable() {
		arr = new LinkList[100];
	}
	/**
	 * 指定数组初始化大小
	 */
	public HashTable(int maxSize) {
		arr = new LinkList[maxSize];
	}
	
	/**
	 * 插入数据
	 */
	public void insert(Info info) {
		//获得关键字
		String key = info.getKey();
		//关键字所对应的hash数
		int hashValue = hashCode(key);
		if (arr[hashValue] == null) {
			arr[hashValue] = new LinkList();
		}
		arr[hashValue].insertFirst(info);
		
	}
	/**
	 * 查找数据
	 * @return 
	 */
	public Info find(String key) {
		int hashValue = hashCode(key);
		return arr[hashValue].find(key).info;
		
	}
	
	
	
	/**
	 * 删除数据
	 * @param key
	 * @return
	 */
	public Info delete(String key) {
		int hashValue = hashCode(key);
		return arr[hashValue].delete(key).info;
	}
	
	
	
	
	
	
//	public int hashCode(String key) {
//		//将字母转化为ascii相加  有重复，而且重复概率很高
//		int hashValue = 0;
//		for (int i = key.length() - 1; i >= 0; i--) {
//			int letter = key.charAt(i) -96;
//			hashValue +=letter;
//		}
//		return hashValue;
//	}
	//幂的连乘   数字太大，需要压缩
	public int hashCode(String key) {
		BigInteger hashVal = new BigInteger("0");
		BigInteger pow27 = new BigInteger("1");
		for (int i = key.length() - 1; i >= 0 ; i--) {
			int letter = key.charAt(i) - 96;
			BigInteger letterB = new BigInteger(String.valueOf(letter));
			hashVal = hashVal.add(letterB.multiply(pow27));
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
		}
		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();
 	}
	
	
	
	
	
	

}
