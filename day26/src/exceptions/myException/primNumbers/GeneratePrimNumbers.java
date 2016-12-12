package exceptions.myException.primNumbers;

public class GeneratePrimNumbers {
	
	public boolean isPrim(int n) throws NegPrimNumberException{
		boolean prim = true;
		
		if(n<=0){
			//throw new NegPrimNumberException();
			throw new NegPrimNumberException(n);
		}
		
		if(n==1){
			prim = false;
		}
		
		//for (int i = 2; i <=n/2;  i++) {
		for (int i = 2; i <=Math.sqrt(n);  i++) {
			if(n%i ==0){
				prim = false;
			}
		}
		
		return prim; 
	}

}
