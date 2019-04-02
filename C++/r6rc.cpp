#include <iostream>
#include <cmath> 
using namespace std;
 
int main() {
int mmr;
int elo;
int goal;


cout << "Enter your current MMR: ";
cin >> mmr;

cout << "Enter your current ELO: ";
cin >> elo;

cout << "Enter your current GOAL: ";
cin >> goal;

int equation = ceil((goal - mmr) / elo);


    if (equation == 1) {
        cout << " match to reach your rank goal " << equation;
    } else if (equation > 1) {
        cout << " +/- 1 matches to reach your rank goal " << equation;
    } else {
        cout << " matches to reach your rank goal " << equation;
    }

   return 0;
}
