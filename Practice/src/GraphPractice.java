import java.util.*;

public class GraphPractice {
	
	private static class Node{
		
	}

	Map<Integer,LinkedList<Integer>>adj;
	HashSet<Integer> visited = new HashSet<Integer>();

	public GraphPractice(int size){
		
		adj = new HashMap<Integer,LinkedList<Integer>>();
		
		for(int i=0; i< size; i++){
			adj.put(i, new LinkedList<Integer>());
		}
		
	}
	public boolean addEdge(int src, int dest){
		
		if( !(src > adj.size() || dest > adj.size())){
			
			adj.get(src).add(dest);
			adj.get(dest).add(src);
			
			return true;
		}
		
		return false;
	}
	public boolean hasBFS(int src, int dest){
		LinkedList<Integer> nextToVisit = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		nextToVisit.add(src);
		
		while(!nextToVisit.isEmpty()){
			int curr = nextToVisit.remove();
			
			if(curr == dest){
			
				return true;
			}
			if(visited.contains(curr)){
				continue;
			}
			visited.add(curr);
			
			for(Integer i : adj.get(curr)){
				visited.add(i);
			}
		}
		
		return false;
	}
	
	public int [] shortestPath(int start){
		//timothy is testing this keyboards
		//
		
		return new int [start];
	}
	
}
