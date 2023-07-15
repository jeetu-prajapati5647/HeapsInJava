import java.util.ArrayList;
import java.util.List;

public class HeapImplementation {
    private static void swap(List<Integer> heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    private static void push_up_In_minHeap(List<Integer> heap,int i){
        int parent_index=(i-1)/2;
        if(i==0 || heap.get(parent_index)<heap.get(i)) return;
        swap(heap,i,parent_index);
        push_up_In_minHeap(heap,parent_index);

    }
    private static void insert_in_min_heap(List<Integer> heap,int element){
        heap.add(element);
        int index=heap.size()-1;
        push_up_In_minHeap(heap,index);

    }
    public static void main(String[] args) {
        List<Integer> heap=new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insert_in_min_heap(heap,5);
        System.out.println(heap);

    }
}
