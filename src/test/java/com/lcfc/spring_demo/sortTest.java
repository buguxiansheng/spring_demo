package com.lcfc.spring_demo;


import org.junit.jupiter.api.Test;

public class sortTest {

    //常规内部类
    class seq_Stack{
        private int size;
        private int[] stack;
        private int top;

        //构造方法
        public seq_Stack(int size,int top){
            this.size=size;
            stack=new int[size];
            this.top=top;
        }

        public boolean empty(){
            if(top==-1){
                return true;
            }else{
                return false;
            }
        }
        
        private void push(int t){
            if(top+1<size){
                stack[top+1]=t;
                top++;
            }else{
                System.err.println("栈已满");
            }
        }

        private void pop(){
            if(top==-1){
                System.err.println("栈中已无元素");
            }else{
                System.out.print(stack[top]+" ");
                top--;
                pop();
            }
        }


        private void peak(){
            if(top==-1){
                System.err.println("栈中已无元素");
            }else{
                System.out.println(stack[top]);
            }

        }    
    }

    //交换数字
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    //冒泡排序
    static void bubble_sort(int a[]){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
    }

    //快速排序一趟
    static int patition(int a[],int start,int end) {
        
            int privot=a[start];
            int l=start;
            int r=end;
            while(l<r){
                while(a[l]<=privot&&l<end) l++;
                while(a[r]>=privot&&r>start) r--;
                if(l<r){
                    swap(a, l, r);
                }
            }
            swap(a, start, r); 
            // quick_sort(a, 0, r-1);
            // quick_sort(a,r+1,a.length-1);
            return r;      
    }

    //快速排序
    static void quick_sort(int a[],int start,int end){
        if(end-start<1){
            return;
        }else{
            int index=patition(a, start, end);
            quick_sort(a, start,index-1);
            quick_sort(a, index+1, end);
        }
    } 

    //插入排序
    static void insert_sort(int a[]){
        for(int i=1;i<a.length;i++){
            //有序列中如何插入一个数
            while (i>0) {
                if(a[i]<a[i-1]){
                    swap(a,i,i-1);
                     i--;
                }else{
                    break;
                } 
            }
            // for(int j=i;j>0;j--){
            //     if(a[j]<a[j-1]){
            //         swap(a,j-1,j);
            //     }else{
            //         break;
            //     }
            // }
        }
    }


    //创建堆
    static void heapify(int a[],int length) {
        int size=length/2-1;
        while(size>=0){
            if(a[size]<a[2*size+1]){
                swap(a, size,2*size+1);
            }
            if(2*size+2<=length){
                if(a[size]<a[2*size+2]){
                    swap(a, size, 2*size+2);
                }
            }
            size--;
        }   
    }

    //堆排序
    static void heap_sort(int a[]){
        int length=a.length-1;
        while (length>=0) {
            heapify(a, length);
            swap(a,0,length);
            length--;
        }

    }
    //希尔排序
    static void shell_sort(){
        
    }

    class Node{
        Integer val;
        Node next;
        public Node(Integer val){
            this.val=val;
            this.next=null;
        }
    }

    //静态内部类
    class link_Stack{
        private Node start;

        private boolean isEmpty(){
            if(start.next == null){
                return true;
            }else{
                return false;
            }
        }
        private void push(Integer val){
            Node node=new Node(val);
            node.next=start.next;
            start.next=node;
           
        }
        private void pop(){
            if(start.next==null){
                System.err.println("栈内无元素");
            }else{
                System.out.println(start.next.val);
                if(start.next.next!=null){
                    start.next=start.next.next;
                    pop();
                }
            }
        }
        private void peak(){
            if(start.next==null){
                System.err.println("栈内无元素");
            }else{
                System.out.println(start.next.val);
            }
            
        }
        

    }




    
    @Test
	void sort(){
        int a[]={5,4,3,5,2,50,1};
        for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
        }
        System.out.println();
        // 冒泡排序
        // bubble_sort(a);
        // 快速排序
        // quick_sort(a,0,a.length-1);
        //插入排序
        //insert_sort(a);
        //堆排序
        //heap_sort(a);
        //希尔排序



        
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
    }
    
    @Test
    void testStack(){
        // seq_Stack a=new seq_Stack(5, -1);
        // a.push(8);
        // a.push(101001);
        // a.push(25);
        // a.pop();


        // link_Stack a=new link_Stack();
        // a.start=new Node(null);
        // a.push(8);
        // a.push(101001);
        // a.push(25);
        // a.push(1);
        // a.peak();
    }
    @Test
    void nullpointerExTest(){


        //字符串变量未初始化
        // String str=null;
        // System.err.println(str);

        //接口类型未用具体类初始化


        //向上转型 保留父类的独有方法 子类重写的方法 丢弃子类新增的方法
        //向下转型 保留子类的方法外加父类的独有方法

        
    }
}