import java.util.ArrayList;
import java.util.List;

public class Variable {
	
	public Variable(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}

	public int size() {
		return type.size();
	}

	public void setType(Type newType){
		type = newType;
	}

	@Override
	public String toString() {
		return String.format("%s %s", type.toString(), name);
	}

	private String name;
	private Type type;
}