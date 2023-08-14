package com.client;

import com.framework.PrimeAcc;
import com.framework.ShoFactory;
import com.application.GSPrimeAcc;
import com.application.GSShopFactory;
import com.framework.NormalAcc;
import com.application.GSNormalAcc;
public class Client {

	public static void main(String[] args) {
		ShoFactory sf = new GSShopFactory();
		PrimeAcc gpa = new GSPrimeAcc(101,"Praveen",5000,true);
		NormalAcc gna = new GSNormalAcc(102,"sagarkumar",5000,100);
		gpa.bookProduct(gpa.getCharges());
		gpa.toString();
        gna.bookProduct(gna.getDeliveryCharge());
        gna.toString();
	}

}
