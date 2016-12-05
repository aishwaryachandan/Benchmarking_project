
class BenchmarkMethods {
	public static void bubble(int[] arr){
		int[] temp=new int[arr.length];
		calculator.copyArray(arr,temp);
		long startTime = System.currentTimeMillis();

		Sortingalgos.bubblesort(temp);
		long endTime = System.currentTimeMillis();
		long totalTime=endTime - startTime;
		System.out.println("time taken by bubble sort is"+" "+totalTime);

	}
	public static void insertion(int[] arr){
		int[] temp=new int[arr.length];
		calculator.copyArray(arr,temp);
		long startTime = System.currentTimeMillis();
		Sortingalgos.insertionsort(temp);
		long endTime = System.currentTimeMillis();
		long totalTime=endTime - startTime;
		System.out.println("time taken by insertionsort is"+" "+totalTime);

	}
	public static void selection(int[] arr){
		int[] temp=new int[arr.length];
		calculator.copyArray(arr,temp);
		long startTime = System.currentTimeMillis();
		Sortingalgos.selectionsort(temp);
		long endTime = System.currentTimeMillis();
		long totalTime=endTime - startTime;
		System.out.println("time taken by selectionsort is"+" "+totalTime);

	}

}