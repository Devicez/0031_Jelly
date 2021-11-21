//package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> abc = new ArrayList<Integer>();
        abc.add(input.nextInt());
        abc.add(input.nextInt());
        abc.add(input.nextInt());

        int count = 0;

        while (abc.get(0)!=1 || abc.get(1)!=1 || abc.get(2)!=1)
        {
            int p = abc.indexOf(Collections.max(abc));
            if(Collections.max(abc)%2 != 0)
            {
                abc.set(p,(abc.get(p) - 1)/2);
            }
            else
            {
                abc.set(p,abc.get(p)/2);
            }
            count++;
        }
        
        System.out.println(count);
    }
}
