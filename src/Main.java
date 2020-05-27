import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        int[] ary = {1, 2, 4, 4, 6, 8, 11, 15};
        int sum = 10;


//        for (int i = 0; i < ary.length ; i++) {
//
//            for (int j = 0; j < ary.length; j++) {
//                System.out.println(ary[i] +" "+ ary[j]);
//
//                if(ary[i] + ary[j] == 8){
//
//                    System.out.println(ary[i] + " + " + ary[j] + " = " + 8);
//
//                    break;
//
//                }
//            }
//
//        }


        System.out.println(findPair(ary, sum));


    }


    static boolean findPair(int[] data, int sum) {

        HashSet<Integer> hashSet = new HashSet();
        int len = data.length;

        for (int i = 0; i < len; i++) {
            System.out.println(data[i] + " - " + sum );
            if (hashSet.contains(data[i])) {
                System.out.println(data[i] + " "  );
                System.out.println(hashSet);
                return true;

            }

            hashSet.add(sum - data[i]);
            System.out.println(hashSet + "hs");

        }

        return false;

    }

}

//3,5,6,7,8,2