package ch20;

import ch03.MyStack;

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
	private int maxSize = 20;
	//当前顶点
	private int nVertex;
	//栈
	private MyStack stack;
	
	
	public Graph() {
		vertexsList = new Vertex[maxSize];
		adjMat = new int[maxSize][maxSize];
		for (int i = 0; i < maxSize; i++) {
			for (int j = 0; j < maxSize; j++) {
				adjMat[i][j] = 0;
			}
		}
		nVertex = 0;
		stack = new MyStack();
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
	
	public int getadjUnvistedVertex(int v) {
		for (int i = 0; i < nVertex; i++) {
			if (adjMat[v][i] == 1 && vertexsList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}
	//深度遍历
	public void dfs() {
		//首先访问0号顶点
		vertexsList[0].wasVisited = true;
		//显示该节点
		displayVertex(0);
		//压入栈中
		stack.push(0);
		while(!stack.isEmpty()) {
			//获得一个未访问过的邻接点
			int v = getadjUnvistedVertex((int) stack.peek());
			if (v == -1) {
				//弹出一个顶点
				stack.pop();
			} else {
				vertexsList[v].wasVisited = true;
				displayVertex(v);
				stack.push(v);
				 
			}
		}
		//搜索完以后，要将访问信息修改
		for (int i = 0; i < nVertex; i++) {
			vertexsList[i].wasVisited = false;
		}
	}
	
	public void displayVertex(int v) {
		System.out.print(vertexsList[v].label);
		
	}
	
	public void mst() {
		//首先访问0号顶点
		vertexsList[0].wasVisited = true;
		//显示该节点
		//displayVertex(0);
		//压入栈中
		stack.push(0);
		while(!stack.isEmpty()) {
			//当前顶点
			int currentVertex = (int) stack.peek();
			//获得一个未访问过的邻接点
			int v = getadjUnvistedVertex(currentVertex);
			if (v == -1) {
				//弹出一个顶点
				stack.pop();
			} else {
				vertexsList[v].wasVisited = true;
				
				stack.push(v);
				displayVertex(currentVertex);
				System.out.print("-");
				displayVertex(v);
				System.out.print(" ");
				
				 
			}
		}
		//搜索完以后，要将访问信息修改
		for (int i = 0; i < nVertex; i++) {
			vertexsList[i].wasVisited = false;
		}
	}
	
	
	
}












