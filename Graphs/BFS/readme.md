## Breadth First Search - JAVA

Tell us two things about the graph
1- if there is a path between any two nodes?
2- shortest path/stops between two nodes?

In Undirected graphs both nodes connected through and edge are each others neighbors (relationship goes both ways) and in contrast in a directed graph A -> B only A is B's neighbor and not vice versa ( 1- way relationship).

We need to check people in the order they were added to the queue DS. Enqueue at end of the queue and dequeue from front. LIFO.
Once someone has been checked, we keep them in a separate array and don't check them again. Otherwise, we will run into an infinite loop

Tree : special type of graph where edges never point back.
example: Family tree, arrows pointing from parents to children and not otherwise.

### Running Time for Graphs

O(V+E) V = Vertices/ Nodes & E = Edges / Connections/lines btw nodes

# Implement Breadth First Search

https://www.baeldung.com/java-breadth-first-search
https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
