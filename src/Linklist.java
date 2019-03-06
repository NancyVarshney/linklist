class Node {
    public int data;
     public  Node next;

    public Node(int data) {
        this.data = data;
    }

   /* public void setnext(Node next){
        this.next=next;
    }
    public Node getnext()
    {
        return next;
    }
    public void setdata(int data){
        this.data=data;
    }
    public int getdata()
    {
        return data;
    }*/


    public void display()
    {
        System.out.println(" " +data);
    }
}
public class Linklist {
    private Node first;
  public Linklist()
  {
      first=null;
  }

  public boolean isempty()
  {
      return (first==null);
  }
    public void insertfirst(int val) {
        Node n = new Node(val);
        n.next = first;
        first = n;

    }

    public Node deletefirst()
    {
        Node temp;
        temp=first;
        first=first.next;
       return temp;
    }

    public static void main(String[] args) {
        Linklist obj=new Linklist();
        System.out.println(obj.isempty());
        obj.insertfirst(34);
        obj.insertfirst(45);
        System.out.println(obj.isempty());
        obj.deletefirst();
        obj.deletefirst();
        System.out.println(obj.isempty());
  }
}
