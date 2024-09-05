import java.util.Scanner;
class bus{
    public static book p1=new book(1,null);
    public static book p2=new book(2,null);
    public static book p3=new book(3,null);
    public static book p4=new book(4,null);
    public static book p5=new book(5,null);
    public static book p6=new book(6,null);
    public static book p7=new book(7,null);
    public static book p8=new book(8,null);
    public static class book{
        int data;
        book next;
        String name;
        book(int data,String name){
            this.data=data;
        }
     
        public void print(){
            System.out.println("*** Thank you for booking ****");
            System.out.println("Name : "+this.name+"\nseat no : "+this.data);
        }
    }
    public static book check(int num){
        if(num== p1.data){
            if(p1.name==null){
                return(p1);
            }
        }
        else if(num ==p2.data){
            if(p2.name==null){
                return (p2);
            }
        }
        else if(num ==p3.data){
            if(p3.name==null){
                return (p3);
            }
        }
        else if(num ==p4.data){
            if(p4.name==null){
                return (p4);
            }
        }
        else if(num ==p5.data){
            if(p5.name==null){
                return (p5);
            }
        }
        else if(num ==p6.data){
            if(p6.name==null){
                return (p6);
            }
        }
        else if(num ==p7.data){
            if(p7.name==null){
                return (p7);
            }
        }
        else if(num==p8.data) {
            if(p8.name==null){
                return (p8);
            }
        }
        return null;
    }
    public static void check2(){
        int count=0;
        if(p1.name==null){
            count+=1;
        }
        if(p2.name==null){
            count+=1;
        }
        if(p3.name==null){
            count+=1;
        }
        if(p4.name==null){
            count+=1;
        }
        if(p5.name==null){
            count+=1;
        }
        if(p6.name==null){
            count+=1;
        }
        if(p7.name==null){
            count+=1;
        }
        if(p8.name==null){
            count+=1;
        }
        System.out.println("their are available seats are "+count);
    }
    public static void display(){
        String s1,s2,s3,s4,s5,s6,s7,s8;
        if(p1.name == null){
            s1="1";
        }else{
            s1="X";
        }
        if(p2.name==null){
            s2="2";
        }else{
            s2="X";
        }
        if(p3.name==null){
            s3="3";
        }else{
            s3="X";
        }
        if(p4.name==null){
            s4="4";
        }else{
            s4="X";
        }
        if(p5.name==null){
            s5="5";
        }else{
            s5="X";
        }
        if(p6.name==null){
            s6="6";
        }else{
            s6="X";
        }
        if(p7.name==null){
            s7="7";
        }else{
            s7="X";
        }
        if(p8.name==null){
            s8="8";
        }else{
            s8="X";
        }
        System.out.println(s1+"\t"+s2+"\t\t"+s3+"\t"+s4);
        System.out.println(s5+"\t"+s6+"\t\t"+s7+"\t"+s8);
    }
    public static void cancel(int name){
        book value=check1(name);
        if(value==null){
            System.out.println("seat is not booked");
        }
        else{
            value.name=null;
        }
    }
    public static book check1(int num){
        if(num==p1.data){
            if(p1.name!=null){
                return(p1);
            }
        }
        else if(num ==p2.data){
            if(p2.name!=null){
                return (p2);
            }
        }
        else if(num ==p3.data){
            if(p3.name!=null){
                return (p3);
            }
        }
        else if(num ==p4.data){
            if(p4.name!=null){
                return (p4);
            }
        }
        else if(num ==p5.data){
            if(p5.name!=null){
                return (p5);
            }
        }
        else if(num ==p6.data){
            if(p6.name!=null){
                return (p6);
            }
        }
        else if(num ==p7.data){
            if(p7.name!=null){
                return (p7);
            }
        }
        else if(num==p8.data) {
            if(p8.name!=null){
                return (p8);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=p6;
        p6.next=p7;
        p7.next=p8;
        while(true){
            System.out.println("*** welcome to bus booking ***");
            System.out.println(" 1.book  \n  2.cancel  \n 3.display  \n 4.Available  \n 5.exit");
            Scanner a=new Scanner(System.in);
            int b=a.nextInt();
            if(b==1){
                System.out.println("enter your name");
                Scanner c=new Scanner(System.in);
                String name=c.next();
                display();
                System.out.println("please enter the seat number you want to book");
                Scanner d=new Scanner(System.in);
                int seat=d.nextInt();
                book e=check(seat);
                if(e==null){
                    System.out.println("seat has been already booked");
                }
                else{
                    e.name=name;
                    e.print();
                }
            }
            else if(b==3){
                display();
            }
            else if (b==2){
                System.out.println("enter your seat no  : ");
                Scanner q=new Scanner(System.in);
                int w= q.nextInt();
                cancel(w);
            }
            else if(b==4){
                check2();
            }
            else if(b==5){
                System.exit(0);
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
}
