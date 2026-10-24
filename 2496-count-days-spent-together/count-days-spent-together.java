import java.util.*;
class Solution {
    private static final int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String st;
        String ed;
        if(arriveAlice.compareTo(arriveBob)>0){
            st=arriveAlice;
        }else st=arriveBob;
        if(leaveAlice.compareTo(leaveBob)<0){
            ed=leaveAlice;
        }else ed=leaveBob;
        if(st.compareTo(ed)>0) return 0;
        return toGether(ed)-toGether(st)+1;
        
    }
    private int toGether(String date){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
}