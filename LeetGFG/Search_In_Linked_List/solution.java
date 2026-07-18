'''
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''
class Solution:
    def searchKey(self, head, key):
        while(head is not None):
            if(head.data == key):
                return True
                break
            head = head.next
        else:
            return False