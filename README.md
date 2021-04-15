# Code Challenge 15
## Trees

### **Requirements:**

- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a BinaryTree class
    - Define a method for each of the depth first traversals called `preOrder`, `inOrder`, and `postOrder` which returns an array of the values, ordered appropriately. 
      
- Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

- Create a BinarySearchTree class
    - Define a method named `add` that accepts a value, and adds a new node   with that value in the correct location in the binary search tree.
    - Define a method named `contains` that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

### **Structure and Testing:**

Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

**Write tests to prove the following functionality:**

- Can successfully instantiate an empty tree
- Can successfully instantiate a tree with a single root node
- Can successfully add a left child and right child to a single root node
- Can successfully return a collection from a preorder traversal
- Can successfully return a collection from an inorder traversal
- Can successfully return a collection from a postorder traversal

**Ensure tests are passing before you submit your solution.**

# Code Challenge 16

## Extend Trees

### Add a feature:
- Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

![WhiteBoard](assets/CC16WB.png)

# Code Challenge 17

## Extend Trees

### Add a feature:
- Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

![WhiteBoard](assets/CC17WB.png)

# Code Challenge 18

## Trees

### Write a function called FizzBuzzTree which takes a k-ary tree as an argument.
### Without utilizing any of the built-in methods available to your language, determine whether or not the value of each node is divisible by 3, 5 or both. Create a new tree with the same structure as the original, but the values modified as follows:
- If the value is divisible by 3, replace the value with “Fizz”
- If the value is divisible by 5, replace the value with “Buzz”
- If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
- If the value is not divisible by 3 or 5, simply turn the number into a String.
![WhiteBoard](assets/CC18WBimg
