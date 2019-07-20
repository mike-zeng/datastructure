package list;

import java.util.Iterator;

/**
 * 表是最简单的线性数据结构,在java集合中体现为java.util.List
 * 表可以由数组实现，链表实现，游标实现三种方式
 * 你需要完成：
 * 1. 表的简单数组实现
 * 2. 单链表
 * 3. 双链表
 * 4. 循环双链表
 * 5. 链表的游标实现
 * @author zeng
 */
public interface List<E> {
    /**
     * 返回表的大小
     * @return 表的大小
     */
   int size();

    /**
     * 返回表中不存在元素
     * @return 表是否为空
     */
   boolean isEmpty();

    /**
     * 表中是否包含某个对象
     * @param o 待判断的对象
     * @return 是否存在
     */
   boolean contains(Object o);

    /**
     * 返回iterator
     * @return iterator
     */
   Iterator<E> iterator();

    /**
     * 表转换为Object数组
     * @return Object数组
     */
   Object[] toArray();

    /**
     * 添加元素到末尾
     * @param e 待添加元素
     * @return 是否成功
     */
    boolean add(E e);

    /**
     * 移除元素
     * @param o 待移除的元素
     * @return 是否成功
     */
    boolean remove(Object o);

    /**
     * 清空表
     */
    void clear();

    /**
     * 获取元素
     * @param index 元素所在位置
     * @return 元素
     */
    E get(int index);

    /**
     * 设置元素
     * @param index 目标位置
     * @param element 目标元素
     * @return 设置成功的元素即设置成什么就返回什么
     */
    E set(int index, E element);

    /**
     * 在某个位置添加元素
     * @param index 位置
     * @param element 元素
     */
    void add(int index, E element);

    /**
     * 移除某个位置的元素
     * @param index 位置
     * @return 被移除的元素
     */
    E remove(int index);

    /**
     * 从前往后查找某元素在哪个位置
     * @param o 目标元素
     * @return 位置
     */
    int indexOf(Object o);

    /**
     * 从后往前查找某元素在哪个位置
     * @param o 目标元素
     * @return 位置
     */
    int lastIndexOf(Object o);

}
