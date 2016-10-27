package sample15;

/**
 * Created by kei.watanabe on 2016/10/25.
 */
public class Boy extends Person {

    Boy(String name, int age, String address ){
        super(name,age,address);
    }

    public void say(){
        System.out.println("ぼく" + name + "。年齢は"
                + age + "才なんだ。" + address + "に住んでるんだよ。");
    }

}
