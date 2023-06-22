import java.util.*;
class LinkedLists{
public static void main(String args[]){
LinkedList<String>ll=new LinkedList<String>();
ll.add("a");
ll.add("b");
ll.add("c");
ll.add("d");
ll.add("e");
System.out.print("\n current contents of linked list:"+ll);
ll.clear();
System.out.println("\n contents of linked list after deletion: "+ll);
}
}
