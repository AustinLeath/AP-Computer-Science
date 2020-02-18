#include <iostream>
using namespace std;

int main()
{
    int counter = 0;
    int number;
    cout << "Enter a number to count to: ";
    cin >> number;
    for(int i = number; i < 25; i++) {
        cout << "test\n";
        counter++;
    }
    cout << "the total count of output is: " << counter;
}
