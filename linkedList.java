

public class linkedList
{
  private int data;
  private linkedList next;

  public linkedList(int data)
  {
    this.data = data;
    this.next = null;
  }

  public linkedList(int data, linkedList next)
  {
    this.data = data;
    this.next = next;
  }

  public int getData() {return data;}
  public void setData(int data) {this.data = data;}

  public linkedList getNext() {return next;}
  public void setNext(linkedList next) {this.next = next;}
}
