package 并查集;

import java.util.*;

/**
 * @Auther: gjx
 * @Date: 2021/1/18 - 01 - 18 - 15:19
 * @Description: 并查集
 * @version: 1.0
 * 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该账户的邮箱地址。
 * 现在，我们想合并这些账户。如果两个账户都有一些共同的邮箱地址，则两个账户必定属于同一个人。请注意，即使两个账户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的账户，但其所有账户都具有相同的名称。
 * 合并账户后，按以下格式返回账户：每个账户的第一个元素是名称，其余元素是按字符 ASCII 顺序排列的邮箱地址。账户本身可以以任意顺序返回。
 * 示例 1：
 * 输入：
 * accounts = [
 * ["John", "johnsmith@mail.com", "john00@mail.com"],
 * ["John", "johnnybravo@mail.com"],
 * ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]
 * ]
 * 输出：
 * [["John", 'john00@mail.com',
 * 'john_newyork@mail.com', 'johnsmith@mail.com'],
 * ["John", "johnnybravo@mail.com"],
 * ["Mary", "mary@mail.com"]
 * ]
 * 解释：
 * 第一个和第三个 John 是同一个人，因为他们有共同的邮箱地址 "johnsmith@mail.com"。
 * 第二个 John 和 Mary 是不同的人，因为他们的邮箱地址没有被其他帐户使用。
 * 可以以任何顺序返回这些列表，例如答案 [['Mary'，'mary@mail.com']，['John'，'johnnybravo@mail.com']，
 * ['John'，'john00@mail.com'，'john_newyork@mail.com'，'johnsmith@mail.com']] 也是正确的。
 */
public class LeetCode_721 {
    int [] parents;
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        //邮箱
        Map<String, Integer> accountNumber =new HashMap<>();
        //邮箱账户名
        Map<String, String> accountName =new HashMap<>();

        int  accountsNumber = 0;
        for (int i = 0 ; i < accounts.size() ; i++ ){
            for (int j =1 ; j < accounts.get(i).size() ; j++){
                if (!accountNumber.containsKey(accounts.get(i).get(j))){

                    accountNumber.put(accounts.get(i).get(j) , accountsNumber++);
                    accountName.put(accounts.get(i).get(j) , accounts.get(i).get(0));

                }

            }

        }
        //初始化并查集
        init(accountsNumber);

        //合并
        for (int i = 0 ; i < accounts.size() ;i++){
            for (int j = 2 ;j<accounts.get(i).size() ;j++){
                int lindex =accountNumber.get(accounts.get(i).get(1));
                union(lindex , accountNumber.get(accounts.get(i).get(j) ) );
            }
        }

        // 整合
        Map<Integer, List<String>> indexToEmails = new HashMap<Integer, List<String>>();
        for (String email : accountNumber.keySet()) {
            int index = findParent(accountNumber.get(email));
            List<String> account = indexToEmails.getOrDefault(index, new ArrayList<String>());
            account.add(email);
            indexToEmails.put(index, account);
        }


        List<List<String>> result = new ArrayList<>();

        for (List<String> emails : indexToEmails.values()){
            Collections.sort(emails);
            String name = accountName.get(emails.get(0));
            List<String> account = new ArrayList<String>();
            account.add(name);
            account.addAll(emails);
            result.add(account);

        }





        return result;
    }


    public  void init(int size){
        parents =new int[size];
        for (int i = 0; i < parents.length; i++) {
               parents[i] =i;
        }
    }



    int findParent(int i){
        if (parents[i] != i)
           i = findParent(i);
        return i ;
    }

    void union(int i,int j){

        int  left  = findParent(i);

        int  right = findParent(j);

        parents[right] = left;

    }
}
