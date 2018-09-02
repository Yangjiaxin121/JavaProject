package ch16;

public class TestHashTable {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.insert(new Info("abc","张三"));
		ht.insert(new Info("bbb","李四"));
		
		System.out.println(ht.find("bbb").getName());
		System.out.println(ht.delete("bbb").getName());
	}

}
