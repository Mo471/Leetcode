class MyCircularDeque {

    int[] deque;
    int l;
    int r;
    int size;
    int maxCapacity;
    
    public MyCircularDeque(int maxCapacityIn) {
        this.l = 0;
        this.r = 0;
        this.deque = new int[maxCapacityIn];
        this.maxCapacity = maxCapacityIn;
        this.size = 0;
    }
    
    public boolean insertFront(int elementIn) {
        if (size == maxCapacity) {
            return false;
        }

        if (size == 0) {
            deque[0] = elementIn;
            l = 0;
            r = 0;
            size++;
            return true;
        }

        if (r == maxCapacity - 1) {
            deque[0] = elementIn;
            r = 0;
            size++;
            return true;
        }

        deque[r + 1] = elementIn;
        r = r + 1;
        size++;
        return true;
    }
    
    public boolean insertLast(int elementIn) {
        if (size == maxCapacity) {
            return false;
        }

        if (size == 0) {
            deque[0] = elementIn;
            l = 0;
            r = 0;
            size++;
            return true;
        }

        if (l == 0) {
            deque[maxCapacity - 1] = elementIn;
            l = maxCapacity - 1;
            size++;
            return true;
        }
        deque[l - 1] = elementIn;
        l = l - 1;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }

        if (r == 0) {
            r = maxCapacity - 1;
            size--;
            return true;
        }

        r = r - 1;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }

        if (l == maxCapacity - 1) {
            l = 0;
            size--;
            return true;
        }

        l = l + 1;
        size--;
        return true;
    }
    
    public int getFront() {
        if (size == 0) return -1;
        return deque[r];
    }
    
    public int getRear() {
        if (size == 0) return -1;
        return deque[l];
    }
    
    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(size == maxCapacity) return true;
        else return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */