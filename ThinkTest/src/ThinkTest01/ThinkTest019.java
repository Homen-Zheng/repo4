import java.util.*;

public class test001{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String string = null;
        while (in.hasNext()){
            string = in.nextLine();
            boolean flag = false;
            char[] cArray = string.toCharArray();
            StringBuffer sb= new StringBuffer();
            for(int i=0;i<cArray.length;i++){
                if(i==0||cArray[i-1]==' '){
                    if(cArray[i]>='a'&&cArray[i]<='z') {
                        sb.append((char)(cArray[i]+'A'-'a'));
                    }else {
                        sb.append(cArray[i]);
                    }
                }else if(cArray[i]>='A'&&cArray[i]<='Z') {
                    if(flag){
                        flag=false;
                        continue;
                    }else {
                        flag = true;
                        sb.append((char)(cArray[i]+'a'-'A'));
                    }
                }else {
                    sb.append(cArray[i]);
                }
            }
            System.out.println(sb.toString());
        }

    }
}
