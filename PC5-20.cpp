//Kien Tran
//OCCC CS-1143
//This program generates a random number and asks the user to guess what the generated number is

#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

int main()
{
	int num, guess;
	int tries = 1;

	srand(time(0));         
	num = rand() % 1000;

	cout << "Please type in what you think the random generated number is: ";
	cin >> guess;

	while (guess != num)
	{
		if (guess < num)
		{
			cout << "Too low, try again." << endl;
			cin >> guess;
			tries++;
		}
		else if (guess > num)
		{
			cout << "Too high, try again." << endl;
			cin >> guess;
			tries++;
		}
	}

	cout << "Congratulations! The correct number is " << num << endl;
	cout << "You took " << tries << " tries to guess the right number." << endl;

	return 0;
}