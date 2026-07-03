class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String str1= new String(arr1);
        for(int i=0;i<s2.length();i++){
            for(int j=i ;j<s2.length();j++){
                char[] substr1=s2.substring(i,j+1).toCharArray();
                Arrays.sort(substr1);
                String sortedsubstr=new String(substr1);
                if(sortedsubstr.equals(str1)){
                    return true;
                }
            }
        }
    return false;
        
    }
}
