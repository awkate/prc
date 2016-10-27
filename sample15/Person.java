package sample15;

/**
 * Created by kei.watanabe on 2016/10/25.
 */
public class Person {
         String name;
         int age;
         String address;

        public Person(String name,int age,String address){
            this.name =name;
            this.age =age;
            this.address = address;
        }

        public void say(){
            System.out.println("私の名前は" + name + "です。年齢は"
                    + age + "才で、住所は" + address + "です。");
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            if(age >= 0){
                this.age = age;
            }else {
                this.age = 0;
            }
        }

        public void setAddress(String address){

            this.address = address;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getAddress(){
            return address;
        }


}
