package stack;

/**
 * 任务：
 * 1. 使用数组实现栈
 * 2. 使用链表实现栈
 */
public interface Stack<E> {
    /**
     * 返回栈大小
     * @return 栈大小
     */
    int size();

    /**
     * 栈是否为空
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * 压栈
     * @return 压栈元素
     */
    E push(E e);

    /**
     * 出栈
     * @return 出栈元素
     */
    E pop();

    /**
     * 返回栈顶元素
     * @return 栈顶元素
     */
    E top();
}
