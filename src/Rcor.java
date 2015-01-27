public class Rcor implements Radius{

	NeutronStar ns;
	
	Rcor(NeutronStar ns) {
		this.ns = ns;
	}
	
	public double call() {
		return Math.pow(NeutronStar.G * ns.m / Math.pow(ns.omega, 2) , 1./3);
	}

}
