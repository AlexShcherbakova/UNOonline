package com.UNOonline.UNO;

import java.util.Random;

public class RandomCode
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(8999)+1000;
        System.out.println(randomNumber);
    }
}