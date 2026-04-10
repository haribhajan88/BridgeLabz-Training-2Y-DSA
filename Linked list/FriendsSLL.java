class FriendsSLL {
    static class Node{
        int id; Node next;
        Node(int i){id=i;}
    }
    Node head;

    void add(int id){
        Node nn=new Node(id);
        nn.next=head; head=nn;
    }

    void display(){
        Node t=head;
        while(t!=null){System.out.println(t.id); t=t.next;}
    }

    public static void main(String[] args){
        FriendsSLL f=new FriendsSLL();
        f.add(101); f.add(102);
        f.display();
    }
}
