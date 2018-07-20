import java.util.*;

public class BSTValidate {
	class Node {
        int data;
        Node left;
        Node right;
     }

    boolean checkBST(Node root) {
        if(root.left == null && root.right == null){
            return true;
        }
        List<Integer> balanced = new ArrayList<Integer>();
        populate(root, balanced);
        for(int i =0; i< balanced.size(); i++){
            if(i+1 < balanced.size()){
                if(balanced.get(i) == balanced.get(i+1)){
                    return false;
                }
                 if(balanced.get(i) >= balanced.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
    List<Integer> populate(Node root,List<Integer>balanced)
    {
          if( root!= null){
            
              populate(root.left,balanced);
                balanced.add(root.data);
               populate(root.right,balanced);
          }  
         return balanced;
    }


}
