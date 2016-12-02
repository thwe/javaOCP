package riemannintegral;


public class FSin implements Integrable{
    
    @Override
    public double f (double x) 
    {
        return Math.sin(x);
    }                
}
