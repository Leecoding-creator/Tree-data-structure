package project;

public class ArrayStack implements Stack {  // 배열을 이용해 Stack interface를 구현
    private int top;	                      // 톱 원소를 가리키는 인덱스 변수
    private int stackSize;	    // 스택(배열)의 크기
    private int increment;	    // 스택(배열)의 확장 단위
    private Object[] itemArray;  // Java 객체 타입의 원소를 실제 저장할 수 있는 배열

    public ArrayStack() {    // 무인자 생성자로 스택 변수들을 초기화 , createStack()
         top = -1;		
         stackSize = 50;   // 초기의 스택 크기
         increment = 10;   // 스택의 확장 단위
         itemArray = new Object[stackSize];
    }

    public boolean isEmpty() {     // 스택이 공백인가를 검사
         return top == -1;
    }
    
    public void push(Object x) {   // 스택에 원소 x를 삽입
        if (top == stackSize-1)       // 스택이 만원인 경우
            stackFull();
        itemArray[++top] = x;        // 원소 삽입
    }  // end push()
    
    public void stackFull() {         // 스택이 가득 찾으면 스택 크기를 확장
    	stackSize += increment;    // 배열 크기를 increment만큼 확장
    	Object[] tempArray = new Object[stackSize];   // 확장된 크기의 배열 생성
        for (int i = 0; i <= top; i++)     // 확장된 배열로 원소 이동
        	tempArray[i] = itemArray[i];
        itemArray = tempArray;  // 확장된 배열을 itemArray 배열변수가 가리키도록 조정 
    }  // end stackFull()
    public Object pop() {        // 스택의 톱 원소를 삭제하여 반환
    	if (isEmpty()) return null;   // 공백인 경우
    	else return itemArray[top--];
    }  // end pop()

    public void delete() {      // 스택의 톱 원소를 삭제
    	if (isEmpty()) return; // 공백인 경우
    	else top--;
    }  // end delete()

    public Object peek() {	   // 스택의 톱 원소 검색
    	if (isEmpty()) return null;   // 공백인 경우
    	else return itemArray[top];
    }  // end peek()

} //end ArrayStack class
