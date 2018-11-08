import java.util.*;

class Stack<E> {
  private ArrayList<E> elements;

  public Stack() {
    elements = new ArrayList<E>();
  }

  public void push(E pushValue) {
    elements.add(pushValue);
  }

  public E pop() {
    int size = elements.size();
    if(size == 0){
      return null;
    }
    else{
      E element = elements.get(size-1);
      elements.remove(size-1);
      return element;
    }
  }

  public int getSize(){
    return elements.size();
  }
}
