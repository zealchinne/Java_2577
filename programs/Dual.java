//which is valid or invalid FunctionalInterface
interface Sayable
{
	void say(String msg);// Abstract method
}

interface Dual extends Sayable // invalid
{
	void say(String msg);
	void talk();
}
