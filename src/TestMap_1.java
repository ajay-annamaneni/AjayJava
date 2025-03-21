import java.util.*;

public class TestMap_1
{
    public static void main(String[] args)
    {
        Map<Integer, Student> myMap=new HashMap<Integer, Student>();

        Student s1=new Student("AAJay","AT");
        myMap.put(1,s1);

        System.out.println(myMap);
        for(Integer i: myMap.keySet())
        {
            System.out.println(myMap.get(i));//.displayInfo();
        }
    }
}

//myMap.put(3,'A');
//System.out.println("Updating "+myMap);
	
	/*if(myMap.containsKey(1))
	{
		myMap.put(1,'X');
	}
	myMap.remove(3);
	System.out.println("After Remove "+myMap);
	System.out.println("Student Grade "+myMap.get(2));
	}
}*/