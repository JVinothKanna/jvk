import java.util.HashMap;
import java.util.Map;

public class BalancedBracketsUsingHashMap {

    public static boolean check(String input){
        char[] inputAry = input.toCharArray();
        Map<Character, Integer> result = new HashMap<>();
        //({}[()])
        for(char c : inputAry){
            if(c == '('){
                if(result.containsKey('(')){
                    int tmp = result.get('(');
                    tmp++;
                    result.put('(', tmp);
                }else{
                    result.put('(', 1);
                }

            }else if(c == ')'){
                if(result.containsKey('(')){
                    int tmp = result.get('(');
                    tmp--;
                    result.put('(', tmp);

                }else{
                    return false;
                }
            }else if(c == '{'){
                if(result.containsKey('{')){
                    int tmp = result.get('{');
                    tmp++;
                    result.put('{', tmp);
                }else{
                    result.put('{', 1);
                }
            }else if(c == '}'){
                if(result.containsKey('{')){
                    int tmp = result.get('{');
                    tmp--;
                    result.put('{', tmp);
                }else{
                    return false;
                }

            }else if(c == '['){
                if( result.containsKey('[')){
                    int tmp = result.get('[');
                    tmp++;
                    result.put('[', tmp);
                }else{
                    result.put('[', 1);
                }
            }else if(c == ']' ){
                if(result.containsKey('[')){
                    int tmp = result.get('[');
                    tmp--;
                    result.put('[', tmp);
                }else{
                    return false;
                }
            }
        }

        long val = result.entrySet().stream().filter(e -> e.getValue() >= 1).count();

        if(val >= 1) {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] arg){
        String input = "({}[()])";
        System.out.println(check(input));

    }
}
