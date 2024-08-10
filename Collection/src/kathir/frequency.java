package kathir;

import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		int [] a= {1,2,1,2,3,3,4,1,2};
//		Arrays.sort(a);//1,1,1,2,2
//		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) {
			int dupli=1;
//		     int temp=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
//					temp=a[i];
					dupli++;
					a[i]=-1;
				}
			}		
//			if (a[i]==a[i+1]) {
//				System.out.println(temp+" = "+dupli);
//			}
			System.out.println(a[i]+" = "+dupli);
		}
//		count=a[a.length-1];	
	}
}