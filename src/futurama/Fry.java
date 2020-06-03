package futurama;

public class Fry  {

private String movieName;




public Fry(String name){
    movieName = name;
}

public void testint (int number){
    System.out.printf("%,d \n", + number);
}


    public void FrySay(){
    System.out.println("Это класс Фрая");
}


public void FrySay1(String name){
    System.out.println(name + " отличное имя!!!");
}


public void setName (String name){
        movieName = name;
}

public String getName (){
        return movieName;
}


public void output(){
    System.out.printf("Твой любимый фильм - %s", getName());
    System.out.println();
}





}
