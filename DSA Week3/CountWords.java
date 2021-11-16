package Week3;

public class CountWords {
    public static int countWords(String s) 
    { 
        // code here  
        int cnt=0,i=0;
        char ch=s.charAt(i);
        while(i<s.length() && (ch=='\\'||ch==' '))
            {
              ch=s.charAt(i);
              if(ch==' ')
              {
                  i++;
              }
              else if(ch=='\\')
              {
                  i+=2;
              }
            }
        for(;i<s.length();)
        {
            ch=s.charAt(i);
            if(ch=='\\'||ch==' ')
            {
              while(i<s.length() && (ch=='\\'||ch==' '))
              {
                ch=s.charAt(i);
                if(ch==' ')
                {
                  i++;
                }
                else if(ch=='\\')
                {
                  i+=2;
                }
              }
              cnt++;
            }
            else
              i++; 
        }
        if(!(s.charAt(s.length()-1)==' ' || s.charAt(s.length()-2)=='\\'))
          cnt++;
        return cnt;
    
    }
}
