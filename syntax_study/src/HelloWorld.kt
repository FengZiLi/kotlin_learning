/**
 * Created by Administrator on 2016/1/29.
 */

fun main(args: Array<String>)
{
    println("Hello,world")

    val v=Paris(3,5)

    val  (a,b)=v;
    print("a=$a,b=$b")//输出是a=5，b=3！！！
}

class Paris<S,V>(var s : S, var v:V)//这种设计应该是个坑，component必须和参数顺序一模一样，否则会出问题
{
    operator fun component1():V{
        return v
    }
    operator fun component2():S{
        return  s
    }
}
