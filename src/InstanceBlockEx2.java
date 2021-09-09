public class InstanceBlockEx2 {
        int val;
        static int count;

        // instance block
        {
            count++;
        }
        InstanceBlockEx2()
        {
            val = 90;
            count++;
        }
        InstanceBlockEx2(int a)
        {
            val = a;
            count++;
        }
        public static void main(String[] args) {
            InstanceBlockEx2 obj = new InstanceBlockEx2();
            InstanceBlockEx2 obj2 = new InstanceBlockEx2(40);
            InstanceBlockEx2 obj3 = new InstanceBlockEx2();
            InstanceBlockEx2 obj4 = new InstanceBlockEx2();
            InstanceBlockEx2 obj5 = new InstanceBlockEx2();
            System.out.println(count);
        }
    }

