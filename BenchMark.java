
import java.util.Scanner;
import java.lang.*;
class TaskBubble extends Thread{
	public void run(){
		BenchmarkMethods.bubble(BenchMark.array);
	}
}

class TaskInsertion extends Thread{
	public void run(){
		BenchmarkMethods.insertion(BenchMark.array);
	}
}
class TaskSelection extends Thread{
	public void run(){
		BenchmarkMethods.selection(BenchMark.array);

	}
}
 class BenchMark{
	static int[] array;
	public static void sort(int[] arr){
		int choice;
		Scanner S = new Scanner(System.in);
		do{

        System.out.println("..............................................");
		System.out.println("choose sorting algorithm");
		System.out.println("1.bubble \t2.insertion\t3.selection\t4.benchmark all sort\t5.exit\t6.start over");
		System.out.println("...................................................");
		System.out.println("enter your choice");
		choice=S.nextInt();

		switch(choice){
			case 1:System.out.println("you have chosen bubble sort");
			       BenchmarkMethods.bubble(arr);
			       break;
			case 2:System.out.println("you have chosen insertion sort");
			       BenchmarkMethods.insertion(arr);
			       break;
			case 3:System.out.println("you have chosen selection sort");
			        BenchmarkMethods.selection(arr);
			        break;
			case 4:System.out.println("you have chosen benchmark all");
			    
			        array=arr;
			        TaskBubble tB=new TaskBubble();
			        tB.start();

			        TaskInsertion tI= new TaskInsertion();
			        tI.start();

			        TaskSelection tS=new TaskSelection();
			        tS.start();
			         while(true){
			        	if(!(tB.isAlive()||tI.isAlive()||tS.isAlive())){
			        		break;
			        	}
			        }

			        break;
			case 5:System.out.println("thank you");
			       System.exit(0);
			       break;
			case 6:mainCall();		

			default:System.out.println("enter proper choice");
		}
	}while(choice!=5);
}

	public static void mainCall(){

		Scanner S = new Scanner(System.in);
		int choice,size=0;


		System.out.println("enter the array size");
		size = S.nextInt();
		System.out.println("..................................");

		int[] array1=new int[size];
		do{

		System.out.println("choose the complexity");
		System.out.println("\n 1.Best Case \t 2.Average Case \t 3.Worst Case  ");
		System.out.print(" Enter Your choice :-\t");
			choice = S.nextInt();
		System.out.println("--------------------------------------------------");

		switch(choice){
			case 1:System.out.println("you have chosen best case");
			       array1=calculator.generatenaturalnos(size);
			       sort(array1);
			       break;

			case 2:System.out.println("you have chosen avaerage case");
			       array1=calculator.generaterandomnos(size);
			       sort(array1);
			       break;

			case 3:System.out.println("you have chosen worst case");
			       array1=calculator.revNaturalnos(size);
			       sort(array1);
			       break;

			default:System.out.println("enter proper choice");
			         break;
			       }
			   }
			 while(!(choice==1||choice==2||choice==3));
			}


		public static void main(String[] args){
				mainCall();
			}
}

		
	










			        

		



	

