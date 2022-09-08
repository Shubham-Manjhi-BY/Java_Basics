import java.util.ArrayList;

public class Demo
{
    public static boolean Exist = false;
    public static void ReplaceIfExist(String ReplaceValue, ArrayList list)
    {
        if(list.size() >= 3) {
            list.set(2, ReplaceValue);
            Exist = true;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(" Original Arraylist : "+list);

        ReplaceIfExist("Shubham",list);
        System.out.println(" Check Replace Exist in Arraylist : "+Exist);
        System.out.println(" Replaced Arraylist : "+list);
    }
}