package com.michael;

import java.util.Arrays;

public class InsertionSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1021,304,15,6};
		for(int i=1;i<arr.length;i++) {
			int insertValue = arr[i];
			int insertedIndex = i-1;
			while(insertedIndex>=0&&insertValue<arr[insertedIndex]) {// {101,34,15,256}==>{34,101,15,256}
				arr[insertedIndex + 1] = arr[insertedIndex];// {101,34,15,256}==> {101,101,15,256}
				insertedIndex--;//����������-1Ϊ����������׼������������ѭ�� insertedIndex == -1
			}
			arr[insertedIndex+1] = insertValue;//indexsertedIndex == -1+1 == 0 
			System.out.println("��"+i+"�ֲ���"+Arrays.toString(arr));

		}

	}

}
