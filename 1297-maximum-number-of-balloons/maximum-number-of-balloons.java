class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
        }

        return Math.min(
            Math.min(freq[1], freq[0]),
            Math.min(freq[11] / 2,
                     Math.min(freq[14] / 2, freq[13]))
        );
    }
}