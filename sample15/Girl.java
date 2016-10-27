package sample15;

/**
 * Created by kei.watanabe on 2016/10/25.
 */
public class Girl extends Person  {
    Girl(String name, int age, String address) {
        super(name,age,address);
    }

   public void say(){
        System.out.println("わたし" + name + "です。年齢は内緒("
                + age + ")　" + address + "に住んでます。");
    }
}
