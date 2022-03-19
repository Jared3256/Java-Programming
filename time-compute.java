package hello;

import java.util.*;

public class Hello
{
	public  static void main(String [] args)
	{
            Scanner in = new Scanner (System.in);
            int sec , min, hr, day , mon , yr ,time;
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
                                                                mon = 0;
							}
						}
					}
				}
			}
		}

		System.out.println(yr + " "  + mon + " " + day + " " + hr + " " + min +" " + sec);
	}
}
