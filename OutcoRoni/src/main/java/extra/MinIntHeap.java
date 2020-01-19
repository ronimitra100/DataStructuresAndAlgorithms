package extra;

import java.util.Arrays;

/**
 * Created by ronim_000 on 11/2/2019.
 */
public class MinIntHeap {
    private int capacity=0;
    private int size=0;
    int[] items = new int[capacity];

    private int leftChildIndex(int parentIndex){return (parentIndex*2+1);};
    private int rightChildIndex(int parentIndex){return (parentIndex*2+2);};
    private int parentIndex(int childIndex){return ((childIndex-1)/2);};

    private boolean hasLeftChild(int parentIndex){return (parentIndex*2+1 <size);};
    private boolean hasRightChild(int parentIndex){return (parentIndex*2+2 <size);};
    private boolean hasParent(int childIndex){return ( ((childIndex-1)/2) >=0);};

    private int getLeftChild(int parentIndex){return (items[parentIndex*2+1]);};
    private int getRightChild(int parentIndex){return (items[parentIndex*2+2]);};
    private int getParent(int childIndex){return items[(childIndex-1)/2];};

    private void swap(int index1, int index2){
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    private void ensureExtraCapacity(){
        if (size==capacity){
            items= Arrays.copyOf(items,capacity*2);
            capacity *=2;
        }
    }

    private int peek(){
        if (size==0) throw new IllegalStateException();
        return items[0];
    }

    private int poll(){
        if (size==0) throw new IllegalStateException();
        int item = items[0];
        items[0]=items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    private void add(int item){
        ensureExtraCapacity();
        items[size] =item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index=size-1;
        while(hasParent(index) && getParent(index)>items[index]){
            swap(index, parentIndex(index));
            index=parentIndex(index);
        }
    }

    private void heapifyDown() {
        int index=0;
        while (hasLeftChild(index)){
            int smallerChildIndex=leftChildIndex(index);
            if (hasRightChild(index) && getRightChild(index)<items[smallerChildIndex]){
                smallerChildIndex=rightChildIndex(index);
            }

            if (items[index]<items[smallerChildIndex]){
                break;
            }
            else{
                swap(index,smallerChildIndex);
            }
            index=smallerChildIndex;
        }
    }
}
