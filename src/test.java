import com.company.Main;

public class test {
    public  static void main(String[] arges) {
        // 对象的创建   类名 对象名 = new 类名();
        Main tx1 = new Main();
        tx1.jiao();

        tx1.setAge(18);
        tx1.setInfo(name:"小明", age: 18 , sex'男');


        int res = tx1.getAge();
        System.out.println(res);

        System.out.println(tx1.getName());


        String result = tx1.play(name1:"小美",name2: "小三" ,count:15);
        System.out.println(result);

        }


        // 方法的访问
        Main test01(); // 静态方法 ： 类名.方法()
        tx1.test02();  // 普通方法 对象.方法()
}
