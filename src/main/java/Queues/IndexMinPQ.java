package Queues;

class IndexMinPQ<Key extends Comparable<Key>> {
    private int N;
    private int[] pq;
    private int[] qp;
    private Key[] keys;

    public IndexMinPQ(int maxN) {
        System.out.println("maxN: " + maxN);
        keys = (Key[]) new Comparable[maxN + 1];
        System.out.println("keys length: " + keys.length);
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

    public void insert(int k, Key key) {
        N++;
        qp[k] = N;
        pq[N] = k;
        keys[k] = key;
        swim(N);
    }

    public void insert(Key key) {
        qp[N] = N;
        pq[N] = N;
        keys[N] = key;
        swim();
        System.out.println("N value: " + N);
        N++;
    }

    public Key min() {
        return keys[pq[1]];
    }

    private void exch(int i, int j) {
        int key = pq[i];
        pq[i] = pq[j];
        pq[j] = key;
    }


    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    //side 316
    private void swim() {
        int k = N;
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    public int delMinEager() {
        int indexOfMin = pq[1];
        exch(1, N--);
        sink(1);
        keys[pq[N + 1]] = null;
        qp[pq[N + 1]] = -1;
        return indexOfMin;
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
        System.out.println("int i: " + i);
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

    public int minIndex() {
        return pq[1];
    }

    public void change(int k, Key key) {
        keys[k] = key;
        swim(qp[k]);
        sink(qp[k]);
    }

    public void delete(int k) {
        exch(k, N--);
        swim(qp[k]);
        sink(qp[k]);
        keys[pq[N + 1]] = null;
        qp[pq[N + 1]] = -1;
    }
}
