import java.util.Comparator;
import java.util.TreeSet;

class desending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        if(i1<i2)
        {
            return 1;
        }
        else if(i2<i1)
        {
            return -1;
        }
        return 0;
    }
}
class testing {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>(new desending());
        set.add(67);
        set.add(90);
        set.add(73);
        set.add(38);
        System.out.println(set);
    }
}
