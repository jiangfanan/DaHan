public class Triangle
{
	public static void main (String[] args){
        int n=10;
		int [] [] array =new int[n][n];
		int i=0;int j=1;
		for(;i<n;i++){
			array[i][0]=1;
		}
		for(;j<n;j++){
			array[j][j]=1;
		}
		for(i=2;i<n;i++){
			for(j=1;j<n;j++){
				array[i][j]=array[i-1][j-1]+array[i-1][j];
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<=n;j++){
				System.out.println(array[i][j]);
				System.out.println("\n");
			}
		}

	}

}