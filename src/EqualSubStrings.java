public class EqualSubStrings {

    public static void main(String[] args) {
        String s ="abcdefghi";
        int i,n=3,l,j=0;
        l=s.length();
        String[] ss = new String[n];
        int sl=l/n;
        if(l%n!=0)
        {
            System.out.println("Can not divide string equally");
        }
        else
        {
            for(i=0;i<l;i=i+sl)
            {
                String part = s.substring(i,i+sl);
                ss[j]=part;
                j++;


            }
            for(j=0;j<n;j++) {
                System.out.println(ss[j]);
            }
        }
    }

}
