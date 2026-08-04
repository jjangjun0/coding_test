class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] character = new int[8]; // R, T / C, F / J, M / A, N
        int size = survey.length;
        int score;
        for (int i = 0; i < size; i++) {
            score = choices[i];
            if (score >= 1 && score < 4)
                character[find_idx(survey[i].charAt(0))] += (4 - score);
            else if (score > 4 && score < 8)
                character[find_idx(survey[i].charAt(1))] += (score - 4);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(character[0] >= character[1] ? 'R' : 'T');
        sb.append(character[2] >= character[3] ? 'C' : 'F');
        sb.append(character[4] >= character[5] ? 'J' : 'M');
        sb.append(character[6] >= character[7] ? 'A' : 'N');
        return sb.toString();
    }
    int find_idx(char c) {
        int idx = 0;
        if (c == 'R') idx = 0;
        else if (c == 'T') idx = 1;
        else if (c == 'C') idx = 2;
        else if (c == 'F') idx = 3;
        else if (c == 'J') idx = 4;
        else if (c == 'M') idx = 5;
        else if (c == 'A') idx = 6;
        else if (c == 'N') idx = 7;
        return idx;
    }
}