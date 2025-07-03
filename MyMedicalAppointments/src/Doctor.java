public class Doctor { // es una clase close
 //atributos
 int id;
 String name;
 String speciality;
 
 Doctor(){
    System.out.println("construyendo el objeto Doctor");
 }
 Doctor(String name){
    System.out.println("El nombre del Doctor asignado es: "+ name);

 }
 //comportamientos
 public void showName(){
  System.out.println(name);
 }
}

