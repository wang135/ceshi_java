
package wang;
class wa{
    public static void main(String[] args) {
        Flowerss a = new Flowerss("wang",35);
        a.SetAge(112);
//        a.setName("wangjing");
        a.xueli = "dadzhuang";
        System.out.println("wwwwwwwwwwww"+a.GetAge()+a.getName()+a.xueli);


    }
}


//abstract class Sport{
//    abstract void lanqiu();
//    abstract void zuqiu();
//}
//
//class Gss extends Sport{
//    public Gss(String names,String aihaos,int ages){
//        this.names = names;
//        this.aihaos = aihaos;
//        this.age = ages;
//    }
//    void lanqiu(){
//        System.out.println("nihaolanqiu");
//    }
//    void zuqiu(){
//        System.out.println("nihao"+this.age);
//
//    }
//}






class Flowerss{
    public String xueli;
    private String name;
    private int age;
    final int x = 100;
    // 构造函数
    public Flowerss(String name,int age) {

        this.name = name;
        this.age = age;

    }
    //    私有变量获取name
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    //    年龄条件限制
    void SetAge(int age) {
        if (age>=25) {

            System.out.println("年龄不符合");
            return;
        }
        else {
            System.out.println("年龄符合");
            this.age = age;
        }
    }
    public int GetAge() {
        return this.age;

    }
}




