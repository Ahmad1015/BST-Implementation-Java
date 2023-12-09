import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Queue<TNode> Q = new LinkedList<TNode>();
    }
}


//node class for BST
class TNode{
    int data;
    TNode right;
    TNode left;
//complete the code with parametrized and default constructor
}
//################

class  BST{
TNode root;

public boolean insertNode(int v){
TNode nNode=new Node(v);
root=recursiveInsertNode(TNode node,

nNode  );
return true;
}

private TNode recursiveInsertNode(TNode node, TNode nNode ){
//completethe code
}

TNode search(int v){
return recursiveSearch(root,v);
}

private TNode recursiveSearch(TNode node, int v){
//complete the task
}


void DFS(TNode node){
//complete iterative method
}

void BFS(TNode node,Queue<TNode> Q){       // Iterative
    if(node != null){
        TNode n = node;
        Q.add(n);
        while(!Q.isEmpty()){
            n = Q.remove();
            System.out.println(n.data);
            if(n.left!=null)
                Q.add(n.left);
            if(n.right!=null)
                Q.add(n.right);
        }
    }
}

void BFS_recursive(TNode node,Queue<TNode> Q){ // Look if recursive is possible
    if(node!=null){
        System.out.println(node);
        if(node.left!=null){
            Q.add(node.left);
        }
        if(node.right!=null){
            Q.add(node.right);
        }
        if(!Q.isEmpty()){
            BFS_recursive(Q.remove(),Q);
        }
    }
}

void DFS_inorder(TNode node){
//complete the recursive code
}

void DFS_preorder(TNode node){
//complete the recursive code
}

void DFS_postorder(TNode node){
//complete the recursive code
}

}