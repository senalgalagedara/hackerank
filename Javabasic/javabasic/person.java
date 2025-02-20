package javabasic;

class person{
    private String name;
    private int age;
    private String address;

    public person(){
        this.name = "Senal";
        this.age = 22;
        this.address = "Panadura";
    }
    public person(String name, int age,String address){
        this.name=name;
        this.age = age;
        this.address = address;
    }
    public void displayPersonInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
    }
}
