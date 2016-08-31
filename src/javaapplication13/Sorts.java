package javaapplication13;
import java.util.Arrays;
import java.util.Random;
public class Sorts {
    
    private int number_elements = 0;
    private int[] list;
    private long startTime = 0;
    private long endTime = 0;
    private long duration = 0;
    
    //For Heap Sort
    private int n = 0;
    private int left = 0;
    private int right = 0;
    private int largest = 0;
    
    public Sorts(){
        
    }
    
    public Sorts(int number_elements){
        this.number_elements = number_elements;
        this.list = new int[number_elements];
    }
    
    public void setNumberElements(int number_elements){
        this.number_elements = number_elements;
        this.list = new int[number_elements];
    }
    
    public int getNumberElements(){
        return this.number_elements;
    }
    
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    
    public long getStartTime(){
        return this.startTime;
    }
    
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
    
    public long getEndTime(){
        return this.endTime;
    }
    
    public void setDuration(long duration){
        this.duration = duration;
    }
    
    public long getDuration(){
        return this.duration;
    }
    
    
    public void fillList(){
        Random r = new Random();
        int randomInt = 0;
        for(int i = 0; i < this.number_elements; i++){
            randomInt = r.nextInt(100)+1;
            this.list[i] = randomInt;
        }
    }
    
    public void printList(){
        for(int i = 0; i < this.list.length; i++){
            System.out.print("["+this.list[i]+"]");
        }
    }
    
    public void bubbleSort(){
        int temp = 0;
        this.startTime = System.nanoTime();
        for(int i = 0; i < this.list.length; i++){
            for(int j = 1; j < this.list.length; j++){
                if(this.list[j-1] > this.list[j]){
                    temp = this.list[j];
                    this.list[j] = this.list[j-1];
                    this.list[j-1] = temp;
                }
            }
        }
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public void insertSort(){
        int j = 0, temp = 0;
        this.startTime = System.nanoTime();
        for(int i = 0; i < this.list.length; i++){
            temp = this.list[i];
            j = i;
            while(j > 0 && this.list[j-1] > temp){
                this.list[j] = this.list[j-1];
                j--;
            }
            this.list[j] = temp;
        }
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public void selectionSort(){
        int index = 0;
        this.startTime = System.nanoTime();
        for(int i = 0; i < this.list.length; i++){
            index = i;
            for(int j = i+1; j < this.list.length; j++){
                if(this.list[j] < this.list[index]){
                    index = j;
                }
            }
            int minimum = this.list[index];
            this.list[index] = this.list[i];
            this.list[i] = minimum;
        }
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public void mergeSort(){
        this.startTime = System.nanoTime();
        this.list = processMergeSort(this.list);
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public int[] processMergeSort(int[] number_list){
        if(number_list.length <= 1){
            return number_list;
        }
        
        int[] first = new int[number_list.length/2];
        int[] second = new int[number_list.length - first.length];
        System.arraycopy(number_list, 0, first, 0, first.length);
        System.arraycopy(number_list, first.length, second, 0, second.length);
        
        processMergeSort(first);
        processMergeSort(second);
        
        merge(first, second, number_list);
        return number_list;
    }
    
    public void merge(int[] first, int[] second, int[] result){
        
        int iFirst = 0;
        int iSecond = 0;
        
        int j = 0;
        
        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst] < second[iSecond]){
                result[j] = first[iFirst];
                iFirst++;
            }else{
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        
        System.arraycopy(first, iFirst, result,j,first.length - iFirst);
        System.arraycopy(second, iSecond, result,j,second.length - iSecond);
        
    }
    
    public void heapSort(){
        this.startTime = System.nanoTime();
        buildHeap(this.list);
        for(int i = this.n; i > 0; i--){
            exchange(0,i);
            n = n-1;
            maxHeap(this.list, 0);
        }
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public void exchange(int i, int j){
        int temp = this.list[i];
        this.list[i] = this.list[j];
        this.list[j] = temp;
    }
    
    public void maxHeap(int[] a, int i){
        this.left = 2*i;
        this.right = 2*i+1;
        if(this.left <= n && a[this.left] > a[i]){
            this.largest = this.left;
        }else{
            this.largest = i;
        }
        
        if(this.right <= this.n && a[this.right] > a[this.largest]){
            this.largest = this.right;
        }
        
        if(this.largest != i){
            exchange(i, this.largest);
            maxHeap(a, this.largest);
        }
    }
    
    public void buildHeap(int[] a){
        
        this.n = a.length -1;
        for(int i = n/2; i >= 0; i--){
            maxHeap(a,i);
        }
    }
    
    public void quickSort(){
        this.startTime = System.nanoTime();
        if(this.list == null || this.list.length == 0){
            return;
        }
        processQuickSort(0, this.list.length-1);
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
    public void processQuickSort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        
        int pivot = this.list[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while(i <= j){
            while(this.list[i] < pivot){
                i++;
            }
            while(this.list[j] > pivot){
                j--;
            }
            if( i <= j){
                exchange(i,j);
                i++;
                j--;
            }
        }
        if(lowerIndex < j){
            processQuickSort(lowerIndex, j);
        }
        if(i < higherIndex){
            processQuickSort(i, higherIndex);
        }
    }
    
    public int getMax(){
        int mx = this.list[0];
        for(int i = 1; i < this.list.length; i++){
            if(this.list[i] > mx){
                mx = this.list[i];
            }
        }
        return mx;
    }
    
    public void countSort(int exp){
        int output[] = new int[this.list.length];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
        for(i = 0; i < this.list.length; i++){
            count[ (this.list[i]/exp)%10]++;
        }
        
        for(i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        
        for(i = this.list.length-1; i >= 0; i--){
            output[count[(this.list[i]/exp)%10]-1] = this.list[i];
            count[(this.list[i]/exp)%10]--;
        }
        
        for(i = 0; i < this.list.length; i++){
            this.list[i] = output[i];
        }
    }
    
    public void radixSort(){
        this.startTime = System.nanoTime();
        int m = getMax();
        for(int exp = 1; m/exp > 0; exp *= 10){
            countSort(exp);
        }
        this.endTime = System.nanoTime();
        this.duration = this.endTime - this.startTime;
    }
    
}
    
