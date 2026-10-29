class Solution {
    int n,LOG;
    int [] tin,tout,depth,bit;
    int up[][];
    //XOR
     void bitUpdate(int i, int val){
        for (;i<=n+1;i+=i & -i) bit[i]^=val;
    }
     int bitQuery(int i) {
        int res = 0;
        for (; i > 0; i -= i & -i) res ^= bit[i];
        return res;
    }
    int lca(int a, int b) {
        if (depth[a] < depth[b]) { int t = a; a = b; b = t; }

        int diff = depth[a] - depth[b];
        for (int k = 0; k <= LOG; k++) {
            if (((diff >> k) & 1) == 1) a = up[k][a];   // lift a to b's depth
        }
        if (a == b) return a;

        for (int k = LOG; k >= 0; k--) {
            if (up[k][a] != up[k][b]) {   // jump only while still different
                a = up[k][a];
                b = up[k][b];
            }
        }
        return up[0][a];
    }
  
    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
           this.n = n;
        char[] ch = s.toCharArray();
         List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) < n) LOG++;
        up = new int[LOG + 1][n];// up[0] = parent
        depth = new int[n];
        tin = new int[n];
        tout = new int[n];
        bit = new int[n + 2];
        int[] pre = new int[n];
        int[] stack = new int[n];
        int[] nextChild = new int[n]; // which neighbor to look at next
        int top = 0, timer = 0;
         stack[top++] = 0;
        up[0][0] = 0;       // root's parent is itself
        pre[0] = 1 << (ch[0] - 'a');
        tin[0] = ++timer;
        while (top > 0) {
            int u = stack[top - 1];
            if (nextChild[u] < adj[u].size()) {
                int v = adj[u].get(nextChild[u]++);
                if (v == up[0][u]) continue;              // skip the parent
                up[0][v] = u;
                depth[v] = depth[u] + 1;
                pre[v] = pre[u] ^ (1 << (ch[v] - 'a'));
                tin[v] = ++timer;
                stack[top++] = v;        // go down
            } else {
                tout[u] = timer;          // subtree finished
                top--;            // go back up
            }
        }
         for (int k = 1; k <= LOG; k++) {
            for (int v = 0; v < n; v++) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }
         List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int x = Integer.parseInt(p[1]);
                char newC = p[2].charAt(0);

                if (ch[x] != newC) {
                    int delta = (1 << (ch[x] - 'a')) ^ (1 << (newC - 'a'));
                    ch[x] = newC;
                    bitUpdate(tin[x], delta);  // XOR delta into the subtree range
                    bitUpdate(tout[x] + 1, delta); 
                       }
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int l = lca(u, v);
                int pu = pre[u] ^ bitQuery(tin[u]); // current pre of u
                int pv = pre[v] ^ bitQuery(tin[v]);   // current pre of v
                int mask = pu ^ pv ^ (1 << (ch[l] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
                  }
        }
        return ans;


    

    }
}
