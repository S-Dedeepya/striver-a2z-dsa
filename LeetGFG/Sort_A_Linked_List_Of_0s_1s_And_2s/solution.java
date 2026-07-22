class Solution {
  public:
    Node* segregate(Node* head) {
        // code here
        vector<Node*>t(3, nullptr);

        for( int i = 0 ; i < 3 ; i++ )
        t[i] = new Node(i);
        
        auto th = t ;
        
        auto it = head ;
        
        while( it ) 
        {
            int v = it -> data ;
            
            t[v]->next = it ;
            t[v] = it ;
            
            it = it->next ;
            t[v]->next = nullptr ;
        }
        
        t[1]->next = th[2]->next ;
        t[0]->next = th[1]->next ;
        
        return th[0]->next ; 
        
    }
};