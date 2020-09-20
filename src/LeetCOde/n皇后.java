//package LeetCOde;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class n皇后 {
//    public static void main(String[] args) {
//        StringBuilder s =new StringBuilder();
//        s.append('.');
//        s.setCharAt();
//    }
//
//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> result =new ArrayList<List<String>>();
//        int [] array =new int[n];
//        check(0,array,result);
//        return result;
//    }
//
//    private void check(int i, int[] array, List<List<String>> result) {
//        if (i==array.length){
//            List<String> list=new ArrayList<String>();
//
//            for(int k =0;k<array.length;k++){
//                String str="";
//                for(int z=0;z<array[k];z++){
//                    str+=".";
//                }
//                str+="Q";
//                for(int z=array[k]+1;z<array.length;z++){
//                    str+=".";
//                }
//                list.add(str);
//            }
//
//            result.add(new ArrayList(list));
//            return ;
//        }
//
//        boolean [] col =new boolean[array.length];
//
//        for(int j=0;j<array.length;j++){
//
//            array[i] =j;
//            if(!col[j]&&judge(array,i)){
//                col[j] =true;
//                check(i+1,array,result);
//            }
//
//        }
//
//
//
//    }
//
//
//    private  boolean judge(int[] array, int i) {
//        for(int j =0;j<i;j++){
//            if(array[i]==array[j]||Math.abs(j-i)==Math.abs(array[j]-array[i])){
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
