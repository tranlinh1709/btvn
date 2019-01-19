package btvn;

public class MyNumber {
	public int [] numbers;

	//khoi tao gia tri cho thuoc tinh Numbers
	public MyNumber(int [] numbers){
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
	ArrayList nt = lstPrimeNumber();
	for(int j: nt){
	if (nt(i)== nt(j))&&(i!=j)
	ListNumber.add(i);
	}
	}

	//tong gia tri nguyen to chan 
	public int GetTotal();
	ArrayList lstPrimeNumber = new ArrayList();
	for (int i: numbers)
	int  currentnumber = numbers[i];
	boolean isPrime = true;
	for (int k = 2, k < currentnumber; k++){
	if (currentnumber%k ==0){
	isPrime=false;
	break;
	}
	}
	if(isPrime==true)&&(currentnumber%2==0){
	lstPrimeNumber.add(currentnumber);
	int total = 0;
	for (int j: lstPrimeNumber){
	total = total + lstPrimeNumber.get(j)

	//tim xem so nguyen to nao bang tong 2 so lien truoc
	plublic ArrayList GetLuckyNumber(){
	ArrayList lstPrimeNumber = new ArrayList();
	for (int i: numbers)
	int  currentnumber = numbers[i];
	boolean isPrime = true;
	for (int k = 2, k < currentnumber; k++){
	if (currentnumber%k ==0){
	isPrime=false;
	break;
	}
	}
	if(isPrime==true){
	lstPrimeNumber.add(currentnumber);
	for (int j=0; j< lstPrimeNumber.size(); j++){
	if (lstPrimeNumber.get(j+2) = lstPrimeNumber.get(j+1) + lstPrimeNumber.get(j)){
	GetLuckyNumber.add(j+2);
	}
	}
	return lstPrimeNumber;



}
