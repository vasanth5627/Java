package GetSDEReady.Math;

import java.util.HashMap;
import java.util.Map;

public class CountDaysTogether {
    static Map<Integer,Integer> days = new HashMap<>();
    static int countDays(int d1,int m1,int d2,int m2){

        if(m1==m2){
            return (d1>=d2?d1-d2:d2-d1)+1;
        }
        int count=0;
        for (int i = m1+1; i < m2; i++) {
            count+=days.get(i);
        }
        count+= (days.get(m1)-d1)+d2;
        return count+1;
    }

    static int countNoOfDays(String aa,String al,String ba,String bl){
        String[] ara = aa.split("-");
        String[] lea = al.split("-");
        String[] arb = ba.split("-");
        String[] leb = bl.split("-");
        int araDt = Integer.parseInt(ara[1]);
        int araMo = Integer.parseInt(ara[0]);
        int leaDt = Integer.parseInt(lea[1]);
        int leaMo = Integer.parseInt(lea[0]);
        int arbDt = Integer.parseInt(arb[1]);
        int arbMo = Integer.parseInt(arb[0]);
        int lebDt = Integer.parseInt(leb[1]);
        int lebMo = Integer.parseInt(leb[0]);

        if(leaMo>arbMo || lebMo>araMo){
            return 1;
        }

        if(leaMo==arbMo && lebMo==araMo && (leaDt>=arbDt || lebDt>=araDt)){
            return 2;
        }
        return 0;
//
//           int noOfDays =  araMo>=arbMo?leaMo>=arbMo?countDays(arbDt,arbMo,leaDt,leaMo):0
//               :lebMo>=araMo?countDays(araDt,araMo,leaDt,leaMo):0;
//
//       return noOfDays;

    }

    public static void main(String[] args) {
        days.put(1,31);
        days.put(2,28);
        days.put(3,31);
        days.put(4,30);
        days.put(5,31);
        days.put(6,30);
        days.put(7,31);
        days.put(8,31);
        days.put(9,30);
        days.put(10,31);
        days.put(11,30);
        days.put(12,31);

        System.out.println(countNoOfDays("10-01","10-31","11-01","12-31"));

    }
}
