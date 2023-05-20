class Solution {
    public int partitionString(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character, Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){
                    System.out.println(s.charAt(j) + " "+j);
                    count++;
                    i=j-1;
                    break;
                }
                else{
                    map.put(s.charAt(j), j);
                }
            }
        }
        return count+1;
    }
}



//using hashset
class Solution {
    public int partitionString(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> map=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(map.contains(s.charAt(j))){
                    System.out.println(s.charAt(j) + " "+j);
                    count++;
                    i=j-1;
                    break;
                }
                else{
                    map.add(s.charAt(j));
                }
            }
        }
        return count+1;
    }
}
