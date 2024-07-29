//import java.util.Scanner;
//
//public class FirstApp {
// public static void verifieparite(int nbr){
//  if (nbr % 2 == 0)
//   System.out.println("Le nombre est pair.");
//  else
//   System.out.println("Le nombre est impair.");
// }

import java.util.HashMap;
import java.util.Map;

 public class FirstApp{
  public static void main(String[] args) {
   int[] result1 = calculTowSum(new int[]{2, 7, 11, 15}, 9);
   System.out.println((result1[0] == 0 && result1[1] == 1) ? "Test 1 réussi" : "Test 1 raté");

   int[] result2 = calculTowSum(new int[]{15, 12, 9, 1, 5, 3}, 8);
   System.out.println((result2[0] == 4 && result2[1] == 5) ? "Test 2 réussi" : "Test 2 raté");

   int[] result3 = calculTowSum(new int[]{10, 6, 8, 11, 2}, 10);
   System.out.println((result3[0] == 2 && result3[1] == 4) ? "Test 3 réussi" : "Test 3 raté");
  }

  public static int[] calculTowSum(int[] nums, int target) {
   Map<Integer, Integer> map = new HashMap<>();
   for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) {
     return new int[]{map.get(complement), i};
    }
    map.put(nums[i], i);
   }
   throw new IllegalArgumentException("Aucune paire qui additionne à la cible a été trouvée.");
  }
 }


// int nbr = 0;
//
//  System.out.print("Veuillez renseigner un nombre : ");
//  Scanner sc = new Scanner(System.in);
//  nbr = sc.nextInt();
//  verifieparite(nbr);
// }
//}

//Scanner scanner = new Scanner(System.in);
//System.out.print("Entre N ");
//int N = scanner.nextInt();

