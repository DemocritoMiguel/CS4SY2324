public class Move {
    private final String name;
    private Move strongAgainst;

    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }

    public String getName(){
        return this.name;
    }

    public Move getStrongAgainst(){
        return this.strongAgainst;
    }

    public void setStrongAgainst(Move strongAgainst){
        this.strongAgainst = strongAgainst;
    }

    public static int compareMoves(Move m1, Move m2){
        if(m1.getStrongAgainst() == m2) return 0;
        else if (m2.getStrongAgainst() == m1) return 1;
        else return 2;
    }
}
