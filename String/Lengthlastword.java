/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
    int l = s.length()-1;
    int c=0;
      for(int i=l;i>=0;i--){
        if(s.charAt(i)!=' '){
            c++;
        }
        else{
            break;
        }
      }
      return c;
    }

}
