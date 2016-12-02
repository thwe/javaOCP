package riemann.wInterfaces;

public class Integral {
	
	   double Riemann (double x1, double x2, int steps, Integrable func) {
		      double result = 0;
		      double delta = (x2-x1) / steps;
		      double xi = x1 + delta/2;
		      for (int i=0; i<steps; i++) {
		          result += func.f(xi);
		          xi+=delta;
		      }
		      return delta*result;
		}

	public static void main(String[] args) {
	
	       double result;
	       result = new Integral().Riemann(0,Math.PI,10000,new FSin());
	       System.out.println ("Integral sin 0..pi = " + result);
	       result = new Integral().Riemann(0,Math.PI,10000,new FCos());
	       System.out.println ("Integral cos 0..pi = " + result);
	}

}
