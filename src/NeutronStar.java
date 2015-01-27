import java.math.*;

public class NeutronStar {

	double p, b, l, omega, mu, dM;
	
	double m = 1.4 * 2E33;
	double r = 1E6;
	double i = 0.4 * m * r*r;
	
	final static double G = 6.67E-8;
	
	public NeutronStar(double p,double b, double l) {
		this.p = p;
		this.b = b;
		this.l = l;
		this.omega = 2 * Math.PI / p;
		this.mu = .5 * b * Math.pow(this.r, 3);
		this.dM = l * this.r / G / this.m;	
	}
	
}
