class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String add = word;
        while(sequence.contains(word) == true) {
            count++;
            word += add;
        }
        return count;
    }
}