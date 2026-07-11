class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task:tasks) {
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int maxfreq = 0;
        for (int f:freq) {
            maxfreq=Math.max(maxfreq,f);
        }
        int countMax=0;
        for (int f:freq) {
            if (f==maxfreq) countMax++;
        }
        int need=(maxfreq-1)*(n+1)+countMax;
        return Math.max(need,tasks.length);
    }
}
