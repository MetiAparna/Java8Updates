package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter1
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(6);
		l.add(7);
		l.add(3);
		l.add(9);
		l.add(8);
		l.add(12);
		
		
        List<Integer> l2=l.stream().filter(e1->e1%2==0).collect(Collectors.toList());
        System.out.println(l2);
     /*   
        for(Integer a:l)
        {
        	if(a%2==0)
        		l2.add(a);
        }
		System.out.println(l2);
	   */
        
        
		}

}
