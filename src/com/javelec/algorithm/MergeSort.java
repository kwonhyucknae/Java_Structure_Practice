package com.javelec.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.javalec.Dto.Dto;

public class MergeSort {

	public static List<Dto> mergeSort(List<Dto> list)
	{
		if (list.size() < 2) 
			return list; 
		int mid = list.size()/2; 
		List<Dto> a_list = new ArrayList<>(); 
		List<Dto> b_list = new ArrayList<>(); 
		
		for (int i=0; i<mid; i++) 
		{ 
			a_list.add(list.get(i)); 
		} 
		for (int i=mid; i<list.size(); i++) 
		{ 
			b_list.add(list.get(i)); 
		} 
		
		a_list = mergeSort(a_list); 
		b_list = mergeSort(b_list); 
		List<Dto> result = merge(a_list, b_list); 
		
		return result;

	}
	public static List<Dto> merge(List<Dto> a_list,List<Dto> b_list)
	{
		int indexOfA = 0, indexOfB = 0; 
		List<Dto> result = new ArrayList<>(); 
		
		
		while (indexOfA < a_list.size() && indexOfB < b_list.size())
		{ 
			if (a_list.get(indexOfA).getPrice() <= b_list.get(indexOfB).getPrice()) 
			{ 
				result.add(a_list.get(indexOfA)); 
				indexOfA++; 
			} 
			else 
			{ 
				result.add(b_list.get(indexOfB)); 
				indexOfB++; 
			} 
		} 
		while (indexOfA < a_list.size()) 
		{ 
			result.add(a_list.get(indexOfA)); 
			indexOfA++; 
		} 
		while (indexOfB < b_list.size()) 
		{ 
			result.add(b_list.get(indexOfB)); indexOfB++; 
		} 
		
		return result;
		
		/*
		int i=l;
		int j=mid+1;
		int k=l;
		//int temp[]=new int[list.size()];
		List<Dto> temp=new ArrayList<Dto>();
		
		while(i<=mid && j<=r)
		{
			if(list.get(i).getPrice()<list.get(j).getPrice())
			{
				temp.add(list.get(i));
				i++;
			}
			else {
				temp.add(list.get(j));
				j++;
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
			*/
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
