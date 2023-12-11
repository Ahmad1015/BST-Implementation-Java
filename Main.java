import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Queue<TNode> Q = new LinkedList<TNode>();
        BST tree = new BST();
        tree.insertNode(10);
        tree.insertNode(4);
        tree.insertNode(12);
        tree.insertNode(3);
        tree.insertNode(15);
        tree.insertNode(35);
        //tree.BFS(tree.root, Q);
        System.out.println();
        tree.insertNode(20);
        tree.BFS(tree.root, Q);
        System.out.println();
        System.out.println(tree.depth_node(20,tree.root));
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
        recursiveInsertNode(nNode,root);
        return true;
    }

    private void recursiveInsertNode(TNode node,TNode root1){
        if(root== null){
            root = node;
            return;
        }
        if(node.data < root1.data)
            if(root1.left == null)
                root1.left = node;
            else{
                recursiveInsertNode(node, root1.left);
            }
        else if (node.data > root1.data)
                if(root1.right == null)
                    root1.right = node;
                else
                    recursiveInsertNode(node, root1.right);
    }

    TNode search(int v){
        return recursiveSearch(root,v);
    }

    private TNode recursiveSearch(TNode node,int v){
        if(node.data == v)
            return node;
        else if (node.data > v)
             return recursiveSearch(node.right, v);
        else
            return recursiveSearch(node.left, v);
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
                System.out.print(n.data+" ");
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
            DFS_postorder(node.left);
            DFS_postorder(node.right);
            System.out.println(node.data);
        }
    }
    
    TNode Find_parent(TNode node,int value){
        TNode temp = new TNode(value);
        if(node.left != null && node.left.data == temp.data )
            return node;
        else if (node.right !=null && node.right.data == temp.data )
            return node;
        else{
            if(temp.data>node.data)
                return Find_parent(node.right, value);
            else if(temp.data<node.data)
                return Find_parent(node.left, value);
            else
                return null;
        }
   
    }

    int depth_node(int val,TNode node ){
        int count = 0;
        TNode temp = new TNode(val);
        if(root.data == temp.data)
            return 0;
        else{
            if(node.data>temp.data){
                count++;
                if(node.left != null){
                    count += depth_node(val, node.left);
                }
            }
            if(node.data<temp.data){
                count++;
                if(node.right !=null){
                    count+=depth_node(val, node.right);
                }
            }
            if(node.data == temp.data){
                return count++;
            }
        }
            return count;
    }
}
