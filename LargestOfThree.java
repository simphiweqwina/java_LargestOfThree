import java.util.Scanner;

class LargestOfThree{
	int largestNum;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//instantiate class
		LargestOfThree lot = new LargestOfThree();
		//prompt first number 
		System.out.print("Enter FIRST nO. :");
		lot.findLargest(sc.nextInt());
		//prompt secomd number
		System.out.print("Enter SECOND nO. :");
		lot.findLargest(sc.nextInt());
		//prompt third number
		System.out.print("Enter THIRD nO. :");
		lot.findLargest(sc.nextInt());
		//print result
		lot.printResult();
	}

	public void findLargest(int num){
		if (num > this.largestNum) {
			this.largestNum = num;
		}
	}

	public void printResult(){
		System.out.print("Largest Number is : "+this.largestNum);
	}
}