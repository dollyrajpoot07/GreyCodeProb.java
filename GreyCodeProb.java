// Given a number N, generate bit patterns from 0 to 2^N-1 such that successive patterns differ by one bit.

// Input: N = 2
// Output: 00 01 11 10

// Input: N = 3
// Output: 000 001 011 010 110 111 101 100

import java.lang.Math;

class GreyCodeProb {

    static void GreyCode(int n) {
	    for (int i = 0; i < (1 << n); i++) {

	    int val = (i ^ (i >> 1));

	    String s = Integer.toBinaryString(val);
	    System.out.print(String.format("%1$" + 4 + "s", s).replace(' ', '0') + " ");
	    }
    }

    public static void main(String[] args) {
	    int n = 4;
        GreyCode(n);
    }
}
