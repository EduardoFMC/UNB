n = [int(x) for x in input().split()]
a = []
for i in range(3):
	a.append([int(x) for x in input().split()])
	a[i].sort(reverse=True)
 
dp = [[[0 for i in range(n[2] + 1)] for j in range(n[1] + 1)] for k in range(n[0] + 1)]
ans = 0
for i in range(n[0] + 1):
	for j in range(n[1] + 1):
		for k in range(n[2] + 1):
			if i < n[0] and j < n[1]:
				dp[i + 1][j + 1][k] = max(dp[i + 1][j + 1][k], dp[i][j][k] + a[0][i] * a[1][j])
			if i < n[0] and k < n[2]:
				dp[i + 1][j][k + 1] = max(dp[i + 1][j][k + 1], dp[i][j][k] + a[0][i] * a[2][k])
			if j < n[1] and k < n[2]:
				dp[i][j + 1][k + 1] = max(dp[i][j + 1][k + 1], dp[i][j][k] + a[1][j] * a[2][k])
			ans = max(ans, dp[i][j][k])
 
print(ans)