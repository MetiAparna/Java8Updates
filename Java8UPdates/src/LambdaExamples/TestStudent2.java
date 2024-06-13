package LambdaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent2 {

	public static void main(String[] args)
	{
		List<Student> l=new ArrayList<Student>();
	       
	       l.add(new Student(1,"Krishna","Java"));
	       l.add(new Student(2,"Radha","sql"));
	       l.add(new Student(3,"Mukunda","Html"));
	       l.add(new Student(4,"Achyutha","css"));
	       l.add(new Student(5,"Rama","Java"));
	       l.add(new Student(6,"Sita","sql"));
	       
	       TestStudent2 t=new TestStudent2();
	        t.sortByCourse(l);
	}
	       
	       public void sortByCourse(List<Student> l)
	       {
	    	   Collections.sort(l,(e1,e2)->{
	    		   
	    		   return e1.getCourse().compareToIgnoreCase(e2.getCourse());
	    	   });
	    	   for(Student s:l)
	    		   System.out.println(s);
	    	   
	       }
	}

	

