****
```java
//比较2个数字大小

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(30,30));
        System.out.println(isSame(29,30));
    }

    public static boolean isSame(int a,int b){
        return a==b?true:false;
    }
}
//诶 ，其实也是有一点学到的知识，就是被调用的方法在java中是这样和main方法并列的
```
