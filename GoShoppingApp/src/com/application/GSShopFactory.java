package com.application;

import com.framework.NormalAcc;
import com.framework.PrimeAcc;
import com.framework.ShoFactory;

public class GSShopFactory extends ShoFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accName, float charges, boolean isPrime) {

		GSPrimeAcc gsprime = new GSPrimeAcc(AccNo, accName, charges,isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAcc(int AccNo, String accName, float charges, float deliveryCharge) {
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accName, charges,deliveryCharge);
		return gsnormal;
	}

	

	

	
}
