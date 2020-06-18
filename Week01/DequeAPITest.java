package com.abc;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用 add first 或 add last 这套新的 API 改写 Deque 的代码
 * @since
 */
public class DequeAPITest {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList();
        deque.offerFirst("a");
        deque.offerFirst("b");
        deque.offerLast("c");
        deque.offerLast("d");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size()>0){
            System.out.println(deque.pollLast());
        }

        System.out.println(deque.pollLast());
    }
}
