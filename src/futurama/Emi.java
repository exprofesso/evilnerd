package futurama;

public class Emi  {
private String fname;
private String lname;
private static int count = 0;

public Emi(String fn, String ln){
    fname = fn;
    lname = ln;
    count++;
    System.out.printf("%s %s: в фильме 12 стульев - %d персонад(а\\ей). \n", fname, lname, count);
}

public String getFname(){
    return fname;
}
public String getLname(){
    return lname;
}

public static int getCount(){
    return count;
}

}
