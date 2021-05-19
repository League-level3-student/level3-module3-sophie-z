package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkified = "";
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				
			}
			if(i%2 == 1) {
				funkified += Character.toUpperCase(s.charAt(i));
			}
			else if(i%2 == 0 || i ==0) {
				funkified += Character.toLowerCase(s.charAt(i));
			}
		}
		return funkified;
	}

}
