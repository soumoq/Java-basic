import java.util.*;
public class Abc {
    private Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Abc a=new Abc();
        String t1=a.selectText();
        System.out.println(t1);
        String t2=a.sc.nextLine();
        if(t1.equals(t2))
        {
            System.out.println("perfect");
        }
        else
        {
            String words1[]=t1.split("\\W+");
            String words2[]=t2.split("\\W+");
            try
            {
                for(int i=0;i<words1.length;i++)
                {
                    if(!words1[i].equals(words2[i]))
                    {
                        System.out.println(words2[i]);
                    }
                }
                if(words2.length>words1.length)
                {
                    for(int j=words1.length;j<words2.length;j++)
                    {
                        System.out.println(words2[j]);
                    }
                }

            }catch (Exception e)
            {
                System.out.println(e);
            }
        }



    }

    public String selectText()
    {
        String []texts={"what are you doing","I am going to school","This is our home","The Rock is coking","I love to do reading"};
        Random rand=new Random();
        int value=rand.nextInt(texts.length);
        return texts[value];
    }
}
