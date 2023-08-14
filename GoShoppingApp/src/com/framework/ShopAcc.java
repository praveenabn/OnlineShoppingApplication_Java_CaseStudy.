package com.framework;

public abstract class ShopAcc {
        
	private int accNo;
	private String accName;
	private float charges;
	
	
	
	
	public ShopAcc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}
	
	

	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public String getAccName() {
		return accName;
	}



	public void setAccName(String accName) {
		this.accName = accName;
	}



	public float getCharges() {
		return charges;
	}



	public void setCharges(float charges) {
		this.charges = charges;
	}



	public void bookProduct(float charges) {
		System.out.println("Product is booked and charges are:" + charges);
	}
	
	public void items(float charges) {
		System.out.println("Items are delivered with charges:" + charges);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
