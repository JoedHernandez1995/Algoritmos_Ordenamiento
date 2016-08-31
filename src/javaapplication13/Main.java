package javaapplication13;

import java.io.FileWriter;

public class Main {
    
    private static final String DELIMITADOR = ",";
    private static final String NUEVA_LINEA = "\n";
    
    private static final String FILE_HEADER = "Bubble Sort,Insert Sort,Selection Sort,Merge Sort,Heap Sort,Quick Sort,Radix Sort";
    public static void main(String[] args) {
        
        FileWriter filewriter = null;
        Sorts sort = new Sorts();
        int x = 0;
        
        //Corriendo los algoritmos con 10 elementos 10 veces
        try{
            filewriter = new FileWriter("ten_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(10);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        }
        
        x = 0;
        
        //Corriendo los algoritmos con 100 elementos 10 veces
        try{
            filewriter = new FileWriter("one_hundred_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(100);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        }
        
        x = 0;
        
        //Corriendo los algoritmos con 1000 elementos 10 veces
        try{
            filewriter = new FileWriter("one_thousand_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(1000);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        } 
        
        x = 0;
        
        //Corriendo los algoritmos con 10000 elementos 10 veces
        try{
            filewriter = new FileWriter("ten_thousand_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(10000);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        }
        
        x = 0;
        
        //Corriendo los algoritmos con 100000 elementos 10 veces
        try{
            filewriter = new FileWriter("one_hundred_thousand_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(100000);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        }
        
        x = 0;
        
        //Corriendo los algoritmos con 1000000 elementos 10 veces
        try{
            filewriter = new FileWriter("one_million_elements.csv");
            filewriter.append(FILE_HEADER);
            filewriter.append(NUEVA_LINEA);
            sort.setNumberElements(1000000);
            while(x < 10){
                
                //BubbleSort
                sort.fillList();
                sort.bubbleSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //InsertSort
                sort.fillList();
                sort.insertSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //SelectionSort
                sort.fillList();
                sort.selectionSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //MergeSort
                sort.fillList();
                sort.mergeSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Heap Sort
                sort.fillList();
                sort.heapSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //QuickSort
                sort.fillList();
                sort.quickSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(DELIMITADOR);
                
                //Radix Sort
                sort.fillList();
                sort.radixSort();
                filewriter.append(String.valueOf(sort.getDuration()));
                
                filewriter.append(NUEVA_LINEA);
                x++;
            }
            filewriter.flush();
            filewriter.close();
            System.out.println("CSV File Created Successfully");
        }catch (Exception e){
            System.err.println("Error in CSV File Writer");
            e.printStackTrace();
        } 
    }
    
}
