package LambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {

	public static void main(String[] args) 
	{
        List<Mobile> l=new ArrayList<>();
        
        l.add(new Mobile(1,"apple",100000));
        l.add(new Mobile(2,"apple",200000));
        l.add(new Mobile(3,"apple",4700000));
        
        
        
        
     /*   Comparator<Mobile> com=new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				// TODO Auto-generated method stub
				return 0;
			}
        	
        };
       */
        Comparator<Mobile> com=(e1,e2)->{///lambda Expression Example(arg)->{implimentation}
			return e1.getBrand().compareToIgnoreCase(e2.getBrand());//{}=compare(obj 1,obj 2)?:
   
        };
        
        Collections.sort(l,com);
        for(Mobile m:l)
        	System.out.println(m);
        
	}

}
