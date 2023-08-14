package com.framework;

public abstract class PrimeAcc extends ShopAcc{

	
	private boolean isPrime;
	 private static final float deliveryCharge = 0.0f;
	
	 
	 
	
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}

	


	public boolean isPrime() {
		return isPrime;
	}




	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}




	public static float getDeliverycharge() {
		return deliveryCharge;
	}




	public void bookProduct(float charges) {
		System.out.println("Charges are: " + charges);
	}




	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + ", getAccNo()=" + getAccNo()
				+ ", getAccName()=" + getAccName() + ", getCharges()=" + getCharges() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}




	



	
	
	
	
		
	
}
