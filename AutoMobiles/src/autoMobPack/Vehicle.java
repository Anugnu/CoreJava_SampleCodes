package autoMobPack;

public abstract class Vehicle {
	private String myId ;
	private String model;
	private String make;
	private double rpm ;
	private double powr ; 
	private double xpos ;
	private double ypos ;
	
	public Vehicle() {
		myId = "v001";
		model = "m001";
		make = "ma001";
		rpm = 0;
		powr = 0;
		xpos = 0;
		ypos = 0;
	} 
	
	public String getMyId() {
		return myId;
	}
	public void setMyId(String myId) {
		this.myId = myId;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public double getRpm() {
		return rpm;
	}
	public void setRpm(double rpm) {
		this.rpm = rpm;
	}
	public double getPowr() {
		return powr;
	}
	public void setPowr(double powr) {
		this.powr = powr;
	}
	public double getXpos() {
		return xpos;
	}
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public double getYpos() {
		return ypos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myId == null) ? 0 : myId.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (myId == null) {
			if (other.myId != null)
				return false;
		} else if (!myId.equals(other.myId))
			return false;
		return true;
	}

	public String toString() {
		return "Vehicle [myId=" + myId + ", rpm=" + rpm + ", powr=" + powr + ", xpos=" + xpos + ", ypos=" + ypos + "]";
	}
	

}
