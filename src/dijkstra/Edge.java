package dijkstra;

public class Edge {
    private int fromNodeIndex;
	
    public int getFromNodeIndex() {
        return fromNodeIndex;
    }

    private int toNodeIndex;

    public int getToNodeIndex() {
        return toNodeIndex;
    }

    private int length;

    public int getLength() {
        return length;
    }

    public Edge(int fromNodeIndex, int toNodeIndex, int length) {
        this.fromNodeIndex = fromNodeIndex;
        this.toNodeIndex = toNodeIndex;
        this.length = length;
    }

    public int getNeighbourIndex(int nodeIndex) {
        if (this.fromNodeIndex == nodeIndex) {
            return this.toNodeIndex;
        } else {
            return this.fromNodeIndex;
        }
    }
}
