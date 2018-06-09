import java.util.List;

public class test {

	public static void main(String[] args) {
		entity e = new entity("Lee","","","");
		List<String> list=Util.queryinfo(e);
		Object[] arr = list.toArray();
	         String name = (String) arr[0];
	         String idnumber = (String) arr[1];
	         String info = (String) arr[2];
	         System.out.println(name);
	         System.out.println(idnumber);
	         System.out.println(info);
	    }
//		String name = Util.name;
//		String idnumber = arr[0].toString();
//		String info = arr[0].toString();
//		System.out.println(name+idnumber+info);
}

