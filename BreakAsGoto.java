class BreakAsGoto
{ public static void main(String args[])
{
boolean t = true;
first: {
second: {
third: {
System.out.println("Before the break.");
if(t) break second; // break out of second block
System.out.println("This won't execute");
} // end of third
} // end of second
System.out.println("This is after second block.");
} // end of first
} // end of main()
} // end of class
