package btvn;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyNumber1 {
	public int [] ListNumber;

	//khoi tao gia tri cho thuoc tinh Numbers
	public MyNumber1(int [] number){
	this.ListNumber = number;
	}
	//Tra ra gia tri nho nhat trong ListNumber
	public int GetMinNumber(){
	int min = ListNumber[0];
	for (int i =0; i < ListNumber.length; i++){
	if (ListNumber[i] < min){
	min = ListNumber[i];
	}
	}
	return min;
	}
	//Tra ra gia tri lon nhat trong ListNumber
	public int GetMaxNumber(){
	int max = ListNumber[0];
	for (int i =0; i < ListNumber.length; i++){
	if (ListNumber[i] > max){
	max = ListNumber[i];
	}
	}
	return max;
	}

	//Dua ra do nam giua min max
	public ArrayList GetDistanceMinMax() {
	ArrayList distance = new ArrayList();
	int minnumber = this.GetMinNumber();
	int maxnumber = this.GetMaxNumber();
	for (int i = 0; i< ListNumber.length; i++){
	if ((minnumber < ListNumber[i])&& (maxnumber > ListNumber[i])){
		distance.add(i);
		}
	}
	return distance;
	}	
@Test
public void check_GetMinNumber(){
	//Arrange
	int [] Number ={5,6,8,2,34,10};
	MyNumber1 numb = new MyNumber1(Number);
	//Action 
	int x = numb.GetMinNumber();
	//Assertion
	Assert.assertEquals(2,x);
	}
@Test
public void check_GetMaxNumber(){
	//Arrange
	int [] Number ={5,6,8,2,34,10};
	MyNumber1 numb = new MyNumber1(Number);
	//Action 
	int y = numb.GetMaxNumber();
	//Assertion
	Assert.assertEquals(34,y);
}
@Test
public void check_GetDistanceMinMax(){
	//Arrange
	int [] Number ={5,6,8,2,34,10};
	MyNumber1 numb = new MyNumber1(Number);
	//Action
	ArrayList Distance = numb.GetDistanceMinMax();
	//Assertion
	for (int i = 0; i < Distance.size(); i++) {
		Assert.assertEquals(4,Distance.size());
		Assert.assertEquals(5,Distance.get(0));
		Assert.assertEquals(6,Distance.get(1));
		Assert.assertEquals(8,Distance.get(2));
		Assert.assertEquals(10,Distance.get(4));
	}	
	}
}



