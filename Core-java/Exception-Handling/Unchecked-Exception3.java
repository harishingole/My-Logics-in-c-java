class Test{
	public static void main(String... str){
		String s ="Harish-Ingole";
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		try{System.out.println(s.charAt(15));	}
		catch(StringIndexOutOfBoundsException si){System.out.println(si);}
		System.out.println("abc");
	}
}

