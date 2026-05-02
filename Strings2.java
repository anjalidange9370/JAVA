//methods of string
//(==) and .equals these both are different methods in java
//.equalsto cheacks address too while(==) checks the values only
public class Strings2 {
     public static void main(String[] args) {
    String s1="AADIANDJAVA";
    String s2="AADIANDJAVA";
    String s3="ADIANDPYTHON";
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    String s4=new String("AADIANDJAVA");
    String s5=new String("AADIANDJAVA");
    System.out.println(s4.equals(s5));
  System.out.println(s1.equals(s4));   
  String str="ANJALI_DANGE  ";
  String str2="ADITYA_DANGE  ";
  System.out.println(str.length());
  System.out.println(str.indexOf('A'));
System.out.println(str.lastIndexOf('A'));
System.out.println(str.charAt(3));
//System.out.println(str.charAt(33));
System.out.println(str.equals("ANJALI_DANGE"));
System.out.println(str.equals("ADITYA_DANGE"));
System.out.println(str.concat("good"));
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.startsWith("A"));
System.out.println(str.endsWith("A"));
System.out.println(str.trim());
System.out.println(str.compareTo(str2));
}
}
