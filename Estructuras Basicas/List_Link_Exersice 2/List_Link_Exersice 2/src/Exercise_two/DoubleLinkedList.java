/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Exercise_two;

class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    //Initially, heade and tail is set to null
    Node head, tail  = null;  
    //Node head, tail , foother = null;
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;
        //Node cucu = foother;
        if(head == null ) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");
        while(current != null)
        {
        	
        	if(current.previous == null)
        	{
        		System.out.println("Numero: "+ current.item + " Siguiente: " + current.next.item);
        		current = current.next; 
        	}
        	if(current.next == null)
        	{
        		System.out.println("Numero: "+ current.item + " Anterior: " + current.previous.item );
        		break;
        	}
        	else {
        		System.out.println("Numero: "+ current.item + " Anterior: " + current.previous.item + " Siguiente: " + current.next.item);
                current = current.next; 
        	}
             
             
        }  
    }  
}