 //stack class also containing the intopostfix method
   import java.util.*;
    public class StackI 
    {   int i,j;
String postfix[];
String stack[];
int top;
String post;
int size;
public StackI(int n)
{
    stack=new String[n];
    top=-1;
}
public void push(String item)
{
    if(top>=stack.length)
        System.out.println("Stack overflow");
    else
    {
        stack[++top]=item;
    }
}
public String pop()
{
    if(top==-1)
    {       System.out.println("Stack underflow");
            return "0";
    }
    else
        return stack[top--];
}
boolean isAlpha(String ch)
{
   for(int i = 0; i < ch.length(); i++)
   {
     if(!Character.isDigit(ch.charAt(i)))
     {
       return false;
     }
   }
   return true;

}
boolean isOperator(String ch)
{
    if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/"))
        return true;
    else return false;

}

void intopost(StringTokenizer str)
{
postfix=new String[1000];
size = 0;
String ch;

j=0;
while(str.hasMoreTokens())
{
    ch=str.nextToken();
    if(ch.equals("("))
        push(ch);
    else if(isAlpha(ch))
    {
        postfix[j++]=ch;
        size++;
    }
    else if(isOperator(ch))
    {
        push (ch);
    }
    else if(ch.equals(")"))
    {
        String c  = pop();
        while(!c.equals("("))
                {                       
                    postfix[j++]=c;
                    size++;
                    c= pop();
                }
    }

}
while (top > -1) {
 String add = pop();
 postfix[j++] = add;
 size++;
}
}
public String disp()
{
  String value = "";
    for(i=0;i<size;i++)
    {   
        value = value + postfix[i] + " ";
        System.out.println(postfix[i]);
    }
    return value;
}
}