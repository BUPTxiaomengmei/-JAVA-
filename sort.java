/*
 * ���ߣ�BUPTС����
 * 
 * ����ð�ݺ�ѡ�����򣬷ֱ���Bubble��Select
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
			
			//�ó����������һ��1-100000��
			//Math.random()�����һ��0~1
			int t=(int)(Math.random()*10000);
			arr[i]=t;
		}
		//����һ��Bubble��
//		Bubble bubble=new Bubble();

		
		//����һ��Select��
		Select select=new Select();
		
		//������ǰ��ӡϵͳʱ��
		Calendar cal=Calendar.getInstance();
		System.out.println("����ǰ"+cal.getTime());
//		bubble.sort(arr);
		select.sort(arr);
		//���µõ�ʵ��
		Calendar cal1=Calendar.getInstance();
		System.out.println("�����"+cal1.getTime());
		//��������
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
	}

}



//ѡ������
class Select
{
	//ѡ������
	public void sort(int arr[])
	{
		int temp=0;
		for(int j=0;j<arr.length-1;j++)
		{
			//����Ϊ��һ����������С��
			int min=arr[j];
			//��¼��С�����±�
			int minIndex=j;
			for(int k=j+1;k<arr.length-1;k++)
			{
				if(min>arr[k])
				{
					//�޸���С
					min=arr[k];
					minIndex=k;
				}
			}
			
			//���˳�for���ҵ���ε���Сֵ
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			minIndex=j;
		}
	}
}



//ð������
class Bubble
{
	
	//���򷽷�
	public void sort(int arr[])
	{
		int temp=0;
		//����ʼ
		//���ѭ����������һ���߼���
		for(int i=0;i<arr.length-1;i++)
		{
			//�ڲ�ѭ������ʼ��һ�Ƚϣ��������
			//ǰһ�����Ⱥ�һ�������򽻻�
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//��λ
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
}



