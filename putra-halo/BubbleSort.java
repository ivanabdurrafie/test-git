class BubbleSort{
	static int [] arr = {16, 63, 10, 9, 37, 22, 1, 54};
	static int n = arr.length, i, j, temp = 0;
	public static void sorting(){
		for(i = 0; i < n; i++){
			for(j = 1; j < (n-i); j++){
				swap();
			}
		}
	}
	public static void swap(){
		if(arr[j-1] > arr[j]){
			temp = arr[j-1];
			arr[j-1] = arr [j];
			arr[j] = temp;
		}
	}
	public static void tampilArray(){
		System.out.println("Hasil pengurutan: ");
		for(i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		sorting();
		tampilArray();
	}
}