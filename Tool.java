package models;

public class Tool{

	
	public boolean getValidationInt(String line) {
		boolean flag;
		int i = 0;
		flag = true;
		System.out.println("entro a validar :" + line);
		while (i < line.length() && flag) {
			if (line.charAt(i) < 48 || line.charAt(i) > 58) {
				System.out.println(line.charAt(i));
				if (line.charAt(i) != '-') {
					flag = false;
				}
			}
			i++;
		}
		System.out.println(flag);
		return flag;
	}
	
}
