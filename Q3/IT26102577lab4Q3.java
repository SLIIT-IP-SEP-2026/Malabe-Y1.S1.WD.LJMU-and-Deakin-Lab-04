int number ;
string result;

Scanner input = new Scanner (System.in);

System.out.print("Enter a number: ");
number = input.nextint();

result = (number > 0)? "The number is positive":(number < 0)? "the number isd negative"
System.out.println(result);