package com.framework;

public abstract class ShoFactory {

	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accName, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int AccNo, String accName, float charges, float deliveryCharge);
}

