package com.javalec.Dto;

import java.util.ArrayList;
import java.util.List;

import com.javelec.algorithm.MergeSort;

public class RDto {
	static List<Dto> list=new ArrayList<Dto>();
	
	final String name[]= {"[대박세일]","[롯데리아]치킨","[빠쎤]크뤠잇","[빠싸]농심","[빠싸]젤리스푼","[슈퍼트가]자유이용권","[슈퍼특가]SPAO","[즉시할인]하나 양말","[패션위크]마이슈","[패션위크]데일리샵","[패션위크]스포츠브랜드","[패션위크]뉴발란스","[패션위크]기모"};
	final int price[]= {8000,9000,1600,5000,5000,9900,990,1900,8900,2000,990,11900,19900};
	final int realprice[]= {16000,43000,2900,10000,48000,9900,990,1900,8900,2000,5900,42000,46000};
	final int nine[]= {36,117,10424,268,28,111,358,81,333,1222,271,381,77};
	final int ten[]= {35,9,9397,19,8,57,65,32,119,612,96,766,28};
	
	
	
	
	public RDto() {
		MergeSort merge = new MergeSort();
		
		for(int i=0;i<13;i++)
		{
			Dto temp=new Dto();
			temp.setName(name[i]);
			temp.setPrice(price[i]);
			temp.setRealprice(realprice[i]);
			temp.setNine(nine[i]);
			temp.setTen(ten[i]);
			list.add(temp);
		}
		//System.out.println(list.size());
		list=merge.mergeSort(list);
	}
	
	public List<Dto> getList()
	{
		return list;
	}
	
	
}
