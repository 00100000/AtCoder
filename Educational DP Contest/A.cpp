#include <bits/stdc++.h>
using namespace std;

#ifdef LOCAL
#include <algo/debug.h>
#endif

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n;
	cin >> n;
	vector<int> h(n);
	for (int i = 0; i < n; i++) cin >> h[i];

	vector<int> dp(n);
	for (int i = 1; i < n; i++) {
		int a = i - 1 >= 0 ? dp[i - 1] + abs(h[i] - h[i - 1]) : 1e9;
		int b = i - 2 >= 0 ? dp[i - 2] + abs(h[i] - h[i - 2]) : 1e9;
		dp[i] = min(a, b);
	}

	cout << dp[n - 1];
	return 0;
}
