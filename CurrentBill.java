class CurrentBill{
	public static void main(String[] args){
		int units = 350;
		System.out.println("Electricty bill " + eleBill(units));
		int n = 5;
		PyramidPat(n);
	}
	static int eleBill(int units){
		return ((units > 250) & true) ? units - 250 : 0;
	}
	static void PyramidPat(int n){
		for(int i=1;i<=n;i++){
			for(int j=0;j<=n-i;j++) System.out.print(" ");
			for(int j=1;j<=2 * i -1;j++) System.out.print("*");
			System.out.println();
		}
	}
}