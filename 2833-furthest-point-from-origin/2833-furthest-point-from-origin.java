class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        return (moves.length()-moves.replaceAll("_","").length())+Math.abs((moves.length()-moves.replaceAll("L","").length())-(moves.length()-moves.replaceAll("R","").length()));
    }
}