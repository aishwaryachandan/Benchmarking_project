
class Sortingalgos{

	

	public static int[] bubblesort(int[] array){
		int[] array1= array;
		int temp=0;
	    int n=array1.length-1;

		for(int i=0;i<n;i++){
			for(int j=0;j<(n-i);j++){
				if(array1[j]>array1[j+1]){
					temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		return array1;
	}
	public static int[] selectionsort(int[] array){
		int[] array1=array;
		int temp=0;
		int i,j,min,minIndex;
		for(i=0;i<array1.length;i++){
			min=array1[i];
			minIndex=i;
			for(j=i;j<array1.length;j++){
				if(array1[j]<min){
					min=array1[j];
					minIndex=j;
				}
			}
		   temp=array1[i];
           array1[i]=array1[minIndex];
           array1[minIndex]=temp;
		}
   
        return array1;

	}
	public static int[] insertionsort(int[] array){
		int[] array1=array;
		int temp=0;
		int j;
		for(int i=1;i<array1.length;i++){
			j=i-1;
			while(j>-1 && array1[j]>array1[j+1]){
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;	
			}
		
		}
		return array1;
	}
}