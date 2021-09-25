package com.rajat.algorithms.sort;

public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		
		int[] input = {5,2,6,4,1,3};
		
		insertionSort(input);
		
		for(int i=0;i<input.length;i++){
			
			System.out.println(input[i]);
		}

	}
	/*******************************************************************************************************************
										
										                 INSERTION SORT
										
	 * Insertion sort starts with a pivot starting at 1st position of the array. pivot is used as the boundary
	 * to distinguish the sorted part and unsorted part of the given array. At each iteration the pivot moves
	 * to right bringing one more element to the sorted part and insert into its correct position within the sorted part.
	 */
	
	
	
	public static void insertionSort(int[] input){
		
		for(int i=1;i <input.length;i++){
			
			int key = input[i];
			int j= i-1;
			
			while(j >=0 && key < input[j]){
				
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = key;
					
		}
	
	}
	
	/************************************************************************************************************************
	 * Merge sort applies the divide and conquer rule. It keeps dividing the array until it goes down to size 1 and then merges
	 * back the sorted arrays. 
	 * 
	 */
	
	
	public static void mergeSort(int[] A, int low, int high){
		
		int mid = low + (high - low)/2;
		
		mergeSort(A, low, mid);
		mergeSort(A, mid+1, high);
	//	merge()
		
		
		
		
	}
	
	
	
	public static int[] merge(int[] A, int[] B){
		
		int lenA = A.length;
		int lenB = B.length;
		
		int[] merged = new int[lenA+lenB]; 
		int i=0,j=0,k=0;
		
		while(i < lenA && j < lenB){
			
			if(A[i] <= B[j]){
				
				merged[k++] = A[i++];
				
		
			}else{
				
				merged[k++] = B[j++];
				
			}

		 }
		 
		 while(i < lenA){
			 
			 merged[k++] = A[i++];
			 
		 }
		
		 while(j < lenB){
			 
			 merged[k++] = B[j++];
			 
		 }
		
		
		return merged;
		
		
		
	}

}
