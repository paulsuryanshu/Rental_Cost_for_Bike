import java.io.*;

class Mobike{
    Long bno;
    Long phno;
    String name;
    int days;
    int charge;
    public void getdata()throws Exception
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.print("Enter the name of the customer :: ");
        name = br.readLine();
        System.out.print("Enter the bike number of the customer :: ");
        bno = Long.parseLong(br.readLine());
        System.out.print("Enter the mobile number of the customer :: ");
        phno = Long.parseLong(br.readLine());
        System.out.println("The rental chart is First five days: Rs. 500 per day,Next five days: Rs. 400 per day,Rest of the days: Rs. 200 per day.");
        System.out.print("Enter the rental days :: ");
        days = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.println();
        System.out.println();
    }
    void compute()
    {
        if (days <= 5) 
        {
            charge = days * 500;
        } 
        else if (days <= 10) 
        {
            charge = 5 * 500 + (days - 5) * 400;
        } 
        else 
        {
            charge = 5 * 500 + 5 * 400 + (days - 10) * 200;
        }
    }
    void display()
    {
        System.out.println("Bike No. :: "+bno);
        System.out.println("Phone No. :: "+phno);
        System.out.println("Name :: "+name);
        System.out.println("No. of days :: "+days);
        System.out.println("The total payable amount is :: "+charge);
    }
}
class main{
    public static void main(String args[])throws Exception
    {
        Mobike ob = new Mobike();
        ob.getdata();
        ob.compute();
        ob.display();
    }
}
