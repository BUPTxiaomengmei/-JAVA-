/*
 * 作者：BUPT小萌妹
 * 
 * 含有冒泡和选择排序，分别是Bubble和Select
 */

package com.Josephus;

import java.util.*;

class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int len=150000;
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			
			//让程序随机产生一个1-100000数
			//Math.random()会产生一个0~1
			int t=(int)(Math.random()*10000);
			arr[i]=t;
		}
		//创建一个Bubble类
//		Bubble bubble=new Bubble();

		
		//创建一个Select类
		Select select=new Select();
		
		//在排序前打印系统时间
		Calendar cal=Calendar.getInstance();
		System.out.println("排序前"+cal.getTime());
//		bubble.sort(arr);
		select.sort(arr);
		//重新得到实例
		Calendar cal1=Calendar.getInstance();
		System.out.println("排序后"+cal1.getTime());
		//输出最后结果
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
	}

}



//选择排序
class Select
{
	//选择排序
	public void sort(int arr[])
	{
		int temp=0;
		for(int j=0;j<arr.length-1;j++)
		{
			//我认为第一个数就是最小的
			int min=arr[j];
			//记录最小数的下标
			int minIndex=j;
			for(int k=j+1;k<arr.length-1;k++)
			{
				if(min>arr[k])
				{
					//修改最小
					min=arr[k];
					minIndex=k;
				}
			}
			
			//当退出for就找到这次的最小值
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			minIndex=j;
		}
	}
}



//冒泡排序
class Bubble
{
	
	//排序方法
	public void sort(int arr[])
	{
		int temp=0;
		//排序开始
		//外层循环，它决定一共走几趟
		for(int i=0;i<arr.length-1;i++)
		{
			//内层循环，开始逐一比较，如果发现
			//前一个数比后一个数大，则交换
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//换位
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
}



