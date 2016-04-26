package com.xp.sort;
/*
 * ��������
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arry = new int[]{23,12,3,4,67,5,6,12,2,89,12};
		System.out.print("����֮ǰ��");
		outPrint(arry);//��ӡ
		//int[] a = insertSort(arry);
		//int[] a = inSort(arry);
		int[] a = selectSort(arry);
		outPrint(a);
	}
	
	public static void outPrint(int[] arry){
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * ��������     ����
	 * @param a
	 * @return
	 */
	public static int[] insertSort(int[] a){
		for (int i = 1; i < a.length; i++) {
			if(a[i]<a[i-1]){	
				int j = i-1; //�����ڱ�ģʽ ������ڱ�����һ��������һֱ���ƣ�ֱ���ҵ����ʵ�λ�ò���
				int x = a[i];
				a[i] = a[i-1];		
				while(x<a[j]){
					a[j+1] = a[j];
					j--;
				}
				a[j+1] = x;
			}
			outPrint(a);
		}
		return a;
	}
	/**
	 * ֱ��ѡ������
	 * @param a
	 * @return
	 */
	public static int[] inSort(int[] a){
		for (int i = 1; i < a.length; i++) {
			int j = i-1;
			int x = a[i];
			for(;j>=0&&x<a[j];j--){
				a[j+1] = a[j];
			}
			a[j+1] = x;
			outPrint(a);
		}
		return a;
	}
	
	public static int[]  selectSort(int[] a){  
        int position=0;  
        for(int i=0;i<a.length;i++){  

            int j=i+1;  
            position=i;  
            int temp=a[i];  
            for(;j<a.length;j++){  
            if(a[j]<temp){  
                temp=a[j];  
                position=j;  
            }  
            }  
            a[position]=a[i];  
            a[i]=temp;  
            outPrint(a);
        }  
        return a;
    }  

}
