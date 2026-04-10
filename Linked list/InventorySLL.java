class InventorySLL {
    static class Node{
        String name; int qty; double price; Node next;
        Node(String n,int q,double p){name=n;qty=q;price=p;}
    }
    Node head;

    void add(String n,int q,double p){
        Node nn=new Node(n,q,p);
        nn.next=head; head=nn;
    }

    double total(){
        double sum=0;
        Node t=head;
        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }
        return sum;
    }

    public static void main(String[] args){
        InventorySLL i=new InventorySLL();
        i.add("Item1",2,100);
        System.out.println(i.total());
    }
}
