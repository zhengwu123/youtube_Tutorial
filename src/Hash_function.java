/**
 * Created by zhengwu on 8/26/17.
 */
public class Hash_function {
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
        //convert string into integer.
        //magic number 31, 33
        long result = 0;
        for(int i=0;i<key.length;i++){
            result = (result * 33 + (int)key[i])%HASH_SIZE;
        }
        return (int)result;
    }
}
