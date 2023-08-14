package com.framework;

public abstract class NormalAcc extends ShopAcc {

	
	
	private float deliveryCharge;
	
	
	
	public NormalAcc(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	
	
	

	public float getDeliveryCharge() {
		return deliveryCharge;
	}





	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}





	public void bookProduct(float deliveryCharge) {
		System.out.println("Charges + delivery charges : "+ deliveryCharge);
	}



	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



	

	
	
	
}
