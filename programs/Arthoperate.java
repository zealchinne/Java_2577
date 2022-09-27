//Write a Java Program for Arthmatic Operation (+,_,*,/)
class Arthoperate {
	int x=50;
	int y=101;

void dev() {
			int z=y/x;
			System.out.println(z); //2
		}
 void per() {
			int z=y%x;
			System.out.println(z); //0
		}

	void add() {
			int z=x+y;
			System.out.println(z); //151
		}

void sub() {
			int z=y-x;
			System.out.println(z); //51
		}

void mul() {
			int z=x*y;
			System.out.println(z); //5000
		}

		public static void main(String args []) {
		Arthoperate a =new Arthoperate();
		a.add();
		a.sub();
		a.mul();
		a.dev();
		a.per();
	}// main end
}//class end


		

	
