class IndexMinPQ<Key extends Comparable<Key>> {
    private int N;
    private int[] pq;
    private int[] qp;
    private Key[] keys;

    public IndexMinPQ(int maxN) {
        keys = (Key[]) new Comparable[maxN + 1];
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];
        for (int i = 0; i <= maxN; i++) qp[i] = -1;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean contains(int k) {
        return qp[k] != -1;
    }

    public void insert(Key key) {
        N++;
        qp[N] = N;
        pq[N] = N;
        keys[N++] = key;
        swim(N);
    }

    public Key min() {
        return keys[pq[1]];
    }

    private void exch(int i, int j) {
        int key = pq[i];
        pq[i] = pq[j];
        pq[j] = key;
    }

    //side 316
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    public Key delMin() {
        exch(1, N--);
        sink(1);
        Key key = keys[pq[N + 1]];
        keys[pq[N + 1]] = null;
        qp[pq[N + 1]] = -1;
        return key;
    }

    private boolean less(int i, int j) {
        System.out.println(keys.length);
        System.out.println(i);
        return keys[i].compareTo(keys[j]) < 0;
    }

    //side 316
    private void sink(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }
}
