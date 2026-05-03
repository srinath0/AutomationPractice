public class TwoDigitisSame{
    public static void main(String[] args) {
        String str="12345";
        while(str.length()>2){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length()-1;i++){
                int ch=str.charAt(i)-'0';
                int ch1=str.charAt(i+1)-'0';
                int sum=ch+ch1;
                sb.append(sum%10);
            }
            str=sb.toString();
            System.out.println(str);
        }
        if(str.charAt(0)==str.charAt(1)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

