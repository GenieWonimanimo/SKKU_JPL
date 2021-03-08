public class  VarArrayMethod{
	// main function에서 호출 될 함수는 static이어야 한다.
	// static이 아닌 함수를 호출하기 위해서는
	static void runMethod(int a, int b) {
		System.out.println("Executed runMethod .. ");
		
		System.out.println("Finished runMethod. ");
	}
	static void runMethod(float a, int b) {
		
	}
	static void runMethod(float a, int b, int c) {
		
	}
	/* 이 함수는 return 값만 바뀌었기 때문에 overloading 아님	
	static int runMethod(float a, int b, int c) {
		
	}
	*/
	// 각각의 원소에 접근하려면 for loop 이용
	static void runMethod(float... a) {
		for (float i : a)
			System.out.println(i);
	}
	public static void main(String[] args) {
		int variable1 = 10;
		double variable2 = 2.5;
		float variable3 = 2.4f; // 더 작은 자료형에 double을 넣으므로 f로 바꿔줘야 한다
		long variable4 = 2;
		boolean variable5 = true;
		String string1 = "Hello, welcome to ";
		String string2 = "Java programming";
		String string3 = string1 + string2;
		//System.out.println(variable1 + " " + variable2 + " " + variable3);
		//System.out.println(variable4 + " " + variable5 + " " + string3);
		
		int []array1 = new int[10];
		int array2[] = new int[10];
		//System.out.println(array1);		// array1의 주소 값을 출력
		//System.out.println(array1[0]);	// 값을 설정하지 않으면 0으로 초기화된다
		array1[1] = 7;
		//System.out.println(array1[1]);
		//System.out.println(array1[15]); // out of bounds 에러
		
		int [][]array3 = {{1, 2, 3, 4}, {5, 6, 7, 8}}; // new int[2][4]
		int array4[][] = new int[10][5];
		//System.out.println(array3[0][2]);
		
		//runMethod(variable1, 20);
		//runMethod(variable3, variable3, variable3);
	}

}
