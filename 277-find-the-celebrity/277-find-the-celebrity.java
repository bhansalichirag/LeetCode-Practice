/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++)
        {
            int counter = 0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && knows(i,j))
                {
                    counter++;
                    A[j]++;
                }
            }
            B[i] = counter;
        }
        
        for(int i=0;i<n;i++)
        {
            if(A[i]==n-1 && B[i]==0)
                return i;
        }
        return -1;
    }
}