package coll_ection;

import java.util.Arrays;

public class Link_Arr_List {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(1,3));
		System.out.println(s.substring(1));
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(s.replace('e', 'i'));

	}

}
