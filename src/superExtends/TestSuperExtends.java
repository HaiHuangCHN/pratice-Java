package superExtends;

import com.sun.tools.corba.se.idl.constExpr.Or;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://blog.csdn.net/anlian523/article/details/100865538/
 *
 * @author haihuang95@zto.com
 * @version 0.1.0
 * @date 2022/9/17 10:45
 * @since 0.1.0
 */
public class TestSuperExtends {

    @Test
    public void testSuperExtends() {
        // 这样的行为都无法通过编译。之所以java这么设计，是因为泛型不像数组，泛型没有内建的协变类型。具体地说，类型信息在编译过后就被类型擦除掉了，运行时也就没法检查了（不像数组，有运行时的插入检查）
        // List<Fruit> flist = new ArrayList<Apple>();

        List<? extends Fruit> flist1;
        flist1 = new ArrayList<Fruit>();
        flist1 = new ArrayList<Apple>();
        flist1 = new ArrayList<Orange>();
        flist1 = new ArrayList<Jonathan>();

        List<? extends Apple> flist2;
        // 编译错误
        // flist2 = new ArrayList<Fruit>();
        flist2 = new ArrayList<Apple>();
        // 编译错误
        // flist2 = new ArrayList<Orange>();
        flist2 = new ArrayList<Jonathan>();

        List<? super Fruit> flist3;
        flist3 = new ArrayList<Fruit>();
        // 编译错误
        // flist3 = new ArrayList<Apple>();
        // flist3 = new ArrayList<Orange>();
        // flist3 = new ArrayList<Jonathan>();

        List<? super Apple> flist4;
        flist4 = new ArrayList<Fruit>();
        flist4 = new ArrayList<Apple>();
        // 编译错误
        // flist4 = new ArrayList<Orange>();
        // flist4 = new ArrayList<Jonathan>();

        List<? extends Fruit> flist5;
        flist5 = new ArrayList<Fruit>();
        // flist5.add(new Fruit());
        // flist5.add(new Apple());
        // flist5.add(new Orange());
        // flist5.add(new Jonathan());

        List<? extends Apple> flist6;
        flist6 = new ArrayList<Apple>();
        Fruit oExtends = flist6.get(0);
        Apple o1Extends = flist6.get(0);
        // flist6.add(new Fruit());
        // flist6.add(new Apple());
        // flist6.add(new Orange());
        // flist6.add(new Jonathan());

        List<? super Fruit> flist7;
        flist7 = new ArrayList<Fruit>();
        flist7.add(new Fruit());
        flist7.add(new Apple());
        flist7.add(new Orange());
        flist7.add(new Jonathan());

        List<? super Apple> flist8;
        flist8 = new ArrayList<Apple>();
        // 编译错误
        // flist8.add(new Fruit());
        flist8.add(new Apple());
        // 编译错误
        // flist8.add(new Orange());
        flist8.add(new Jonathan());

        Object oSuper = flist8.get(0);
        // 编译错误
        // Fruit o1Super = flist8.get(0);

    }

}
