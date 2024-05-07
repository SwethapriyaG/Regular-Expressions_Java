//Program to demonstrate regular expressions in java

import java.util.regex.*;


class RegularExpressionsEx
{
	public static void main(String ar[])
	{
		//define pattern
		Pattern p = Pattern.compile("[Src]");
		
		//perform matching operations
		String str = "I am Swetha";
		
		Matcher m = p.matcher(str);
		
		System.out.println("m.find():"+m.find());
		
		System.out.println("m.start():"+m.start());
		
		System.out.println("m.find():"+m.find(7));
		

		
		Pattern p1 = Pattern.compile("\\d?");
		
		String str1 = "a1d";
		
		Matcher m1 = p1.matcher(str1);
		
		System.out.println("m1.find():"+m1.find());
		
		System.out.println("m1.matches():"+m1.matches());
		
		
		
		Pattern p2 = Pattern.compile("\\d*");
		
		String str2 = "";
		
		Matcher m2 = p2.matcher(str2);
		
		System.out.println("m2.find():"+m2.find());
		
		System.out.println("m2.matches():"+m2.matches());
		
		
		Pattern p3 = Pattern.compile("\\d+");
		
		String str3 = "11233";
		
		Matcher m3 = p3.matcher(str3);
		
		System.out.println("m3.find():"+m3.find());
		
		System.out.println("m3.matches():"+m3.matches());
		
		
		Pattern p4 = Pattern.compile("\\d{4}");
		
		String str4 = "11244";
		
		Matcher m4 = p4.matcher(str4);
		
		System.out.println("m4.find():"+m4.find());
		
		System.out.println("m4.matches():"+m4.matches());
		
		
		Pattern p5 = Pattern.compile("\\d{4,}");
		
		String str5 = "11244";
		
		Matcher m5 = p5.matcher(str5);
		
		System.out.println("m5.find():"+m5.find());
		
		System.out.println("m5.matches():"+m5.matches());
		
		
		Pattern p6 = Pattern.compile("\\d{4,6}");
		
		String str6 = "112344";
		
		Matcher m6 = p6.matcher(str6);
		
		System.out.println("m6.find():"+m6.find());
		
		System.out.println("m6.matches():"+m6.matches());
		
		
		Pattern p7 = Pattern.compile("\\d{10}");
		
		String str7 = "9898723456";
		
		Matcher m7 = p7.matcher(str7);
		
		System.out.println("m7.find():"+m7.find());
		
		System.out.println("m7.matches():"+m7.matches());
		
		
		Pattern ps = Pattern.compile("\\w*h$");
		
		String strs = "santosh";
		
		Matcher ms = ps.matcher(strs);
		
		System.out.println("ms.find():"+ms.find());
		
		System.out.println("ms.matches():"+ms.matches());
		
		
		Pattern ps1 = Pattern.compile("\\w+h$");
		
		String strs1 = "hari";
		
		Matcher ms1 = ps1.matcher(strs1);
		
		System.out.println("ms1.find():"+ms1.find());
		
		System.out.println("ms1.matches():"+ms1.matches());
		
		
		Pattern ps2 = Pattern.compile("\\w*h$");
		
		String strs2 = "santosh";
		
		Matcher ms2 = ps.matcher(strs2);
		
		System.out.println("ms2.find():"+ms2.find());
		
		System.out.println("ms2.matches():"+ms2.matches());
		
		
		Pattern ps3 = Pattern.compile("\\w+@\\w+[.]\\w+");
		
		String strs3 = "swetha@gmail.com";
		
		Matcher ms3 = ps3.matcher(strs3);
		
		System.out.println("ms3.find():"+ms3.find());
		
		System.out.println("ms3.matches():"+ms3.matches());
		
		boolean result = Pattern.matches("\\w+@\\w+[.]\\w+","swetha@gmail.com");
		System.out.println("result: "+result);
	}
}	