import sys

n = int(sys.stdin.readline().rstrip())
inp = sys.stdin.readline().rstrip().split()
out = int(sys.stdin.readline().rstrip())

sol = [[] for _ in range(n)]
for i in range(n):
    if int(inp[i]) == -1:
        root = i
    else :
        sol[int(inp[i])].append(i)

def dfs(start, lst, out):
    if (start == out):
        return 0
    elif (len(lst[start]) == 0) or (len(lst[start]) == 1 and lst[start][0] == out):
        return 1
    else :
        count = 0
        for a in lst[start]:
            count += dfs(a, lst, out)
        return count

print(dfs(root, sol, out))
