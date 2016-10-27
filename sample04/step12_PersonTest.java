package sample04;

/**
 * Created by kei.watanabe on 2016/10/25.
 */
class Person {
    String name;
    int age;
    String address;

    Person(String _name,int _age,String _address){
        name =_name;
        age =_age;
        address = _address;
    }

    void say(){
        System.out.println("私の名前は" + name + "です。年齢は"
                + age + "才で、住所は" + address + "です。");
    }

}


class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("太郎", 21, "東京都港区");
        people[1] = new Person("花子", 18, "北海道札幌市");

        for (int i = 0; i < people.length; i++) {

            people[i].say();
        }

        System.out.println("データを変更。");

        people[0].name = "次郎";
        people[0].age = 15;
        people[0].address = "福岡県福岡市";
        people[1].name = "桃子";
        people[1].age = 25;
        people[1].address = "宮城県仙台市";

        for (int i = 0; i < people.length; i++) {
            people[i].say();
        }
    }
}