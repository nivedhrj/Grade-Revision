import java.util.*;
class Main{
    String name;
    int basic;
    int experience;
    double increment;


    Main(){
        this.name=" ";
        this.basic =0;
        this.experience=0;

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your Basic Salary:");
        basic =sc.nextInt();
        System.out.println("Enter your Increment:");
        experience=sc.nextInt();
        sc.close();
    }
    public void increment(){

        if(experience <=3){
            increment=1000+(10.0/100)*basic;
        }
        else if(experience>3&& experience<=5){
            increment=3000+(12.0/100)*basic;
        }
        else if(experience>5 && experience<=10){
            increment=5000+(15.0/100)*basic;
        }
        else{
            increment=8000+(20.0/100)* basic;
        }

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Basic Salary:"+ basic);
        System.out.println("Increment: "+increment);
        System.out.println("New Basic Salary: "+(basic +increment));

    }
    public static void main(String[]Args){
        Main Main=new Main();
        Main.input();
        Main.increment();
        Main.display();

    }
}