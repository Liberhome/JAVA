1.使用.equals()方法可以比较字符串是否相等

2。要检测两个字符串是否相等，而不区分大小写，可以使用：equalsIgnoreCase（）

3.取子串：s.substring()

4.记住了，空串是“”长度为0的字符串是一个对象，null是特殊的，表示没有对象与之关联

通常，需要检测资1个字符串不是空页不是null的时候：
```java
if(str!=null&&str.length()!=0)
```
5.StringBuilder相比String的优势在于不用每次都构建一个新的String对象
直接使用.append方法

6.关于输入：
```java
import java.util.Scanner;

public class StoryOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();//输入一行
        String s2 = scanner.next();//输入一个单词，用空白符做分割
        int i = scanner.nextInt();//输入一个整数
        double v = scanner.nextDouble();//输入一个浮点数
    }
}
```



