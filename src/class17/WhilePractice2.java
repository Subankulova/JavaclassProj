package class17;

public class WhilePractice2 {
    public static void main(String[] args) {
        //write a program to print all characters in a string
        String str = "Let's go Mars";
        int startingindex = 0;
        //if you need to increment then use var < how many time you need to run
        while(startingindex<13){
           char each = str.charAt(startingindex);
            System.out.println(each);
           startingindex++;
        }

        //write a program that print out all characters of a string
        //in reverse order
        //ex: Java
        //output: avaJ
        System.out.println("Task2======");

        String str1 = "Java";
        int end = 4;
        while(end>0){
            end--;
            char each1 = str1.charAt(end);
            System.out.println(each1);

        }
        //write a program counting a vowels and cons

        String st = "I love Java";
        int vow = 0;
        int cons = 0;
        int ch = 0;
        st = st.toLowerCase();
        while(ch<=st.length()){
            if (st.charAt(ch) >= 'i' || st.charAt(ch)>='o' || st.charAt(ch) >='e'|| st.charAt(ch)>='a') {
                vow++;
            }
            System.out.println("it's vowels " + vow);
        }
    }
}
