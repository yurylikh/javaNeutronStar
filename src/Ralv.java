public class Ralv implements Radius{

	NeutronStar ns;
	
	Ralv(NeutronStar ns) {
		this.ns = ns;
	}
	
	public double call() {
		return Math.pow( Math.pow(ns.mu, 2) / ns.dM / Math.sqrt(2 * NeutronStar.G * ns.m) , 2./7);
	}
	
}
