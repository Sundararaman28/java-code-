package codevita;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int K = sc.nextInt();
        
        if (K == L) {
            System.out.println(0);  // All ones, no zeros left.
        } else if (K == 0) {
            System.out.println(L);  // All zeros, so longest block is L.
        } else {
            int baseZeros = (L - K) / (K + 1);  // Zeros in each gap.
            int extraZeros = (L - K) % (K + 1);  // Extra zeros to distribute.
            
            // If there are extra zeros, some gaps will have 1 more zero.
            if (extraZeros > 0) {
                System.out.println(baseZeros + 1);
            } else {
                System.out.println(baseZeros);
            }
        }
        sc.close();
    }
}

