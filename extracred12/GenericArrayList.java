import java.util.NoSuchElementException;

public class GenericArrayList<E> implements List<E> {

	E[] data;
	int size = 0;
	
	public GenericArrayList(){
		data = (E[])new Object[10];
	}
	@Override
	public E get(int index) {
		if(index >= size || index < 0){
			throw new NoSuchElementException();
		}
		
		return data[index];
	}

	@Override
	public void add(E value) {
		if(size == data.length){
			System.out.println("Resizing array to capacity "+data.length * 2);
			E[] newArray = (E[])new Object[data.length * 2];
			//adds element
			
			for(int i = 0; i < size; i++){
				newArray[i] = data[i];
			}
			data = newArray;
		}
		
		data[size++] = value;

	}
    @Override
    public  GenericArrayList<E> addAll(GenericArrayList<E> inputList){
        E[] newArray = (E[])new Object[data.length * 2];
        return inputList;
        
    }

	@Override
	public void remove(int index) {
		if(index < 0 || index >= size){
			throw new NoSuchElementException();
		}
		
		for(int i = index; i < size - 1; i++ ){
			data[i] = data[i + 1];
		}
		
		data[size - 1] = null;
		size--;

	}

	@Override
	public void set(int index, E value) {
		if(index < 0 || index >= size){
			throw new NoSuchElementException();
		}
		
		data[index] = value;

	}

	public int size() {
		int size = this.size;
		return size;
	}
	
	public E addAll(E anotherList){
		
		
	}
	
	
	
	public static void main(String[] args) {
		GenericArrayList<Integer> myList = new GenericArrayList<Integer>();
		for(int i =0; i < 80; i++){
			myList.add(i);
		}
		myList.remove(0);
		myList.set(23,4444);
		for(int i = 0; i < 79; i++){
			System.out.println(myList.get(i));
		}
		
		
		System.out.println(myList.size());

	
		
		

	}

}
