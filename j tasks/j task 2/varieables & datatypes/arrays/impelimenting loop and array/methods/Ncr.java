class Ncr{
	
	public static int findNcr(int n, int r) {
        int numerator = getNcr(n);
        int denominator = getNcr(r) * getNcr(n - r);
        int result= numerator / denominator;
		return result;
	}	
	public static int getNcr(int n){
	int  fact=1;
	for( int i=1; i<=n;i++){
	fact=fact*i;	
	
	}
	return fact;
	};
	
	
}