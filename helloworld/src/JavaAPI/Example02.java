package JavaAPI;

public class Example02 {
	public static void main(String[] args) {
		String a = "abcdedcba";
		System.out.println("字符串的长度为："+a.length());
		System.out.println("字符串的第一个字符："+a.charAt(0));
		System.out.println("字符串c第一次出现的位置："+a.indexOf('c'));
		System.out.println("字符串c最后一次出现的位置："+a.lastIndexOf('c'));;
		System.out.print("字符串转化为字符数组后的结果：");
		char[] charArray = a.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(i!=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.println("将int值转换为string类型之后的结果："+String.valueOf(12));
		System.out.println("转换为大写："+a.toUpperCase());
		String s = " i t c a s t ";
		System.out.println("去除字符串两端空格后的结果："+s.trim());
		System.out.println("去除字符串中所有空格后的结果："+s.replace(" ", ""));
		String s1 = "String";
		String s2 = "Str";
		System.out.println("判断字符串是否以Str开头："+s1.startsWith("Str"));
		System.out.println("判断是否以ng结尾："+s1.endsWith("ng"));
		System.out.println("判断是否包含字符串tri："+s1.contains("tri"));
		System.out.println("判断字符串是否为空："+s1.isEmpty());
		System.out.println("判断两个字符串是否相等："+s1.equals(s2));
		
	}

}
