struct Node *insertInTail(struct Node * head, int data)
{
   //Your code here
   struct Node *new_node=(struct Node *)malloc(sizeof(struct Node));
   
    struct Node *ptr=head;
    
    if(head==NULL)
    {
        new_node->prev=NULL;
        new_node->next=NULL;
        new_node->data=data;
        head=new_node;
        return head;
    }
    else
    {
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        new_node->prev=ptr;
        ptr->next=new_node;
        new_node->next=NULL;
        new_node->data=data;
        return head;
    }
}