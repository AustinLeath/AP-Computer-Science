/*
int main() {
   double test = 1.0;
        if (test == 1.0) {
            printf("1\n");
    }
        if (test == 2.0) {
            printf("2\n");
    }
        if (test == 3.0) {
            printf("3\n");
    }
        if (test == 4.0) {
            printf("4\n");
    }
}
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int main()
{
    long int hat;
    hat = rand(); /*use rand() for short ints*/
    printf("%ld is a random number.\n",hat);
    return(0);
}