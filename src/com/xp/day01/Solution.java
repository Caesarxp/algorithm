package com.xp.day01;
/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 * @author xp
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("������");
		
		
	}
	
	public boolean Find(int[][] arry, int target){
		boolean found = false;
		int lie = arry[0].length;
		int hang = arry.length;
		int col = lie - 1;
		int row = 0;
		while(row<hang &&col>=0){
	           int value = arry[row][col];
	            if(target>value){
	                row++;
	            }else if(value>target){
	                col--;
	            }else{
	                found = true;
	                break;
	            }
	                  
	    }
		return found;
		
	}
	

}
