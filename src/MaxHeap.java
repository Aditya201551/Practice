// Minor Bug: TO BE FIXED

public class MaxHeap {
    int[] Heap;
    int size,maxsize;
    MaxHeap(int maxsize)
    {
        this.maxsize=maxsize;
        size=0;
        Heap=new int[maxsize];
        Heap[0]=Integer.MAX_VALUE;
    }
    int parent(int position)
    {
        return position/2;
    }
    int leftChild(int position)
    {
        return (position*2);
    }
    int rightChild(int position)
    {
        return (position*2)+1;
    }
    boolean isLeaf(int position)
    {
        return (position>(size/2)&&position<=size);
    }
    void swap(int pos1, int pos2)
    {
        int tmp=Heap[pos1];
        Heap[pos1]=Heap[pos2];
        Heap[pos2]=tmp;
    }
    void maxHeapify(int position)
    {
        if(isLeaf(position))
            return;
        if(Heap[position]<Heap[leftChild(position)]||Heap[position]<Heap[rightChild(position)])
        {
            if(Heap[leftChild(position)]>Heap[rightChild(position)])
            {
                swap(position, leftChild(position));
                maxHeapify(leftChild(position));
            }else{
                swap(position, rightChild(position));
                maxHeapify(rightChild(position));
            }
        }
    }
    void insert(int element)
    {
        Heap[++size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    void delete()
    {
        if(size==0)
        {
            System.out.println("Heap is empty : nothing to delete");
            return;
        }
        int popped=Heap[1];
        Heap[1]=Heap[size--];
        System.out.println("Deleted: "+popped);
        maxHeapify(1);
    }

    void print()
    {
        if(size==0) {
            System.out.println("Heap is empty: Nothing to print");
            return;
        }
        for(int i=1;i<=size/2;i++)
        {
            System.out.println(
                    "PARENT: "+Heap[i]+" "+
                            "LeftChild: "+Heap[2*i]+" "+
                            "RightChild: "+Heap[(2*i)+1]+" "
            );
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr ={1,2,5,8,6,10,9,65,87,100,341};
        MaxHeap ob=new MaxHeap(15);
//        ob.print();
        for(int i:arr)
            ob.insert(i);
        ob.print();
        ob.insert(10);
        ob.delete();
        ob.print();
    }
}
