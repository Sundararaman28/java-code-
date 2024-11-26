import java.util.*;

public class Main {
    static final int MAXN = 100005;
    static int n;
    static long p;
    static Person[] person = new Person[MAXN];
    static Person[] personArr = new Person[MAXN];
    static long[] ans = new long[MAXN];
    static long last = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextLong();

        for (int i = 0; i < n; i++) {
            long time = sc.nextLong();
            person[i] = new Person(time, i);
            personArr[i] = person[i];
        }

        Arrays.sort(person, 0, n, Comparator.comparingLong((Person a) -> a.t).thenComparingInt(a -> a.idx));

        Deque<Pair> queuing = new ArrayDeque<>();
        PriorityQueue<Integer> waiting = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            while (!queuing.isEmpty() && queuing.peekFirst().time + p <= person[i].t) {
                popPerson(queuing);
            }

            while (queuing.isEmpty() && last < person[i].t && !waiting.isEmpty()) {
                int idx = waiting.poll();
                queuing.addLast(new Pair(personArr[idx], last));
                if (queuing.peekFirst().time + p <= person[i].t) {
                    popPerson(queuing);
                } else {
                    break;
                }
            }

            if (queuing.isEmpty()) {
                waiting.add(person[i].idx);
                last = person[i].t;
                int idx = waiting.poll();
                queuing.addLast(new Pair(personArr[idx], last));
            } else {
                if (queuing.peekLast().person.idx > person[i].idx) {
                    queuing.addLast(new Pair(person[i], 0));
                } else {
                    waiting.add(person[i].idx);
                }
            }
        }

        while (!queuing.isEmpty()) {
            popPerson(queuing);
        }

        while (!waiting.isEmpty()) {
            int idx = waiting.poll();
            queuing.addLast(new Pair(personArr[idx], last));
            popPerson(queuing);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    static void popPerson(Deque<Pair> queuing) {
        last = queuing.peekFirst().time + p;
        ans[queuing.peekFirst().person.idx] = last;
        queuing.pollFirst();
        if (!queuing.isEmpty()) {
            queuing.peekFirst().time = last;
        }
    }

    static class Person {
        long t;
        int idx;

        Person(long t, int idx) {
            this.t = t;
            this.idx = idx;
        }
    }

    static class Pair {
        Person person;
        long time;

        Pair(Person person, long time) {
            this.person = person;
            this.time = time;
        }
    }
}