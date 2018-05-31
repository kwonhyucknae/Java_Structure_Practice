package com.javelec.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.javalec.Dto.Dto;

public class MergeSort {

	public static void mergeSort(List<Dto> list,int l,int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(list,l,mid);
			mergeSort(list,mid+1,r);
			merge(list,l,mid,r);
		}
	}
	public static void merge(List<Dto> list,int l,int mid,int r)
	{
		int i=l;
		int j=mid+1;
		int k=l;
		//int temp[]=new int[list.size()];
		List<Dto> temp=new ArrayList<Dto>();
		
		while(i<=mid && j<=r)
		{
			if(list.get(i).getPrice()<list.get(j).getPrice())
			{
				temp.set(k++, list.get(i));
			}
			else {
				temp.set(k++, list.get(j));
			}
		}
		while(i<=mid)
			temp.set(k++,list.get(i++));
		while(j<=r)
			temp.set(k++, list.get(j++));
		for(int index=l;index<k;index++)
			{list.set(index, temp.get(index));
			 list.get(index).setRank(index);
			}
	}
	
	public static void printArray(List<Dto> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getName()+" ");
		}
		System.out.println();
	}
	
}
