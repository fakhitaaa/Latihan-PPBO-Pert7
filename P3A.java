class P3A{
public static void main(String [] args)
{
P3A ortu = new P3A();
P3B anak = new P3B();
System.out.println("superclass");
ortu.setX(10);
ortu.setY(20); ortu.getNilai();
System.out.println("sub Class");
anak.setX(5);
anak.setY(4);
anak.getNilai();
anak.setZ(50);
anak.getJumlah();
}
}