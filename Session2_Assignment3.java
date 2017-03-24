package tanaji;

public class Session2_Assignment3 {

		public static void main(String[] args) {
			
			int odd=1;
			int noOfSpace=3;
			int j;
			for(int i=1;i<=4;i++)
			{
				int k=96;
				for(j=1;j<=noOfSpace;j++){
					System.out.print(" ");
				}
						for(j=1;j<=odd;j++)
			{
					if(j<=i){
						k=k+1;
					}else{
						k=k-1;
					}
			System.out.print((char)k);
			}
			
			System.out.println();
			odd=odd+2;
			noOfSpace=noOfSpace-1;
		}
			
	}
	
}
