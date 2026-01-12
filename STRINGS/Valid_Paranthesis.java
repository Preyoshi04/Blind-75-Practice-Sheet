import java.util.*;

public class Valid_Paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        Valid_Paranthesis obj = new Valid_Paranthesis();
        System.out.println(obj.isValid(str));
        sc.close();
    }
     public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                st.push(c);
            }
            else
            {
                if(st.isEmpty())
            {
                return false;
            }
            char top = st.pop();
            if(c == ')' && top != '(')
            {
                return false;
            }
            else if(c == '}' && top != '{')
            {
                return false;
            }
            else if(c == ']' && top != '[')
            {
                return false;
            }
            }
        }
        return st.isEmpty();
    }
}
