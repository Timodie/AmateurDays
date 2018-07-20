import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ShortestPath {
	
	 public static class Graph {
	        
	        private static class Node {
	            int index;
	            //each node object will have this list connected to it
	            List<Integer>adjacents = new ArrayList<Integer>();
	           //default distance of nodes not connected to another another node
	            int distance = -1;
	            
	            Node(int index){
	                this.index = index;
	            }
	        }
	        	//creating array of node objects
	        	//an adjacency list where each node will be able to have a list of other nodes it
	        	//connects to i.e edges
	            Node [] nodes;
	        
	        public Graph(int size) {
	        //our graph size
	         nodes =new Node[size];
	         //initialize indices of the adjacency list to correspond to loop index
	          for(int i =0; i< nodes.length; i++){
	              nodes[i] =new Node(i);
	          }
	        }

	        public void addEdge(int first, int second) {
	           // create an adjacency list 
	        	//add edge baby
	            nodes[first].adjacents.add(second);
	            nodes[second].adjacents.add(first);
	          
	        }
	        /*
	         * Now the main bfs
	         * start node is 0
	         * pop it and add its adjacent nodes and do the same for those
	         * but before adding adjacent nodes do what the problem specifies
	         * i.e 
	         */
	        public int[] shortestReach(int startId) { // 0 indexed
	            Queue<Node> q = new LinkedList<Node>();
	            nodes[startId].distance =0;
	            int [] distances = new int[nodes.length];
	            q.add(nodes[startId]);
	            while(!q.isEmpty()){
	                Node head =q.remove();
	                for(int adj: head.adjacents){
	                    if(nodes[adj].distance < 0){
	                        nodes[adj].distance = head.distance +6;
	                        q.add(nodes[adj]);
	                    }
	                }
	            }
	            for(int i =0; i<nodes.length; i++){
	                distances [i] = nodes[i].distance;
	            }
	           return distances; 
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	      
	        int queries = scanner.nextInt();
	        
	        for (int t = 0; t < queries; t++) {
	            
	            // Create a graph of size n where each edge weight is 6:
	            Graph graph = new Graph(scanner.nextInt());
	            int m = scanner.nextInt();
	            
	            // read and set edges
	            for (int i = 0; i < m; i++) {
	                int u = scanner.nextInt() - 1;
	                int v = scanner.nextInt() - 1;
	                
	                // add each edge to the graph
	                graph.addEdge(u, v);
	            }
	            
	            // Find shortest reach from node s
	            int startId = scanner.nextInt() - 1;
	            int[] distances = graph.shortestReach(startId);
	 
	            for (int i = 0; i < distances.length; i++) {
	                if (i != startId) {
	                    System.out.print(distances[i]);
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();            
	        }
	        
	        scanner.close();
	    }

}
