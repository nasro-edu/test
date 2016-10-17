/**
 * 
 */

/**
 * @author nasro
 *
1. Create a stack
2. For each character t in the expression
   - If t is an operand, append it to the output
   - Else if t is ')',then pop from the stack till '(' is encountered and append 
     it to the output. do not append '(' to the output.
   - If t is an operator or '('
        -- If t has higher precedence than the top of the stack, then push t 
           on to the stack.
        -- If t has lower precedence than top of the stack, then keep popping 
           from the stack and appending to the output until either stack is 
           empty or a lower priority operator is encountered.

    After the input is over, keep popping and appending to the output until the
    stack is empty.
     */
public class ArithmExprssion {

	private String expressionIn;
	private String expressionOut;
	private MyStack stack;
	
	private String precedence[][]= {{"+","-","*","/","%",")","("},{"4","4","3","3","2","1","1"}};
	
	public ArithmExprssion () 
		{
		}
	public ArithmExprssion (String expressionIn) 
	{this.expressionIn = expressionIn;}
	
	public boolean isOperator(char c)
	{	return (c=='+')||(c=='-')||(c=='*')||(c=='/')||(c=='%')||(c=='^');
	}
	
	public void converToPostFix()
	{
		StringBuilder outStr = new StringBuilder(expressionIn.length());
		
	for (int i=0; i<expressionIn.length(); i++)
		{
		
		}
	
	}
}
