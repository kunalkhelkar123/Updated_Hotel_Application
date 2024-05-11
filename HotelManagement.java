import java.util.Scanner;
class HotelManagement 
{
	Scanner sc=new Scanner(System.in);
	Hotel h;

	public void chooseFood()
	{
		System.out.println("1.veg 2.non veg");
		switch(sc.nextInt())
		{
			case 1:
				h=new Veg();
			break;
			case 2:
				h=new NonVeg();
			break;

		}

	}
	public void orderFood()
	{
		if(h!=null)
		{
			if(h instanceof Veg)
		 {
			 Veg v1=(Veg)h;
			  for(;;)
			 {
			System.out.println("1."+"food name ="+v1.food1+"                   price "+v1. price1);
			System.out.println("2."+"food name ="+v1.food2+"                       price "+v1. price2);
			System.out.println("3."+"food name ="+v1.food3+"   price "+v1. price3);
			System.out.println("4."+"food name ="+v1.food4+"   price "+v1. price4);
			System.out.println("5."+"food name ="+v1.food5+"   price "+v1. price5);
			System.out.println("6."+"food name ="+v1.food6+"   price "+v1. price6);
			System.out.println("7."+"food name ="+v1.food7+"   price "+v1. price7);
			System.out.println("8."+"food name ="+v1.food8+"   price "+v1. price8);
			System.out.println("9.please bring food"+(char)2);
			switch(sc.nextInt())
		    {
				case 1:
					System.out.println("please enter qty");
				  v1.qty1=sc.nextInt();
					break;
				case 2:
					System.out.println("please enter qty");
				  v1.qty2=sc.nextInt();
					break;
				case 3:
					System.out.println("please enter qty");
				  v1.qty3=sc.nextInt();

					break;
				case 4:
					System.out.println("please enter qty");
				  v1.qty4=sc.nextInt();
					break;
				case 5:
					System.out.println("please enter qty");
				  v1.qty5=sc.nextInt();
					break;
				case 6:
					System.out.println("please enter qty");
				  v1.qty6=sc.nextInt();
					break;
				case 7:
					System.out.println("please enter qty");
				  v1.qty7=sc.nextInt();
					break;
				case 8:
					System.out.println("please enter qty");
				  v1.qty8=sc.nextInt();
					break;
				case 9:
				bill();
					return ;
			}
			 }
		 }
		if(h instanceof NonVeg)
		 {
			 NonVeg v2=(NonVeg)h;
			  for(;;)
			 {
			System.out.println("1."+"food name ="+v2.food1+"                   price "+v2. price1);
			System.out.println("2."+"food name ="+v2.food2+"                   price "+v2. price2);
			System.out.println("3."+"food name ="+v2.food3+"  			       price "+v2. price3);
			System.out.println("4."+"food name ="+v2.food4+"  				   price "+v2. price4);
			System.out.println("5."+"food name ="+v2.food5+"                   price "+v2. price5);
			System.out.println("6."+"food name ="+v2.food6+"  			   	   price "+v2. price6);
			System.out.println("7."+"food name ="+v2.food7+" 				   price "+v2. price7);
			System.out.println("8."+"food name ="+v2.food8+"                   price "+v2. price8);
			System.out.println("7."+"food name ="+v2.food9+"                   price "+v2. price9);
			System.out.println("9."+"food name ="+v2.food10+"                  price "+v2. price10);
			System.out.println("10.please bring food"+(char)2);
			switch(sc.nextInt())
		    {
				case 1:
					System.out.println("please enter qty");
				  v2.qty1=sc.nextInt();
					break;
				case 2:
					System.out.println("please enter qty");
				  v2.qty2=sc.nextInt();
					break;
				case 3:
					System.out.println("please enter qty");
				  v2.qty3=sc.nextInt();

					break;
				case 4:
					System.out.println("please enter qty");
				  v2.qty4=sc.nextInt();
					break;
				case 5:
					System.out.println("please enter qty");
				  v2.qty5=sc.nextInt();
					break;
				case 6:
					System.out.println("please enter qty");
				  v2.qty6=sc.nextInt();
					break;
				case 7:
					System.out.println("please enter qty");
				  v2.qty7=sc.nextInt();
					break;
				case 8:
					System.out.println("please enter qty");
				  v2.qty8=sc.nextInt();
					break;
					case 9:
					System.out.println("please enter qty");
				  v2.qty9=sc.nextInt();
					break;
				case 10:
				    bill();
					return ;
			}
			 }
		 
			 
		 
		 
	}
		}
		else{

			System.out.println("First choose the food");
		}


         
}
	public void bill()
	{
		int c=1;
		double sum=0;
		if(h!=null)
		{
			if(h instanceof Veg)
		{
          Veg v1=(Veg)h;
		  System.out.println("s.no"+" food name"+"qty"+"price");
           if(v1.qty1!=0)
		   {
			   System.out.println(c++ +v1.food1+v1.qty1+"  "+(v1.qty1*v1.price1));
		       sum=sum+(v1.qty1*v1.price1);
		   }
			    if(v1.qty2!=0)
		   {
			   System.out.println(c++ +v1.food2+v1.qty2+"  "+(v1.qty2*v1.price2));
		    sum=sum+(v1.qty2*v1.price2);
		   }
		    if(v1.qty3!=0)
		   {
			   System.out.println(c++ +v1.food3+v1.qty3+"  "+(v1.qty3*v1.price3));
		        sum=sum+(v1.qty3*v1.price3);
		   }
			    if(v1.qty4!=0)
		   {
			   System.out.println(c++ +v1.food4+v1.qty4+"  "+(v1.qty4*v1.price4));
		      sum=sum+(v1.qty4*v1.price4);
		   }
			    if(v1.qty5!=0)
		   {
			   System.out.println(c++ +v1.food5+v1.qty5+"  "+(v1.qty5*v1.price5));
		       sum=sum+(v1.qty5*v1.price5);
		   }
			    if(v1.qty6!=0)
		   {
			   System.out.println(c++ +v1.food6+v1.qty6+"  "+(v1.qty6*v1.price6));
		       sum=sum+(v1.qty6*v1.price6);
		   }
			    if(v1.qty7!=0)
		   {
			   System.out.println(c++ +v1.food7+v1.qty7+"  "+(v1.qty7*v1.price7));
		       sum=sum+(v1.qty7*v1.price7);
		   }
			    if(v1.qty8!=0)
		   {
			   System.out.println(c++ +v1.food8+v1.qty8+"  "+(v1.qty8*v1.price8));
		          sum=sum+(v1.qty8*v1.price8);
		   }
		   System.out.println("_____________________________________________________");
		   System.out.println("totol--------------------------------------------"+sum);

		}
		if(h instanceof NonVeg)
		{
          NonVeg v2=(NonVeg)h;
		  System.out.println("s.no"+" food name"+"qty"+"price");
           if(v2.qty1!=0)
		   {
			   System.out.println(c++ +v2.food1+v2.qty1+"  "+(v2.qty1*v2.price1));
		       sum=sum+(v2.qty1*v2.price1);
		   }
			    if(v2.qty2!=0)
		   {
			   System.out.println(c++ +v2.food2+v2.qty2+"  "+(v2.qty2*v2.price2));
		    sum=sum+(v2.qty2*v2.price2);
		   }
		    if(v2.qty3!=0)
		   {
			   System.out.println(c++ +v2.food3+v2.qty3+"  "+(v2.qty3*v2.price3));
		        sum=sum+(v2.qty3*v2.price3);
		   }
			    if(v2.qty4!=0)
		   {
			   System.out.println(c++ +v2.food4+v2.qty4+"  "+(v2.qty4*v2.price4));
		      sum=sum+(v2.qty4*v2.price4);
		   }
			    if(v2.qty5!=0)
		   {
			   System.out.println(c++ +v2.food5+v2.qty5+"  "+(v2.qty5*v2.price5));
		       sum=sum+(v2.qty5*v2.price5);
		   }
			    if(v2.qty6!=0)
		   {
			   System.out.println(c++ +v2.food6+v2.qty6+"  "+(v2.qty6*v2.price6));
		       sum=sum+(v2.qty6*v2.price6);
		   }
			    if(v2.qty7!=0)
		   {
			   System.out.println(c++ +v2.food7+v2.qty7+"  "+(v2.qty7*v2.price7));
		       sum=sum+(v2.qty7*v2.price7);
		   }
			    if(v2.qty8!=0)
		   {
			   System.out.println(c++ +v2.food8+v2.qty8+"  "+(v2.qty8*v2.price8));
		          sum=sum+(v2.qty8*v2.price8);
		   }
		   System.out.println("_____________________________________________________");
		   System.out.println("totol--------------------------------------------"+sum);

		}
		}
		else{
			System.out.println("Frist order the food");
		}
	}
}
