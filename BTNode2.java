package BinaryTree;

public class BTNode2<E>{
    BTNode2 left, right;
    E data;

    /* Constructor */
    public BTNode2(E item)
    {
        left = null;
        right = null;
        data = item;
    }

    /* Function to get left node */
    public BTNode2 getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BTNode2 getRight()
    {
        return right;
    }

    /* Function to get data from node */
    public E getData()
    {
        return data;
    }
}
