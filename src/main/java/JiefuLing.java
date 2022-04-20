public class JiefuLing {

	public String getFullName() {
		return "Jiefu Ling";
	}
	
	public String getFirstName() {
		return "Jiefu";
	}
	
	public String getLastName() {
		return "Ling";
	}
	
	public String getUCInetID() {
		return "jieful2";
	}
	
	public int getStudentNumber() {
		return 25008346;
	}
	
	public String getRotatedFullName(int shift) {
		String str = "Jiefu Ling";
		if (shift < 0) {
			shift = -shift;
			String result = str.substring(shift) + str.substring(0, shift);
	        return result;
		}
		else {
	        String result = str.substring(str.length() - shift) + str.substring(0, str.length() - shift);
	        return result;
		}
	}

}
