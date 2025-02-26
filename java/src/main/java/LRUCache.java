import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRUCache {

    // store keys of cache
    static Deque<Integer> dq;

    // store references of key in cache
    private static HashSet<Integer> map;

    //maximum capacity of cache
    static int csize;

    LRUCache(int n)
    {
        dq=new LinkedList<>();
        map=new HashSet<>();
        csize=n;
    }

    void refer(int x)
    {
        // not present in cache
        if (!map.contains(x)) {
            // cache is full
            if (dq.size() == csize) {
                // remove the least recently used element
                int last = dq.removeLast();
                map.remove(last);
            }
        }
        // present in cache
        else {
            // remove the element to move it to front
            dq.remove(x);
        }

        // update reference: add to front of queue
        dq.push(x);
        map.add(x);
    }

    // display contents of cache
    private void display()
    {
        for (Integer integer : dq) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }

}
