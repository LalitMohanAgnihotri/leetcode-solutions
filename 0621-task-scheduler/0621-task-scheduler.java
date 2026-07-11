class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task:tasks) {
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int maxFreq=freq[25];
        int countMax=0;
        for (int f:freq) {
            if (f==maxFreq) countMax++;
        }
        int count=maxFreq-1;
        int length= n+1;
        int empty= count*length+countMax;
        return Math.max(empty,tasks.length);
    }
}
