//WAP to show data about dog breed
class Dog
{
 String breed;
 int age;
 String size;
 String color;
 public void getInfo()
    {
      System.out.println("This dog is"+breed+"\t having age:"+age+"\t with color:"+color);
    }
public static void main(String args[])
{
 Dog d=new Dog();
 d.breed="Puppy";
 d.age=2;
d.size="small";
d.color="Brown";
d.getInfo();
}
}