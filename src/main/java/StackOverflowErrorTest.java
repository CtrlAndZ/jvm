/**
 * 利用递归测试栈的溢出
 * 测试栈的深度
 */

/**
 * 知识点：
 * 线程执行每执行一个方法时就会创建一个栈帧
 * 创建完将该栈帧压栈
 * 当方法执行完毕之后，便会将栈帧出栈
 */


public class StackOverflowErrorTest {

    private static int i = 0;

    public void toMe() throws StackOverflowError{
        i++;
        toMe();
    }

    public static void main(String[] args) {
        try {
            new StackOverflowErrorTest().toMe();
        } catch (StackOverflowError e){
            System.out.println(i);
        }
    }

}
