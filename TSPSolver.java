package Task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TSPSolver {
 
    // Method to solve the TSP using the Nearest Neighbor Algorithm
    
    /**
     * @param distances: 2D array of integers, representing the distances between cities
     * @return List<Integer>, the order in which the cities should be visited
     */
    public static List<Integer> solveTSP(int[][] distances) {
    List<Integer> tour = new ArrayList<>();
    Set<Integer> visited = new HashSet<>();
    
    // Start from city 0
    int currentCity = 0;
    tour.add(currentCity);
    visited.add(currentCity);
    
    while (visited.size() < distances.length) {
    int nextCity = findNearestNeighbor(currentCity, visited, 
   distances);
    tour.add(nextCity);
    visited.add(nextCity);
    currentCity = nextCity;
    }
    
    // Return to the starting city
    tour.add(0);
    return tour;
    }
    
    // Method to find the nearest unvisited neighbor of a given city
    private static int findNearestNeighbor(int currentCity, Set<Integer> 
   visited, int[][] distances) {
    int nearestNeighbor = -1;
    int minDistance = Integer.MAX_VALUE;
    for (int city = 0; city < distances.length; city++) {
    if (!visited.contains(city) && distances[currentCity][city] < 
   minDistance) {
    nearestNeighbor = city;
    minDistance = distances[currentCity][city];
}
 }
 return nearestNeighbor;
 }
 // explain the algorithm in the document
 // test the algorithm in the main method
 public static void main(String[] args) {
 int[][] distances = {
 {0, 10, 15, 20},
 {10, 0, 35, 25},
 {15, 35, 0, 30},
 {20, 25, 30, 0}
 };
 List<Integer> tour = solveTSP(distances);
 System.out.println("The order in which the cities should be visited is: " + tour);
 } 
 // The Nearest Neighbor Algorithm is a heuristic algorithm used to solve the Traveling Salesman Problem (TSP). The algorithm starts by selecting an arbitrary city as the starting point. It then repeatedly selects the nearest unvisited city to the current city and adds it to the tour. This process continues until all cities have been visited, and the algorithm returns to the starting city to complete the tour.
 
 // The solveTSP method implements the Nearest Neighbor Algorithm to find the optimal order in which the cities should be visited. It takes a 2D array of distances between cities as input and returns a list of integers representing the order of cities in the optimal tour.
 
 // The findNearestNeighbor method is used to find the nearest unvisited neighbor of a given city. It iterates over all cities, checks if they are unvisited and calculates the distance to the current city. It then selects the city with the minimum distance as the nearest neighbor.
 
 // By repeatedly applying the Nearest Neighbor Algorithm, the solveTSP method constructs an optimal tour of the cities, ensuring that each city is visited exactly once and returning to the starting city to complete the tour. The algorithm provides a simple and efficient solution to the TSP, although it may not always produce the optimal tour due to its greedy nature.
 
 // Overall, the Nearest Neighbor Algorithm is a useful heuristic for solving the TSP and finding approximate solutions to complex optimization problems.
 





}   