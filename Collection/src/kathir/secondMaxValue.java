package kathir;

public class secondMaxValue {

	public static void main(String[] args) {

		int[]a= {1,2,3,4};
		int max=a[0];
		int max1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max1=max;
				max=a[i];
			}
			if(a[i]>max1 && a[i]!=max) {
				max1=a[i];
			}
		System.out.println(max1);
		}
		
	}

}
