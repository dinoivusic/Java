public class Bakery{
	//declare var
	private double loaf, buns, donuts, total, change, cash;


	//constructors
	public Bakery(){//default values

	}
	public Bakery(double loaf, double buns,double donuts){
		this.loaf=loaf;
		this.buns=buns;
		this.donuts=donuts;
	}
	//setters
	public void setCash(double cash){
		this.cash=cash;
	}
	//other methods
	public void computeChange(){
		total=(loaf*3.5)+(buns*1.5)+(donuts*3);
		change=cash-total;
	}
	//getters
	public double getChange(){
		return change;
	}

}