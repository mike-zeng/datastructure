package queue;

/**
 *
 */
public interface Queue<E> {
    /**
     * 返回队列大小
     * @return 队列大小
     */
    int size();
    /**
     * 队列是否为空
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * 入队
     * @param e 入队元素
     * @return 入队元素
     */
    E enqueue(E e);

    /**
     * 出队
     * @return 出队元素
     */
    E dequeue();
}
