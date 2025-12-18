public class RemoveOuterMostParanthesesrs {
    public static void main(String[] args) {
        String s="(()()())(())" ;
        int cnt=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')') {
                cnt--;

            }
            if(cnt!=0)
            {
                sb.append(s.charAt(i));  {
                    cnt++;
                }
            }

        }
        System.out.println(sb.toString());
        
        
    }
    
}
