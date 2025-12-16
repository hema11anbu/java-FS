import  java.util.Arrays;
public class FrequencyElement {
    public static void main(String[] args) {
        int a[]= {1,2,5,3,3,6,2,5,5,7,7};
        boolean[] isVisited=new boolean [a.length];
        for (int i=0;i<a.length;i++) {
            if(isVisited[i]==true) {
                continue;
            }
            int count = 1;
            for (int j=i+1; j<a.length;j++) {
                count++;
                if (isVisited[j] = true ){
                }     
                }
                if(count>0)
                {
                    System.out.println(a[i]+" "+count );
                }
                }
                System.out.println(Arrays.toString(isVisited));
            }
        }
