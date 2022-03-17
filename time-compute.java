package hello;

import java.util.*;

public class HelloP
{
	private Scanner in = new Scanner (System.in);
	private int time;

	private int sec , min, hr, day , mon , yr;
	
	public  static void main(String [] args)
	{
		sec = min = hr = day= mon = yr = 0;
		System.out.println("Enter time in Seconds : ");
		time =  in.nextInt();

		for(int i = 0 ; i < time; i++)
		{
			sec ++;
			if(sec == 60)
			{
				sec = 0;
				min ++;
				if(min ==60)
				{
					hr ++;
					min = 0;
					if (hr == 24)
					{
						day++;
						hr = 0;
						if (day == 30)
						{
							mon ++;
							day = 0;
							if ( mon ==12)
							{
								yr ++;
							}
						}
					}
				}
			}
		}

		System.out.println(yr + " "  + mon + " " + day + " " + hr + " " + min +" " + sec);
	}
}
