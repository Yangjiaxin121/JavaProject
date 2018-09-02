package ch18;

/**
 * 图
 * @author yangjiaxin
 *
 */
public class Graph {
	//顶点数组
	private Vertex[] vertexsList;	
	//邻接矩阵
	private int[][] adjMat;
	//顶点的最大数目
	private int maxSize = 10;
	//当前顶点
	private int nVertex;
	
	public Graph() {
		vertexsList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for (int i = 0; i < maxSize; i++) {
			for (int j = 0; j < maxSize; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
	}
	/**
	 * 添加顶点
	 */
	public void addVertex(char label) {
		vertexsList[nVertex++] = new Vertex(label);
		
	}
	/**
	 * 添加边
	 */
	public void addEdge(int start,int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	
}












