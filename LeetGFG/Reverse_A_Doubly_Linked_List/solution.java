/*
Problem Revision Notes

Problem:    Reverse a Doubly Linked List
Platform:   GeeksForGeeks
Date:       2026-07-19

──────────────────────────────────────────────────

Intuition
Make temp traverse to the end of the give list
And then create a new linked list by moving the temp in reverse order.

──────────────────────────────────────────────────

Lines / Logic To Be Careful With
DO NOT swap pointers after temp reached the last node

──────────────────────────────────────────────────

Edge Cases Handled
(Only one node is also handled)

──────────────────────────────────────────────────

Mistakes I Made
Swapped the pointers after temp reached the last node

──────────────────────────────────────────────────

Future Reminder
Don't make the mistakes i made

──────────────────────────────────────────────────

Time Complexity
O(n)

Space Complexity
O(1)

══════════════════════════════════════════════════
*/

class Solution:
    
    def reverseDLL(self, head):
        while head:
            head.next, head.prev = head.prev, head.next
            if not head.prev:return head
            head=head.prev