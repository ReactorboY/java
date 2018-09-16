public class flow{
	public static void main(String[] args){
//		prints true if both side are true only
		System.out.println(2 < 3 && 4 > 3);
//		 prints true if either is true only
		System.out.println(2 < 3 && 4 > 3);
//		! operator reciprocal the value 
//		prints out true but illogicaly false
		System.out.println(!(5 > 6));
		
//		 if elseif else
		if (1 > 2) {
			System.out.println("pehla If");
		} else if (1 < 2){
			System.out.println("else ho gya");;
		} else 
			System.out.println("Simple");
		
//		 ternanry operator
		int a = 2;
		int b = (a > 1) ? 'A' : 'N';
		System.out.println(b);
	}
}