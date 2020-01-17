package functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	public final int variable = 10;

	public void singleAbstractMethod();

	public default void defaultMethod() {
		System.out.println("This is the default method.");
	}

	public default void defaultMethod2() {
		System.out.println("This is the default method2.");
	}

	public static void staticMethod() {
		System.out.println("This is the static method of fuctional Interface");
	}
}
