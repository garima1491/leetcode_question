class Solution {
    public boolean judgeCircle(String moves) {
       int x=0;
       int y=0;
       for(int i=0;i<moves.length();i++){
        char move = moves.charAt(i);
        if(move == 'U'){
            x++;
        }
        else if(move == 'D'){
            x--;
        }
        else if(move == 'L'){
            y++;
        }
        else if(move == 'R'){
            y--;
        }
       }
       return x==0 && y==0;
    }
}