//package bianlifen;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.ListTest;
//
//public class p3 {
//
//
//    public int buy(int money, int[] items){
//        ArrayList<Integer> a =new ArrayList<Integer>(0);
//        HashMap<>
//        track(a,money,0,items);
//        return a.get(0);
//    }
//
//    public void track(ArrayList a ,int money,int now_money,int  [] items){
//        if (now_money==money){
//            a.set(0,(int)a.get(0)+1);
//        }
//        for(int i=0;i<items.length;i++){
//            now_money += items[i];
//            if (now_money<=money){
//                track(a,money,now_money,items);
//                now_money -= items[i];
//            }
//
//            else {
//                now_money -= items[i];
//                return;
//            }
//        }
//    }
//}
