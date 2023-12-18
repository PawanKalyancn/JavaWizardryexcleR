package oopsdemo;

public class Studentencapulation {
String name="pawan";
int id=1;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Studentencapulation [name=" + name + ", id=" + id + "]";
}

}
