import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

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

    TNode(){
        data=0;
        right=null;
        left = null;
    }
    TNode(int value){
        data = value;
        right = null;
        left = null;
    }
}
//################

class  BST{
    TNode root;

    public boolean insertNode(int v){
        TNode nNode=new TNode(v);
        root=recursiveInsertNode(nNode);
        return true;
    }

    private TNode recursiveInsertNode(TNode node){
    //completethe code
    }

    TNode search(int v){
        return recursiveSearch(v);
    }

    private TNode recursiveSearch(int v){
    //complete the task
    }


    void DFS(TNode node){
        if(node != null){
            Stack<TNode> s = new Stack<TNode>();
            TNode n = node;
            s.push(n);
            while(!s.isEmpty()){
                n = s.pop();
                System.out.println(n.data);
                if(n.right!=null){
                    s.push(n.right);
                }
                if(n.left!=null){
                    s.push(n.left);
                }
            }
        }
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
        if(node!=null){
            DFS_inorder(node.left);
            System.out.println(node.data);
            DFS_inorder(node.right);
        }
    }

    void DFS_preorder(TNode node){
        if(node!=null){
            System.out.println(node.data);
            DFS_preorder(node.left);
            DFS_preorder(node.right);
        }
    }

    void DFS_postorder(TNode node){
        if(node!=null){
            DFS_postorder(node.right);
            DFS_postorder(node.left);
            System.out.println(node.data);
        }
    }

}