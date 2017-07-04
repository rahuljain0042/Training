class student
{
int i;
String name;

student(int id, String n)
{
id=i;
name=n;

}
void display()
{
System.out.println(i+" "+name);
}
public static void main(String args[])
{
student p = new student(45,"rahul");
p.display();
}
}