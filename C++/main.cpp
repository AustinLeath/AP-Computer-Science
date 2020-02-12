#include <iostream>
using namespace std;

int main()
{
    int counter = 0;
    int number;
    cin >> number;
    for(int i = number; i < 25; i++) {
        cout << "test\n";
        counter++;
    }
    cout << "the total count of output is: " << counter;
}
