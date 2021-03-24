//Jared Rostkowski
import java.util.*; 
public class BSTExtended<E extends Comparable> extends BinarySearchTree<E> 
{ 
    public BSTExtended() 
    { 
        super(); 
    } 
     
    public void levelOrder() 
    { 
        Queue<Node> q = new Queue<Node>(); 
        q.insert(root); 
        Node n; 
        while (!q.empty())  
        { 
            n = q.remove(); 
            System.out.print(n.data+" "); 
            if (n.left!= null)  
            { 
                q.insert(n.left); 
            } 
            if (n.right!= null)  
            { 
                q.insert(n.right); 
            } 
        } 
    } 
    public void displayTree() 
    { 
        System.out.println(" "); 
        recursiveDisplayTree(root);    
    } 
    public void recursiveDisplayTree(Node root) 
    { 
        if(root.left==null && root.right==null) 
        { 
     
            System.out.println(root.data); 
        } 
        else if(root.left!=null && root.right==null) 
        { 
            System.out.println(root.data+"("+root.left.data+"-"+")"); 
            recursiveDisplayTree(root.left); 
        } 
        else if(root.left==null && root.right!=null) 
        { 
            System.out.println(root.data+"("+"-"+root.right.data+")"); 
            recursiveDisplayTree(root.right); 
        } 
         
        else 
        { 
            System.out.println(root.data+"("+root.left.data+" " +root.right.data+")"); 
            recursiveDisplayTree(root.left); 
            recursiveDisplayTree(root.right); 
        } 
         
    } 
    public static void main(String[] args) 
    { 
        BSTExtended<Integer> b = new BSTExtended<Integer>(); 
        int i =-1; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter a number to put in the tree, 0 to stop: "); 
        while(i!=0) 
        { 
            i = input.nextInt(); 
            if(i==0) 
                break; 
            else 
            { 
                b.insert(i); 
            } 
        } 
        b.levelOrder(); 
        b.displayTree(); 
         
    } 
}