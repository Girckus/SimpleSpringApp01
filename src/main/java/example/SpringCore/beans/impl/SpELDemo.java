package example.SpringCore.beans.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELDemo {

	@Value("#{3.14159}")
	private Double myDouble;
	
	@Value("#{3}")
	private Integer myInteger;
	
	@Value("#{9.87E4}")
	private Double otherDouble;
	
	@Value("#{'Blah Blah'}")
	private String myString;
	
	@Value("#{true}")
	private Boolean myBoolean;
	
	@Value("#{spELDemo2.myString}")
	private String fuckingClassString;
	
	@Value("#{spELDemo2.getMyString()}")
	private String fuckingClassStringMethod;
	
	@Value("#{spELDemo2.myString.toUpperCase()}")
	private String fuckingClassStringUpper;
	
	@Value("#{spELDemo2.myString2?.toUpperCase()}")
	private String fuckingClassString2;

	@Value("#{T(java.lang.Math).random()}")
	private Double random;
	
	@Value("#{2 * T(java.lang.Math).PI + (5 ^ T(java.lang.Math).random()) - (1/T(java.lang.Math).random()) + ((T(java.lang.Math).random() * 100) % 6)}")
	private Double count;

	@Value("#{ (( 3 < 5 or 4 lt 6 or 2 > 7 ) and ( not (1 gt 6) or 3 == 3 or 3 eq 3 or 1 <= 2 ) && ( 4 le 4 or 4 >= 4 or 4 ge 4 )) ? 'true' : 'false' }")
	private String logic;
	
	@Value("#{ spELDemo2.myString2?: 'myString 2 is null' }")
	private String elvis;
	
	@Value("#{spELDemo2.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com'}")
	private Boolean emailValid;
	
	@Value("#{spELDemo2.list[1]}")
	private String list1;
	
	@Value("#{spELDemo2.list.?[length() eq 3]}")
	private List<String> list2;
	
	@Value("#{spELDemo2.list.^[length() eq 3]}")
	private String list3;
	
	@Value("#{spELDemo2.list.$[length() eq 3]}")
	private String list4;
	
	@Value("#{spELDemo2.list.![length()]}")
	private List<Integer> list5;

	@Override
	public String toString() {
		return "SpELDemo [myDouble=" + myDouble + ", myInteger="
				+ myInteger + ", otherDouble=" + otherDouble + ", myString="
				+ myString + ", myBoolean=" + myBoolean
				+ ", fuckingClassString=" + fuckingClassString
				+ ", fuckingClassStringMethod=" + fuckingClassStringMethod
				+ ", fuckingClassStringUpper=" + fuckingClassStringUpper
				+ ", fuckingClassString2=" + fuckingClassString2 + ", random="
				+ random + ", count=" + count + ", logic=" + logic + ", elvis="
				+ elvis + ", emailValid=" + emailValid + ", list1=" + list1
				+ ", list2=" + list2 + ", list3=" + list3 + ", list4=" + list4
				+ ", list5=" + list5 + "]";
	}
	
}