package riemannintegral;

public class FCos implements Integrable {
	
    @Override
    public double f (double x) 
        { 
            return Math.cos(x);
        }   
}
