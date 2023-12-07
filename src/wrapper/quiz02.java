package wrapper;

public class quiz02 {

	public static void main(String[] args) {

		String str = "10";
		byte num1 = Byte.parseByte(str);
		short num2 = Short.parseShort(str);
		int num3 = Integer.parseInt(str);
		long num4 = Long.parseLong(str);

		String str2 = "10.0";
		float num5 = Float.parseFloat(str2);
		double num6 = Double.parseDouble(str2);

		System.out.println(num1 + " " + num2 + " " + " " + num3 + " " + num4 + " " + num5 + " " + num6);
	}

}
