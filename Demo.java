class  Ball{
	
String color;
int cost;

void bounce(){
System.out.println("Ball is bouncing");
}

void roll(){
	System.out.println("Ball is rolling");
}

}
class Demo
{
	public static void main(String[] args){

	Ball b1=new Ball();
	b1.bounce();
	b1.roll();
	}
}
