class UndoRedoDLL {
    static class Node{
        String state; Node prev,next;
        Node(String s){state=s;}
    }
    Node head,current;

    void add(String s){
        Node nn=new Node(s);
        if(head==null){head=nn; current=nn;}
        else{
            current.next=nn; nn.prev=current;
            current=nn;
        }
    }

    void undo(){
        if(current.prev!=null) current=current.prev;
        System.out.println(current.state);
    }

    void redo(){
        if(current.next!=null) current=current.next;
        System.out.println(current.state);
    }

    public static void main(String[] args){
        UndoRedoDLL u=new UndoRedoDLL();
        u.add("A"); u.add("B"); u.undo(); u.redo();
    }
}
