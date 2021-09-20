package org.cap.train;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! from STS!");
		show();
	}
	
	public static void show() {
		int[] arr= {1,2,3};
		for(int i=0; i<4;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Show method here!");
	}
}
