package som.study;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: studyJava
 * @description: stream练习
 * @author: cuichenyang
 * @create: 2020-10-13 11:06
 **/
public class StreamMain
{
    private List<String> strlist=new ArrayList<>();
    private List<Integer> integerlist=new ArrayList<>();
    private String[] strArry={"12","cds","cds","df","vgf","vsd"};
    private int[] intArry={1,2,3,4,5,6,7,8};

    @Before
    private void newList()
    {
        for (String s : strArry)
        {
            strlist.add(s);
        }
        for (int i : intArry)
        {
            integerlist.add(i);
        }

    }

    @Test
    public void streamTest()
    {
        integerlist.stream().forEach(a->a);
    }
}
