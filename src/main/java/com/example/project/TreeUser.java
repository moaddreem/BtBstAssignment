package com.example.project;

public class TreeUser {
	public static <T> int countLeaves(BT<T> bt) {
    	if(bt.empty())
    		return -1;
    	if(bt == null)
    		return 0;
    	if(bt.isLeaf())
    		return 1;
    	return countLeaves(bt.find(Relative.LeftChild))+countLeaves(bt.find(Relative.RightChild));
    }

}
