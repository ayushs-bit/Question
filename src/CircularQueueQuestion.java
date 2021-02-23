import java.util.Scanner;

public class CircularQueueQuestion 
{
    int ar[];
    int Front,Rear,max = 0;
    CircularQueueQuestion()
    {
        ar = new int[5];
        Front = -1;
        Rear = -1;
    }
    
    void insert()
    {
        if((Front == 0 && Rear == 4) || Rear == Front -1)
        {
            System.out.println("Queue full");
        }
        else
        {
            System.out.println("enter data");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            
            if(Front == -1)
            {
                Front = 0;
            }
            if(Rear < 4)
            {
                Rear =  Rear + 1;
            }
            else if(Rear == 4 && Front !=0)
            {
                Rear = 0;
            }
            ar[Rear] = data;
            System.out.println("data inserted...");
        }
    }
        
    void delete()
    {
          if(Front == -1)
          {
              System.out.println("Queue empty");
          }
          else
          {
              if(Front == Rear)
              {
                  System.out.println("deleted:" +ar[Front]);
                  Front = -1;
                  Rear = -1;
              }
              else if(Front < Rear)
              {
                  System.out.println("deleted:" +ar[Front]);
                  Front = Front + 1;
              }
              else if (Front == 4 && Rear < Front)
              {
                  System.out.println("deleted:"+ar[Front]);
                  Front = 0;
              }
              else if(Rear < Front)
              {
                  System.out.println("deleted:"+ar[Front]);
                  Front = Front + 1;
              }
          }
    }
    
    void traverse()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue empty");
        }
        else
        {
            if(Front <= Rear)
            {
                for (int i = Front;i<=Rear;i++)
                {
                    System.out.print(" "+ar[i]);
                }
            }
            else
            {
               for(int i = Front;i<=4;i++)
               {
                   System.out.print(" "+ar[i]);
               }
               for(int i = 0;i<=Rear;i++)
               {
                   System.out.print(" "+ar[i]);
               }
            }
        }
    }
    void highestvalue()
    {
        if(Front == -1 || Rear == -1)
        {
            System.out.println("Queue empty");
        }
        else
        {
            if(Front < Rear)
            {
                for(int i = Front;i<=Rear;i++)
                {
                    if(max<ar[i])
                    {
                        max=ar[i];
                    }
                }
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    if(max<ar[i])
                    {
                        max=ar[i];
                    }
                }
                for(int j=0;j<=Rear;j++)
                {
                    if(max<ar[j])
                    {
                        max=ar[j];
                    }
                }
            }
            System.out.println("Highest Number = "+max);
        }
    }
    
    public static void main(String args[])
    {
        CircularQueueQuestion obj = new CircularQueueQuestion();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 to find highest value");
            System.out.println("press 5 for exit");
            //System.out.println("press 5 for insert");
            
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.highestvalue();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
  
