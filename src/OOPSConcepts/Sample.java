package OOPSConcepts;

import java.util.Arrays;

class Sample
{
    public void demo(String str)
    {
        String arr = str.split(";")[0];
        System.out.println(arr);
        System.out.println(arr + " iam the arr");
//        for (String s : arr)
//        {
//            System.out.println(s);
//        }
    }
 
    public static void main(String[] args)
    {
        char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 
                        'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        String str = new String(array);
        //
        System.out.println(str + " iam the str");
        Sample obj = new Sample();
        obj.demo(str);
    }
}