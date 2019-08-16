package web;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class token
{
    public static void main(String[] args)
    {
        try
        {
            SecureRandom random = SecureRandom.getInstanceStrong();
            System.out.println("SecureRandom.getInstanceStrong() = " + random.getAlgorithm());
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
    }
}