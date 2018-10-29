public class ListNode {
    int val;
    ListNode m_pNext;

    ListNode  m_pSibling;

    ListNode(int x) { val = x; }

    public static ListNode complex(ListNode l1){
        if(l1.m_pNext == null && l1.m_pSibling == null){
            ListNode newListNode = new ListNode(l1.val);
            newListNode.m_pSibling = null;
            newListNode.m_pNext = null;
            return newListNode;
        }


        ListNode newListNode = new ListNode(0);

        ListNode temListNode = newListNode;

        while (l1.m_pNext != null){
            ListNode m_ListNode = new ListNode(l1.val);
            m_ListNode.m_pNext = l1.m_pNext;

            if(l1.m_pSibling != null){
                ListNode p_ListNode = new ListNode(l1.val);

                m_ListNode.m_pSibling = l1.m_pSibling;


            }

            newListNode.m_pNext = m_ListNode;

        }

        return  newListNode;
    }

}



