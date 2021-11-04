class P3B extends P3A {
private int z;
public void getJumlah(){
System.out.println("jumlah:"+ (x+y+z));
}
public void setZ(int z){
this.z = z; } }
class P3A {
private int x;
private int y;
public void setX(int x){
this.x = x;
public void setY(int y){
this.y = y;
}
public void getNilai(){
System.out.println("nilai x: "+ x +" nilai y: " + y);
}