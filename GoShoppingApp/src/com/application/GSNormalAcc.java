package com.application;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	
	
	public GSNormalAcc(int accNo, String accName, float charges, float deliveryCharge) {
		super(accNo, accName, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println( "Dear normal user your Product charges are :"+ getCharges() + " " + "and delivery charges:" + deliveryCharge );
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccName()="
				+ getAccName() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
	
	
}
