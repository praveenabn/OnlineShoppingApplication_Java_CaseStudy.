package com.application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	

	private  final float charges=0.0f;
	
	public GSPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges, isPrime);
		
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime user your product charges are :" + charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + ", isPrime()=" + isPrime() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	

	
	
}
