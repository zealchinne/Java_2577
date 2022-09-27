import java.io.IOException;
class Throwsdemo{
void q()throws IOException{
throw new IOException("error");
}
void r()throws IOException{
q();
}
void s(){
try{
r();
}catch(Exception e){System.out.println("exception has been handled");}
}
public static void main(String args[]){
Throwsdemo obj=new Throwsdemo();
obj.s();
System.out.println("flow is normal");
}
}