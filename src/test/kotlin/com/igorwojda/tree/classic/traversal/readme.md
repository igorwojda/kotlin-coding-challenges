# Tree traversal

## Nice to solve before

[Queue](../../../queue/basic/readme.md)

## Instructions

Traverse [tree](https://en.wikipedia.org/wiki/Tree_(data_structure)) using `Breath-First` and `Depth-First` traversals.

## Steps

### 1. Breath First traversal (BF traversal)

Implement breath-first traversal - visit every node on a level before going to a lower level.

Test: `breath first traverse breath first`

![breadth_first_traversal.svg](misc/breadth_first_traversal.svg)

### 2. Depth First traversal (DF traversal)

Implement depth-first traversal. There 3 variants of depth first traversal that differ when the current node is
traversed.

- Pre order - visit the node first
- In order - visit the node after traversing entire left side
- Post order - visit the node after traversing entire left side and entire right side

#### 2a. Pre Order Depth First traversal

Algorithm:
- Visit the node 
- Traverse entire left side
- Traverse entire right side

![depth_first_traversal_pre_order.svg](misc/depth_first_traversal_pre_order.svg)

Result: `F B A D C E G I H`

Test: `traverse depth first pre order`

#### 2c. In Order Depth First traversal

Algorithm:
- Traverse entire left side
- Visit the node 
- Traverse entire right side

Result: `A B C D E F G H I`

Test: `traverse depth first in order`

![depth_first_traversal_in_order.svg](misc/depth_first_traversal_in_order.svg)

#### 2b. Post Order Depth First traversal

Algorithm:
- Traverse entire left side
- Traverse entire right side
- Visit the node 

Result: `A C E D B H I G F`

Test: `traverse depth first pre order reversed`

![depth_first_traversal_post_order.svg](misc/depth_first_traversal_post_order.svg)

#### 2d. Pre Order Depth First traversal reversed

Algorithm:
- Visit the node 
- Traverse entire right side
- Traverse entire left side

Result: `F G I H B D E C A`

Test: `traverse depth first pre order reversed`

#### 2e. In Order Depth First traversal reversed

Algorithm:
- Traverse entire right side
- Visit the node 
- Traverse entire left side

Result: `I H G F E D C B A`

Test: `traverse depth first in order reversed`

#### 2f. Post Order Depth First traversal reversed

Algorithm:
- Traverse entire right side
- Traverse entire left side
- Visit the node 

Result: `H I G E C D A B F`

Test: `traverse depth first pre order`

![depth_first_traversal_post_order.svg](misc/depth_first_traversal_post_order.svg)






