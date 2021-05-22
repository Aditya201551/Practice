public class StringProgram {
    public static void main(String[] args) {
        String s="Hello World";
        char ch=s.charAt(1);
        char arr[]=s.toCharArray();
        System.out.println(ch);
        for(int i=0;i<11;i++)
            System.out.print(arr[i]);
    }
}
