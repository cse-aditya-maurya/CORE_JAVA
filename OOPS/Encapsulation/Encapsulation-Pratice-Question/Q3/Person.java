/*
Q. Validate Age Using Setter

Class Name: Person

Private Variables:
- String name
- int age

Methods:
- public void setName(String name)
- public void setAge(int age)
- public String getName()
- public int getAge()

Condition:
- The value of age must be greater than or equal to 18.
- If an invalid age is provided (age < 18), the age should not be set.

Requirement:
- Implement proper encapsulation by keeping variables private.
- Validation logic must be written inside the setAge() method.

*/

class Person {
	private String name;
	private int age;
	public Person(String name,int age){
        this.name=name;
        setAge(age);
}
    public int getAge(){
    	return age;
    }
    public void setAge(int age){
    	if(age>=18){
    		this.age=age;
    	}
    	else{
    		System.out.println("Invalid Age");
    	}
    }
    public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }

}