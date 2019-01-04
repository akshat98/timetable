package schedule;

public class Tuple {
	int lhid;
	Course crs;
	Faculty fac;
	
	//for batches;
	//String batch;
	
	public Tuple(Course crs, Faculty fac, int lhid) {
		this.crs = crs;
		this.fac = fac;
		this.lhid = lhid+1;
		//this.batch = batch;
	}
}
