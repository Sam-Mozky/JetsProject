package com.skilldistillery.jets;

import java.util.Objects;

public abstract class Jet {
	
	private String model;
	private double range;
	private int speed;
	private long price;
	
	public Jet(String model, double range, int speed, long price) {
		super();
		this.model = model;
		this.range = range;
		this.speed = speed;
		this.price = price;
	}

	abstract void fly();
	
		
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Jet [model=" + model + ", range=" + range + ", speed=" + speed + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price
				&& Double.doubleToLongBits(range) == Double.doubleToLongBits(other.range) && speed == other.speed;
	}
	
	
	
}
