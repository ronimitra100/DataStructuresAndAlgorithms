package practice;

/**
 * Created by ronim_000 on 7/23/2019.
 */
public class DynamicArray<String> {
    private Object[] data;
    private int size;
    private int initialCapacity;

    public DynamicArray(int initialCapacity){
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index){
        return (String)data[index];
    }

    public void set(int index, String value){
        data[index] = value;
    }

    public void insert(int index, String value){
        //Check size of array
        if (size==initialCapacity){
            resize();
        }

        //Insert new element into array
        for (int j=size; j>index; j--){
            data[j] = data[j-1];
        }
        data[index] = value;
        size++;
    }

    public void delete(int index){
       for (int j=index; j<size-1; j++){
           data[j] = data[j+1];
       }
       size--;
    }

    public boolean contains(String value){
        for (int i=0; i<size; i++){
            String currentValue = (String)data[i];
            if (currentValue.equals(value)){
                return true;
            }
        }

        return false;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void resize(){
        Object[] newData = new Object[initialCapacity*2];
        for (int i=0; i<initialCapacity; i++){
            newData[i]=data[i];
        }
        initialCapacity = initialCapacity*2;
        data = newData;
    }

    public int size(){
       return size;
    }

    public void print(){
         for (int i=0; i<size; i++){
             System.out.println("data["+i+"]: " + data[i]);
         }
    }


    public void add(String value){
        if (size==initialCapacity){
            resize();
        }

        //Insert new element into array

        data[size] = value;
        size++;

    }

}
