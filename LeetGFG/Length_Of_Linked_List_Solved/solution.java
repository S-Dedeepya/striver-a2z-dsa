class Solution {
  public:
    int getCount(Node* head) {
        // Code here
        int count = 0;
        while(head != NULL){
            count++;
            head = head->next;
        }
        return count;
    }
};