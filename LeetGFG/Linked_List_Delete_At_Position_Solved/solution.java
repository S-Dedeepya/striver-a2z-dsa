'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''
def deleteAtPosition(head, pos):
    if(pos == 1):
        temp = head
        head = head.next
        temp.next = None
    else:
        pre = head
        for _ in range(pos-2):
            pre = pre.next
        temp = pre.next
        pre.next = temp.next
        temp.next = None
    
    return head