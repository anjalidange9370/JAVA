//String is a final class in java
//string is non-premitive /referenced datatype
//String is immutable class in java
//String is character array
//scp does not store duplicate
//heap can store duplicate values
//Memory Area Representation:it contains 5 areaas
//heap  stack   native  pc_register
//heap stores:
//Stack Stores:
//native stores:
//pc_Register:
public class Strings1{
        public static void main(String[] args){
        String city="banglore";//string literal
        String s1=new String("Hydrabad");//new Keyword
        StringBuilder sb=new StringBuilder("Delhi");//String Builder(mutable)
        StringBuffer bs=new StringBuffer("Mumbai");//String Buffer(mutable)
      String name="Maharashtra";
      System.out.println(name);
      name.concat("mumbai");
      System.out.println(name);
      String s2="Mumbai";
      System.out.println(s2);
      s2.concat("Pune");
      System.out.println(s2);
StringBuffer sbb=new StringBuffer("anjali");
sbb.append("akansha");
System.out.println(sbb);
StringBuilder ssb=new StringBuilder("Raja");
ssb.append("Rani");
System.out.println(ssb);
    }
}