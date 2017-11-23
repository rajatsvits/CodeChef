#include <iostream>
#include <vector>
#include <utility>
#include <algorithm>
using namespace std;
 
int main() {
   int N, Q, M, t, R;
   cin >> N >> Q >> M;
   vector < pair<int,int> > A[M];
   for (int i = 1; i <= N; i++) {
      cin >> t;
      A[t%M].push_back(make_pair(t, i));
   }
   for (int i = 0; i < Q; i++) {
      cin >> t >> R;
      if (R >= M) cout << -1 << endl;
      else if (A[R].size() < t) cout << -1 << endl;
      else {
         sort(A[R].begin(), A[R].end());
         cout << A[R][t-1].second << endl;
      }
   }
	return 0;
}
