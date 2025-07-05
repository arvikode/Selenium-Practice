import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class Five {
    public static void main(String[] args) {

        // Input_list= [1,2,3].
        //Replace every element with addition of previous and next element
        //1-> 1+2 =3
        //2->1+3=4
        //3->2+3=5
        //output list = [3,4, 5]

        List<Integer> list = List.of(3,4,5);
        List<Integer> result = new ArrayList<>();

        int listLen = list.size();
        System.out.println(listLen);

        for (int i = 0; i < listLen; i++) {
            int prev, next = 0;

            // Find Prev
            if (i == 0) {
                prev = list.get(listLen-1);
            } else {
                prev = list.get(i-1);
            }

            // Find Next
            if (i == listLen-1) {
                next = list.get(0);
            } else {
                next = list.get(i+1);
            }
            result.add(prev+next);
        }
        System.out.println(result);
    }
}
