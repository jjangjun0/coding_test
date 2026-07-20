#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool isPrime(int n) {
    bool result = true;
    if (n < 2)
        result = false;
    
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            result = false;
            break;
        }
    }
    
    return true;
}

vector<int> solution(int n) {
    vector<int> V;

    int X = 2;
    while (n > 1) {
        if (!isPrime(X)) {
            X++;
            continue;
        }
        else {
            if (n % X == 0) {
                if (find(V.begin(), V.end(), X) == V.end())
                    V.push_back(X);
                n /= X;
            }
            else {
                X++;
            }
        }
    }
    return V;
}