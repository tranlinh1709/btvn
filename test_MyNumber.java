package btvn;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class test_MyNumber {
	public int [] numbers;

	//khoi tao gia tri cho thuoc tinh Numbers
	public test_MyNumber (int [] numbers){
		this.numbers = numbers;
	}
	//tra ra gia tri la so nguuyen to va ko bi trung trong mang Numbers
	public ArrayList GetMyNumber(){
		ArrayList ListNumber = new ArrayList();
	    ArrayList lstPrimeNumber = new ArrayList();
			for (int i: numbers){
				int  currentnumber = numbers[i];
				boolean isPrime = true;
				for (int k = 2; k < currentnumber; k++){
					if (currentnumber%k ==0){
						isPrime=false;
						break;
					}
			}
			if(isPrime==true){
			lstPrimeNumber.add(currentnumber);
			}
			}
			return lstPrimeNumber;
			for(int j1=0; j1<lstPrimeNumber.size(); j1++){
			for (int j2 = 0; j2 < lstPrimeNumber.size(); j2++) {
			if ((lstPrimeNumber.get(j1)== lstPrimeNumber.get(j2))&&(j1!= j2)){
			ListNumber.add(j1);
			}
			}
			return ListNumber;
			}
	}
	
	//test gia tri nguyen to ko bi trung
	

	//tong gia tri nguyen to chan 
	public int GetTotal(){
	int total = 0;
	ArrayList lstPrimeNumber = new ArrayList();
	for (int n: numbers){
		int  currentnumber = numbers[n];
		boolean isPrime = true;
		for (int k = 2; k < currentnumber; k++){
			 if (currentnumber%k ==0){
				 isPrime=false;
				 break;
		}
	}
	if((isPrime==true)&&(currentnumber%2==0)){
		lstPrimeNumber.add(currentnumber);
		}
	}
	for (int j = 0; j < lstPrimeNumber.size(); j++){
		int snt = Integer.parseInt(lstPrimeNumber.get(j).toString());
		total = total + snt;
		}
	return total;
}
	//tim xem so nguyen to nao bang tong 2 so lien truoc
	public ArrayList GetLuckyNumber(){
	ArrayList lstPrimeNumber = new ArrayList();
	for (int i: numbers){
	int  currentnumber = numbers[i];
	boolean isPrime = true;
	for (int k = 2; k < currentnumber; k++){
	if (currentnumber%k ==0){
	isPrime=false;
	break;
	}
	}
	if(isPrime==true){
	lstPrimeNumber.add(currentnumber);
	for (int j=0; j< lstPrimeNumber.size(); j++){
	if (lstPrimeNumber.get(j+2) == (lstPrimeNumber.get(j+1) + lstPrimeNumber.get(j))){
		GetLuckyNumber.add(j+2);
		}
	}
	return lstPrimeNumber;
	}
	}
	}
	
	@Test
	public void check_GetMyNumber(){
	//arrange
		int [] originalnumbers ={2,3,5,2,6,7,10,3};
		test_MyNumber numb = new test_MyNumber(originalnumbers);
	//action
		ArrayList Prime = new ArrayList();
		Prime = numb.GetMyNumber();
	    for (int i = 0; i < Prime.size(); i++) {
			System.out.println(Prime.get(i));
	    }
	//assertion	
		Assert.assertEquals(5,Prime.get(0));
		Assert.assertEquals(7,Prime.get(1));
		
	}
	@Test
	public void check_GetTotal(){
		//arrange
		int [] originalnumbers ={2,3,5,2,6,7,10,3};
		test_MyNumber numb = new test_MyNumber(originalnumbers);
		//action
		int tong = numb.GetTotal();
		System.out.println(tong);
		//Assertion
		Assert.assertEquals(22,tong);
	}
	@Test
	public void check_GetLuckyNumber(){
		//arrange
		int [] originalnumbers ={2,3,5,2,6,7,10,3};
		test_MyNumber numb = new test_MyNumber(originalnumbers);
		//action
		ArrayList LuckyNumb = new ArrayList();
		LuckyNumb = numb.GetLuckyNumber();
		for (int i = 0; i < originalnumbers.length; i++) {
		System.out.println(LuckyNumb.get(i));
	   //Assertion
		Assert.assertEquals(5, LuckyNumb.get(i));
		}
}
}
