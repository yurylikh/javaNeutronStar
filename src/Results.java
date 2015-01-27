public class Results {

	static double get(Radius radius) {
		return radius.call();
	}
	
	public static void main(String[] args) {
		NeutronStar a0535 = new NeutronStar(103.0, 4.3E12, 4.0E33);
		
		System.out.format("r_cor = %.2e\n", get(new Rcor(a0535)));
		System.out.format("r_alv = %.2e\n", get(new Ralv(a0535)));

	}

}
