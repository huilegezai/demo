package com.formatdata;

import java.util.Stack;

public class FormatData {


    public static String input = "{\n" +
            "\t\"huizai\":\"huawei\",\n" +
            "\t\"template\":[\n" +
            "\t\t\t{$repeat:kkk_length:{\n" +
            "\n" +
            "\t\t\t\t\t\"tempate\":\"{$kkk[1]}.ggg\",\n" +
            "\t\t\t\t\t\"tempate\":\"{$kkk[1]}.ggg\"\n" +
            "\n" +
            "\t\t\t\t},\n" +
            "\t\t\t}\n" +
            "\t]\n" +
            "}";


    public static void main(String[] args)
    {
            System.out.println(testVa(input));

    }


    public static boolean testVa(String input)
    {

        Stack<Character> stack = new Stack<Character>();

        for(int i =0;i<input.trim().length();i++)
        {
            if(input.charAt(i) == '['||input.charAt(i) == '{')
            {
                stack.push(input.charAt(i));
            }
            if(input.charAt(i)==']')
            {
                if(stack.peek() == '[')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(']');
                }
            }

            if(input.charAt(i)=='}')
            {
                if(stack.peek() == '{')
                {
                    stack.pop();
                }
                else
                {
                    stack.push('}');
                }
            }
        }

        return stack.empty();
    }
}
