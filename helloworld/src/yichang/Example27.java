package yichang;

public class Example27 {
	public static void main(String[] args) {
		try {
			int result = divide(4,-2);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	private static int divide(int x, int y) throws DivideByMinusException{
		// TODO Auto-generated method stub
		if(y<0) {
			throw new DivideByMinusException("被除数是负数");
		}
		int result = x / y;
		return result;
	}

}
