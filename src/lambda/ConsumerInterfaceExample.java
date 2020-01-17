package lambda;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	//As you need to perform any operation in which you have to provide the input but there is no return result
	//you don't need to define any method for doing that you can simple user the lambda expression with the consumer
	// functional interface and  all the time you have to call that method you just need to call the accept method 
	// using the reference variable of the consumer interface.
	 public static void main(String args[]) {
		  Consumer<String> consumerString = (String s)->{System.out.println(s);};
		  consumerString.accept("Prabhat");
	 }

}
