package com.xp.day01;
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * @author xp
 *
 */
public class Solution {
	public static void main(String[] args) {
		System.out.println("请输入");
		
		
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
