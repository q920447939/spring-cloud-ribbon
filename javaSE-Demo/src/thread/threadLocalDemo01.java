/**
 * @Project: threadLocalDemo01
 * @Author: liming
 * @Date: 2018年05月18日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package thread;

/**
 * ClassName: threadLocalDemo01
 * @Description: threadLocalDemo01
 * @author liming
 * @date 2018年05月18日
 */
public class threadLocalDemo01 {

    private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    static class MyThread implements Runnable {

        private int index;

        public MyThread(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println("线程:" + index + "的初始值为:" + value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + i);
            }
            System.out.println("线程" + index + "的累加值为:" + value.get());
        }
    }
}



